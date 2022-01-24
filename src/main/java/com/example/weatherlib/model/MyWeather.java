package com.example.weatherlib.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MyWeather {
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private MainProperties main;
    private String visibility;
    private Wind wind;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;
}