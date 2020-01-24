package com.example.tucshopbackend.Services;
import com.example.tucshopbackend.DTO.ProductsDTO;
import com.example.tucshopbackend.Model.Category;
import com.example.tucshopbackend.Model.Products;
import com.example.tucshopbackend.Repository.CategoryRepository;
import com.example.tucshopbackend.Repository.ProductsRepository;
import com.example.tucshopbackend.commons.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductsService {
    @Autowired

    ProductsRepository productsrepository;

    @Autowired
    CategoryRepository categoryRepository;


    public ApiResponse saveProducts (ProductsDTO products)

    {
        Products products1 = new Products();


        products1.setName(products.getName());
        products1.setCategory(products.getCategory());
        products1.setDescription(products.getDescription());
        products1.setPrice(products.getPrice());
        productsrepository.save(products1);


        return new ApiResponse (200,"success",products1);



    }

    public List<Products> getProducts(String category) {

        Category category1 = categoryRepository.findByname(category);
        List<Products> products = productsrepository.getAllProducts(category1.getId());
        return products;
    }
}
