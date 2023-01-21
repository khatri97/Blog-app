package com.himanshu.blog.blogappapis.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.criteria.CriteriaBuilder;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer categoryID;
    private String categoryTitle;
    private String categoryDescription;

}
