package org.ntierbiz.core.orm.common;

import java.sql.Timestamp;

public interface Persistent {
	public abstract long getId();

	public abstract void setId(long id);

	public abstract Timestamp getLastModified();

	public abstract void setLastModified(Timestamp lastModified);

	public abstract long getDomainId();

	public abstract void setDomainId(long domainId);

	public abstract String getCreatedBy();

	public abstract void setCreatedBy(String createdBy);

	public abstract String getModifiedBy();

	public abstract void setModifiedBy(String modifiedBy);
}
