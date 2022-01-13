package com.example.weatherlib.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Sys {

    private int type;
    private int id;
    private String country;
    private int sunrise;
    private int sunset;

}
