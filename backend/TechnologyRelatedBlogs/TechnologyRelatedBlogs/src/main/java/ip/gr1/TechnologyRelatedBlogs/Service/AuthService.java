package ip.gr1.TechnologyRelatedBlogs.Service;

import ip.gr1.TechnologyRelatedBlogs.Model.User;
import ip.gr1.TechnologyRelatedBlogs.Repository.UserRepository;
import ip.gr1.TechnologyRelatedBlogs.dto.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthService {
    @Autowired
    private UserRepository userRepository;
    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        userRepository.save(user);
    }
}
