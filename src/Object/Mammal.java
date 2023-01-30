package Object;

import java.util.Objects;

// 2 level
public class Mammal extends Animal{

    private String livingEnv;

    private String travelSpeed;

    public Mammal(String name, String year, String livingEnv, String travelSpeed) {
        super(name, year);

        setLivingEnv(livingEnv);
        setTravelSpeed(travelSpeed);
    }

    public void sleep(){
        System.out.println("Сон происходит в среде проживания - " + getLivingEnv());
    }

    public void move(){
        System.out.println("Скорость перемещения - " + getTravelSpeed());
    }

    public void walk(){
        System.out.println("Могут позволить себе прогулки");
    }

    public final String getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(String livingEnv) {
        if (livingEnv != null && !livingEnv.isEmpty() && !livingEnv.isBlank()){
            this.livingEnv = livingEnv;
        }
    }

    public final String getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(String travelSpeed) {
        if (travelSpeed != null && !travelSpeed.isEmpty() && !travelSpeed.isBlank()) {
            this.travelSpeed = travelSpeed;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(livingEnv, mammal.livingEnv) && Objects.equals(travelSpeed, mammal.travelSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnv, travelSpeed);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", livingEnv='" + livingEnv + '\'' +
                ", travelSpeed='" + travelSpeed + '\'' +
                '}';
    }
}
