package com.kodilla.mockito.homework;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherNotificationService {

    private Map<Location, List<WeatherClient>> weatherClients = new HashMap<>();

    public void addSubscriber(Location location, WeatherClient weatherClient) {
        if (weatherClients.containsKey(location)) {
            weatherClients.get(location).add(weatherClient);
        } else {
            List<WeatherClient> clients = new ArrayList<>();
            clients.add(weatherClient);
            weatherClients.put(location, clients);
        }
    }

    public void sendNotification(Location location, WeatherNotification weatherNotification) {
        if(weatherClients.containsKey(location)) {
            weatherClients.get(location).forEach(clients -> clients.receive(weatherNotification));
        }
    }

    public void removeLocation(Location location) {
        this.weatherClients.remove(location);
    }

    public void removeSubscriber(WeatherClient weatherClient) {
        this.weatherClients.values().forEach(weatherClients -> weatherClients.remove(weatherClient));
    }
}

