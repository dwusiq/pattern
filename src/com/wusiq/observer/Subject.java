package com.wusiq.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������̳���������ࣨҲ����д�ɽӿڣ�
 * 
 * @author v_wbsqwu
 *
 */
public abstract class Subject {
	protected List<Observer> list = new ArrayList<>();
	
	/**
	 * ע��۲���
	 * 
	 * @param obs
	 *            ��Ҫע��Ĺ۲���
	 */
	protected void register(Observer obs) {
		this.list.add(obs);
	}

	
	/**
	 * ȡ������
	 * 
	 * @param obs
	 *  ��Ҫ��ȡ�����ĵĹ۲���
	 */
	protected void remove(Observer obs) {
		if (list == null || list.size() == 0)
			return;

		if (list.contains(obs)) {
			list.remove(obs);
		}
	}

	/**
	 * ֪ͨ���еĹ۲���
	 */
	protected void notifyAllObserver() {
		if (list == null || list.size() == 0)
			return;

		for (Observer obs : list) {
			obs.update(null);//Ĭ�ϲ�����Ϣ
		}
	}
}
