package com.wusiq.strategy;

/**
 * 技术员工的工资策略
 * @author v_wbsqwu
 *
 */
public class TechnicianWagesStrategy implements WagesStrategy{

	@Override
	public void payMoney() {
	   System.out.println("技术员工");
	   System.out.println("支付工资：8000元");
	}

}
