package com.example.tucshopbackend.Repository;

import com.example.tucshopbackend.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long>
{

    @Query(value = "select * from products where category_id =:id ", nativeQuery = true)
    public List<Products> getAllProducts(@Param("id")Long id);

}
