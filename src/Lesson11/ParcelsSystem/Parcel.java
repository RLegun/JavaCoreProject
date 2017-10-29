package Lesson11.ParcelsSystem;

public class Parcel extends MailBox{
    private int id;
    private Client sender;
    private Client receiver;
    private Location currentLocation;
    private MailStatus status;

    public Parcel() {
        super();
        id = 1;
        sender = sender;
        receiver = receiver;
        currentLocation = currentLocation;
        status = status;
    }

    public Parcel(double height, double width, double depth, double weight, double price,
                  int id, Client sender, Client receiver, Location currentLocation, MailStatus status) {
        super(height, width, depth, weight, price);
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.currentLocation = currentLocation;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getSender() {
        return sender;
    }

    public void setSender(Client sender) {
        this.sender = sender;
    }

    public Client getReceiver() {
        return receiver;
    }

    public void setReceiver(Client receiver) {
        this.receiver = receiver;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public MailStatus getStatus() {
        return status;
    }

    public void setStatus(MailStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "id=" + id +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", currentLocation=" + currentLocation +
                ", status=" + status +
                '}';
    }
}
