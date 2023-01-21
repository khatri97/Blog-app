 package com.himanshu.blog.blogappapis.entities;

 import javax.persistence.*;

 import lombok.Getter;
 import lombok.NoArgsConstructor;
 import lombok.Setter;

 import java.util.ArrayList;
 import java.util.List;

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
     private String email;

     @Column(name = "user_password", nullable = false, length = 100)
     private String password;

     @Column(name = "about_user", nullable = false, length = 100)
     private String about;

     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
     private List<Post> posts= new ArrayList<>();
    
 }
