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
import java.math.BigDecimal;

public class ShoppingCartProduct implements Serializable {

	private BigDecimal price;
	private int quantity = 1;
	private String productName;
	private String image;
	private String productID;
	private String priceText;
	private String mainCartLine;
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getPriceText() {
		return priceText;
	}
	public void setPriceText(String priceText) {
		this.priceText = priceText;
	}
	public String getMainCartLine() {
		return mainCartLine;
	}
	public void setMainCartLine(String mainCartLine) {
		this.mainCartLine = mainCartLine;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ShoppingCartProduct&&productID!=null){
		
			return productID.equals(((ShoppingCartProduct)obj).productID);
		}else
			return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return productID.hashCode()+45;
	}




}
