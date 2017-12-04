package ex.inter.face;

public class JavaInterfaceExample implements interfaceA,interfaceB {

	@Override
	public void exampleHello() {
		System.out.println("hello");
	}

	@Override
	public void exampleBye() {
		System.out.println("bye");
	}
	
}
