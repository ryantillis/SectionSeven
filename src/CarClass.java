public class CarClass {
    private String name;
    private int cylinderCount;
    private int topSpeed;

    public CarClass(String name, int cylinderCount) {
        this.name = name;
        this.cylinderCount = cylinderCount;
        this.topSpeed = 120;
    }

    public String getName() {
        return name;
    }

    public int getCylinderCount() {
        return cylinderCount;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void startEngine(){
        return "startEngine()";
    }

    public void accelerate(){
        return "accelerate()";
    }

    public void brake(){
        return "brake()";
    }

}
