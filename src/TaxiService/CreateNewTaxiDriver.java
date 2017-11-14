package TaxiService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateNewTaxiDriver {
    public static TaxiDriver newTaxiDriver() {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car("model","052015",LocalDate.now());

        TaxiDriver taxiDriver = new TaxiDriver("name", "surname",
                LocalDate.now(), "06541",car);

        System.out.print("Введіть імя -> ");
        String name = scanner.next();
        taxiDriver.setName(name);

        System.out.print("Введіть фамілію -> ");
        String surname = scanner.next();
        taxiDriver.setSurname(surname);

        taxiDriver.setBornDate(LocalDate.now());

        System.out.print("Введіть номер вашого телефону -> ");
        String phoneNumber = scanner.next();
        taxiDriver.setNumberPhone(phoneNumber);

        System.out.print("Введіть модель вашої машини -> ");
        String model = scanner.next();
        car.setModel(model);

        System.out.print("Введіть номерний знак вашої машини -> ");
        String licensePlate = scanner.next();
        car.setLicensePlate(licensePlate);

        car.setReleaseDate(LocalDate.now());

        TaxiDriverList.setTaxiDrivers(taxiDriver);

        System.out.println("Ви зареєстровані...");


        return taxiDriver;
    }
}
