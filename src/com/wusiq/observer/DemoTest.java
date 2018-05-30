package com.wusiq.observer;

public class DemoTest {
   public static void main(String[] args) {
	//初始化主题和观察者
	SubjectSun subject = new SubjectSun();
	ObserverA obsA = new ObserverA();
	ObserverB obsB = new ObserverB();

	//观察者分别订阅主题
	obsA.register(subject);
	obsB.register(subject);
	
	//主题状态发生变化,留意观察者打印的消息
	subject.setSubjectMessage("主题消息发生了变化");
	
	System.out.println("------------------------");
	
	//观察者A取消订阅
	 obsA.unRegister(subject);
	 //主题发生变化，留意观察者打印的消息
	 subject.setSubjectMessage("A取消订阅后，主题消息又发生了变化");
}
}
