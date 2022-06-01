package ru.itis.toureo.services;

import ru.itis.toureo.dto.UserDto;

public interface UserService {
    boolean isAdmin(UserDto user);


}
