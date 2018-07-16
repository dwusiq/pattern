package com.wusiq.proxy.proxyDynamic;

/**
 * 真正的Boss类（委托类，即被代理的类）
 * @author wicker
 *
 */
public class RealBoss implements Boss{

	/**
	 * 出差（只做核心的主要业务，其他关联的非主要业务可以交给代理类去做）
	 */
	@Override
	public void businessTrip() {
		System.out.print("############老板现在起程出差");
		System.out.println();
	}

}
