public class Felidae extends Animal{
    public String sound = "meowing meowing";
    boolean soundCheck;
    public Felidae (int age, double weight, boolean running, boolean eating, boolean soundCheck){
        super(age,weight,running,eating);
        this.sound = sound;
        this.soundCheck = soundCheck;
    }

    public boolean isSoundCheck() {
        return soundCheck;
    }

    public void setSoundCheck(boolean soundCheck) {
        this.soundCheck = soundCheck;
    }

    public void displaySound() {
        System.out.println(this.sound);
    }
}
