package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;

import com.example.vimash.bean.jpa.request.PageRequest;
import com.example.vimash.bean.jpa.response.CustomerResponse;
import com.example.vimash.bean.jpa.response.customer.CustomerIPageResponse;
import org.apache.commons.collections4.MapUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class AbstractBaseDao {

    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @PersistenceContext()
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public CustomerIPageResponse findAll(PageRequest searchDTO) {
        CustomerIPageResponse customerIPageResponse = new CustomerIPageResponse();
        String hsql = searchDTO.getQuery().toString().trim();
        System.out.println(hsql);
        Query query = this.entityManager.createQuery(hsql);
        if (searchDTO.hasPaging()) {
            query.setFirstResult(searchDTO.getFirstResult()).setMaxResults(searchDTO.getNoRecordInPage());
        }

        List<CustomerEntity> list = query.getResultList();
        System.out.println("fsdf");
        List<CustomerResponse> lrsp = null;
        list.stream().forEach(l -> {

            CustomerResponse lrspp = new CustomerResponse(l.getCustomerCode(),l.getPostCode(),
                    l.getCustomerName(), l.getPicName(), l.getAddress1(), l.getPhoneNumber(),
                    l.getFaxNumber(), l.getLeadTime(), l.getRouteCode(), l.getCourseCode());
            lrsp.add(lrspp);
        });
        List a = new ArrayList();
        a.add(1, "111111");
        customerIPageResponse.setResults(a);
        customerIPageResponse.pageInfo(searchDTO.getCurrentPage(), searchDTO.getNoRecordInPage(), countTotalRecord(searchDTO));
        return customerIPageResponse;
        //fillParams(query, searchDTO.getSearchFields());
//        T instance;
//        try {
//            instance = (T) searchDTO.getResponseClass().getConstructor().newInstance();
//            instance.pageInfo(searchDTO.getCurrentPage(), searchDTO.getNoRecordInPage(), countTotalRecord(searchDTO));
//            System.out.println("ds");
//
//            if (searchDTO.hasPaging() && instance.getTotalPage() > 0 && (instance.getCurrentPage() > instance.getTotalPage())) {
//                searchDTO.currentPage(instance.getTotalPage());
//                query.setFirstResult(searchDTO.getFirstResult()).setMaxResults(searchDTO.getNoRecordInPage());
//                instance.pageInfo(searchDTO.getCurrentPage(), searchDTO.getNoRecordInPage(), countTotalRecord(searchDTO));
//            }
//            instance.rawResults(query.getResultList());
//            return instance;
//        } catch (Exception e) {
//            return null;
//        }
    }

    protected Long countTotalRecord(PageRequest searchDTO) {
        Query query = this.entityManager.createQuery(searchDTO.getCount().toString());
        fillParams(query, searchDTO.getSearchFields());
        Object singResult = query.getSingleResult();
        if (Objects.isNull(singResult)) {
            return (long) 0;
        }
        return ((Long) singResult);
    }

    protected Long countTotalRecordWithNativeQuery(PageRequest searchDTO) {
        Query query = this.entityManager.createNativeQuery(searchDTO.getCount().toString());
        fillParams(query, searchDTO.getSearchFields());
        Object singResult = query.getSingleResult();
        if (Objects.isNull(singResult)) {
            return (long) 0;
        }
        return ((BigInteger) singResult).longValue();
    }

    protected void fillParams(Query query, Map<String, Object> searchParams) {
        if (MapUtils.isEmpty(searchParams)) {
            return;
        }
        searchParams.forEach(query::setParameter);
    }
}