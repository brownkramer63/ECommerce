import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Customer {

    private UUID    id;

    private String userName;
    private String email;

    private ArrayList<Address> address;

    public Customer(UUID id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    public Customer(UUID id, String userName, String email, ArrayList<Address> address) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }




    //type name;








}
