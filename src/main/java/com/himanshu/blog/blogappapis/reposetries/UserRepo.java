 package com.himanshu.blog.blogappapis.reposetries;

 import org.springframework.data.jpa.repository.JpaRepository;

 import com.himanshu.blog.blogappapis.entities.User;

 public interface UserRepo extends JpaRepository<User,Integer> {

     
    
 }
