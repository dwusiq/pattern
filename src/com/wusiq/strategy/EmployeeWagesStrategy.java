package com.wusiq.strategy;

/**
 * ��ͨԱ���Ĺ��ʲ���
 * @author v_wbsqwu
 *
 */
public class EmployeeWagesStrategy implements WagesStrategy{

	@Override
	public void payMoney() {
	   System.out.println("��ͨԱ��");
	   System.out.println("֧�����ʣ�3000Ԫ");
	}

}
