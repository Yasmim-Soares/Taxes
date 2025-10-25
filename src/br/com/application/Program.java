package br.com.application;

import model.entities.Individual;

import java.util.Scanner;

public class Program {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int numberPayers = sc.nextInt();

        int payers[] = new int[numberPayers];

        for(int i = 0; i < numberPayers; i++){
            System.out.println("Enter tax payer " +(i+1)+ " data: ");
            System.out.print("Individual or company (i/c)?");
            char type = sc.next().charAt(0);

            if(type == 'i') {
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.println("Health expanditures: ");
                double healthExpanditures = sc.nextDouble();

                Individual individual = new Individual(name, anualIncome, healthExpanditures);
            }
        }
    }
}
