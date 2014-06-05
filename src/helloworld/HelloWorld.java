package helloworld;

public class HelloWorld {
	
	//MEMBER
	int n = 0;
	
	//CONSTRUCTOR
	public HelloWorld() {
		n = 1;
	}
	
	public HelloWorld(int arg) {
		n = arg;
	}
	
	//METHOD
	public void print() {
		for(int i = 0; i < n; i++) {
			System.out.println("HelloWorld!");
		}
	}
	
}