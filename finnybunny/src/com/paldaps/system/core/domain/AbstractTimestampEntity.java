package com.paldaps.system.core.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@MappedSuperclass
public class AbstractTimestampEntity {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created", nullable = true)
    protected Date created;
    @Version
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated", nullable = true)
    protected Date updated;

    @PrePersist
    protected void prePersist() {
    updated = created = new Date();
    }

    @PreUpdate
    protected void preUpdate() {
    updated = new Date();
    }

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	
	
	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}    
    
}