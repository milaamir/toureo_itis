package ru.itis.toureo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.toureo.dto.UserDto;
import ru.itis.toureo.repositories.UsersRepository;

@Service
public class UserServiceImpl implements UserService  {

    @Autowired
    private final UsersRepository usersRepository;

    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public boolean isAdmin(UserDto user) {
        return user.getRole().toString().equals("ADMIN");
    }


}
