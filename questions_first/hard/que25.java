package questions_first.hard;

import java.util.Scanner;

class Vehicle {
    String vehicleNo;
    String type;
    double mileage;

    Vehicle(String vehicleNo, String type, double mileage) {
        this.vehicleNo = vehicleNo;
        this.type = type;
        this.mileage = mileage;
    }
}

class Fleet {
    Vehicle[] vehicles = new Vehicle[3];
    int count = 0;

    void addVehicle(Vehicle v) {
        if (count < 3) {
            vehicles[count++] = v;
        }
    }

    void displayHighMileage(double minMileage) {
        System.out.println("Vehicles with mileage above " + minMileage + ":");
        for (int i = 0; i < count; i++) {
            if (vehicles[i].mileage > minMileage) {
                System.out.println(
                    "Vehicle No: " + vehicles[i].vehicleNo +
                    ", Type: " + vehicles[i].type +
                    ", Mileage: " + vehicles[i].mileage
                );
            }
        }
    }
}

public class que25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fleet fleet = new Fleet();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String vehicleNo = sc.next();
            String type = sc.next();
            double mileage = sc.nextDouble();
            fleet.addVehicle(new Vehicle(vehicleNo, type, mileage));
        }

        double minMileage = sc.nextDouble();
        fleet.displayHighMileage(minMileage);

        sc.close();
    }
}
