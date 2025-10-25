package model.entities;

public class Company extends TaxPayer {
    private int employesNumber;

    public Company() {
    }

    public Company(String name, Double anualIncome, int employesNumber) {
        super(name, anualIncome);
        this.employesNumber = employesNumber;
    }

    public int getEmployesNumber() {
        return employesNumber;
    }

    public void setEmployesNumber(int employesNumber) {
        this.employesNumber = employesNumber;
    }

    public Double tax(Double anualIncome){
        Double tax = 0.0;
        if(getEmployesNumber() > 10){
           tax = getAnualIncome() * 0.14;
       } else {
            tax = getAnualIncome() * 0.16;
        }

        return tax;
    }
}
