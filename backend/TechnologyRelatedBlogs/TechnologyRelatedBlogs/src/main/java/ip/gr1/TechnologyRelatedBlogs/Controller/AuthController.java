package ip.gr1.TechnologyRelatedBlogs.Controller;

import ip.gr1.TechnologyRelatedBlogs.Service.AuthService;
import ip.gr1.TechnologyRelatedBlogs.dto.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;
    @PostMapping("/signup")
    public  void    signup(@RequestBody RegisterRequest registerRequest){
    authService.signup(registerRequest);
    }
}
