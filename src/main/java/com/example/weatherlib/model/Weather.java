package com.example.weatherlib.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Weather {

    private int id;
    private String main;
    private String description;
    private String icon;

}
