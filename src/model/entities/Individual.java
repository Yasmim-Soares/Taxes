package model.entities;

public class Individual extends TaxPayer {
        private Double healthExpanditures;

        public Individual() {
        }

        public Individual(String name, Double anualIncome, Double healthExpanditures){
            super(name, anualIncome);
            this.healthExpanditures = healthExpanditures;
        }

        public Double getHealthExpanditures() {
            return healthExpanditures;
        }

        public void setHealthExpanditures(Double healthExpanditures){
            this.healthExpanditures = healthExpanditures;
        }

        @Override
        public Double tax(){
            Double tax = 0.0;
            if (getAnualIncome() < 20000){
                 tax = getAnualIncome() * 0.15;
            } else {
                 tax = getAnualIncome() * 0.25;
            }

            if(getHealthExpanditures() > 0){
                return tax - getHealthExpanditures() * 0.50;
            }
            return tax;

        }
}
