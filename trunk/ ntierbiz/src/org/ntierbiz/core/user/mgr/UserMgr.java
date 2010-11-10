package org.ntierbiz.core.user.mgr;

import java.util.List;

import org.ntierbiz.core.user.model.BasicAddress;
import org.ntierbiz.core.user.model.BasicCredentials;
import org.ntierbiz.core.user.model.BasicProfile;
import org.ntierbiz.core.user.model.BasicProfilePO;


public interface UserMgr {

	public abstract boolean createUser(BasicProfile profile,
			BasicCredentials credentials, BasicAddress address);
	public abstract List<BasicProfilePO> getAllProfiles();
	

}