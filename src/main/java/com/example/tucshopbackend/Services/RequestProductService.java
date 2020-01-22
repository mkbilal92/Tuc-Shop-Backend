package com.example.tucshopbackend.Services;

import com.example.tucshopbackend.DTO.RequestProductDTO;
import com.example.tucshopbackend.Model.RequestProduct;
import com.example.tucshopbackend.Repository.RequestProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestProductService {

    @Autowired
    RequestProductRepository requestProductRepository;


    public String saveRequestforproduct (RequestProductDTO requestproduct)

    {

        RequestProduct requestProduct = new RequestProduct();
        requestProduct.setName(requestproduct.getName());
        requestProductRepository.save(requestProduct);
         return ("Saved Product");





    }




}
