package tasks.desafios02.compareble;

public class Person implements Comparable<Person>{
    //Variables:
    private String name;
    private int oldY;

    //Gets & Sets:


    public void setName(String name) {this.name = name;}

    public String getName() {return name;}

    public void setOldY(int oldY) {this.oldY = oldY;}

    public int getOldY() {return oldY;}

    //Overrides:
    @Override
    public int compareTo(Person o) {
        return getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return String.format("Nome: %s. Idade: %d",getName(),getOldY());
    }
}
