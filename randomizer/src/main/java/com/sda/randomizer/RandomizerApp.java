package com.sda.randomizer;

import java.util.Scanner;

public class RandomizerApp {
    public static void main(String[] args) {
        //Create objects
        Menu menu = new Menu();
        PersonRepository repository = new PersonRepository();
        Scanner scanner = new Scanner(System.in);
        MainController mainController = new MainController(repository, scanner, menu);

        //display menu
        menu.buildMenu();

        //grab user input
        int option = scanner.nextInt();
        //redirect option to the appropriate object
        mainController.dispatch(option);
        //load data
        //present

    }
}
