package com.wusiq.proxy.proxyStatic;

/**
 * boss代理类（即静态代理类）
 * @author wicker
 *
 */
public class ProxyBoss implements Boss{
	
	private Boss realBoss;//持有真正对象的引用
	
	public ProxyBoss(Boss realBoss) {
		this.realBoss = realBoss;
	}

	/**
	 * 出差
	 */
	@Override
	public void businessTrip() {
		System.out.println("购买机票");
		System.out.println("安排专车送机");
		System.out.println("订好目的地下榻");
		System.out.println("安排接机人员");
		realBoss.businessTrip();
		System.out.println("通知接机人员准备接机");
	}

}
