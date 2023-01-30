package Object;

import java.util.Objects;

//3 level
public class Flying extends Bird{

    private String typeOfTravel;

    public Flying(String name, String year, String livingEnv, String typeOfTravel) {
        super(name, year, livingEnv);

        setTypeOfTravel(typeOfTravel);
    }

    public void fly(){
        System.out.println("Способны летать");
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
        Flying flying = (Flying) o;
        return Objects.equals(typeOfTravel, flying.typeOfTravel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfTravel);
    }

    @Override
    public String toString() {
        return "Flying{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", livingEnv='" + getLivingEnv() + '\'' +
                ", typeOfTravel='" + typeOfTravel + '\'' +
                '}';
    }
}
