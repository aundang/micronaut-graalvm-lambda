package example.micronaut;

import jakarta.inject.Singleton;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Singleton
public class UserService {
        private static final List<User> USERS = Arrays.asList(
                new User("Aubree", "aubree123"),
                new User("Edward", "edward123"),
                new User("Stephen", "stephen123"),
                new User("Anthony", "tony123"),
                new User("Cathy", "cathy123"),
                new User("Dane", "dane123"),
                new User("Kate", "kate123")
        );

        public User randomUser() {
            return USERS.get(new Random().nextInt(USERS.size()));
        }

        public List<User> getUsers() {
            return USERS;
        }
}
