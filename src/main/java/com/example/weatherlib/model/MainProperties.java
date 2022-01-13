package com.example.weatherlib.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MainProperties {

    private int temp;
    private int feels_like;
    private int temp_min;
    private int temp_max;
    private int pressure;
    private int humidity;

}
