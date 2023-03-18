package com.example.msrating.model;

import com.example.msrating.util.ModelUtils.*;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public enum RateTypeEnum {
    WINE(WineTypeEnum.class),
    BEER(BeerTypeEnum.class),
    CITY(CityTypeEnum.class),
    COUNTRY(CountryTypeEnum.class);

    private Class type;

    public static Map<String, RateTypeEnum> rateTypeMap = new HashMap<>();

    RateTypeEnum(Class type) {
        this.type = type;
    }

    static{
        Stream.of(values()).map(rateTypeEnum -> rateTypeMap.put(rateTypeEnum.name().toLowerCase(), rateTypeEnum));
    }
}