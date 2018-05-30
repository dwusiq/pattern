package com.wusiq.strategy;

/**
 * 普通员工的工资策略
 * @author v_wbsqwu
 *
 */
public class EmployeeWagesStrategy implements WagesStrategy{

	@Override
	public void payMoney() {
	   System.out.println("普通员工");
	   System.out.println("支付工资：3000元");
	}

}
