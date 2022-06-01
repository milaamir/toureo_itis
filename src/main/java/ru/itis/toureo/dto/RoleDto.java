package ru.itis.toureo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.Role;
import ru.itis.toureo.models.Sight;
import ru.itis.toureo.models.User;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleDto {
    private Long id;
    private String name;
    private List<User> users;

    public static RoleDto from(Role role) {
        return RoleDto.builder()
                .id(role.getId())
                .name(role.getName())
                .users(role.getUsers())
                .build();
    }

    public static List<RoleDto> from(List<Role> roles){
        return roles.stream()
                .map(RoleDto::from)
                .collect(Collectors.toList());
    }
}
