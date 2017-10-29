package Lesson11.ParcelsSystem;

public class MailStatus {
    private String sent;
    private String received;

    public MailStatus() {
        sent = "sent";
        received = "received";
    }

    public MailStatus(String sent, String received) {
        this.sent = sent;
        this.received = received;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    @Override
    public String toString() {
        return "MailStatus{" +
                "sent='" + sent + '\'' +
                ", received='" + received + '\'' +
                '}';
    }
}
