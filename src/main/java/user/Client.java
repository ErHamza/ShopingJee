package user;

public class Client  {
    private String name;
    private int client_id;
    private String password;
    private String email;
    private String phone_number;
    private String adress;
    private String location;

    public Client(String name, String password,
                  String email, String phone_number,
                  String adress, String location) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.adress = adress;
        this.location = location;
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
