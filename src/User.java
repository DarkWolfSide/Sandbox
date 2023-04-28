public class User {
    private int id;
    private String name;
    private String lastname;
    private int accountNumber;
    private int balance;

    public User() {
    }

    public User(int id, String name, String lastname, int accountNumber, int balance) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.accountNumber = accountNumber;
        this.balance = balance;
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

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return "User{UID " + this.id + ", name='" + this.name + "', lastname='" + this.lastname + "', accountNumber=" + this.accountNumber + ", balance=" + this.balance + "}";
    }
}