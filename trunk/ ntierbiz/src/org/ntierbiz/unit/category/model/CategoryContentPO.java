package org.ntierbiz.unit.category.model;

import org.ntierbiz.core.orm.common.PersistentPO;

public class CategoryContentPO  extends PersistentPO implements CategoryContent{
	private String smallDescription;
	private String longDescription;
	private String logo;
	private String thumbnail;
	private String title;
	private String image;
	private String largeImage;
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#getSmallDescription()
	 */
	@Override
	public String getSmallDescription() {
		return smallDescription;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#setSmallDescription(java.lang.String)
	 */
	@Override
	public void setSmallDescription(String smallDescription) {
		this.smallDescription = smallDescription;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#getLongDescription()
	 */
	@Override
	public String getLongDescription() {
		return longDescription;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#setLongDescription(java.lang.String)
	 */
	@Override
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#getLogo()
	 */
	@Override
	public String getLogo() {
		return logo;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#setLogo(java.lang.String)
	 */
	@Override
	public void setLogo(String logo) {
		this.logo = logo;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#getThumbnail()
	 */
	@Override
	public String getThumbnail() {
		return thumbnail;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#setThumbnail(java.lang.String)
	 */
	@Override
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#getImage()
	 */
	@Override
	public String getImage() {
		return image;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#setImage(java.lang.String)
	 */
	@Override
	public void setImage(String image) {
		this.image = image;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#getLargeImage()
	 */
	@Override
	public String getLargeImage() {
		return largeImage;
	}
	/* (non-Javadoc)
	 * @see org.ntierbiz.unit.category.model.CategoryContent#setLargeImage(java.lang.String)
	 */
	@Override
	public void setLargeImage(String largeImage) {
		this.largeImage = largeImage;
	}
	
}
