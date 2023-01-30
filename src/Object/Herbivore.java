package Object;

import java.util.Objects;

//3 level
public class Herbivore extends Mammal {

    private String typeOfFood;

    public Herbivore(String name, String year, String livingEnv, String travelSpeed, String typeOfFood) {
        super(name, year, livingEnv, travelSpeed);

        setTypeOfFood(typeOfFood);
    }

    public void eat(){
        System.out.println("Питаются - " + getTypeOfFood());
    }

    public void graze(){
        System.out.println("Представители пасутся");
    }

    public final String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeOfFood, herbivore.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", livingEnv='" + getLivingEnv() + '\'' +
                ", travelSpeed='" + getTravelSpeed() + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
