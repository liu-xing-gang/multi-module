package com.s.springboot1.service;


import com.s.springboot1.model.User;
import com.s.springboot1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAll() {
        Iterable<User> userList = userRepository.findAll();
        return userList;
    }

    public User findByIdUser(Integer id){
        User user = userRepository.findById(id).orElse(null);
        return user;
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public void delUser(Integer id){
        User user = this.findByIdUser(id);
        userRepository.delete(user);
    }


}
