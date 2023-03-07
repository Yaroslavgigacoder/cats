import java.util.Random;

public class Cat {
    private String name;
    private int appetit;
    private int satiety;
    public Cat(String name, int appetit){
        this.name = name;
        this.appetit = appetit;
    }

    public void eat(Plate plate) throws InterruptedException {
        plate.deacreaseFood(appetit, satiety);
        System.out.println(plate);
        Thread.sleep(5 * 1000L);


    }

    public void makeHungry(){
        Random rnd = new Random();
        satiety = rnd.nextInt(appetit);
        System.out.println("Проголодался на: ");
        System.out.println(satiety);
        
    }

    @Override
    public String toString() {
        return name + "{appetite=" + appetit + "}";
    }
}
