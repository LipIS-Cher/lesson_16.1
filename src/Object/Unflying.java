package Object;

import java.util.Objects;

//3 level
public class Unflying extends Bird{

    private String typeOfTravel;

    public Unflying(String name, String year, String livingEnv, String typeOfTravel) {
        super(name, year, livingEnv);

        setTypeOfTravel(typeOfTravel);
    }

    public void walk(){
        System.out.println("Не способны летать");
    }

    public final String getTypeOfTravel() {
        return typeOfTravel;
    }

    public void setTypeOfTravel(String typeOfTravel) {
        if (typeOfTravel != null && !typeOfTravel.isEmpty() && !typeOfTravel.isBlank()) {
            this.typeOfTravel = typeOfTravel;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Unflying unflying = (Unflying) o;
        return Objects.equals(typeOfTravel, unflying.typeOfTravel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfTravel);
    }

    @Override
    public String toString() {
        return "Unflying{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", livingEnv='" + getLivingEnv() + '\'' +
                ", typeOfTravel='" + typeOfTravel + '\'' +
                '}';
    }
}
