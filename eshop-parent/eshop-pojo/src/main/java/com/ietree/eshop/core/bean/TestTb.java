package com.ietree.eshop.core.bean;

import java.io.Serializable;

public class TestTb implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String description;
	private String imgUrl;
	private String webSite;
	private Integer sort;
	private Integer isDisplay;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getIsDisplay() {
		return isDisplay;
	}

	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}

	@Override
	public String toString() {
		return "TestTb [id=" + id + ", name=" + name + ", description=" + description + ", imgUrl=" + imgUrl
				+ ", webSite=" + webSite + ", sort=" + sort + ", isDisplay=" + isDisplay + "]";
	}

}
