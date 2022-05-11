package com.stream;
import java.util.ArrayList;
public class Products {

	private int PId;
	private String pName;
	private int price;
	@Override
	public String toString() {
		return "Products [PId=" + PId + ", pName=" + pName + ", price=" + price + "]";
	}
	public Products(int pId, String pName, int price) {
		super();
		PId = pId;
		this.pName = pName;
		this.price = price;
	}
	public int getPId() {
		return PId;
	}
	public void setPId(int pId) {
		PId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
	