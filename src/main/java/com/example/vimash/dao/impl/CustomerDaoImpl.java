package com.example.vimash.dao.impl;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.dao.CustomerDao;
import com.example.vimash.utils.DataUtil;
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
    public List<CustomerEntity> getAllCustomer(String name, String code1, String code2, Integer page, Integer size) {
        List<CustomerEntity> companyList =null;
        StringBuilder sql = new StringBuilder();
        sql.append("select c from CustomerEntity c where del_flg = 0 ");
        if (!DataUtil.isEmpty(name)) {
            sql.append(" and customer_name like '%"+name+"%'");
        }
        if (!DataUtil.isEmpty(code1) && !DataUtil.isEmpty(code2)) {
            sql.append(" and (customerCode between '"+code1+"' and '"+code2+"')");
        }
        Integer firstResult = (page - 1) * size;
        companyList = entityManager.createQuery(sql.toString(),CustomerEntity.class)
                .setFirstResult(firstResult)
                .setMaxResults(size)
                .getResultList();
        return companyList;
    }
}
