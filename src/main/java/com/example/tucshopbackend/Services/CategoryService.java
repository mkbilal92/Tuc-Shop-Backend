package com.example.tucshopbackend.Services;

import com.example.tucshopbackend.DTO.CategoryDTO;
import com.example.tucshopbackend.Model.Category;
import com.example.tucshopbackend.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {


    @Autowired
    CategoryRepository categoryRepository;

    public String saveCategory (CategoryDTO category){


        Category category1 = new Category ();

        category1.setName(category.getName());
        category1.setImage(category.getImage());
        categoryRepository.save(category1);
        return ("Save Category");
    }


}
