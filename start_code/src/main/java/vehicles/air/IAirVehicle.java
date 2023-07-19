package vehicles.air;

import vehicles.IVehicle;

public interface IAirVehicle extends IVehicle {
    int getCapacity();
    void setCapacity(int capacity);
}
