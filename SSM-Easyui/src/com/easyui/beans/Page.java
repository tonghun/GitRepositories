package com.easyui.beans;

public class Page {

	private int page;
	private int rows;
	private int start;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getStart() {
		System.out.println("getStart");
		return (page - 1) * rows;
	}

	@Override
	public String toString() {
		return "Page [page=" + page + ", rows=" + rows + ", start=" + start + "]";
	}

}
