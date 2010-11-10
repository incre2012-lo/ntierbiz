package org.ntierbiz.unit.category.model;

import org.ntierbiz.core.orm.common.Persistent;

public interface CategoryContent extends Persistent{

	public abstract String getSmallDescription();

	public abstract void setSmallDescription(String smallDescription);

	public abstract String getLongDescription();

	public abstract void setLongDescription(String longDescription);

	public abstract String getLogo();

	public abstract void setLogo(String logo);

	public abstract String getThumbnail();

	public abstract void setThumbnail(String thumbnail);

	public abstract String getTitle();

	public abstract void setTitle(String title);

	public abstract String getImage();

	public abstract void setImage(String image);

	public abstract String getLargeImage();

	public abstract void setLargeImage(String largeImage);

}