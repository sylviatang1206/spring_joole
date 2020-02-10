package com.example.springjoole.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String manufacturer;
    private String series;
    private String model;
    private String use_type;
    private String application;
    private String mounting_location;
    private String accessories;
    private int model_year;
    private int airflow;
    private long power_min;
    private long power_max;
    private int operating_voltage_min;
    private int operating_voltage_max;
    private int fan_speed_min;
    private int fan_speed_max;
    private int number_of_fan_speeds;
    private int sound;
    private int diameter;
    private long height_max;
    private long height_min;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUse_type() {
        return use_type;
    }

    public void setUse_type(String use_type) {
        this.use_type = use_type;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getMounting_location() {
        return mounting_location;
    }

    public void setMounting_location(String mounting_location) {
        this.mounting_location = mounting_location;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public int getModel_year() {
        return model_year;
    }

    public void setModel_year(int model_year) {
        this.model_year = model_year;
    }

    public int getAirflow() {
        return airflow;
    }

    public void setAirflow(int airflow) {
        this.airflow = airflow;
    }

    public long getPower_min() {
        return power_min;
    }

    public void setPower_min(long power_min) {
        this.power_min = power_min;
    }

    public long getPower_max() {
        return power_max;
    }

    public void setPower_max(long power_max) {
        this.power_max = power_max;
    }

    public int getOperating_voltage_min() {
        return operating_voltage_min;
    }

    public void setOperating_voltage_min(int operating_voltage_min) {
        this.operating_voltage_min = operating_voltage_min;
    }

    public int getOperating_voltage_max() {
        return operating_voltage_max;
    }

    public void setOperating_voltage_max(int operating_voltage_max) {
        this.operating_voltage_max = operating_voltage_max;
    }

    public int getFan_speed_min() {
        return fan_speed_min;
    }

    public void setFan_speed_min(int fan_speed_min) {
        this.fan_speed_min = fan_speed_min;
    }

    public int getFan_speed_max() {
        return fan_speed_max;
    }

    public void setFan_speed_max(int fan_speed_max) {
        this.fan_speed_max = fan_speed_max;
    }

    public int getNumber_of_fan_speeds() {
        return number_of_fan_speeds;
    }

    public void setNumber_of_fan_speeds(int number_of_fan_speeds) {
        this.number_of_fan_speeds = number_of_fan_speeds;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public long getHeight_max() {
        return height_max;
    }

    public void setHeight_max(long height_max) {
        this.height_max = height_max;
    }

    public long getHeight_min() {
        return height_min;
    }

    public void setHeight_min(long height_min) {
        this.height_min = height_min;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int weight;

}
