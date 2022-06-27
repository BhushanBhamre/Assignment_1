package com.yash.assignment1;

public class ArrayListToMap {
	int itemId;
	String itemname;
	int itemprice;
	public ArrayListToMap(int itemId, String itemname, int itemprice) {
		super();
		this.itemId = itemId;
		this.itemname = itemname;
		this.itemprice = itemprice;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getItemprice() {
		return itemprice;
	}
	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}
	@Override
	public String toString() {
		return "ArrayListToMap [itemId=" + itemId + ", itemname=" + itemname + ", itemprice=" + itemprice + "]";
	}
	
	
}
