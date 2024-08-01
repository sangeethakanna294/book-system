package com.management.book_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.book_system.entity.Account;

public interface UserRepository extends JpaRepository<Account, Integer> {

}
