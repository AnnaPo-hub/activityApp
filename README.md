Strava Extension for Family Trip Activities
Финальный проект для курса Spring frameWork  разработчик  в OTUS. 

1. Для начала работы заменить accessToken в apiClient() в классе StravaIntegrationConfiguration
    strava_oauth.setAccessToken("bce070482f098a98f45c44278b2e668ee72828cc");
    В статье по ссылке описаны шаги для получения токена: 
    https://github.com/franchyze923/Code_From_Tutorials/blob/master/Strava_Api/request_links.txt
    
2. Запустить приложения в модулях activity(порт 8080) и stravaAdapterTrue(порт 7001)
3. Создать новое  путешествие, используя TripService
4. Получить  все активности за время путешествия, вызвав метод  getActivitiesByPeriod , который вызывает сервис Strava
5. С помощью метода getStatsByTrip получить статистику по путешествию 
    
 
    
   
