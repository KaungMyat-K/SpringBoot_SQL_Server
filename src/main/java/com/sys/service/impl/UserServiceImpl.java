package com.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.entity.User;
import com.sys.exception.BadRequestException;
import com.sys.repository.UserRepository;
import com.sys.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveData(User data) {
       
        throw new UnsupportedOperationException("Unimplemented method 'saveData'");
    }

    @Override
    public User updateData(User data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateData'");
    }

    @Override
    public void deleteData(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteData'");
    }

    @Override
    public List<User> findAllData() {
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
       return userRepository.findById(id).orElseThrow(()-> new BadRequestException("User ID : "+id+" not found!!!"));
    }
    
}
