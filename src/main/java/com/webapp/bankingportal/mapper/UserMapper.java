package com.webapp.bankingportal.mapper;

import java.util.ArrayList;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.webapp.bankingportal.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUser(User source, @MappingTarget User target);

    default <T> ArrayList<T> map(ArrayList<T> source) {
        return source == null ? null : new ArrayList<>(source);
    }
}
