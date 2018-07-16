package com.wusiq.proxy.proxyStatic;

/**
 * 测试类
 * @author wicker
 *
 */
public class DemoTest {
   public static void main(String[] args) {
	   Boss realBoss = new RealBoss();
	   Boss proxyBoss = new ProxyBoss(realBoss);
	   
	   //老板出差
	   proxyBoss.businessTrip();
}
}
