package com.awork;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {


		public static void main(String[] args) {
			List<Emp> a  = new ArrayList<>();
			a.add(new Emp(1, "Janice", 80000, "it"));
			a.add(new Emp(2, "Jose", 20000, "IT"));
			a.add(new Emp(3, "Maria", 90000, "Payroll"));
			a.add(new Emp(4, "Tyler", 10000, "Finance"));
			
			System.out.println("Employee with salaray > 40000");
			List<Emp> newdata= a.stream().filter((s)->s.getIncome()>40000).collect(Collectors.toList());
			for(Emp e: newdata) {
				System.out.println(e.getName().toUpperCase());
			}
			//<Employee> caps = newdata.stream().map(String::toUpperCase);
			//System.out.println(newdata);
			
			long data= a.stream().filter((s)->s.getDept().equalsIgnoreCase("IT")).count();
			System.out.println(data);
			
			Optional<Emp> emp = a.stream().collect(Collectors.maxBy(Comparator.comparingInt(Emp::getIncome)));
			System.out.println(emp);
			
			Optional<Emp> emp2 = a.stream().collect(Collectors.minBy(Comparator.comparingInt(Emp::getIncome)));
			System.out.println(emp2);
		}
		
	}
