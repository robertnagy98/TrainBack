package com.project.ServerTrain;

public class Train {

    public int id;
    public Route route;
    public int sits;
    public int wagons;
    public int price;
    public String time;
    public String departureTime;
    public String arrivalTime;
    public String trainKind;

    public Train(int id, Route route, int sits, int wagons, int price, String time, String departureTime, String arrivalTime, String trainKind)
    {
        this.id=id;
        this.route=route;
        this.sits=sits;
        this.wagons=wagons;
        this.price=price;
        this.time=time;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.trainKind=trainKind;
    }

    public Train() {}
}
