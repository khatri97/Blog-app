package com.himanshu.blog.blogappapis.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "categories")
@NoArgsConstructor
@Getter
@Setter
public class Category {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "title", length = 100, nullable = false)
    private String categoryTitle;

    @Column(name = "description")
    private String categoryDescription;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Post> posts= new ArrayList<>();

}
