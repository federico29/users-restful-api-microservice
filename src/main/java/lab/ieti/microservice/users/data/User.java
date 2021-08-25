package lab.ieti.microservice.users.data;

import lab.ieti.microservice.users.dto.UserDto;
import java.time.LocalDateTime;
import java.util.UUID;

public class User {

    private String id;
    private String name;
    private String email;
    private String lastName;
    private LocalDateTime createdAt;

    public User(UserDto userDto) {
        this.id = UUID.randomUUID().toString();
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.lastName = userDto.getEmail();
        this.createdAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
