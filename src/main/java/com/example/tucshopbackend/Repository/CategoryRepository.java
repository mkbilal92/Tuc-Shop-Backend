package com.example.tucshopbackend.Repository;

import com.example.tucshopbackend.Model.Category;
import com.example.tucshopbackend.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


    public Category findByname(String name);



}
