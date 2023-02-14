package example.micronaut;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Get("/random")
    public User randomUser() {
        return userService.randomUser();
    }

    @Get("/")
    public List<User> getUsers() {
        return userService.getUsers();
    }


    @Get
    public Map<String, Object> index() {
        return Collections.singletonMap("message", "Hello World");
    }
}