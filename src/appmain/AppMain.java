package appmain;

import helloworld.HelloWorld;

public class AppMain {
	
	//MAIN
	public static void main(String[] args) {
		if(args.length > 0) {
			HelloWorld app = new HelloWorld(Integer.parseInt(args[0]));
			app.print();
		}else {
			HelloWorld app = new HelloWorld();
			app.print();
		}
	}
	
}