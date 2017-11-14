package TaxiService;

import java.time.LocalDate;

public class Car {
    private int id;
    private String model;
    private String licensePlate;
    private LocalDate releaseDate;
    private TaxiStatus status;

    public Car(String model, String licensePlate, LocalDate releaseDate) {
        this.id = TaxiDriverList.getTaxiDrivers().size()+1;
        this.model = model;
        this.licensePlate = licensePlate;
        this.releaseDate = releaseDate;
        this.status = TaxiStatus.FREE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public TaxiStatus getStatus() {
        return status;
    }

    public void setStatus(TaxiStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Автомобіль{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", releaseDate=" + releaseDate +
                ", status=" + status +
                '}';
    }
}
