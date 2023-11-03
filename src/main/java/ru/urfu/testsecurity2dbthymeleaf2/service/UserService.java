package ru.urfu.testsecurity2dbthymeleaf2.service;

import ru.urfu.testsecurity2dbthymeleaf2.dto.UserDto;
import ru.urfu.testsecurity2dbthymeleaf2.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
