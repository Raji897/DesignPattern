package creational.factory;

public class User {
    private String name, type;
    public User(String name, String type) {
        this.name = name; this.type = type;
    }
    public String getInfo() { return type + ": " + name; }
}