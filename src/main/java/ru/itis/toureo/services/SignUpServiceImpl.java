package ru.itis.toureo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.itis.toureo.dto.UserDto;
import ru.itis.toureo.models.User;
import ru.itis.toureo.repositories.UsersRepository;


@Service
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder; //проерка совпадает ли пароль

    @Override
    public void signUp(UserDto userDto) {
        User newUser = User.builder()
                .login(userDto.getLogin())
                .name(userDto.getName())
                .surname(userDto.getSurname())
                .email(userDto.getEmail())
                .password(passwordEncoder.encode(userDto.getPassword()))
                .build();
        usersRepository.save(newUser);

    }


    @Override
    public User getUserById(Long userId) {
        return usersRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

}