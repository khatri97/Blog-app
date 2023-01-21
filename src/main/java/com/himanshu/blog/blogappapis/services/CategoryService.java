package com.himanshu.blog.blogappapis.services;

import com.himanshu.blog.blogappapis.entities.Category;
import com.himanshu.blog.blogappapis.payloads.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {

    // Create
     CategoryDto createCategory(CategoryDto categoryDto);

    // Update
    CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

    // Delete
    void deleteCategory(Integer categoryId);

    // Get
    CategoryDto getCategory(Integer categoryId);

    //Get All
    List<CategoryDto> getCategories();
}
