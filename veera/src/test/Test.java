package test;

import java.io.Console;
import java.util.Objects;

public class Test {

	public static void main(String[] args) {
		System.out.println("Just Created This Class So That I Would Be Able To Practice What I'ma Learning.");
		Console console = System.console();
		String property = System.getProperty("ifconfig");
		System.out.println("prop === > "  + property);
		System.out.println("Enter Useraname : ");
		System.out.println("Thinking this Console Object is Empty or Null === > " + Objects.isNull(console));
		String userName = console.readLine();
		System.out.println("Enter Password : ");
		String password = console.readPassword().toString();
		System.out.println("The Username is " + userName + " with Password " + password);
	}

}
