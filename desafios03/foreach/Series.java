package tasks.desafios03.foreach;

public class Series extends Title{
    public Series(String name, int release) {
        super(name, release);
    }

    //VALUES:
    private int eps;
    private int seasons;
    private int sum;

    //OPERATIONS:

    public void setEps(int eps) {
        sum+=eps;
        seasons++;
    }
    public int averageEps(){
        return sum/seasons;
    }

    public int getSeasons() {
        return seasons;
    }
    //OVERRIDES:

    @Override
    public String toString() {
        return String.format("Série: %s (%d)",getName(),getRelease());
    }
}
