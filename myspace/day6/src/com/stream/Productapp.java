package com.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sam.User;


public class Productapp {
public static void main(String[] args) {
	ArrayList<Products> al=new ArrayList<Products>();
	al.add(new Products(101,"adam",12));
	al.add(new Products(102,"adamq",23));
	al.add(new Products(103,"adamw",51));
	//ArrayList<String> newdata=al.stream().sorted().filter((s)->s.startsWith("a")).map(String::toUpperCase).collect(Collectors.toList());
	//System.out.println(newdata);
	//Task is salary <2000
	
}
}
