package com.example.tucshopbackend.Services;

import com.example.tucshopbackend.DTO.RequestProductDTO;
import com.example.tucshopbackend.Model.RequestProduct;
import com.example.tucshopbackend.Repository.RequestProductRepository;
import com.example.tucshopbackend.commons.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RequestProductService {

    @Autowired
    RequestProductRepository requestProductRepository;


    public ApiResponse saveRequestforproduct (RequestProductDTO requestproduct) {

        RequestProduct requestProduct = new RequestProduct();
        requestProduct.setName(requestproduct.getName());
        requestProductRepository.save(requestProduct);
         return new ApiResponse(200,"success",requestProduct);

    }




}
