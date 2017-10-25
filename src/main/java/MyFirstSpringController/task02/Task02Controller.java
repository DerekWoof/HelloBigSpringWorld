package MyFirstSpringController.task02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task02Controller {

    @GetMapping(value = "/animal", produces = "application/json")

    public Animal retrieverAnimal() {
        return new Animal("Numbers", "18");
    }

    @GetMapping(value = "/users", produces = "application/json")
    public Users retrieverUser() {
        return new Users("Kitowcy","Wysłali","Zordona");
    }
}
