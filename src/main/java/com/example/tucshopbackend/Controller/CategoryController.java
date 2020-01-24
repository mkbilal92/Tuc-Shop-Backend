package com.example.tucshopbackend.Controller;

import com.example.tucshopbackend.DTO.CategoryDTO;
import com.example.tucshopbackend.Repository.CategoryRepository;
import com.example.tucshopbackend.Services.CategoryService;
import com.example.tucshopbackend.commons.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RequestMapping ("/api/category")
@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryService categoryService;

    @PostMapping ("/")


    public ApiResponse getRequest (@RequestBody CategoryDTO categoryDTO){

        return this.categoryService.saveCategory (categoryDTO);



    }



}
