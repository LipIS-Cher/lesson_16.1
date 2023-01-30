package Object;

import java.util.Objects;

// 2 level
public class Bird extends Animal{

    private String livingEnv;

    public Bird(String name, String year, String livingEnv) {
        super(name, year);

        setLivingEnv(livingEnv);
    }

    public void sleep(){
        System.out.println("Сон происходит в среде проживания - " + getLivingEnv());
    }

    public void hunt(){
        System.out.println("Убивает животных ниже него в пищевой цепи");
    }

    public final String getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(String livingEnv) {
        if (livingEnv != null && !livingEnv.isEmpty() && !livingEnv.isBlank()){
            this.livingEnv = livingEnv;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(livingEnv, bird.livingEnv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnv);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", livingEnv='" + livingEnv + '\'' +
                '}';
    }
}
