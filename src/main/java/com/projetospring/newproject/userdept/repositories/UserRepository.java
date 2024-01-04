package com.projetospring.newproject.userdept.repositories;

import com.projetospring.newproject.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
