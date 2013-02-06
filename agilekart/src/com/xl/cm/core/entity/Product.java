package com.xl.cm.core.entity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


import javax.xml.bind.annotation.*;


import org.apache.commons.lang.StringUtils;

@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
	
	@XmlAttribute (name = "productID")
	private String productID;
	
	@XmlAttribute (name = "productModel")
	private String productModel;
	
	@XmlAttribute (name = "productPrice")
	private BigDecimal productPrice;
	
	@XmlAttribute (name = "productStatus")	
	private boolean productStatus;
	
	@XmlAttribute (name = "productManufacturer")
	private String productManufacturer;
	
	@XmlAttribute (name = "productSortOrder")
	private int productSortOrder;

	@XmlElement (name = "productImage")
	private String productImage;
	
	@XmlElement (name = "productImage1")
	private String productImage1;
	
	@XmlElement (name = "productImage2")
	private String productImage2;
	
	@XmlElement (name = "productImage3")
	private String productImage3;
	
	@XmlElement (name = "productImage4")
	private String productImage4;	
	

	@XmlElement (name = "desc") 
	private String desc;
	
	@XmlElement(name = "shortDesc")
	private String shortDesc;
	
	@XmlElement(name = "title")
	private String title;
	
	@XmlElement(name = "productUrl")
	private String productUrl;
	
	@XmlElement(name = "productHighlight")
	private String productHighlight;
	
	@XmlElement(name = "seUrlSrc")
	private String seUrlSrc;
	
	@XmlElement(name = "seUrl")
	private String seUrl;

	@XmlElement(name = "metatagTitle")
	private String metatagTitle;
	
	@XmlElement(name = "metatagKeywords")
	private String metatagKeywords;
	
	@XmlElement(name = "metatagDescription")
	private String metatagDescription;
	
	@XmlElement(name = "urlPath")
	private String urlPath;
	
	
	@XmlAttribute(name = "mrp")
	private BigDecimal mrp;
	
	@XmlElement(name = "brand")
	private String brand;
	
	@XmlElement(name = "vatPercent")
	private String vatPercent;
	
	@XmlElement(name = "supplierPrice")
	private BigDecimal supplierPrice;
	
	@XmlElement(name = "unitQty")
	private String unitQty;
	
	@XmlElement(name = "sku")
	private String sku;
	
	@XmlElement(name = "typecode")
	private String typecode;
	
	@XmlElement(name = "variationAttrs")
	private String variationAttrs;
	
	@XmlElement(name = "prefix")
	private String prefix;
	
	public String getProductID() {
		return productID;
	}

	public void setProductID(String entity) {
		this.productID = entity;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String text) {
		this.desc = text;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public boolean isProductStatus() {
		return productStatus;
	}

	public void setProductStatus(boolean productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	public int getProductSortOrder() {
		return productSortOrder;
	}

	public void setProductSortOrder(int productSortOrder) {
		this.productSortOrder = productSortOrder;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public java.lang.String getProductImage1() {
		return productImage1;
	}

	public void setProductImage1(java.lang.String productImage1) {
		this.productImage1 = productImage1;
	}

	public java.lang.String getProductImage2() {
		return productImage2;
	}

	public void setProductImage2(java.lang.String productImage2) {
		this.productImage2 = productImage2;
	}

	public java.lang.String getProductImage3() {
		return productImage3;
	}

	public void setProductImage3(java.lang.String productImage3) {
		this.productImage3 = productImage3;
	}

	public java.lang.String getProductImage4() {
		return productImage4;
	}

	public void setProductImage4(java.lang.String productImage4) {
		this.productImage4 = productImage4;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	public String getProductHighlight() {
		return productHighlight;
	}

	public void setProductHighlight(String productHighlight) {
		this.productHighlight = productHighlight;
	}

	public String getSeUrlSrc() {
		return seUrlSrc;
	}

	public void setSeUrlSrc(String seUrlSrc) {
		this.seUrlSrc = seUrlSrc;
	}

	public String getSeUrl() {
		return seUrl;
	}

	public void setSeUrl(String seUrl) {
		this.seUrl = seUrl;
	}

	public String getMetatagTitle() {
		return metatagTitle;
	}

	public void setMetatagTitle(String metatagTitle) {
		this.metatagTitle = metatagTitle;
	}

	public String getMetatagKeywords() {
		return metatagKeywords;
	}

	public void setMetatagKeywords(String metatagKeywords) {
		this.metatagKeywords = metatagKeywords;
	}

	public String getMetatagDescription() {
		return metatagDescription;
	}

	public void setMetatagDescription(String metatagDescription) {
		this.metatagDescription = metatagDescription;
	}

	public BigDecimal getMrp() {
		return mrp;
	}

	public void setMrp(BigDecimal mrp) {
		this.mrp = mrp;
	}

	
	public String getUrlPath() {
		return urlPath;
	}

	public void setUrlPath(String urlPath) {
		this.urlPath = urlPath;
	}

	
	public String getBrand() {
	    return brand;
	}

	public void setBrand(String brand) {
	    this.brand = brand;
	}

	
	
	public String getVatPercent() {
	    return vatPercent;
	}

	public void setVatPercent(String vatPercent) {
	    this.vatPercent = vatPercent;
	}

	
	public BigDecimal getSupplierPrice() {
	    return supplierPrice;
	}

	public void setSupplierPrice(BigDecimal supplierPrice) {
	    this.supplierPrice = supplierPrice;
	}

	
	
	public String getSku() {
	    return sku;
	}

	public void setSku(String sku) {
	    this.sku = sku;
	}

	public String getUnitQty() {
	    return unitQty;
	}

	public void setUnitQty(String unitQty) {
	    this.unitQty = unitQty;
	}

	
	
	public String getTypecode() {
	    return typecode;
	}

	public void setTypecode(String typecode) {
	    this.typecode = typecode;
	}

	
	
	public String getVariationAttrs() {
	    return variationAttrs;
	}

	public void setVariationAttrs(String variationAttrs) {
	    this.variationAttrs = variationAttrs;
	}

	
	
	public String getPrefix() {
	    return prefix;
	}

	public void setPrefix(String prefix) {
	    this.prefix = prefix;
	}

	public List<String> getImagesPath(){
		List<String> imagepaths=new ArrayList<String>();
		if(!StringUtils.isBlank(getProductImage1())){
			imagepaths.add(getProductImage1());
		}
		if(!StringUtils.isBlank(getProductImage2())){
			imagepaths.add(getProductImage2());
		}
		if(!StringUtils.isBlank(getProductImage3())){
			imagepaths.add(getProductImage3());
		}
		if(!StringUtils.isBlank(getProductImage4())){
			imagepaths.add(getProductImage4());
		}
		
		return imagepaths;
	}
	public String getFormatHTMLProductPrice(){
		String savediscount = null;
		double fprodprice = 0;
		fprodprice = mrp.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
		double fdiscountprice = productPrice.setScale(2,
				BigDecimal.ROUND_HALF_UP).doubleValue();
		double arith = fdiscountprice / fprodprice;
		double fsdiscount = 100 - arith * 100;
		Float percentagediscount = new Float(fsdiscount);
		savediscount = String.valueOf(percentagediscount.intValue());
		StringBuffer p = new StringBuffer();
		p.append("<div class='product-price'>");
		if (productPrice == null) {
			p.append("<div class='product-price-price' style='width:50%;float:left;'>");
			p.append("INR").append(" ").append(mrp);		
			p.append("</div>");
			p.append("<div class='product-line'>&nbsp;</div>");
		} else {
			p.append("<div style='width:50%;float:left;'>");
			p.append("<strike>");			
			p.append("INR").append(" ").append(mrp);
			p.append("</strike>");
			p.append("</div>");
			p.append("<div style='width:50%;float:right;'>");
			p.append("<font color='red'>");
			p.append("INR").append(" ").append(productPrice);			
			p.append("</font>").append("<br>").append(
					"<font color='red' style='font-size:75%;'>").append("Save").append(": ").append(
							savediscount).append(
					"%").append(" ").append("OFF").append(
					"</font>");

			p.append("</div>").toString();
		}
		p.append("</div>");
		return p.toString();
	}
	
}
