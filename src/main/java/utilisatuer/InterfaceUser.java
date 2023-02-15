package utilisatuer;

import java.util.List;

public interface InterfaceUser {
    public User signUp(User c);
    public void modify(User c);

    public List<User> getAllUsers();



}
