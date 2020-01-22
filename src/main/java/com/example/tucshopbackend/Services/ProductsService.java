package com.example.tucshopbackend.Services;
import com.example.tucshopbackend.DTO.ProductsDTO;
import com.example.tucshopbackend.Model.Products;
import com.example.tucshopbackend.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductsService {
    @Autowired

    ProductsRepository productsrepository;


    public String saveProducts (ProductsDTO products)

    {
        Products products1 = new Products();


        products1.setName(products.getName());
        products1.setCategory(products.getCategory());
        products1.setDescription(products.getDescription());
        products1.setPrice(products.getPrice());
        productsrepository.save(products1);


        return ("Products Saved");



    }




}
