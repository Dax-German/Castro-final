package com.example.sensordata;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SensorService {

    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public Iterable<Sensor> getAllSensors() {
        return sensorRepository.findAll();
    }

    public Optional<Sensor> getSensorById(Long id) {
        return sensorRepository.findById(id);
    }

    public Sensor saveSensor(Sensor sensor) {
        return sensorRepository.save(sensor);
    }

    public void deleteSensor(Long id) {
        sensorRepository.deleteById(id);
    }
}
