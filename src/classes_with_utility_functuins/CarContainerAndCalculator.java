package classes_with_utility_functuins;

import cars.*;


public class CarContainerAndCalculator {

    static CarPattern [] arrayOfCars = new CarPattern[7];

    public static void main(String[] args) {

        arrayOfCars[0] = new Mercedes(1, "Mercedes", "Geländewagen", 1990, "Black", 40000, 4564326);
        arrayOfCars[1] = new BMW(2, "BMW", "i8", 2013, "Grey", 50000, 5832483);
        arrayOfCars[2] = new Toyota(3, "Toyota", "LandCruiser", 1989, "Black", 30000, 4354367);
        arrayOfCars[3] = new Fiat(4, "Fiat", "Tempra", 1992, "Blue", 2000, 7543456);
        arrayOfCars[4] = new Mini(5, "Mini", "Cooper", 2010, "Red", 10000, 5543214);
        arrayOfCars[5] = new Ford(6, "Ford", "Mondeo", 1990, "White", 1500, 6645432);
        arrayOfCars[6] = new Lamborghini(7, "Lamborghini", "Hurricane", 2021, "Yellow", 100000, 6543345);


        CarContainerAndCalculator carContainerAndCalculator = new CarContainerAndCalculator();
        System.out.println("List of required cars of a given brand: ");
        carContainerAndCalculator.findCarOfCurrentBrand("Fiat", "Mini", "Ford");

        System.out.println("list of cars of a given brand that have been in operation for more than 10 years: ");
        carContainerAndCalculator.findCarOfCertainUsageDateAndModel("Lamborghini", "Fiat", "Toyota", 10);

        System.out.println("List of cars of a certain release year, which are more expensive than a given price: ");
        carContainerAndCalculator.findCarOfCertainReleaseDateAndPrice(1990, 2500);

        }


    public void findCarOfCurrentBrand(String brand1, String brand2, String brand3) {
        for (CarPattern brand : arrayOfCars) {
            if (brand.getBrand().equals(brand1)) {
                System.out.println(brand.toString());
            } else if (brand.getBrand().equals(brand2)) {
                System.out.println(brand.toString());
            } else if (brand.getBrand().equals(brand3)) {
                System.out.println(brand.toString());
            }
        }
    }

    public void findCarOfCertainUsageDateAndModel (String brand1, String brand2, String brand3, int yearsInUse) {
        int today = 2022;

        for (CarPattern brandDate : arrayOfCars) {
            if (brandDate.getBrand().equals(brand1) && (today - brandDate.getYearOfRelease() > yearsInUse)) {
                System.out.println(brandDate.toString());
            } else if (brandDate.getBrand().equals(brand2) && (today - brandDate.getYearOfRelease() > yearsInUse)) {
                System.out.println(brandDate.toString());
            } else if (brandDate.getBrand().equals(brand3) && (today - brandDate.getYearOfRelease() > yearsInUse)) {
                System.out.println(brandDate.toString());
            }
        }
    }

    public void findCarOfCertainReleaseDateAndPrice (int releaseDate, int price) {
        for (CarPattern dateAndPrice : arrayOfCars) {
            if (dateAndPrice.getYearOfRelease() == releaseDate && dateAndPrice.getPriceInDollars() > price) {
                System.out.println(dateAndPrice.toString());
            }
        }
    }

}

