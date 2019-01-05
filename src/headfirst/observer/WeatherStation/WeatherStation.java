package headfirst.observer.WeatherStation;


public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.removeObserver(statisticsDisplay);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.removeObserver(currentDisplay);
		System.out.println("--------add HeatIndexDisplay--------");
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		weatherData.setMeasurements(78, 90, 29.2f);

	}
}
