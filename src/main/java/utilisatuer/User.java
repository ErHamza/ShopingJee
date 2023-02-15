package utilisatuer;

public class User {
    private String name;
    private int client_id;
    private String password;
    private String email;
    private String phone_number;
    private String adress;
    private String location;
    private String role;

    public User(String name, String password,
                String email, String phone_number,
                String adress, String location, String role) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.adress = adress;
        this.location = location;
        this.role =role;
    }
public User(){}
    public User(
            String name,
                  int client_id,
                  String email,
                  String phone_number,
                  String adress,
                  String location,
            String role

    ) {
        this.name = name;
        this.client_id = client_id;
        this.email = email;
        this.phone_number = phone_number;
        this.adress = adress;
        this.location = location;
        this.role= role;

    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public int getClient_id() {
        return client_id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getAdress() {
        return adress;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
