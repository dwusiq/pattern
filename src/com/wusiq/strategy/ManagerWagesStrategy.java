package com.wusiq.strategy;

/**
 * ����Ĺ��ʲ���
 * @author v_wbsqwu
 *
 */
public class ManagerWagesStrategy implements WagesStrategy{

	@Override
	public void payMoney() {
	   System.out.println("����");
	   System.out.println("֧�����ʣ�20000Ԫ");
	}

}
