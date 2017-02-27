
import java.util.Scanner;

public class Task5_VehicleMonitor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String null1 = sc.nextLine();
        double f = sc.nextDouble();
        String null2 = sc.nextLine();
        Vehicle[] cars = new Vehicle[n];
        int licNo = -1;
        for (int i = 0; i < n; i++) {
            licNo++;
            String licenseNo = "";
            if (licNo < 10) {
                licenseNo = "000" + licNo;
            } else if (licNo < 100) {
                licenseNo = "00" + licNo;
            } else if (licNo < 1000) {
                licenseNo = "0" + licNo;
            } else {
                licenseNo = "" + licNo;
            }
            String scan = sc.nextLine();
            String[] car = scan.split("\\s*,\\s*");

            switch (car.length + 1) {
                case 7:
                    cars[i] = new Vehicle(car[0], car[1], Double.parseDouble(car[2]), Double.parseDouble(car[3]), Integer.parseInt(car[4]), Double.parseDouble(car[5]), licenseNo);
                    break;
                case 8:
                    if (car[6].chars().allMatch(Character::isDigit)) {
                        cars[i] = new Vehicle(car[0], car[1], Double.parseDouble(car[2]), Double.parseDouble(car[3]), Integer.parseInt(car[4]), Double.parseDouble(car[5]), licenseNo, Double.parseDouble(car[6]));
                    } else {
                        cars[i] = new Vehicle(car[0], car[1], Double.parseDouble(car[2]), Double.parseDouble(car[3]), Integer.parseInt(car[4]), Double.parseDouble(car[5]), licenseNo, car[7]);
                    }
                    break;
                case 9:
                    cars[i] = new Vehicle(car[0], car[1], Double.parseDouble(car[2]), Double.parseDouble(car[3]), Integer.parseInt(car[4]), Double.parseDouble(car[5]), licenseNo, Double.parseDouble(car[6]), car[7]);
                    break;
                default:
                    break;
            }
        }

        for (Vehicle car : cars) {
            System.out.format("%s-%s, %d, %s%nInsurance cost: %f - Travel cost: %f%n", car.getLicenseNo(), car.getModel(), car.getYearProduced(), car.getColour() == null ? "N/A" : car.getColour(), car.getInsurancePrice(), car.calculateTripPrice(f));
        }
    }
}
