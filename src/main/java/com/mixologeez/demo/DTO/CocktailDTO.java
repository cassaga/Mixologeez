package com.mixologeez.demo.DTO;


import com.mixologeez.demo.models.Cocktail;

public class CocktailDTO {
    private  Long id ;
    private  String cocktailName;
    private String cocktailImage;
    private String cocktailDescription;
    private  String cocktailInstructions;
    private String tag1;
    private String tag2;
    private String tag3;
    private  String country;


    public CocktailDTO (Cocktail cocktail) {
        this.id = cocktail.getCocktailId();
        this.cocktailName = cocktail.getCocktailName();
        this.cocktailImage = cocktail.getCocktailImage();
        this.cocktailDescription = cocktail.getCocktailDescription();
        this.cocktailInstructions = cocktail.getCocktailInstruction();
        this.tag1 = cocktail.getTag1().getTagName();
        this.tag2 = cocktail.getTag2().getTagName();
        this.tag3 = cocktail.getTag3().getTagName();
        this.country = cocktail.getCountry().getCountryName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getCocktailInstructions() {
        return cocktailInstructions;
    }

    public void setCocktailInstructions(String cocktailInstructions) {
        this.cocktailInstructions = cocktailInstructions;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "CocktailDTO{" +
                "id=" + id +
                ", cocktailName='" + cocktailName + '\'' +
                ", cocktailImage='" + cocktailImage + '\'' +
                ", cocktailDescription='" + cocktailDescription + '\'' +
                ", cocktailInstructions='" + cocktailInstructions + '\'' +
                ", tag1='" + tag1 + '\'' +
                ", tag2='" + tag2 + '\'' +
                ", tag3='" + tag3 + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}


