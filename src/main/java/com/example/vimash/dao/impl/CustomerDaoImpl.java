package com.example.vimash.dao.impl;

import com.example.vimash.bean.jpa.jpa.CustomerEntity;
import com.example.vimash.bean.jpa.request.CustomerSearchListRequest;
import com.example.vimash.bean.jpa.response.CustomerResponse;
import com.example.vimash.bean.jpa.response.customer.CustomerIPageResponse;
import com.example.vimash.dao.AbstractBaseDao;
import com.example.vimash.dao.CustomerDao;
import com.example.vimash.utils.ApiValidateException;
import com.example.vimash.utils.Constants;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
    public void addCustomer(CustomerEntity customerEntity) throws ApiValidateException,Exception {
//        StringBuilder sql = new StringBuilder();
//        sql.append(" Insert into m_customer( ");
//        sql.append("     customer_code, customer_name,pic_name, ");
//        sql.append("     phone_number,fax_number, post_code, ");
//        sql.append("     , address1, ");
//        sql.append("     address2, address3, ");
//        sql.append("     address4, bank_name, ");
//        sql.append("     bank_branch_name, bank_acc_number, ");
//        sql.append("     bank_acc_holder, lead_time, ");
//        sql.append("     route_code, course_code, ");
//        sql.append("     output_priority_rank, free_item1, ");
//        sql.append("     free_item2, free_item3, ");
//        sql.append("     notes  ,del_flg , ");
//        sql.append("     create_by, create_date, ");
//        sql.append("     update_by, update_date, ");
//        sql.append(" )");
        entityManager.persist(customerEntity);

    }

    @Override
    public void updateCustomer(CustomerEntity customerEntity) throws ApiValidateException, Exception {
        entityManager.merge(customerEntity);
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
    @Override
    public void findByCustomerCode(String customerCode) throws ApiValidateException{
        List<CustomerEntity> companyList =null;
        Query query =  entityManager.createQuery("select c from CustomerEntity c where del_flg = 0 and customer_code = '"+customerCode+"' ",CustomerEntity.class);

        companyList = query.getResultList();

        if (companyList.size() >0) {
            throw new ApiValidateException(Constants.STATUS_SYSTEM_ERROR, customerCode,
                    "Customer code bị trùng");
        }
    }
}
