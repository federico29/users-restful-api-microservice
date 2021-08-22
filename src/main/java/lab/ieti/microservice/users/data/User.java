package lab.ieti.microservice.users.data;

import lab.ieti.microservice.users.dto.UserDto;
import java.time.LocalDateTime;
import java.util.UUID;

public class User {

    private final String id;
    private final String name;
    private final String email;
    private final String lastName;
    private final LocalDateTime createdAt;

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
