package com.tts.tttwitter1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.tttwitter1.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}