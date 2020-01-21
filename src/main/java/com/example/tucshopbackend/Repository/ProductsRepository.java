package com.example.tucshopbackend.Repository;

import com.example.tucshopbackend.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long>
{
}
