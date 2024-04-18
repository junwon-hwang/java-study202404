package day08.final_.practice;

import static day08.final_.practice.WeatherConstants.*;

public class WeatherAnalyzer  {
    public static boolean checkTemperatureAlert(double currentTemperature) {
        return currentTemperature > MAX_TEMPERATURE_ALERT.getNumericData()
                || currentTemperature < MIN_TEMPERATURE_ALERT.getNumericData();
    }

    public static boolean checkPrecipitationAlert(double currentPrecipitation) {
        return currentPrecipitation > PRECIPITATION_ALERT.getNumericData();
    }
}
