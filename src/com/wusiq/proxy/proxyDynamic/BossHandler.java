package com.wusiq.proxy.proxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 该类可以在委托类的方法执行前后加逻辑
 * @author wicker
 *
 */
public class BossHandler implements InvocationHandler{
	Boss realBoss;
	public BossHandler(Boss realBoss) {
		this.realBoss = realBoss;
	}

	/**
	 * 重写invoke方法
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object returnMsg = null;
		System.out.println("方法调用前做了很多事情");
		returnMsg = method.invoke(realBoss, args);
		System.out.println("调用方法之后又做了很多事情");
		return returnMsg;
	}

}
