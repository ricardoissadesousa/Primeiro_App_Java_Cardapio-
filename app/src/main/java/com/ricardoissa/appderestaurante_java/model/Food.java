package com.ricardoissa.appderestaurante_java.model;

public class Food {
    int imgFood;
    String foodName;
    String foodDescription;
    String prince;

    public Food(int imgFood, String foodName, String foodDescription, String prince) {
        this.imgFood = imgFood;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.prince = prince;
    }

    public int getImgFood() {
        return imgFood;
    }

    public void setImgFood(int imgFood) {
        this.imgFood = imgFood;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public String getPrince() {
        return prince;
    }

    public void setPrince(String prince) {
        this.prince = prince;
    }
}
