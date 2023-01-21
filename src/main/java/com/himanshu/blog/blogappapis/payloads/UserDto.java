 package com.himanshu.blog.blogappapis.payloads;

 import lombok.Getter;
 import lombok.NoArgsConstructor;
 import lombok.Setter;

 import javax.validation.constraints.Email;
 import javax.validation.constraints.NotEmpty;
 import javax.validation.constraints.Size;

 @NoArgsConstructor
 @Getter
 @Setter

 public class UserDto {

     private int id;

     @NotEmpty
     @Size(min = 4, message= "username must be minimum of 4 characters")
     private String name;

     @Email(message = "Email should be valid!!")
     private String email;

     @NotEmpty
     @Size(min = 3, max = 10,message = "Password should be minimum 3 and maximum 10 characters")
     private String Password;

     @NotEmpty
     private String about;
    
 }
