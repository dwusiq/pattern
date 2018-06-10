package decorator;

/**
 * ������
 * @author wicker
 *
 */
public class DemoTest {
  public static void main(String[] args) {
	  SuperInterface myEntity = new MyEntity();//����һ����Ҫ��װ�εĶ���
	  
	  System.out.println("�����A��װ��ʵ��-----------");
	  SuperInterface componentA = new ComponentA(myEntity);
	  componentA.doSomething();
	  
	  System.out.println();
	  System.out.println("�����B��װ��ʵ��-----------");
	  SuperInterface componentB = new ComponentB(myEntity);
	  componentB.doSomething();
	  
	  System.out.println();
	  System.out.println("ͬʱ�����A�����B��װ��ʵ��-----------");
	  SuperInterface componentBoth = new ComponentA(myEntity);
	  componentBoth = new ComponentB(componentBoth);
	  componentBoth.doSomething();
}
}
