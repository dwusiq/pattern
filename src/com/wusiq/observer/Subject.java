package com.wusiq.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 所有主题继承这个抽象类（也可以写成接口）
 * 
 * @author v_wbsqwu
 *
 */
public abstract class Subject {
	protected List<Observer> list = new ArrayList<>();
	
	/**
	 * 注册观察者
	 * 
	 * @param obs
	 *            需要注册的观察者
	 */
	protected void register(Observer obs) {
		this.list.add(obs);
	}

	
	/**
	 * 取消订阅
	 * 
	 * @param obs
	 *  需要被取消订阅的观察者
	 */
	protected void remove(Observer obs) {
		if (list == null || list.size() == 0)
			return;

		if (list.contains(obs)) {
			list.remove(obs);
		}
	}

	/**
	 * 通知所有的观察者
	 */
	protected void notifyAllObserver() {
		if (list == null || list.size() == 0)
			return;

		for (Observer obs : list) {
			obs.update(null);//默认不传消息
		}
	}
}
