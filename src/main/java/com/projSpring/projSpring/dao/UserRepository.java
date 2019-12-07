package com.projSpring.projSpring.dao;

import com.projSpring.projSpring.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
