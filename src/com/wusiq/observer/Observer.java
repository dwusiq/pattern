package com.wusiq.observer;

/**
 * 所有观察者实现这个接口
 * @author v_wbsqwu
 *
 */
public interface Observer {
	void update(Object msg);//通过这个接口接收通知
	void register(Subject subject);//订阅
	void unRegister(Subject subject);//取消订阅
}
