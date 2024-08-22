package com.example.personmanagement;

import java.util.Scanner;

public class PersonManager {
    public static Person inputPersonInfo() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input name: ");
        String name = scanner.nextLine();
        System.out.print("Please input address: ");
        String address = scanner.nextLine();
        System.out.print("Please input salary: ");
        String sSalary = scanner.nextLine();

        double salary;
        try {
            salary = Double.parseDouble(sSalary);
            if (salary <= 0) {
                throw new Exception("Salary is greater than zero");
            }
        } catch (NumberFormatException e) {
            throw new Exception("You must input digit.");
        }
        return new Person(name, address, salary);
    }

    public static void displayPersonInfo(Person person) {
        person.displayInfo();
    }

    public static Person[] sortBySalary(Person[] persons) throws Exception {
        int n = persons.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (persons[j].getSalary() > persons[j + 1].getSalary()) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return persons;
    }
}
