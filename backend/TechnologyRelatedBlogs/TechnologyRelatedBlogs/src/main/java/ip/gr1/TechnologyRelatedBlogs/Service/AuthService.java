package ip.gr1.TechnologyRelatedBlogs.Service;

import ip.gr1.TechnologyRelatedBlogs.Model.User;
import ip.gr1.TechnologyRelatedBlogs.dto.RegisterRequest;

public class AuthService {
    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
    }
}
