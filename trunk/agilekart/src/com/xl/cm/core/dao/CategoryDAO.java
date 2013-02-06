package com.xl.cm.core.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.EqualPredicate;
import org.apache.commons.collections.functors.NotPredicate;

import com.xl.cm.core.entity.Category;
import com.xl.cm.core.entity.CategoryMgr;
import com.xl.cm.core.entity.Product;
import com.xl.cm.core.entity.ProductCategoryAssign;
import com.xl.cm.core.entity.ProductMgr;
import com.xl.cm.core.entity.RelationMgr;
import com.xl.cm.core.mgr.CategoryMgrFactory;
import com.xl.cm.core.mgr.ProductMgrFactory;
import com.xl.cm.core.mgr.RelationMgrFactory;


public class CategoryDAO {
	private CategoryMgr mgr;
	private ProductMgr prdmgr;
	private RelationMgr relmgr;
	
	public CategoryDAO(){
			mgr =CategoryMgrFactory.getInstance().getMgr();
			relmgr=RelationMgrFactory.getInstance().getMgr();
			prdmgr=ProductMgrFactory.getInstance().getMgr();
	}
	
	public List<Category> getAllCategories(){
		return mgr.getCategories();
	}
	public void persist(){
		CategoryMgrFactory.getInstance().persist();
	}
	
	public void addCategory(Category category){	
		if(!mgr.isCategory(category.getCategoryID()))
			mgr.addCategory(category);
	}	
	
	public Category getCategory(String categoryID ){
		if(!mgr.isCategory(categoryID))		
			return mgr.createCategory(categoryID);
		else{
			return mgr.findCategory(categoryID);
		}			
	}
	public List<Category> getSubCategories(String categoryID){
		EqualPredicate nameEqlPredicate = new EqualPredicate(categoryID);
		BeanPredicate beanPredicate = new BeanPredicate("parentCategoryID", nameEqlPredicate);
		 return (List<Category>) CollectionUtils.select(mgr.getCategories(),beanPredicate);
	}
	
	public List<Product> getCategoryProducts(String categoryID) {
		List<Product> list=new ArrayList<Product>();
		if(relmgr==null){
			return list;				
		}		
		EqualPredicate nameEqlPredicate = new EqualPredicate(categoryID);
		BeanPredicate beanPredicate = new BeanPredicate("categoryID", nameEqlPredicate);		
		List <ProductCategoryAssign> productCategoryAssign=(List<ProductCategoryAssign>) CollectionUtils.select(relmgr.getProductCategoriesAssign(), beanPredicate);		
		  Transformer transformer = new Transformer( ) {
			  public Object transform(Object object) {
				  ProductCategoryAssign  assign = (ProductCategoryAssign) object;
				  return prdmgr.findProduct(assign.getProductID());
              }
		  };
		  CollectionUtils.collect(productCategoryAssign, transformer,list);
		  return (List<Product>)CollectionUtils.select( list,new BeanPredicate("typecode", new NotPredicate(new EqualPredicate("6"))));		
	}
	
	public void assignCategoryToProduct(Category cat,Product prd){
		relmgr.assignProductCategory(prd.getProductID(), cat.getCategoryID());
		RelationMgrFactory.getInstance().persist();
	}
	
	static class CategoryDAOHolder{
		private static final CategoryDAO _instance=new CategoryDAO();
	}
	
	public static CategoryDAO getInstance(){
		return CategoryDAOHolder._instance;
	}
}
