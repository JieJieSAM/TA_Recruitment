package com.bupt.tarecruitment.repository;

import com.bupt.tarecruitment.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> findAll();

    Optional<User> findById(String id);

    void save(User user);
}
