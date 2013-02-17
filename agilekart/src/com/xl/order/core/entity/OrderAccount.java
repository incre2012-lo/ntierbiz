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

// Generated Mar 28, 2009 11:17:22 AM by Hibernate Tools 3.2.0.beta8

import java.util.Date;
import java.util.Set;

/**
 * OrdersAccount generated by hbm2java
 */
public class OrderAccount implements java.io.Serializable {

	// Fields

	private String orderAccountID;

	private String orderID;

	private int orderAccountStatusID;

	private Date orderAccountStartDate;

	private Date orderAccountEndDate;

	private int orderAccountBillDay;

	private Set orderAccountProducts;

	
	

}