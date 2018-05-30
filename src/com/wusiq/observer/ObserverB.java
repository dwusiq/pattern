package com.wusiq.observer;

/**
 * ¶©ÔÄÕßB
 * @author v_wbsqwu
 *
 */
public class ObserverB implements Observer{
	private String messageOfObserverB;
	

	@Override
	public void update(Object msg) {
		this.messageOfObserverB = (String) msg;
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
		return "ObserverB [messageOfObserverB=" + messageOfObserverB + "]";
	}



	
}
