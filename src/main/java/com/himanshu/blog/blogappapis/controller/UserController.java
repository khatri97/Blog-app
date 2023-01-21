 package com.himanshu.blog.blogappapis.controller;

 import com.himanshu.blog.blogappapis.payloads.ApiResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.http.HttpStatus;
 import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.*;

 import com.himanshu.blog.blogappapis.payloads.UserDto;
 import com.himanshu.blog.blogappapis.services.UserService;

 import javax.persistence.criteria.CriteriaBuilder;
 import javax.validation.Valid;
 import java.util.List;

 @RestController
// @RequestMapping("/api/users")
 public class UserController {
    
     @Autowired
     private UserService userService;

      //POST method- create user
      @PostMapping("/user")
      public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto){

         UserDto createdUserDto= this.userService.createUser(userDto);
         return new ResponseEntity<>(createdUserDto,HttpStatus.CREATED);
      }

     //PUT - Update user
      @PutMapping("/user/{userID}")
      public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable("userID") Integer uid){

           UserDto updatedUser=  this.userService.updateUser(userDto,uid);
           return ResponseEntity.ok(updatedUser);
      }

     // DELETE- delete user
     @DeleteMapping("/user/{userID}")
     public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userID") Integer uid){

          this.userService.deleteUser(uid);
          return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted Successfully", true), HttpStatus.OK);
     }

     //GET - Get all users
     @GetMapping("/user")
     public ResponseEntity<List<UserDto> > getAllUsers(){

       return ResponseEntity.ok(this.userService.getAllUsers());

     }

     //GET - Get single user
      @GetMapping("/user/{userID}")
      public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userID){

      return ResponseEntity.ok(this.userService.getUserById(userID));
     }


 }
