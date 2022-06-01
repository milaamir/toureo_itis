package ru.itis.toureo.services;

import ru.itis.toureo.dto.UserDto;
import ru.itis.toureo.models.User;


public interface SignUpService {

    void signUp(UserDto userDto);

    User getUserById(Long userId);

}
