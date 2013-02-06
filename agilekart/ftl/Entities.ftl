package com.xl.cm.core.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

@XmlRootElement(name = "${Entities}")
@XmlAccessorType(XmlAccessType.FIELD)
public class ${BigEntity}Mgr {

	 @XmlElement(name = "${Entity}")
	 protected List<${BigEntity}> ${Entities};

	public List<${BigEntity}> get${BigEntities}() {
		return ${Entities};
	}

	public void set${BigEntities}(List<${BigEntity}> ${Entities}) {
		this.${Entities} = ${Entities};
	}
	 
	public void add${BigEntity}(${BigEntity} ${Entity}){
		this.${Entities}.add(${Entity});
	}
	 
	public ${BigEntity} create${BigEntity}(String id) {
		${BigEntity} ${Entity}=new ${BigEntity}();
		${Entity}.set${BigEntity}ID(id);
		return ${Entity};
	}
	
	public ${BigEntity} find${BigEntity}(String ${Entity}ID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(${Entity}ID);
		BeanPredicate beanPredicate = new BeanPredicate("${Entity}ID", nameEqlPredicate);
		return (${BigEntity})CollectionUtils.find(get${BigEntities}(), beanPredicate);
	}
	
	public boolean is${BigEntity}(String ${Entity}ID) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(${Entity}ID);
		BeanPredicate beanPredicate = new BeanPredicate("${Entity}ID", nameEqlPredicate);
		return CollectionUtils.exists(get${BigEntities}(), beanPredicate);
	}
}
