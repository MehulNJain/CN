package JavaPOE;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class WeatherDataGenerator {
    public static void main(String[] args) {
        String city = "Solapur";
        int numberOfRecords = 1000;
        Random random = new Random();

        try {
            FileWriter writer = new FileWriter("weather_data.csv");

            for (int i = 0; i < numberOfRecords; i++) {
                double minTemp = 15 + (25 - 15) * random.nextDouble();
                double maxTemp = 30 + (45 - 30) * random.nextDouble();

                minTemp = Math.round(minTemp * 10.0) / 10.0;
                maxTemp = Math.round(maxTemp * 10.0) / 10.0;

                writer.write(city + "," + minTemp + "," + maxTemp + "\n");
            }

            writer.close();
            System.out.println("Weather data generated successfully into weather_data.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
