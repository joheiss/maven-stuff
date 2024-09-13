package com.jovisco.controllers;

import com.jovisco.domain.UserCommand;
import com.jovisco.entities.User;
// import com.jovisco.mappers.UserMapper;
import com.jovisco.mappers.UserMapperImpl;

public class UserController {

    User saveUser(UserCommand dto) {
        // return UserMapper.INSTANCE.toUser(dto);
        // var mapper = UserMapper.INSTANCE;
        var mapper = new UserMapperImpl();
        return mapper.toUser(dto);
    }
}
