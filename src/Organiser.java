public class Organiser extends AuthUser {
    private int organiserId;
    private String organiserName;
    private String organiserLocation;
    private int eventsConducted;

    public Organiser(int organiserId, String username, String password, String organiserName, String organiserLocation) {
        super(username, password);
        this.organiserId = organiserId;
        this.organiserName = organiserName;
        this.organiserLocation = organiserLocation;
        this.eventsConducted = 0;
    }

    public int getOrganiserId() {
        return organiserId;
    }

    public void setOrganiserId(int organiserId) {
        this.organiserId = organiserId;
    }

    public String getOrganiserName() {
        return organiserName;
    }

    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }

    public String getOrganiserLocation() {
        return organiserLocation;
    }

    public void setOrganiserLocation(String organiserLocation) {
        this.organiserLocation = organiserLocation;
    }

    public int getEventsConducted() {
        return eventsConducted;
    }

    public void setEventsConducted(int eventsConducted) {
        this.eventsConducted = eventsConducted;
    }

    public String toString() {
        return "Id: " + Integer.toString(this.organiserId)  + "\n" +
                "Name: " + this.organiserName + "\n" +
                "Location: " + this.organiserLocation + "\n" +
                "Events conducted: " + Integer.toString(this.eventsConducted);
    }
}
