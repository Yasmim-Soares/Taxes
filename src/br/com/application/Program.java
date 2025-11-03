package br.com.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Company;
import model.entities.Individual;
import model.entities.TaxPayer;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<TaxPayer> list = new ArrayList<>();

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

                list.add(new Individual(name, anualIncome, healthExpanditures));
            } else if (type == 'c'){
                System.out.println("Name: ");
                String name = sc.next();
                System.out.println("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.println("Number of employees: ");
                int numberOfEmloyees = sc.nextInt();

                list.add(new Company(name, anualIncome, numberOfEmloyees));
            }
        }



        double sum = 0.0;
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();

    }
}
