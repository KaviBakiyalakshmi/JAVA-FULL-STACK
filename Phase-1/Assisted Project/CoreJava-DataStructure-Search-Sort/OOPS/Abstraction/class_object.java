package Abstraction;

public class class_object 
{
	String name;
	String breed;
	int age;
	String color;
	

	public class_object(String name, String breed, int age, String color)
	{
		
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public String getBreed() {
		return breed;
	}


	public int getAge() {
		return age;
	}


	public String getColor() {
		return color;
	}


		@Override
	public String toString() {
		return "Hi my name is " + name + ", my breed," + breed + ", age " + age + ", color " + color + "";
	}


	public static void main(String[] args) 
	{
		class_object scott=new class_object("scott","papillon",5,"black");
		System.out.println(scott.toString());
          
	}

}
