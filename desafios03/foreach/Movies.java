package tasks.desafios03.foreach;

public class Movies extends Title{
    public Movies(String name, int release){
        super(name,release);
    }

    //VALUES:

    String osca;

    //OPERATIONS:

    public void setOsca(String osca) {
        this.osca = osca;
    }

    public String getOsca() {
        return osca;
    }

    //OVERRIDES:

    @Override
    public String toString() {
        return String.format("Filme: %s (%d).",getName() ,getRelease());
    }
}
