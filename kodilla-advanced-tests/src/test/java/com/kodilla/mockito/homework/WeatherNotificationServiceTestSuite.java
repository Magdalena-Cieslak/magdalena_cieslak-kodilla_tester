package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.xml.stream.Location;

public class WeatherNotificationServiceTestSuite {
    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);
    Location location = Mockito.mock(Location.class);


    @Test
    public void subscribeClientShouldReceiveNotificationFromGivenLocation() {
        weatherNotificationService.addSubscriber(location, weatherClient);
        weatherNotificationService.sendNotification(location, weatherNotification);

        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification);
    }

    @Test
    public void subscribeClientCanRemoveNotificationFromGivenLocation() {
        weatherNotificationService.addSubscriber(location, weatherClient);
        weatherNotificationService.addSubscriber(location, weatherClient);
        weatherNotificationService.addSubscriber(location, weatherClient);

        WeatherNotification weatherNotification_02 = Mockito.mock(WeatherNotification.class);
        WeatherNotification weatherNotification_03 = Mockito.mock(WeatherNotification.class);

        weatherNotificationService.removeLocation(location, weatherNotification);
        weatherNotificationService.sendNotification(location, weatherNotification_02);
        weatherNotificationService.sendNotification(location,weatherNotification_03);

        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification_02);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification_03);
    }

    @Test
    public void subscribeClientCanRemoveNotificationFromAllLocations() {
        weatherNotificationService.addSubscriber(location, weatherClient);
        weatherNotificationService.addSubscriber(location, weatherClient);
        weatherNotificationService.addSubscriber(location, weatherClient);

        WeatherNotification weatherNotification_02 = Mockito.mock(WeatherNotification.class);
        WeatherNotification weatherNotification_03 = Mockito.mock(WeatherNotification.class);
        weatherNotificationService.removeSubscriber(weatherClient);

        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification);
        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification_02);
        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification_03);
    }

    @Test
    public void notificationShouldBeSendToAllSubscriberFromGivenLocation() {
        WeatherClient weatherClient_02 = Mockito.mock(WeatherClient.class);
        WeatherClient weatherClient_03 = Mockito.mock(WeatherClient.class);
        weatherNotificationService.addSubscriber(location, weatherClient);
        weatherNotificationService.addSubscriber(location, weatherClient_02);
        weatherNotificationService.addSubscriber(location, weatherClient_03);

        weatherNotificationService.sendNotification(location, weatherNotification);

        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(weatherClient_02, Mockito.times(1)).receive(weatherNotification);
        Mockito.verify(weatherClient_03, Mockito.times(1)).receive(weatherNotification);
    }

}
