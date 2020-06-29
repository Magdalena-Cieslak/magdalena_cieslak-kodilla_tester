package com.kodilla.mockito.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherNotificationService {

    private Map<WeatherNotification, List<WeatherClient>> weatherNotifications = new HashMap<>();
    private List<WeatherClient> weatherClients = new ArrayList<>();

    public void addSubscriber(WeatherClient weatherClient) {
        this.weatherClients.add(weatherClient);
    }

    public void sendNotification(WeatherNotification weatherNotification, List<WeatherClient> weatherClient) {
        this.weatherClients.forEach(weatherClient -> weatherClient.receive(weatherNotification));
    }

    public void removeNotification(WeatherClient weatherClient, WeatherNotification weatherNotification) {
        this.weatherClients.remove(weatherNotification);
    }

    public void removeSubscriber(WeatherClient weatherClient, WeatherNotification weatherNotification) {
        this.weatherClients.remove(weatherClient);
    }
}

