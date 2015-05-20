package spring3.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

	public static void main(String[] args) {
		// 1����ȡ�����ļ�ʵ����һ��IoC����
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"hello/hello.xml");

		// 2���������л�ȡBean��ע��˴���ȫ������ӿڱ�̣�����������ʵ�֡�
		HelloApi helloApiObj = context.getBean("hello", HelloApi.class);

		// 3��ִ��ҵ���߼�
		helloApiObj.sayHello();
	}

}
