package tasks.desafios02;

import tasks.desafios02.catalog.Music;
import tasks.desafios02.catalog.PodCast;

public class Main {
    public static void main(String[] args) {
        PodCast jovemNerd = new PodCast("Cyberpunk - ep.1","Equipe Jovem Nerd",90);

        jovemNerd.setStyle("RPG");
        for (int i = 0; i < 6000; i++) {
            jovemNerd.reproduce();
        }
        for (int i = 0; i < 3000; i++) {
            jovemNerd.like();
        }
        jovemNerd.setHost("Jovem Nerd");
        jovemNerd.setHost("Azagal");

        jovemNerd.setFeat("Gaveta");
        jovemNerd.setFeat("Tucano");

        System.out.println(jovemNerd.getHosts());
        System.out.println(jovemNerd.getFeat());
        System.out.println(String.format("Reproduções: %d  |  Likes: %d",
                jovemNerd.getReprodutions(),jovemNerd.getLikes()));
        System.out.println(jovemNerd.getStatus());

        Music lost = new Music("Lost","Link Park",3.33);
        lost.setStyle("Pop Rock");
        for (int i = 0; i < 3000000; i++) {
            lost.reproduce();
        }
        for (int i = 0; i < 2300000; i++) {
            lost.like();
        }

        lost.setArtist("Chester Bennington");
        lost.setArtist("Mike Shinoda");
        lost.setArtist("Joe Hahn");
        lost.setArtist("Rob Bourdon");
        lost.setArtist("Dave Farrel");
        lost.setArtist("Brad Delson");

        System.out.println(lost.getArtist());
        System.out.println(String.format("Reproduções: %d  |  Likes: %d",
                lost.getReprodutions(),lost.getLikes()));
        System.out.println(lost.getStatus());

        PodCast louco = new PodCast("Aliens vão dominar o mundo!","Chapel de Aluminio",180);
        louco.setStyle("Conversa");

        louco.setHost("Fabricio Lolo");
        louco.setHost("João Vitamina");

        louco.setFeat("Merêncio");

        for (int i = 0; i < 4000; i++) {
            louco.reproduce();
        }
        for (int i = 0; i < 100; i++) {
            louco.like();
        }
        System.out.println(louco.getProducer());
        System.out.println(louco.getStatus());
    }
}
