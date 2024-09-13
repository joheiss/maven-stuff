package com.jovisco.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.jovisco.domain.UserCommand;
import com.jovisco.entities.User;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    User toUser(UserCommand dto);

    UserCommand toUserCommand(User user);
}
