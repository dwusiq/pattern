package com.wusiq.strategy;

/**
 * ����Ա���Ĺ��ʲ���
 * @author v_wbsqwu
 *
 */
public class TechnicianWagesStrategy implements WagesStrategy{

	@Override
	public void payMoney() {
	   System.out.println("����Ա��");
	   System.out.println("֧�����ʣ�8000Ԫ");
	}

}
