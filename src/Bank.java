import java.util.Arrays;

public class Bank {
    private int id;
    private String name;
    private User[] users;

    public Bank() {
    }

    public Bank(int id, String name, User[] users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User[] getUsers() {
        return this.users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public String toString() {
        int var10000 = this.id;
        return "Bank{id=" + var10000 + ", name='" + this.name + "', users=" + Arrays.toString(this.users) + "}";
    }
}