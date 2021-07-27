public class Main {
    public static void main(String[] args){
        Tiger tiger = new Tiger(2, 20, true, true, true);
        if (tiger.isSoundCheck() == true)
            tiger.displaySound();
    }
}
