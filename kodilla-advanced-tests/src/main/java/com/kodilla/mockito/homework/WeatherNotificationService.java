package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;

public class WeatherNotificationService {

    private Map<WeatherClient, WeatherNotification> weatherClients = new HashMap<>();

    public void addSubscriber(WeatherClient weatherClient, WeatherNotification weatherNotification) {
        this.weatherClients.put(weatherClient,weatherNotification);
    }

    public void sendNotification(WeatherClient weatherClient, WeatherNotification weatherNotification) {
        this.weatherClients.forEach(WeatherClient::receive);
    }

    public void removeNotification(WeatherClient weatherClient, WeatherNotification weatherNotification) {
    }

    public void removeSubscriber(WeatherClient weatherClient, WeatherNotification weatherNotification) {
    }
}

