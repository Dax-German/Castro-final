package com.example.sensordata;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @GetMapping
    public Iterable<Sensor> getAllSensors() {
        return sensorService.getAllSensors();
    }

    @GetMapping("/{id}")
    public Optional<Sensor> getSensorById(@PathVariable Long id) {
        return sensorService.getSensorById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sensor createSensor(@RequestBody Sensor sensor) {
        return sensorService.saveSensor(sensor);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSensor(@PathVariable Long id) {
        sensorService.deleteSensor(id);
    }
}
