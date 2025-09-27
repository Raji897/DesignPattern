package creational.factory;

public class UserFactory {
    public static User createUser(String name, String type) {
        return new User(name, type);
    }
}