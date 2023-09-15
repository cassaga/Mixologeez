package com.mixologeez.demo.DTO;

import com.mixologeez.demo.models.Cocktail;

public class CocktailPostDTO {
    private  String cocktailName;
    private String cocktailImage;
    private String cocktailDescription;
    private  String cocktailInstruction;
    private Integer tag1Id;
    private Integer tag2Id;
    private Integer tag3Id;
    private  Integer countryId;

    public CocktailPostDTO() {}

    public String getCocktailName() {
        return cocktailName;
    }

    public void setCocktailName(String cocktailName) {
        this.cocktailName = cocktailName;
    }

    public String getCocktailImage() {
        return cocktailImage;
    }

    public void setCocktailImage(String cocktailImage) {
        this.cocktailImage = cocktailImage;
    }

    public String getCocktailDescription() {
        return cocktailDescription;
    }

    public void setCocktailDescription(String cocktailDescription) {
        this.cocktailDescription = cocktailDescription;
    }

    public String getCocktailInstruction() {
        return cocktailInstruction;
    }

    public void setCocktailInstruction(String cocktailInstruction) {
        this.cocktailInstruction = cocktailInstruction;
    }

    public Integer getTag1Id() {
        return tag1Id;
    }

    public void setTag1Id(Integer tag1Id) {
        this.tag1Id = tag1Id;
    }

    public Integer getTag2Id() {
        return tag2Id;
    }

    public void setTag2Id(Integer tag2Id) {
        this.tag2Id = tag2Id;
    }

    public Integer getTag3Id() {
        return tag3Id;
    }

    public void setTag3Id(Integer tag3Id) {
        this.tag3Id = tag3Id;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "CocktailPostDTO{" +
                "cocktailName='" + cocktailName + '\'' +
                ", cocktailImage='" + cocktailImage + '\'' +
                ", cocktailDescription='" + cocktailDescription + '\'' +
                ", cocktailInstruction='" + cocktailInstruction + '\'' +
                ", tag1Id=" + tag1Id +
                ", tag2Id=" + tag2Id +
                ", tag3Id=" + tag3Id +
                ", countryId=" + countryId +
                '}';
    }
}
