package org.ntierbiz.unit.party.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.PersistentPO;

public class PartyTypePO extends PersistentPO implements PartyType{
private String typeID;
private Integer typeCode;
private String description;
private String partyID;
private Set<Party> parties;


public Set<Party> getParties() {
	return parties;
}
public void setParties(Set<Party> parties) {
	this.parties = parties;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyType#getTypeID()
 */
@Override
public String getTypeID() {
	return typeID;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyType#setTypeID(java.lang.String)
 */
@Override
public void setTypeID(String typeID) {
	this.typeID = typeID;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyType#getTypeCode()
 */
@Override
public Integer getTypeCode() {
	return typeCode;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyType#setTypeCode(java.lang.Integer)
 */
@Override
public void setTypeCode(Integer typeCode) {
	this.typeCode = typeCode;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyType#getDescription()
 */
@Override
public String getDescription() {
	return description;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyType#setDescription(java.lang.String)
 */
@Override
public void setDescription(String description) {
	this.description = description;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyType#getPartyID()
 */
@Override
public String getPartyID() {
	return partyID;
}
/* (non-Javadoc)
 * @see org.ntierbiz.unit.party.model.PartyType#setPartyID(java.lang.String)
 */
@Override
public void setPartyID(String partyID) {
	this.partyID = partyID;
}

}
