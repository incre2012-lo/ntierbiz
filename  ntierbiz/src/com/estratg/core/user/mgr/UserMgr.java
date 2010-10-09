package com.estratg.core.user.mgr;

import java.util.List;

import com.estratg.core.user.model.BasicAddress;
import com.estratg.core.user.model.BasicCredentials;
import com.estratg.core.user.model.BasicProfile;
import com.estratg.core.user.model.BasicProfilePO;

public interface UserMgr {

	public abstract boolean createUser(BasicProfile profile,
			BasicCredentials credentials, BasicAddress address);
	public abstract List<BasicProfilePO> getAllProfiles();
	

}