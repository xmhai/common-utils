package com.lin.common.base;

import java.time.LocalDateTime;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class BaseEntityListener {
    @PrePersist
    public void setCreated(BaseEntity entity) {
    	entity.setCreatedBy(0L);
    	entity.setCreatedDate(LocalDateTime.now());
    	entity.setIsDeleted(false);
    }
    
    @PreUpdate
    public void setUpdated(BaseEntity entity) {
    	entity.setUpdatedBy(0L);
    	entity.setUpdatedDate(LocalDateTime.now());
    }
    
    @PreRemove
    public void setDeleted(BaseEntity entity) {
    	entity.setUpdatedBy(0L);
    	entity.setUpdatedDate(LocalDateTime.now());
    	entity.setIsDeleted(true);
    }
}
