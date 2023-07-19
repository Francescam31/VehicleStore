package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class Kayak extends Vehicle implements IWaterVehicle {

    private String hullType;
    private IMotorised motor;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
        this.hullType = "Round";
    }

    @Override
    public String getHullType(){
        return this.hullType;
    }

    @Override
    public void setHullType(String hulltype){
        this.hullType = hullType;
    }


}
