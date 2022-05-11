package com.testapp;
import java.util.ArrayList;
import java.util.Iterator;
public class Shopping {
private ArrayList<Product> al;

public Shopping(){
	al=new ArrayList<Product>();
}
public void AddItem(Product product) {
	al.add(product);
}
public int getItemscount()
{
	return al.size();
}
public void removeProduct(Product item)
throws ProductNotFoundException
{
	if(!al.remove(item)) {
		throw new ProductNotFoundException();
	}
	al.remove(item);
}
public double getBalance() {
	double balance=0.00;
	for(Iterator i =al.iterator();i.hasNext();) {
		Product item=(Product) i.next();
		balance+=item.getPrice();
		
	}
return balance;
}

}

