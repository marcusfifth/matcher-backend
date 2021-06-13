package com.matcher.spring.datajpa.repository;

import java.util.List;

import com.matcher.spring.datajpa.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	//List<User> findByMatch(Boolean is_match);
	//List<User> findByStringContaining(String nom);

	@Query(value = "SELECT * FROM User u WHERE u.id = ?1 AND u.modo_duo = ?2", nativeQuery = true)
	User findUserByIdAndModo(Long id, Boolean modo_duo);
}
