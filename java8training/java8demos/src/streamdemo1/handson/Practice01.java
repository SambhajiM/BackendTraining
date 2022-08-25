package streamdemo1.handson;

import java.util.Arrays;
import java.util.List;

import streamdemo1.common.Gender;
import streamdemo1.common.Person;

public class Practice01 {
	 
    public static List<Person> createPeople(){
    	
        return Arrays.asList(
                new Person("pankaj", 38, Gender.MALE),
                new Person("Manvi", 6, Gender.FEMALE),
                new Person("Aman", 34, Gender.MALE),
                new Person("Bindu", 23, Gender.FEMALE),
                new Person("Kabir", 45, Gender.MALE),
                new Person("Monika", 45, Gender.FEMALE),
                new Person("Monika", 35, Gender.FEMALE),
                new Person("Vijay", 34, Gender.MALE),
                new Person("Priyanka", 35, Gender.FEMALE));
    }

    public static void main(String[] args) {
        List<Person> people = createPeople();
        
        //TODO: Get the name of all female having age more than 6
        for(Person newPerson : people) {
        	if(newPerson.getGender().equals("FEMALE")) {
        		if(newPerson.getAge() > 6) {
        			System.out.println(newPerson.getName());
        		}
        	}
        }
    }
 
}
