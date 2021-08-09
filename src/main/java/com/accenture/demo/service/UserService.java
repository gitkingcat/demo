package com.accenture.demo.service;
import com.accenture.demo.model.User;
import com.accenture.demo.repository.UserRepositoryImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService {
    private UserRepositoryImpl userRepository;


    public UserService() {
        userRepository = new UserRepositoryImpl();
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(s).orElseThrow(()-> new UsernameNotFoundException("User not found"));
        return SecurityUser.fromUser(user);
    }
}
