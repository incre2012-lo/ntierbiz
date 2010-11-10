package org.ntierbiz.unit.party.model;

import org.ntierbiz.core.orm.common.PersistentPO;

public class PartyAttributePO extends PersistentPO implements PartyAttribute {
	private String name;
	private String stringValue;
	private Integer intValue;	
	private String ObjectType;
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyAttribute#getName()
	 */
	@Override
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyAttribute#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyAttribute#getStringValue()
	 */
	@Override
	public String getStringValue() {
		return stringValue;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyAttribute#setStringValue(java.lang.String)
	 */
	@Override
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyAttribute#getIntValue()
	 */
	@Override
	public Integer getIntValue() {
		return intValue;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyAttribute#setIntValue(java.lang.Integer)
	 */
	@Override
	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyAttribute#getObjectType()
	 */
	@Override
	public String getObjectType() {
		return ObjectType;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.party.model.PartyAttribute#setObjectType(java.lang.String)
	 */
	@Override
	public void setObjectType(String objectType) {
		ObjectType = objectType;
	}
}
