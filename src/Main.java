import Object.*;

public class Main {
    public static void main(String[] args) {
        Herbivore gazelle = new Herbivore("Gazelle", "2014", "Степь", "Очень быстрая", "Травоядная");
        Herbivore giraffe = new Herbivore("Giraffe", "2013", "Саванна", "Умеренная", "Листоядная");
        Herbivore horse = new Herbivore("Horse", "2012", "Равнина", "Быстрая", "Травоядная");

        Predator hyena = new Predator("Hyena", "2011", "Саванна", "Очень быстрая", "Мясоед");
        Predator tiger = new Predator("Tiger", "2010", "Саванна", "Очень быстрая", "Мясоед");
        Predator bear = new Predator("Bear", "2009", "Лесополоса", "Умеренная", "Ягодоед");

        Amphibian frog = new Amphibian("Frog", "2008", "Тропики");
        Amphibian snake = new Amphibian("Snake", "2007", "Тропики");

        Unflying peacock = new Unflying("Peacock", "2006", "Саванна", "Лапами");
        Unflying penguin = new Unflying("Penguin", "2005", "Северный полюс", "Лапками");
        Unflying dodo = new Unflying("DoDo", "2004", "Лесополоса", "Лапками");

        Flying seagull = new Flying("Seagull", "2003", "Повсюду", "Полетами");
        Flying albatross = new Flying("Albatross", "2002", "Океан", "Полетами");
        Flying falcon = new Flying("Falcon", "2001", "Горы", "Полетами");


        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println("");
        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);
        System.out.println("");
        System.out.println(frog);
        System.out.println(snake);
        System.out.println("");
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println("");
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);


    }
}