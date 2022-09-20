package com.example.vimash.dao.impl;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.bean.jpa.request.CustomerSearchListRequest;
import com.example.vimash.dao.AbstractBaseDao;
import com.example.vimash.dao.CustomerDao;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDaoImpl extends AbstractBaseDao implements CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    private static final Logger log = LoggerFactory.getLogger(CustomerDaoImpl.class);

    @Override
    public List<CustomerEntity> getAllCustomer() {
        List<CustomerEntity> companyList =null;
        StringBuilder sql = new StringBuilder();
        sql.append("select c from CustomerEntity c");
        companyList = entityManager.createQuery(sql.toString(),CustomerEntity.class)
                .setFirstResult(1)
                .setMaxResults(10)
                .getResultList();
        return companyList;
    }

    @Override
    public CustomerIPageResponse findAll(CustomerSearchListRequest search) {
        return super.findAll(search);
    }

    @Override
    public String deleteSingleCustomer(Long id) {
        Optional<CustomerEntity> customerEntity = findCustomerById(id);
        if (customerEntity.isPresent()) {
            CustomerEntity c = customerEntity.get();
            c.setDelFlg("1");
            log.info("### getuserInfoById()###");
            entityManager.merge(c);
            return "delete successfully";
        } else {
            return "record no exists";
        }
    }

    @Override
    public Optional<CustomerEntity> findCustomerById(Long id) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT c FROM CustomerEntity c WHERE c.customerId = :id AND c.delFlg = 0");
        Query query = entityManager.createQuery(sql.toString())
                .setParameter("id", id);
        try {
            log.info("#############get customer(customerId: " + id + ")");
            return Optional.ofNullable((CustomerEntity) query.getSingleResult());
        } catch (NoResultException e) {
            log.debug("Record that does not exist.(customerId: " + id + ")");
            return Optional.empty();
        }
    }
}
