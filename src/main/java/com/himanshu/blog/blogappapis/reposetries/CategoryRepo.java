package com.himanshu.blog.blogappapis.reposetries;

import com.himanshu.blog.blogappapis.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {


}
