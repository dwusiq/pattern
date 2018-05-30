package com.wusiq.observer;

/**
 * ¶©ÔÄÕßA
 * @author v_wbsqwu
 *
 */
public class ObserverA implements Observer{
	private String messageOfObserverA;
	

	@Override
	public void update(Object msg) {
		this.messageOfObserverA = (String) msg;
		System.out.println(toString());;
	}

	@Override
	public void register(Subject subject) {
		if(subject != null) 
			subject.register(this);
	}

	@Override
	public void unRegister(Subject subject) {
		if(subject != null) 
			subject.remove(this);
	}


	@Override
	public String toString() {
		return "ObserverA [messageOfObserverA=" + messageOfObserverA + "]";
	}

	
}
