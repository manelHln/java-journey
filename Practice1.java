public class Practice1 {
    public static void main (String[] args){

    }
}

class Animal{
    protected void move(){
        System.out.println("Animal is moving");
    }

    protected void move(int x, int y){
        System.out.printf("The animal moved %d on the x axis and %d on the y axis", x,y);
    }
}

class Rabbit extends Animal{
    @Override
    public void move(){
        System.out.println("The rabbit is moving");
    }

    @Override
    public void move(int x, int y){
        super.move(x,y);
    }
}