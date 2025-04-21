package com.pluralsight;

public class Car {
    private String vehicleId;
    private String makeModel;
    private String color;
    private float vehiclePrice;
    private int odometerReading;









    public String getVehicleId() {
        return vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public String getColor() {
        return color;
    }

    public float getVehiclePrice() {
        return vehiclePrice;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    @Override
    public String toString() {
        return "car_class{" +
                "vehicleId='" + vehicleId + '\'' +
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", vehiclePrice=" + vehiclePrice +
                ", odometerReading=" + odometerReading +
                '}';
    }

    public Car(String vehicleId, String makeModel, String color, float vehiclePrice, int odometerReading) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.vehiclePrice = vehiclePrice;
        this.odometerReading = odometerReading;



    }
}
