package com.example.forum.repository;

import com.example.forum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("from User a where a.userName = ?1")
    default User fineByUserName(String userName) {
        return null;
    }


}
