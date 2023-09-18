package tasks.desafios03.foreach;

public class Title {

    //VALUES:

    private String name;
    private int release;
    private double sumRate;
    private int countRate;

    //OPERATIONS:

    public Title(String name,int release){
        this.name = name;
        this.release = release;
    }

    public String getName() {
        return name;
    }

    public int getRelease() {
        return release;
    }

    public void rate(double rate){
        sumRate+=rate;
        countRate++;
    }

    public double Review(){
        return  sumRate/countRate;
    }
}
