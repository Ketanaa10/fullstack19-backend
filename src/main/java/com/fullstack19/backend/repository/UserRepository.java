
package com.fullstack19.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fullstack19.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
