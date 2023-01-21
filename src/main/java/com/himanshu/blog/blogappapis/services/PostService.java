package com.himanshu.blog.blogappapis.services;

import com.himanshu.blog.blogappapis.entities.Category;
import com.himanshu.blog.blogappapis.entities.Post;
import com.himanshu.blog.blogappapis.entities.User;
import com.himanshu.blog.blogappapis.payloads.PostDto;

import java.util.List;

public interface PostService {

    //create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    //update
    Post updatePost(PostDto postDto, Integer postId);

    //delete
    void deletePost(Integer postId);

    //get all posts
    List<Post> getAllPost();

    //get single post
    Post getPostById(Integer postId);

    //get all posts by categories
    List<PostDto> getAllByCategory(Integer categoryId);

    //get all posts by user
    List<PostDto> getAllByUser(Integer userId);

    //search posts
    List<Post> searchPosts(String keyword);
}
