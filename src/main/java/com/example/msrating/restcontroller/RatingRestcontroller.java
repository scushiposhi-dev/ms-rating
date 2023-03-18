package com.example.msrating.restcontroller;

import com.example.msrating.model.Rating;
import com.example.msrating.model.RatingWrapper;
import com.example.msrating.model.Wine;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

import static com.example.msrating.util.ModelUtils.WineTypeEnum.WHITE;

@RestController
@RequestMapping("/ratings")
public class RatingRestcontroller {

    @GetMapping("/wines")
    public RatingWrapper getRatings(){
        RatingWrapper ratingWrapper = RatingWrapper.builder()
                .ratingList(Arrays.asList(Rating.<Wine>builder()
                        .rate(4)
                        .object(Wine.builder().type(WHITE.name()).description("friulano colle duga").id(1L).build())
                        .type(WHITE)
                        .name("friulano colle duga")
                        .description("good enough").build()))
                .build();

        return ratingWrapper;
    }
}
