package com.example.tucshopbackend.Controller;

import com.example.tucshopbackend.DTO.RequestProductDTO;
import com.example.tucshopbackend.Repository.RequestProductRepository;
import com.example.tucshopbackend.Services.RequestProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/api/requestproduct")
@RestController
public class RequestProductController {

    @Autowired
    RequestProductService requestProductService;

     @Autowired
    RequestProductRepository requestProductRepository;

     @PostMapping("/")

   public String  addRequest (@RequestBody RequestProductDTO requestforproduct){


      return  this.requestProductService.saveRequestforproduct(requestforproduct);



     }
}
