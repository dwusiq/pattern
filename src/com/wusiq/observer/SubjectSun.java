package com.wusiq.observer;

/**
 * 主题
 * @author v_wbsqwu
 *
 */
public class SubjectSun extends Subject {
	private String subjectMessage;


	public String getSubjectMessage() {
		return subjectMessage;
	}


	/**
	 * 设置主题消息的时候，触发通知
	 * @param subjectMessage
	 */
	public void setSubjectMessage(String subjectMessage) {
		this.subjectMessage = subjectMessage;
		notifyAllObserver();
	}


	/**
	 * 重写父类方法，定义传递的参数
	 */
	@Override
	protected void notifyAllObserver() {
		if (list == null || list.size() == 0)
			return;

		for (Observer obs : list) {
			obs.update(this.subjectMessage);//默认不传消息
		}
	}
	
	
}
