package com.example.msrating.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class RatingWrapper {
    private List<Rating> ratingList;
}
