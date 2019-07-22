package com.jt.service;

import com.jt.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements  UserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public int checkUserName(String username) {
        return  userMapper.checkUserName(username);
    }
}
