package com.example.tucshopbackend.Repository;

import com.example.tucshopbackend.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
