package TaxiService;

import java.util.ArrayList;

public class TaxiDriverList {
    private static ArrayList<TaxiDriver> taxiDrivers = new ArrayList<>();

    public static ArrayList<TaxiDriver> getTaxiDrivers() {
        return taxiDrivers;
    }

    public static void setTaxiDrivers(ArrayList<TaxiDriver> taxiDrivers) {
        TaxiDriverList.taxiDrivers = taxiDrivers;
    }

    public static void setTaxiDrivers(TaxiDriver taxiDriver) {
        taxiDrivers.add(taxiDriver);
    }

    public static TaxiDriver getFreeTaxi() {
        TaxiDriver freeTaxiDriver = taxiDrivers.get(0);
        for (int i = taxiDrivers.size() - 1; i >= 0; i--) {
            if (TaxiDriverList.getTaxiDrivers().get(i).getCar().getStatus() == TaxiStatus.FREE)
                freeTaxiDriver = taxiDrivers.get(i);
        }
        return freeTaxiDriver;
    }

    public static void showFreeTaxi() {
        for (int i = 0; i < taxiDrivers.size(); i++) {
            if (TaxiDriverList.getTaxiDrivers().get(i).getCar().getStatus() == TaxiStatus.FREE)
                System.out.println(taxiDrivers.get(i).getCar());
        }
        if (taxiDrivers.get(taxiDrivers.size() - 1).getCar().getStatus() == TaxiStatus.RESERVED)
            System.out.println("Не має свобідних машин!!!");
    }

    public static void showReservedTaxi() {
        int x = taxiDrivers.size();
        for (int i = 0; i < taxiDrivers.size(); i++) {
            if (TaxiDriverList.getTaxiDrivers().get(i).getCar().getStatus() == TaxiStatus.RESERVED) {
                System.out.println(taxiDrivers.get(i).getCar());
                x--;
            }
        }
        if (x == taxiDrivers.size()) System.out.println("Не має зарезервованих машин!!!");
    }

    public static void showDrivers() {
        for (TaxiDriver item : taxiDrivers)
            System.out.println(item);
    }
}
