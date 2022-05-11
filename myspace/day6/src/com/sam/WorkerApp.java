package com.sam;

public class WorkerApp {

	
		// TODO Auto-generated method stub
public static void execute (worker wi) {
	wi.doSomeWork();
}
public static void main(String[] args) {
	execute(new worker() {
	public void doSomeWork() {
		System.out.println("Something");
	}
	});
	execute(()->System.out.println("Do again"));
	}

}
