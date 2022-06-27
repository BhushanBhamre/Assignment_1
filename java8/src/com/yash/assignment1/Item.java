package com.yash.assignment1;

public class Item {
	int itemid;
	String itemname;
	int itemprice;
	public Item(int itemid, String itemname, int itemprice) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemname=" + itemname + ", itemprice=" + itemprice + "]";
	}


}
