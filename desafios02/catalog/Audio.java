package tasks.desafios02.catalog;

public class Audio {

    //ATTRIBUTE:
    private String title;
    private double duration;
    private String style;
    private int likes;
    private int reprodutions;
    private String producer;
    private String status;

    //CONSTRUCTOR:
    public  Audio(String title,String producer , double duration){
        this.title = title;
        this.producer = producer;
        this.duration = duration;
    }

    //GETS & SETS:
    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getProducer() {
        return producer;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getLikes() {
        return likes;
    }

    public int getReprodutions() {
        return reprodutions;
    }

    public String getStatus() {
        return status;
    }

    //OPERATIONS:
    public void like(){
        likes++;
    }
    public void reproduce(){
        reprodutions++;
    }
}
