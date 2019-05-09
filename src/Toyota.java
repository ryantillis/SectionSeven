public class Toyota extends CarClass {
    private String model;

    public Toyota(String name, int cylinderCount, String model) {
        super(name, cylinderCount);
        this.model = model;
    }

    @Override
    public String accelerate(){
        return "Your Toyota is accelerating.";
    }
}
