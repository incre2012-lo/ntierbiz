package org.ntierbiz.unit.party.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.Persistent;

public interface PartyType extends Persistent{

	public abstract String getTypeID();

	public abstract void setTypeID(String typeID);

	public abstract Integer getTypeCode();

	public abstract void setTypeCode(Integer typeCode);

	public abstract String getDescription();

	public abstract void setDescription(String description);

	public abstract String getPartyID();

	public abstract void setPartyID(String partyID);
	
	public Set<Party> getParties() ;
	
	public void setParties(Set<Party> parties);

}