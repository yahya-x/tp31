package com.tp31.microservicesmessagingconsumer.repository;

import com.tp31.microservicesmessagingconsumer.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}