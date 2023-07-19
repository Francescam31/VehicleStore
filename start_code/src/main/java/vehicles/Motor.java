package vehicles;

public class Motor implements IMotorised {

    int hp;
    int fuel;

    public Motor(int fuel, int hp) {
        this.fuel = fuel;
        this.hp = hp;
    }

    @Override
    public void startEngine() {
        System.out.println("motor started");
    }

    @Override
    public void stopEngine() {
        System.out.println("motor stopped");
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }


}
