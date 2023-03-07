public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Murzik",10);
        cats[1] = new Cat("Barsik",15);
        cats[2] = new Cat("Lipec",8);
        


        Plate plate = new Plate(60, 15);
        
        while(true){

            for (int i = 0; i < cats.length; i++) {
                System.out.println(cats[i]);
                cats[i].makeHungry();
                cats[i].eat(plate);
            }
            plate.increaseFood(10);
            System.out.println("Добавили в тарелку 10 еды: ");
            System.out.println(plate);
            //Thread.sleep(5 * 1000L);
        } 
    }
    
}