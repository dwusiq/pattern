package com.wusiq.observer;

/**
 * ����
 * @author v_wbsqwu
 *
 */
public class SubjectSun extends Subject {
	private String subjectMessage;


	public String getSubjectMessage() {
		return subjectMessage;
	}


	/**
	 * ����������Ϣ��ʱ�򣬴���֪ͨ
	 * @param subjectMessage
	 */
	public void setSubjectMessage(String subjectMessage) {
		this.subjectMessage = subjectMessage;
		notifyAllObserver();
	}


	/**
	 * ��д���෽�������崫�ݵĲ���
	 */
	@Override
	protected void notifyAllObserver() {
		if (list == null || list.size() == 0)
			return;

		for (Observer obs : list) {
			obs.update(this.subjectMessage);//Ĭ�ϲ�����Ϣ
		}
	}
	
	
}
