package com.rui.pro1.modules.sys.entity;

import java.io.Serializable;

/**
 * The persistent class for the sys_department database table.
 * 
 */

public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private int parentId;

	private String parentIds;

	private String remake;

	private int sort;

	private Integer status;
	


	public Department() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParentIds() {
		return this.parentIds;
	}

	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}

	public String getRemake() {
		return this.remake;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", parentId="
				+ parentId + ", parentIds=" + parentIds + ", remake=" + remake
				+ ", sort=" + sort + ", status=" + status + "]";
	}

}