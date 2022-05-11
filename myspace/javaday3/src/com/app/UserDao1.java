package com.app;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
public class UserDao1 implements UserDao{
public void adduser(user user1) throws Daoexception{
	try {
		FileOutputStream fos = new FileOutputStream("c:\\");
	}catch(FileNotFoundException e) {
		throw new Daoexception("went wrong",e);
	}
}
}
