import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		String userName;
		
		// Set up array, select a random entry, and set to a string.
		String[] names = {"Shanon", "Taha", "Rosalyn", "Mercy", "Langston","Wayne", "Bob"};					
		Random rand = new Random();
		userName = names [rand.nextInt(names.length)];
		
		// Create human object, Get Vars, print Vars
		Person human = new Person (userName,65,"(401)110-1990", "37 1337 st NW");
		System.out.println(human.getName()+" is "+human.getAge()+" years old.");
		System.out.println(human.getName()+"'s Number is "+human.getNumber());
		System.out.println(human.getName()+" lives at "+human.getAddress());
		
		// Increase Age by 1
		human.growsOlder();
		System.out.println(human.getName()+" will be "+human.getAge()+" years old next year.");
		
	}

}
