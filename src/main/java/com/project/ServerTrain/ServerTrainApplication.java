package com.project.ServerTrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ServerTrainApplication {

	public static ArrayList<Train> trains= new ArrayList<Train>();

	public static void main(String[] args) {
		SpringApplication.run(ServerTrainApplication.class, args);

		Station sArad=new Station(01,"Arad",21.33,46.19);
		Station sTimisoara =new Station(02,"Timisoara",21.21,45.75);
		Station sOradea =new Station(03,"Oradea",21.94,47.07);
		ArrayList<Station> stations=new ArrayList<Station>();
		stations.add(sArad);
		stations.add(sTimisoara);
		stations.add(sOradea);
		Route sTimisoara_sArad=new Route(01,stations,"02.12.2020","13:00");
		Route sTimisoara_sOradea=new Route(01,stations,"03.12.2020","13:00");
		Train train=new Train(01,sTimisoara_sArad,104,3,10,"52min","12:00","13:02","IR");
		Train train1=new Train(02,sTimisoara_sOradea,154,4,15,"120min","17:00","19:00","IRN");
		trains.add(train);
		trains.add(train1);
	}
	public static ArrayList<Train> SearchByStation(String start, String finish, String date)
	{
		ArrayList<Train> t=new ArrayList<Train>();
		for (Train train: trains)
		{
			String stations=train.route.getStations();
			if(stations.contains(start) && stations.contains(finish) && train.route.date.contains(date))
			{
				t.add(train);
			}
		}
		return t;
	}

	public static Route SearchByTrainId(int id)
	{
		for (Train train: trains)
		{
			if(train.id==id)
			{
				return train.route;
			}
		}
		return null;
	}

}
