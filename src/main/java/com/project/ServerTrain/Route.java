package com.project.ServerTrain;

import java.util.ArrayList;

public class Route {
    public int id;
    public ArrayList<Station> stations;
    public String date;
    public String time;

    public Route(int id, ArrayList<Station> stations, String date, String time)
    {
        this.id=id;
        this.stations=stations;
        this.date=date;
        this.time=time;
    }

    public Route() {}

    public String getStations()
    {
        String station="";
        for (Station s: stations)
        {
            station=station+s.name;
        }
        return station;
    }
}
