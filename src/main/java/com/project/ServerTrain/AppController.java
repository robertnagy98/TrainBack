package com.project.ServerTrain;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AppController {

    @GetMapping("/SearchTrain")
    public ArrayList<Train> SearchTrain (@RequestBody SearchTrainRequest searchTrainRequest)
    {
        return ServerTrainApplication.SearchByStation(searchTrainRequest.getDeparture(),searchTrainRequest.getArrival(),searchTrainRequest.getDate());
    }

    @GetMapping("/TrainInfo/{id}")
    public Train TrainInfo (@PathVariable("id") int id)
    {
        for (Train train: ServerTrainApplication.trains)
        {
            if(train.id==id)
                return train;
        }
        return null;
    }

    @GetMapping("/TrainRoute/{id}")
    public Route TrainRoute (@PathVariable("id") int id)
    {
        for (Train train: ServerTrainApplication.trains)
        {
            if(train.id==id)
                return train.route;
        }
        return null;
    }

}
