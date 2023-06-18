package meteo;

import java.time.LocalDateTime;

public class AdapterSensorTempriture implements MeteoSensor{
    private SensorTemperature sensorTemperature;  // создаем объект класса нового датчика
    public AdapterSensorTempriture(SensorTemperature sensorTemperature) {  // конструктор
        this.sensorTemperature = sensorTemperature;
    }


    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensorTemperature.temperature(); // привели к одному типу, скастовали
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        int year = sensorTemperature.year();
        int day = sensorTemperature.day() - 1;
        int second = sensorTemperature.second();
        return LocalDateTime.of(year,1,1,0,0,0)
                .plusDays(day).plusSeconds(second);
    }
}
