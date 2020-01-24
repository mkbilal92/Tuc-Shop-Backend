package com.example.tucshopbackend.Model;

import javax.persistence.*;

@Entity
public class Products {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private  String name;
    private String description;
    private  String price;

    @ManyToOne
    @JoinColumn (name = "category_id", nullable = false)
    Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
