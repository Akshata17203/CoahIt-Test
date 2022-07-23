package test;

import java.util.*;
import java.util.stream.Collectors;

public class Person {

	String name;
	int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		List <Person>person = new ArrayList<Person>();
		person.add(new Person("Bella",21));
		person.add(new Person("Edward", 155));
		person.add(new Person("Jacob",224));
		person.add(new Person("Alice", 19));
		person.add(new Person("Jane",20));
		person.add(new Person("Jasper", 17));
person.stream().filter(P -> P.age >18).collect(Collectors.toList()).forEach(Person ->System.out.print(Person.name+" "));
		  

		 
		   
	}

}
