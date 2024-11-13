package task2;

public class qst2_1 {

//	public class Person {
	    private String name;
	    private int age;

	    // Default constructor with age set to 18
	    public qst2_1() {
	        this.age = 10;
	    }

	    // Constructor with name and age parameters
	    public qst2_1(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display name and age
	    public void displayPersonInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        // Creating a Person object with default age
	    	qst2_1 person1 = new qst2_1();
	        person1.setName("Sara");
	        person1.displayPersonInfo();

	        // Creating a Person object with name and age
	        qst2_1 person2 = new qst2_1("Tamil", 25);
	        person2.displayPersonInfo();
	    }
	}


