package ip.gr1.TechnologyRelatedBlogs.Service;

import ip.gr1.TechnologyRelatedBlogs.Model.User;
import ip.gr1.TechnologyRelatedBlogs.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
     private UserRepository userRepository;






    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user =userRepository.findByUserName(s).orElseThrow(()->
                new UsernameNotFoundException("NO User Found"+ s));
        return new org.springframework.security.core.userdetails.User(user.getUserName(),
        user.getPassword(),
                true, true, true, true,
                getAuthorities("ROLE_USER"));
    }
    private Collection<? extends GrantedAuthority> getAuthorities(String role_user) {
        return Collections.singletonList(new SimpleGrantedAuthority(role_user));
    }
}
