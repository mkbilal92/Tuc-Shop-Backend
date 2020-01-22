package com.example.tucshopbackend.Repository;

import com.example.tucshopbackend.Model.RequestProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RequestProductRepository  extends JpaRepository <RequestProduct, Long> {
}
