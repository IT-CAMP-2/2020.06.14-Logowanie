package pl.camp.it.database;

import pl.camp.it.model.Sex;
import pl.camp.it.model.User;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private final List<User> users = new ArrayList<>();
    private static Repository repository = null;

    private Repository() {
        this.users.add(new User(1,
                "Janusz",
                "77f869401de682f60e0e749493ab793d",
                Sex.MAN));
    }

    public List<User> getUsers() {
        return users;
    }

    public static Repository getRepository() {
        if(repository == null) {
            repository = new Repository();
        }
        return repository;
    }
}
