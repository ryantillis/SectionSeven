
class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot(){
        return "Shark eat dem peeple.";
    }

}

class Interstellar extends Movie {
    public Interstellar(){
        super("Interstellar");
    }

    public String plot(){
        return "Man goes into bookshelf.";
    }

}

class Matrix extends Movie {
    public Matrix(){
        super("Matrix");
    }

    public String plot(){
        return "Computer Jesus.";
    }

}

class forgettableMovie extends Movie {
    public forgettableMovie(){
        super("Forgettable.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        for(int i = 1; i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie name " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }


    }


    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        System.out.println("number is " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new Interstellar();
            case 3:
                return new Matrix();
            case 4:
                return new forgettableMovie();
        }
        return null;
    }

}
