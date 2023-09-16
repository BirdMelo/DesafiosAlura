package tasks.desafios02.foreach;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //AVATAR
        Movies f1 = new Movies("Avatar",2009);
        f1.setOsca("filme");
        f1.rate(8);
        f1.rate(6);
        f1.rate(7);

        //HOMEM DE FERRO
        Movies f2 = new Movies("Homem de Ferro",2008);
        f2.rate(5);
        f2.rate(3);
        f2.rate(6);

        //DRAGÃO
        Movies f3 = new Movies("Dragão",2011);
        f3.rate(3);
        f3.rate(6);
        f3.rate(10);

        //B.O.
        Series s1 = new Series("B.O.",2023);
        s1.rate(4);
        s1.rate(5);

        s1.setEps(8);

        //(DES)ENCANTO
        Series s2 = new Series("(Des)encanto",2018);
        s2.rate(4);
        s2.rate(10);
        s2.rate(7);

        s2.setEps(10);
        s2.setEps(10);
        s2.setEps(10);
        s2.setEps(10);
        s2.setEps(10);

        //THE WALKING DEAD
        Series s3 = new Series("The Walking Dead",2010);
        s3.rate(10);
        s3.rate(1);
        s3.rate(4);
        s3.rate(5);

        s3.setEps(6);
        s3.setEps(13);
        s3.setEps(16);
        s3.setEps(16);
        s3.setEps(16);
        s3.setEps(16);
        s3.setEps(16);
        s3.setEps(16);
        s3.setEps(16);
        s3.setEps(22);
        s3.setEps(16);

        //LIST
        List<Title> catalog = new ArrayList<>();
        catalog.add(f1);
        catalog.add(f2);
        catalog.add(f3);
        catalog.add(s1);
        catalog.add(s2);
        catalog.add(s3);

        //OPERATION
        for (Title item:catalog) {
            System.out.println("===============================================");
            System.out.println(item);
            System.out.println(String.format("Avaliação: %.1f",item.Review()));
            if(item instanceof Movies movie && movie.getOsca()!=null){
                System.out.println(String.format("Ganhador do Osca de melhor %s",movie.getOsca()));
            } else if (item instanceof Series serie) {
                System.out.println("Quantidade de temporadas: "+serie.getSeasons());
                System.out.println("Média de epsódios por temporada: "+serie.averageEps());
            }
        }
        System.out.println("===============================================");
    }
}
