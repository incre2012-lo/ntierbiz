package org.ntierbiz.unit.product.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.Persistent;
import org.ntierbiz.unit.party.model.Party;

public interface Product extends Persistent{
	public Party getParty();
	public void setParty(Party party);
	public Set<Party> getSharedParties();
	public void setSharedParties(Set<Party> sharedParties);
}