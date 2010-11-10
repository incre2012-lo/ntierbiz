package org.ntierbiz.core.orm.common;

import java.sql.Timestamp;

public abstract class PersistentPO implements Persistent{

	private long id;
	private Timestamp lastModified;
	private long DomainId;
	private String createdBy;
	private String modifiedBy;
	/* (non-Javadoc)
	 * @see com.estratg.core.orm.Persistent#getId()
	 */
	@Override
	public long getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.orm.Persistent#setId(int)
	 */
	@Override
	public void setId(long id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.orm.Persistent#getLastModified()
	 */
	@Override
	public Timestamp getLastModified() {
		return lastModified;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.orm.Persistent#setLastModified(java.sql.Timestamp)
	 */
	@Override
	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.orm.Persistent#getDomainId()
	 */
	@Override
	public long getDomainId() {
		return DomainId;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.orm.Persistent#setDomainId(int)
	 */
	@Override
	public void setDomainId(long domainId) {
		DomainId = domainId;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.orm.Persistent#getCreatedBy()
	 */
	@Override
	public String getCreatedBy() {
		return createdBy;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.orm.Persistent#setCreatedBy(java.lang.String)
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.orm.Persistent#getModifiedBy()
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}
	/* (non-Javadoc)
	 * @see com.estratg.core.orm.Persistent#setModifiedBy(java.lang.String)
	 */
	@Override
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	@Override
	public String toString() {
		return "PersistentPO [id=" + id + ", lastModified=" + lastModified
				+ ", DomainId=" + DomainId + ", createdBy=" + createdBy
				+ ", modifiedBy=" + modifiedBy + "]";
	}
	
}
