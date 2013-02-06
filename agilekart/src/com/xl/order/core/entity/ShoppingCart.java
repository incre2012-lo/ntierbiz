/*
 * Licensed to csti consulting 
 * You may obtain a copy of the License at
 *
 * http://www.csticonsulting.com
 * Copyright (c) 2006-Aug 24, 2010 Consultation CS-TI inc. 
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.xl.order.core.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.xl.system.core.util.CartUtil;

public class ShoppingCart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String errorMessage;

	private String total;

	private int quantity = 0;
	
	
	private Map <String,ShoppingCartProduct> products;


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Map<String, ShoppingCartProduct> getProducts() {
		return products;
	}

	public void setProducts(Map<String, ShoppingCartProduct> products) {
		this.products = products;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	


	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	public void update(){
		if(products.size()>0){
			this.quantity=CartUtil.getProductCount(products.values());
			this.total="INR "+String.valueOf(CartUtil.getTotalAmount(products.values()));
		}else{
			this.quantity=0;
			this.total="INR 0.00";
		}	
	}
	
	public void clear(){
	    this.products.clear();
	    this.quantity=0;
	    this.total="INR 0.00"; 
	}
	public ShoppingCart(){
			this.products=new HashMap<String, ShoppingCartProduct>();
			this.quantity=0;
			this.total="INR 0.00"; 
		}	
	
	

}
