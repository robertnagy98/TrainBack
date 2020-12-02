package com.project.ServerTrain;

public class Station {

    public int id;
    public String name;
    public double lat;
    public double lon;

    public Station(int id, String name, double lon , double lat)
    {
        this.id=id;
        this.name=name;
        this.lat=lat;
        this.lon=lon;
    }

}
