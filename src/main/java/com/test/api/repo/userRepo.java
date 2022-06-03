package com.test.api.repo;

import java.util.List;

import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.api.entity.User;

@Repository
@DynamicUpdate
public interface userRepo extends JpaRepository<User, String> {
	List<User> findByUserIdAndPassword(String userId, String Password);
}
