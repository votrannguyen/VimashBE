package com.example.vimash.dao.impl;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.dao.CustomerDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CustomerEntity> getAllCustomer(String name, String code, Integer size) {
        List<CustomerEntity> companyList =null;
        String s = "select c from CustomerEntity c" +
                " where del_flg = 0 and customer_code LIKE '%"+code+"%' and customer_name LIKE '%"+name+"%'";
        companyList = entityManager.createQuery(s,CustomerEntity.class).setFirstResult(0).setMaxResults(size).getResultList();
        return companyList;
    }
}
