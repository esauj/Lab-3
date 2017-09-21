package demo;

public class Person {
	static int currentYear = 2017;
	private String name;
	private int birthDate;
	private int age;
	
	//constructor
	public Person(String name, int birthDate){
		this.name = name;
		this.birthDate = birthDate;
	}

	//Resets birthDate variable for use with a new Person
	public void reset_birthday(int year){
		birthDate = year;
	}
	
	//Displays name of current Person
	public void display_name(){
		System.out.println("This is " + name);
	}
	
	//Displays birthday of current Person
	public void display_birthday(){
		System.out.printf("I was born in %d. ", birthDate);
	}
	
	//Subtracts currentYear from birthDate to determine current age
	//and then displays age of current Person
	public void display_age(){
		age = currentYear - birthDate;
		System.out.printf("I am %d years old ", age);
	}
	
	//Compares age to Medicare senior citizen designated age and outputs
	//result of the comparison
	public void age_comparison(){
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
	}

	public static void main(String[] args) {
		Person John = new Person("John",1957);
		John.display_name();
		John.display_birthday();
		John.display_age();
		John.age_comparison();
	}

}