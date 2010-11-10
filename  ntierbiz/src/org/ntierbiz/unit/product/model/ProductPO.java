package org.ntierbiz.unit.product.model;

import java.util.Set;

import org.ntierbiz.core.orm.common.PersistentPO;
import org.ntierbiz.unit.party.model.Party;

public class ProductPO extends PersistentPO implements Product {
	private Party party;
	private Set<Party> sharedParties;

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public Set<Party> getSharedParties() {
		return sharedParties;
	}

	public void setSharedParties(Set<Party> sharedParties) {
		this.sharedParties = sharedParties;
	}
}
