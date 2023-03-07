public class Plate {
    int food;
    public int incfood;
    public Plate(int food, int incfood){
        this.food = food;
        this.incfood = incfood;
    }

    public boolean deacreaseFood(int appetit, int satiety){
        if ((food >= appetit - satiety) ){
            food = food - satiety;
            System.out.println("Съел: ");
            System.out.println(satiety);
            satiety = satiety + appetit;
            appetit = 0;
            return true;
        }
        return false;    
    }

    public void increaseFood(int incfood){
        food = food + incfood;
    }

    @Override
    public String toString(){
        return "Plate[" + food + "]";
    }
}
