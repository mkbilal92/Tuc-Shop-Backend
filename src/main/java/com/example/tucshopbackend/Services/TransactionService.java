package com.example.tucshopbackend.Services;


import com.example.tucshopbackend.DTO.TransactionDTO;
import com.example.tucshopbackend.Model.Transaction;
import com.example.tucshopbackend.Repository.TransactionRepository;
import com.example.tucshopbackend.commons.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
  @Autowired
    TransactionRepository transactionRepository;


  public ApiResponse saveTransaction (TransactionDTO Transaction){


      Transaction transaction = new Transaction();
      transaction.setAmount(Transaction.getAmount());
      transaction.setDate(Transaction.getDate());
      transaction.setProductsList(Transaction.getProductsList());
      transaction.setCreatedBy(Transaction.getCreatedBy());
      transaction.setUpdatedBy(Transaction.getUpdatedBy());
      transactionRepository.save(transaction);
      return new ApiResponse(200,"Transaction Added", transaction);
  }




}
