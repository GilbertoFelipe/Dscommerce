package com.cursodevsuperior.dscommerce.dto;

import com.cursodevsuperior.dscommerce.entities.Product;

public class ProductDTO {

    private Long id;
    private String name;
    private String descritpion;
    private Double price;
    private String imUrl;

    public ProductDTO(){

    }

    public ProductDTO(Long id, String name, String descritpion, Double price, String imUrl) {
        this.id = id;
        this.name = name;
        this.descritpion = descritpion;
        this.price = price;
        this.imUrl = imUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        descritpion = entity.getDescription();
        price = entity.getPrice();
        imUrl = entity.getImgUrl();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public Double getPrice() {
        return price;
    }

    public String getImUrl() {
        return imUrl;
    }
}
