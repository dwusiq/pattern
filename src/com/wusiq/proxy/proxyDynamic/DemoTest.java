package com.wusiq.proxy.proxyDynamic;

import java.lang.reflect.Proxy;

/**
 * 测试类
 * @author wicker
 *
 */
public class DemoTest {
   public static void main(String[] args) {
	   Boss realBoss = new RealBoss();
	   BossHandler handler = new BossHandler(realBoss);
	   Boss proxy = (Boss) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Boss.class}, handler);
	   
	   //老板出差
	   proxy.businessTrip();
}
}
