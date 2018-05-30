package com.wusiq.strategy;

public class DemoTest {
	private WagesStrategy wagesStrategy=null;
	public DemoTest(WagesStrategy wages) {
		this.wagesStrategy = wages;
	}
	
   public static void main(String[] args) {
	   DemoTest test1 = new DemoTest(new EmployeeWagesStrategy());
	   DemoTest test2 = new DemoTest(new TechnicianWagesStrategy());
	   DemoTest test3 = new DemoTest(new ManagerWagesStrategy());
	   
	   test1.wagesStrategy.payMoney();
	   test2.wagesStrategy.payMoney();
	   test3.wagesStrategy.payMoney();
}
}
