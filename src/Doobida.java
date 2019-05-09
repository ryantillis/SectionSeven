public class Doobida extends CarClass {
    private String model;

    public Doobida(String name, int cylinderCount, String model) {
        super(name, cylinderCount);
        this.model = model;
    }

    @Override
    public String accelerate(){
        return "Your Mercedes is accelerating.";
    }

}
