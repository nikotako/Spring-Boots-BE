package com.boostmytool.beststore.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
    @NotEmpty(message = "The name is required")
    private String name;

    @NotEmpty(message = "The name is required")
    private String brand;

    @NotEmpty(message = "The name is required")
    private String category;

    @Min(0)
    private double price;

    @Size(min = 10, message = "the description should at least 10 character")
    @Size(max = 2000, message = "the description cannot exceed 2000 character")
    private String description;

    private MultipartFile imageFile;

    public @NotEmpty(message = "The name is required") String getBrand() {
        return brand;
    }

    public void setBrand(@NotEmpty(message = "The name is required") String brand) {
        this.brand = brand;
    }

    public @NotEmpty(message = "The name is required") String getCategory() {
        return category;
    }

    public void setCategory(@NotEmpty(message = "The name is required") String category) {
        this.category = category;
    }

    @Min(0)
    public double getPrice() {
        return price;
    }

    public void setPrice(@Min(0) double price) {
        this.price = price;
    }

    public @Size(min = 10, message = "the description should at least 10 character") @Size(max = 2000, message = "the description cannot exceed 2000 character") String getDescription() {
        return description;
    }

    public void setDescription(@Size(min = 10, message = "the description should at least 10 character") @Size(max = 2000, message = "the description cannot exceed 2000 character") String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }

    public @NotEmpty(message = "The name is required") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "The name is required") String name) {
        this.name = name;
    }
}
