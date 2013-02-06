package com.paldaps.bo.entity.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

import com.paldaps.system.core.domain.DomainObject;

@Entity
@Table(name = "user", uniqueConstraints = {
@UniqueConstraint(columnNames = "email")})
public class User implements DomainObject {

	 private static final long serialVersionUID = 1L;
	   
 	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String uuid;
 	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Integer version;	
	private String permissions;
	
	public String getUuid() {
	    return uuid;
	}
	public void setUuid(String uuid) {
	    this.uuid = uuid;
	}
	public String getFirstName() {
	    return firstName;
	}
	public void setFirstName(String firstName) {
	    this.firstName = firstName;
	}
	public String getLastName() {
	    return lastName;
	}
	public void setLastName(String lastName) {
	    this.lastName = lastName;
	}	
	public String getEmail() {
	    return email;
	}
	public void setEmail(String email) {
	    this.email = email;
	}
	public String getPassword() {
	    return password;
	}
	public void setPassword(String password) {
	    this.password = password;
	}
	
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
			
	@Version
	public Integer getVersion() {
	        return version;
	 }
	public void setVersion(Integer version) {
	        this.version = version;
	}
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
