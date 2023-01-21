package com.himanshu.blog.blogappapis.reposetries;

import com.himanshu.blog.blogappapis.entities.Category;
import com.himanshu.blog.blogappapis.entities.Post;
import com.himanshu.blog.blogappapis.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

    List<Post> findByUser(User user);
//    Post save(Post post);
    List<Post> findByCategory(Category category);
}
