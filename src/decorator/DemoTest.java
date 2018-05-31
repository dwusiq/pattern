package decorator;

/**
 * 测试类
 * @author wicker
 *
 */
public class DemoTest {
  public static void main(String[] args) {
	  SuperInterface myEntity = new MyEntity();//创建一个将要被装饰的对象
	  
	  System.out.println("用组件A来装饰实体-----------");
	  SuperInterface componentA = new ComponentA(myEntity);
	  componentA.doSomething();
	  
	  System.out.println();
	  System.out.println("用组件B来装饰实体-----------");
	  SuperInterface componentB = new ComponentB(myEntity);
	  componentB.doSomething();
	  
	  System.out.println();
	  System.out.println("同时用组件A和组件B来装饰实体-----------");
	  SuperInterface componentBoth = new ComponentA(myEntity);
	  componentBoth = new ComponentB(componentBoth);
	  componentBoth.doSomething();
}
}
