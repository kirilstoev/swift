
public class Task2_Car {

    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes-Benz", "S220", 2009, 160);
        Car opel = new Car("Opel", "Astra", 1996, 85);
        Car bugatti = new Car("Bugatti", "Veyron", 2015, 612);
        Car lada = new Car("Lada", "5", 1989, 75);

        System.out.println(mercedes.taxCar(mercedes.insuranceCategory(mercedes.getYear())));
        System.out.println(opel.taxCar(opel.insuranceCategory(opel.getYear())));
        System.out.println(bugatti.taxCar(bugatti.insuranceCategory(bugatti.getYear())));
        System.out.println(lada.taxCar(lada.insuranceCategory(lada.getYear())));
    }

}
