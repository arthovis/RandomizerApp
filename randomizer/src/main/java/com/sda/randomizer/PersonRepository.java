package com.sda.randomizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PersonRepository {
    public static List<Person> people = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    //public static Map<Integer,Person> peopleMap = new HashMap<>();

    private static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1 + min);
    }

    public void addPerson() {

        while (true) {
            System.out.println("Who's next? (press 'n' if all are ready)");
            //grab name
            String name = scanner.nextLine();

            if (name.equals("n")) {
                break;
            }
            //get random difficulty between 1-5
            int randomDifficulty = getRandomNumberInRange(1, 5);

            //create person
            Person person = new Person(name, randomDifficulty);
            person.setPresent(true);

            //addperson
            people.add(person);
        }
    }

    //select random person from list
    public void selectNextPerson() {
        if (people.isEmpty()) {
            System.out.println("Everybody finished coding!");
            return;
        }
        //take persons from list and put them in a map
//        for (int id = 1; id<=people.size();id++){
//            peopleMap.put(id, people.get(id-1));
//        }

        //get random person from list
        Random random = new Random();
        int nextPersonID = random.nextInt(people.size());

        //get person by index
        Person nextPerson = people.get(nextPersonID);

        //print next person
        System.out.println("Next person is: " + nextPerson.getName().toUpperCase() + " with task difficulty: " + nextPerson.getDifficulty());

        //remove person from list
        people.remove(nextPerson);
    }

}