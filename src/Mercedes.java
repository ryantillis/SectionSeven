public class Mercedes extends CarClass {
    private String model;

    public Mercedes(String name, int cylinderCount, String model) {
        super(name, cylinderCount);
        this.model = model;
    }

    @Override
    public String accelerate(){
        return "Your Mercedes is accelerating.";
    }

}
