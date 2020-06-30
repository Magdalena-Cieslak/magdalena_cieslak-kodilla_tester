package com.kodilla.mockito.homework;

import javax.xml.stream.Location;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherNotificationService {

    private Map<Location, List<WeatherClient>> weatherClients = new HashMap<>();

    public void addSubscriber(Location location, List<WeatherClient> weatherClient) {
        this.weatherClients.put(location, weatherClient);
    }

    public void sendNotification(WeatherNotification weatherNotification, Location location) {
        this.weatherClients.forEach(client -> client.receive(location, weatherNotification));
    }

    public void removeLocation(Location location) {
        this.weatherClients.remove(location);
    }

    public void removeSubscriber(WeatherClient weatherClient) {
        this.weatherClients.remove(weatherClient);
    }
}

