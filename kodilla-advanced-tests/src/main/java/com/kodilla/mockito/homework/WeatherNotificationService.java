package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherNotificationService {

    private Map<WeatherNotification, List<WeatherClient>> weatherClients = new HashMap<>();

    public void addSubscriber(WeatherNotification weatherNotification, List<WeatherClient> weatherClient) {
        this.weatherClients.put(weatherNotification, weatherClient);
    }

    public void sendNotification(WeatherNotification weatherNotification, WeatherClient weatherClient) {
        this.weatherClients.forEach(weatherClient -> {
            weatherClient.receive(weatherNotification);
        });
    }

    public void removeNotification(WeatherNotification weatherNotification) {
        this.weatherClients.remove(weatherNotification);
    }

    public void removeSubscriber(WeatherClient weatherClient) {
        this.weatherClients.remove(weatherClient);
    }
}

