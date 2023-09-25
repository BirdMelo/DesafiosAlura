package tasks.desafios02.catalog;

import java.util.ArrayList;
import java.util.List;

public class Music extends Audio{

    //CONSTRUCTOR:
    public Music(String title, String producer, double duration) {
        super(title, producer, duration);
    }

    //ATTRIBUTES:
    private String artist;

    //GETS & SETS:
    public List<String> getArtist() {
        return artists;
    }
    public void setArtist(String artist) {
        artists.add(artist);
    }

    //OPERATIONS:
    List<String> artists = new ArrayList<>();

    @Override
    public String getStatus() {
        if (getLikes()>(getReprodutions()*0.7)){
            return "Uma das favoritas!";
        } else if (getLikes()<(getReprodutions()*0.3)) {
            return "Musica desaprovada pela comunidade.";
        }else {
            return "Musica polêmica.";
        }
    }
}
