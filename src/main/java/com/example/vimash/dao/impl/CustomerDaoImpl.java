package com.example.vimash.dao.impl;
import javax.persistence.Query;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.bean.jpa.request.CustomerSearchListRequest;
import com.example.vimash.dao.AbstractBaseDao;
import com.example.vimash.dao.CustomerDao;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CustomerDaoImpl extends AbstractBaseDao implements CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<CustomerEntity> getAllCustomer() {
        List<CustomerEntity> companyList =null;
        StringBuilder sql = new StringBuilder();
        sql.append("select c from CustomerEntity c where del_flg = 0");
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
	public void deleteCustomer(Integer id) throws ApiValidateException, Exception {
		 try{

	            Query query =  entityManager.createQuery("update CustomerEntity set del_flg = 1 where customer_id=:id");
	            query.setParameter("id",id);
	            query.executeUpdate();
	        }catch (Exception e){
	            throw new ApiValidateException(Constants.STATUS_SYSTEM_ERROR, "customerCode",
	                    "Khong the xoa duoc");
	        }
		
	}
}
