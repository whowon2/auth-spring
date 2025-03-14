package whowon2.auth.rest.User;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepo;

    public UserService(UserRepository userRepository) {
        this.userRepo = userRepository;
    }

    public List<UserModel> findAll() {
        return userRepo.findAll();
    }

    public UserModel findById(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    public UserModel findByEmail(String email) {
        return userRepo.findByEmail(email).orElse(null);
    }

    public UserModel save(UserModel user) {
        Optional<UserModel> existingUser = userRepo.findByEmail(
            user.getEmail()
        );

        if (existingUser.isPresent()) {
            throw new IllegalArgumentException("Email already exists");
        }

        return userRepo.save(user);
    }

    public UserModel update(Long id, UserModel user) {
        return userRepo.save(user);
    }

    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }
}
