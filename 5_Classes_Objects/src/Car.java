
public class Car {

    private String brand;
    private String model;
    private int year;
    private int yearIdx;
    private int power;
    private float tax;

    Car(String brand, String model, int year, int power) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.power = power;
    }

    int insuranceCategory(int year) {
        if (2017 - year <= 8) {
            this.yearIdx = 1;
        } else if (2017 - year <= 15) {
            this.yearIdx = 2;
        } else if (2017 - year <= 25) {
            this.yearIdx = 3;
        } else {
            this.yearIdx = 4;
        }
        return this.yearIdx;
    }

    float taxCar(int year) {
        switch (yearIdx) {
            case 1:
                this.tax = 150;
                break;
            case 2:
                this.tax = 200;
                break;
            case 3:
                this.tax = 300;
                break;
            case 4:
                this.tax = 500;
                break;
        }
        if (power < 80) {
            tax += tax * 0.2;
        } else if (power > 140) {
            tax += tax * 4.5 / 10;
        }
        return this.tax;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setPower(int power) {
        this.power = power;
    }

    void setYearsOld(int yearIdx) {
        this.yearIdx = yearIdx;
    }

    void setTax(int tax) {
        this.tax = tax;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPower() {
        return power;
    }

    public int getYearsOld() {
        return yearIdx;
    }

    public float getTax() {
        return tax;
    }
}
