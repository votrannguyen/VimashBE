package com.example.vimash.dao;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.jpa.response.CustomerResponse;
import com.example.vimash.bean.jpa.jpa.response.PageResponse;
import com.example.vimash.bean.jpa.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.bean.jpa.request.PageRequest;
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
        Query query = this.entityManager.createQuery(hsql);
        if (searchDTO.hasPaging()) {
            query.setFirstResult(searchDTO.getFirstResult()).setMaxResults(searchDTO.getNoRecordInPage());
        }

        List<CustomerEntity> list = query.getResultList();
        List<CustomerResponse> lrsp = new ArrayList<>();
        list.stream().forEach(l -> {
            CustomerResponse lrspp = new CustomerResponse(l.getCustomerCode(),l.getPostCode(),
                    l.getCustomerName(), l.getPicName(), l.getAddress1(), l.getPhoneNumber(),
                    l.getFaxNumber(), l.getLeadTime(), l.getRouteCode(), l.getCourseCode());
            lrsp.add(lrspp);
        });
        customerIPageResponse.pageInfo(searchDTO.getCurrentPage(), searchDTO.getNoRecordInPage(), countTotalRecord(searchDTO));
        customerIPageResponse.rawResults(lrsp);
        return customerIPageResponse;
    }

    protected Long countTotalRecord(PageRequest searchDTO) {
        Query query = this.entityManager.createQuery(searchDTO.getCount().toString());
        //fillParams(query, searchDTO.getSearchFields());
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
