package com.example.weatherlib.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Wind {

    private int speed;
    private int deg;
    private int gust;
}
