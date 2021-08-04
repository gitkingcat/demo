package com.accenture.demo.service;
import com.accenture.demo.model.User;
import com.accenture.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailServiceImpl")
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println(s);
        System.out.println(userRepository.findAll());
        User user = userRepository.findUserByEmail(s).orElseThrow(()-> new UsernameNotFoundException("User not found"));
        System.out.println(user.getPassword());
        return SecurityUser.fromUser(user);
    }
}