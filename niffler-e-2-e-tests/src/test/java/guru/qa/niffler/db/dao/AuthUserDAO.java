package guru.qa.niffler.db.dao;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.UUID;

public interface AuthUserDAO {

    PasswordEncoder pe = PasswordEncoderFactories.createDelegatingPasswordEncoder();

    int createUser(UserEntity user);

    UserEntity updateUser(UserEntity user);

    void deleteUserById(UUID userId);

    UserEntity getUserById(UUID userId);
}
