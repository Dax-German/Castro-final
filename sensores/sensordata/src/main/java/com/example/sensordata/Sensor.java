package com.example.sensordata;

import jakarta.persistence.*; // Import correcto para JPA con Jakarta
import java.time.LocalDateTime;

@Entity // Marca esta clase como una entidad de JPA
@Table(name = "sensor") // (Opcional) Define explícitamente el nombre de la tabla
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática de IDs
    private Long id;

    @Column(nullable = false) // Define esta columna como no nula
    private String sensorId;

    @Column(nullable = false)
    private String sensorType;

    @Column(nullable = false)
    private Double value;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
