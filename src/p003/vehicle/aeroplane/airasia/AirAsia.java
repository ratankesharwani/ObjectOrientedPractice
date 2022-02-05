package p003.vehicle.aeroplane.airasia;

import p003.vehicle.Vehicle;

public abstract class AirAsia implements Vehicle {
    private Float fuel = Float.valueOf(0f);
    public Integer wheel;

    public Float getFuel() {
        return fuel;
    }

    public void setFuel(Float fuel) {
        if(fuel<1) {
            System.out.println("Bhai thoda bhara na");
        }
        {
            this.fuel = fuel;
        }
    }
}
