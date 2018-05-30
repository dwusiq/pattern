package com.wusiq.strategy;

/**
 * 经理的工资策略
 * @author v_wbsqwu
 *
 */
public class ManagerWagesStrategy implements WagesStrategy{

	@Override
	public void payMoney() {
	   System.out.println("经理");
	   System.out.println("支付工资：20000元");
	}

}
