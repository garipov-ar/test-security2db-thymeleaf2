package ru.urfu.testsecurity2dbthymeleaf2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.testsecurity2dbthymeleaf2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
