package com.jovisco.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.jovisco.domain.User;
import com.jovisco.dtos.UserCreateRequestDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCreateRequestDto mapToUserCreateRequestDto(User user, @MappingTarget UserCreateRequestDto dto);

    User mapToUser(UserCreateRequestDto dto, @MappingTarget User user);
}
