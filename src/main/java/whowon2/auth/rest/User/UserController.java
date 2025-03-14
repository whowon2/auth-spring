package whowon2.auth.rest.User;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserModel> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public UserModel findById(Long id) {
        return this.service.findById(id);
    }

    @GetMapping("/email/{email}")
    public UserModel findByEmail(String email) {
        return this.service.findByEmail(email);
    }

    @PostMapping
    public UserModel create(@RequestBody UserModel user) {
        return this.service.save(user);
    }

    @PutMapping("/{id}")
    public UserModel update(
        @PathVariable Long id,
        @RequestBody UserModel user
    ) {
        return this.service.update(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.service.deleteById(id);
    }
}
