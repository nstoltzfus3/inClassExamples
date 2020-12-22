package com.nick.swaggertest.model;

import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ItemV2 {
    @ApiModelProperty(notes = "The name of the menu item")
    private String name;
    @ApiModelProperty(notes = "The description of the menu item")
    private String description;
    @ApiModelProperty(notes = "The category of the menu item (appetizer, entree, dessert, etc)")
    private String category;
    @ApiModelProperty(notes = "The ingredients used in the menu item")
    private List<IngredientV2> ingredients;
    @ApiModelProperty(notes = "The price of the menu item")
    private double price;
    @ApiModelProperty(notes = "The creation date of the menu item")
    private Date createdDate;
    @ApiModelProperty(notes = "The last updated date of the menu item")
    private Date updatedDate;
    private boolean glutenFree;
    private boolean vegetarian;
}