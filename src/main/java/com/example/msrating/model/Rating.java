package com.example.msrating.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Rating <T>{
    private T object;
    private String name;
    private Enum type;
    private int rate;
    private String description;
}
