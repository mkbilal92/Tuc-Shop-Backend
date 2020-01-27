package com.example.tucshopbackend.Controller;

import com.example.tucshopbackend.DTO.TransactionDTO;
import com.example.tucshopbackend.Repository.TransactionRepository;
import com.example.tucshopbackend.Services.TransactionService;
import com.example.tucshopbackend.commons.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/api/transaction")
@RestController

public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @Autowired
    TransactionRepository transactionRepository;

    @PostMapping("/")

    public ApiResponse postTransaction (@RequestBody TransactionDTO transactionDTO){

        return this.transactionService.saveTransaction(transactionDTO);


    }







}
