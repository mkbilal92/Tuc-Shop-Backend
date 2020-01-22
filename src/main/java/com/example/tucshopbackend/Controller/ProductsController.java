package com.example.tucshopbackend.Controller;


import com.example.tucshopbackend.DTO.ProductsDTO;
import com.example.tucshopbackend.Repository.ProductsRepository;
import com.example.tucshopbackend.Services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/api/products")

public class ProductsController {

    @Autowired
    ProductsService productsService;

    @Autowired
    ProductsRepository productsRepository;

   @PostMapping("/")
    public String getProducts (@RequestBody ProductsDTO products) {

        return  this.productsService.saveProducts(products);



    }







}
