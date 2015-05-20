package spring3.hello;

public class HelloImp implements HelloApi {

	@Override
	public void sayHello() {
		System.out.println("This is the implement of sayHello method.");
	}

}
