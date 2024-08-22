package com.example.personmanagement;

public class Main {
    public static void main(String[] args) {
        try {
            Person[] persons = new Person[3];

            for (int i = 0; i < 3; i++) {
                persons[i] = PersonManager.inputPersonInfo();
            }

            System.out.println("\n===== Information of Persons you have entered =====");
            for (Person person : persons) {
                PersonManager.displayPersonInfo(person);
                System.out.println();
            }

            PersonManager.sortBySalary(persons);

            System.out.println("\n===== Information of Persons sorted by salary =====");
            for (Person person : persons) {
                PersonManager.displayPersonInfo(person);
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
