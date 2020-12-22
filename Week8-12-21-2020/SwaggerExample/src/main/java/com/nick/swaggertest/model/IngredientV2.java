package com.nick.swaggertest.model;

import lombok.Data;

@Data
public class IngredientV2 {
    private String name;
    private String category;
    private String origin;
    private boolean isMeat;
}
