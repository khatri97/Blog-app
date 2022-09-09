 package com.himanshu.blog.blogappapis.entities;

 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
 import javax.persistence.Table;

 import lombok.Getter;
 import lombok.NoArgsConstructor;
 import lombok.Setter;

 @Entity
 @Table(name="users")
 @NoArgsConstructor
 @Getter
 @Setter

 public class User {
//IDENTITY, AUTO

     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Id
     private int id;

     @Column(name = "user_name", nullable = false, length = 100)
     private String name;

     @Column(name = "user_email", nullable = false, length = 100)
     private String emial;

     @Column(name = "user_password", nullable = false, length = 100)
     private String password;

     @Column(name = "about_user", nullable = false, length = 100)
     private String about;

    
 }
