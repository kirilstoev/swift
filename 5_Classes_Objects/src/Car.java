
public class Car {

    String brand;
    String model;
    int year;
    int yearsOld;
    int power;
    int tax;

    int insuranceCategory(int year) {
        if (2017 - year < 8) {
            this.yearsOld = 1;
        } else if (2017 - year < 15) {
            this.yearsOld = 2;
        } else if (2017 - year < 25) {
            this.yearsOld = 3;
        } else {
            this.yearsOld = 4;
        }
        return yearsOld;
    }

    int taxCar(int year) {
        switch (yearsOld) {
            case 1:
                this.tax = 150;
            case 2:
                this.tax = 200;
            case 3:
                this.tax = 300;
            case 4:
                this.tax = 500;
        }

        if (power < 80) {
            tax += tax * 0.2;
        } else if (power > 140) {
            tax += tax * 4.5 / 10;
        }
        return tax;
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

    void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
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
        return yearsOld;
    }

    public int getTax() {
        return tax;
    }
}
