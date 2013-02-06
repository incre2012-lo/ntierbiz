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
import java.util.Collection;
import java.util.Date;

public class OrderInvoice implements Serializable {

	private static final long serialVersionUID = 1L;

	private String orderID;
	private String merchantStoreName;
	private int status;
	private String statusText;

	private String merchantStoreLogo;
	private String storeEmailAddress;
	private String storeAddress;
	private String storeCity;
	private String storeCountry;
	private String storeState;
	private String storepostalcode;

	private Date orderDate;
	private boolean isOrderUnpaid;
	private Date dueDate;

	// Customer Billing Address
	private String customerBillingStreetAddress;
	private String customerBillingPostalCode;
	private String customerBillingCity;
	private String customerBillingCountry;
	private String customerBillingState;
	private String customerBillingCountryName;
	private String customerBillingName;

	// If shipping is applicable
	private boolean shipping;

	// Shipping address
	private String customerStreetAddress;
	private String customerPostalCode;
	private String customerCity;
	private String customerCompany;
	private String customerZone;
	private String customerCountry;
	private String customerState;
	private String comments;

	private Collection<OrderProduct> orderProducts;

	private Collection<OrderTotal> orderTotal;
	private Collection<OrderTotal> orderSubTotals;
	private Collection<OrderTotal> orderCredits;
	private Collection<OrderTotal> orderRecurings;

	private String shippingMethods = "";
	private String paymentMethods = "";


}
