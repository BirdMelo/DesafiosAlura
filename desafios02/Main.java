package tasks.desafios02;

public class Main {
    public static void main(String[] args) {

        //MOVIES:
        Movie f1 = new Movie("Homem Aranha no Aranhaverso",2018);
        f1.toRate(10);
        f1.toRate(8);
        f1.toRate(9);
        f1.setOntheplan(true);
        f1.setMinutes(180);

        Movie f2 = new Movie("Homem Aranha: Através do Aranhaverso",2023);
        f2.toRate(10);
        f2.toRate(9.5);
        f2.toRate(9.1);
        f2.setOntheplan(false);
        f2.setMinutes(189);

        //OPERATIONS:
        System.out.println(f1.datasheet());
        System.out.println(f2.datasheet());
    }
}
