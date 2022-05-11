package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectiontest {
public static void main(String[] args) throws ClassNotFoundException,SQLException{
Class.forName("com.mysql.jdbc.Driver");
Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root123");
System.out.println("connected..");
}
}
