package com.example.vimash.dao.impl;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.response.CustomerResponse;
import com.example.vimash.dao.CustomerDao;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CustomerResponse> getAllCustomer() {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT new  com.example.vimash.bean.jpa.response.CustomerResponse( ");
        sql.append("     customerId,");
        sql.append("     customerCode, customerName, ");
        sql.append("     faxNumber, postCode, ");
        sql.append("     createBy, createDate, ");
        sql.append("     updateBy, updateDate, ");
        sql.append("     routeCode, courseCode, ");
        sql.append("     phoneNumber, address1, ");
        sql.append("     address2, address3, ");
        sql.append("     address4, notes, ");
        sql.append("     delFlg ");
        sql.append(" )");
        sql.append(" FROM CustomerEntity ");
        sql.append(" WHERE ");
        sql.append("    delFlg = 0");
        Query query = entityManager.createQuery(sql.toString());
        List<CustomerResponse> result = null;
        result = query.getResultList();
        return result;
    }

    @Override
    public CustomerResponse finByIdCustomer(Integer id) {
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT new  com.example.vimash.bean.jpa.response.CustomerResponse( ");
        sql.append("     customerId,");
        sql.append("     customerCode, customerName, ");
        sql.append("     faxNumber, postCode, ");
        sql.append("     createBy, createDate, ");
        sql.append("     updateBy, updateDate, ");
        sql.append("     routeCode, courseCode, ");
        sql.append("     phoneNumber, address1, ");
        sql.append("     address2, address3, ");
        sql.append("     address4, notes, ");
        sql.append("     delFlg ");
        sql.append(" )");
        sql.append(" FROM CustomerEntity ");
        sql.append(" WHERE ");
        sql.append("    delFlg = 0");
        sql.append("  AND  customer_id =: customerId");
        Query query = entityManager.createQuery(sql.toString());
        query.setParameter("customerId", id);
        CustomerResponse result = null;
        result = (CustomerResponse) query.getSingleResult();
        return result;
    }

    @Override
    public CustomerEntity addCustomer(CustomerEntity customerEntity) {
        return null;
    }
}
