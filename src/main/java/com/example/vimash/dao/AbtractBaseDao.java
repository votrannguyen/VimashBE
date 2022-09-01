package com.example.vimash.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbtractBaseDao {
	
	private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
