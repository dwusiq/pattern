package com.wusiq.observer;

/**
 * ���й۲���ʵ������ӿ�
 * @author v_wbsqwu
 *
 */
public interface Observer {
	void update(Object msg);//ͨ������ӿڽ���֪ͨ
	void register(Subject subject);//����
	void unRegister(Subject subject);//ȡ������
}
