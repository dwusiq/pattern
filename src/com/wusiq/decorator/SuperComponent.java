package com.wusiq.decorator;

/**
 * �������ʵ�ֳ����ӿ�
 * ���е�������̳г������
 * @author wicker
 *
 */
public class SuperComponent implements SuperInterface{
	private SuperInterface myEntity;
	
	public SuperComponent(SuperInterface myEntity) {
		this.myEntity = myEntity;
	}

	/**
	 * ������ʵ�ֵķ���
	 */
	@Override
	public void doSomething() {
		myEntity.doSomething();
	}

}
