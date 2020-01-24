package com.example.tucshopbackend.Controller;


import com.example.tucshopbackend.DTO.ProductsDTO;
import com.example.tucshopbackend.Model.Products;
import com.example.tucshopbackend.Repository.ProductsRepository;
import com.example.tucshopbackend.Services.ProductsService;
import com.example.tucshopbackend.commons.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/products")

public class ProductsController {

    @Autowired
    ProductsService productsService;

    @Autowired
    ProductsRepository productsRepository;

   @PostMapping("/")
    public ApiResponse getProducts (@RequestBody ProductsDTO products) {

        return this.productsService.saveProducts(products);



    }


    @RequestMapping(value = "/{category}", method = RequestMethod.GET)
    public List <Products> getProducts(@PathVariable("category") String category){

        return productsService.getProducts(category);
    }




}
