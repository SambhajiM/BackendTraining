package demo1;

public class TestGreetingWithoutJava8 {

	public static void main(String[] args) {
		
		Greeting greeting;
		
		greeting = new MorningGreeting();
		greeting.greet();
		System.out.println(greeting);
		
		greeting = new EveningGreeting();
		greeting.greet();
		System.out.println(greeting);

	}

}
