package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherNotificationServiceTestSuite {
    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();

    @Test
    public void subscribeClientShouldReceiveNotification() {
        WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
        weatherNotificationService.addSubscriber(weatherClient);

        WeatherNotification weatherNotification_01 = Mockito.mock(WeatherNotification.class);
        WeatherNotification weatherNotification_02 = Mockito.mock(WeatherNotification.class);
        WeatherNotification weatherNotification_03 = Mockito.mock(WeatherNotification.class);
        weatherNotificationService.sendNotification(weatherNotification_01);
        weatherNotificationService.sendNotification(weatherNotification_02);
        weatherNotificationService.sendNotification(weatherNotification_03);

        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification_01);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification_02);
        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification_03);
    }

//    @Test
//    public void subscribeClientCanRemoveOneNotification() {
//        WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
//        weatherNotificationService.addSubscriber(weatherClient);
//
//        WeatherNotification weatherNotification_01 = Mockito.mock(WeatherNotification.class);
//        WeatherNotification weatherNotification_02 = Mockito.mock(WeatherNotification.class);
//        WeatherNotification weatherNotification_03 = Mockito.mock(WeatherNotification.class);
//        weatherNotificationService.removeNotification(weatherNotification_01);
//        weatherNotificationService.sendNotification(weatherNotification_02);
//        weatherNotificationService.sendNotification(weatherNotification_03);
//
//        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification_01);
//        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification_02);
//        Mockito.verify(weatherClient, Mockito.times(1)).receive(weatherNotification_03);
//    }
//
//    @Test
//    public void subscribeClientCanRemoveAllNotification() {
//        WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
//        weatherNotificationService.addSubscriber(weatherClient);
//
//        WeatherNotification weatherNotification_01 = Mockito.mock(WeatherNotification.class);
//        WeatherNotification weatherNotification_02 = Mockito.mock(WeatherNotification.class);
//        WeatherNotification weatherNotification_03 = Mockito.mock(WeatherNotification.class);
//        weatherNotificationService.removeSubscriber(weatherClient);
////        weatherNotificationService.removeNotification(weatherNotification_01);
////        weatherNotificationService.removeNotification(weatherNotification_02);
////        weatherNotificationService.removeNotification(weatherNotification_03);
//
//        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification_01);
//        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification_02);
//        Mockito.verify(weatherClient, Mockito.never()).receive(weatherNotification_03);
//    }
//
//    @Test
//    public void notificationShouldBeSendToAllSubscriberInOneLocation() {
//        WeatherClient weatherClient_01 = Mockito.mock(WeatherClient.class);
//        WeatherClient weatherClient_02 = Mockito.mock(WeatherClient.class);
//        WeatherClient weatherClient_03 = Mockito.mock(WeatherClient.class);
//        weatherNotificationService.addSubscriber(weatherClient_01);
//        weatherNotificationService.addSubscriber(weatherClient_02);
//        weatherNotificationService.addSubscriber(weatherClient_03);
//        WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);
//        weatherNotificationService.sendNotification(weatherNotification);
//    }
//



}
