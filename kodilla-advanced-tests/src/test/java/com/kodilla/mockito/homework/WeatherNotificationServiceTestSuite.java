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
        Location location_02 = Mockito.mock(Location.class);
        Location location_03 = Mockito.mock(Location.class);

        weatherNotificationService.addSubscriber(location, weatherClient);
        weatherNotificationService.addSubscriber(location_02, weatherClient);
        weatherNotificationService.addSubscriber(location_03, weatherClient);

        WeatherNotification weatherNotification_02 = Mockito.mock(WeatherNotification.class);
        WeatherNotification weatherNotification_03 = Mockito.mock(WeatherNotification.class);

        weatherNotificationService.removeLocation(location);
        weatherNotificationService.sendNotification(location_02, weatherNotification_02);
        weatherNotificationService.sendNotification(location_03, weatherNotification_03);

        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification_02);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification_03);
    }

    @Test
    public void subscribeClientCanRemoveNotificationFromAllLocations() {
        Location location_01 = Mockito.mock(Location.class);
        Location location_02 = Mockito.mock(Location.class);

        weatherNotificationService.addSubscriber(location, weatherClient);
        weatherNotificationService.addSubscriber(location_01, weatherClient);
        weatherNotificationService.addSubscriber(location_02, weatherClient);

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
