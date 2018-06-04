package com.wusiq.singleton;

/**
 * 枚举单例模式
 * 避免了反射和反序列化的漏洞
 * 没有延迟加载
 * @author wicker
 *
 */
public enum Singleton04 {
  INSTANCE;//这个枚举本身是单例对象
	
	//可以添加自己需要的操作
	public void myMethod() {}
}
