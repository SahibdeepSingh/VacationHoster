package SpringApp;

public class View {

    private final String firstName;
    private final String lastName;
    private final long clientId;

    View(String fName, String lName, long cID){
        this.firstName = fName;
        this.lastName = lName;
        this.clientId = cID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getClientId() {
        return clientId;
    }
}
