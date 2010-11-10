package org.ntierbiz.unit.party.model;

import org.ntierbiz.core.orm.common.Persistent;

public interface PartyAttribute extends Persistent{

	public abstract String getName();

	public abstract void setName(String name);

	public abstract String getStringValue();

	public abstract void setStringValue(String stringValue);

	public abstract Integer getIntValue();

	public abstract void setIntValue(Integer intValue);

	public abstract String getObjectType();

	public abstract void setObjectType(String objectType);

}