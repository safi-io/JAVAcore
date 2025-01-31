package com.basicsOOP.CompositionAggregation;

class Pizza {
    private String size;
    private int noOfCheeseToppings;
    private int noOfPepperoniToppings;
    private int noOfHamToppings;

    public Pizza(String size, int noOfCheeseToppings, int noOfPepperoniToppings, int noOfHamToppings) {
        if (size.equals("Large") || size.equals("Medium") || size.equals("Small")) {
            this.size = size;
        } else {
            System.out.println("Invalid Pizza Size.. Default is Medium");
            this.size = "Medium";
        }
        this.noOfCheeseToppings = noOfCheeseToppings;
        this.noOfPepperoniToppings = noOfPepperoniToppings;
        this.noOfHamToppings = noOfHamToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equals("Large") || size.equals("Medium") || size.equals("Small")) {
            this.size = size;
        } else {
            System.out.println("Invalid Pizza Size.. Default is Medium");
            this.size = "Medium";
        }
    }

    public int getNoOfCheeseToppings() {
        return noOfCheeseToppings;
    }

    public void setNoOfCheeseToppings(int noOfCheeseToppings) {
        this.noOfCheeseToppings = noOfCheeseToppings;
    }

    public int getNoOfPepperoniToppings() {
        return noOfPepperoniToppings;
    }

    public void setNoOfPepperoniToppings(int noOfPepperoniToppings) {
        this.noOfPepperoniToppings = noOfPepperoniToppings;
    }

    public int getNoOfHamToppings() {
        return noOfHamToppings;
    }

    public void setNoOfHamToppings(int noOfHamToppings) {
        this.noOfHamToppings = noOfHamToppings;
    }

    public double calcCost() {
        double pizzaCost;

        double toppingsPrice = (this.getNoOfCheeseToppings() + this.getNoOfHamToppings() + this.getNoOfPepperoniToppings()) * 2;

        pizzaCost = toppingsPrice;

        if (this.getSize() == "Small") {
            pizzaCost += 10;
        } else if (this.getSize() == "Medium") {
            pizzaCost += 12;
        } else {
            pizzaCost += 14;
        }

        return pizzaCost;
    }

    public String getDescription() {
        return "Pizza Size: " + this.getSize() + ". Cheese Toppings: " + this.getNoOfCheeseToppings() + ". Pepperoni Toppings: " + this.getNoOfPepperoniToppings() + ". Ham Toppings: " + this.getNoOfHamToppings();
    }


}

class PizzaOrder {
    private Pizza[] pizzas;
    private int noOfPizzas;

    public PizzaOrder() {
        noOfPizzas = 0;
        pizzas = new Pizza[3];
    }

    public void addPizza(Pizza pizza) {
        if (noOfPizzas < 3) {
            pizzas[noOfPizzas] = pizza;
            noOfPizzas++;
        } else {
            System.out.println("Only 3 Pizzas can be entered.");
        }
    }

    public double calcCost() {
        double orderCost = 0;
        for (Pizza piz : pizzas) {
            if(piz == null) break;
            orderCost += piz.calcCost();
        }
        return orderCost;
    }
}

public class task4 {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Large", 1, 1, 2);

        Pizza p2 = new Pizza("Large", 1, 1, 2);


        PizzaOrder order1 = new PizzaOrder();
        order1.addPizza(p1);
        order1.addPizza(p2);

        System.out.println("Total Order Cost is: $" + order1.calcCost());
    }
}
