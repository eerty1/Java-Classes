package classes_with_utility_functuins;

public class CarPattern {
    int id;
    String brand;
    String model;
    int yearOfRelease;
    String color;
    int priceInDollars;
    int personalNumber;

    public CarPattern(int id, String brand, String model, int yearOfRelease, String color, int priceInDollars, int personalNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.priceInDollars = priceInDollars;
        this.personalNumber = personalNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPriceInDollars() {
        return priceInDollars;
    }

    public void setPriceInDollars(int priceInDollars) {
        this.priceInDollars = priceInDollars;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }


    public String toString() {
        return "The car is{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", color='" + color + '\'' +
                ", priceInDollars=" + priceInDollars +
                ", personalNumber=" + personalNumber +
                '}';
    }
}
