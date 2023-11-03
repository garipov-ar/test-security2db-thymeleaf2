package ru.urfu.testsecurity2dbthymeleaf2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.testsecurity2dbthymeleaf2.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
