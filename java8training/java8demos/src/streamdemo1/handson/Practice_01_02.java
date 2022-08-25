package streamdemo1.handson;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.sql.rowset.Predicate;

import streamdemo1.common.Gender;
import streamdemo1.common.Person;

public class Practice_01_02 {
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
//        for(Person newPerson : people) {
//        	if(newPerson.getGender().equals("FEMALE") && newPerson.getAge() > 6) {
//        		System.out.println(newPerson.getName());	
//        	}
//        }
        
        
        List<String> filteredName_app01 = people.stream()
                .filter(new Predicate<Person>() {
 
                    @Override
                    public boolean test(Person person) {

                        return person.getAge()>6 && person.getGender().equals(Gender.FEMALE);
                    }
                })
                .map(new Function<Person, String>() {
 
                    @Override
                    public String apply(Person person) {

                        return person.getName();
                    }
                })
                .map(new Function<String, String>() {
 
                    @Override
                    public String apply(String name) {

                        return name.toUpperCase();
                    }
                })
                .collect(Collectors.toList());

        System.out.println(filteredName_app01);
        
    }
}
