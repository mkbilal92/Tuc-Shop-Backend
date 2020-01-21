package com.example.tucshopbackend.Repository;

import com.example.tucshopbackend.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
