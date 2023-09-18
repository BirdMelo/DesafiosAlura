package tasks.desafios02;

public class Movie {

    //VARIABLES:
    private String name;
    private int release;
    private int minutes;
    private boolean ontheplan;
    private double sumRatings;
    private int allRatings;

    //CONSTRUCTOR:
    public Movie(String name, int release){
        this.name = name;
        this.release = release;
    }


    //GETS & SETS:
    public String getName() {
        return name;
    }

    public int getRelease() {
        return release;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setOntheplan(boolean ontheplan) {
        this.ontheplan = ontheplan;
    }

    //OPERATIONS:
    public void toRate(double note){
        sumRatings+=note;
        allRatings++;
    }
    public String plan(){
        if (ontheplan){
            return "(DENTRO) Custo: GRÁTIS!";
        }else {
            return "(FORA) Custo: R$25,00";
        }
    }
    public double ratingAverage(){
        return sumRatings/allRatings;
    }
    public String datasheet(){
        return String.format("""
                =========================================
                                Ficha Tecnica
                                
                Filme: %s (%d)
                Avaliação: %.1f
                Duração: %dmin
                Plano: %s
                
                =========================================""",
                name,release,ratingAverage(),minutes,plan());
    }

}
