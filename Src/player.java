
class player{
    


    

    String name;
    int health;
    public player( String name){
        this.name = name;
    
        this.health  = 100;

    }


public static void main(String[] args){
    player p1 = new  player("chetan");
    player p2 =  new player("alice");
    System.out.println(p1.toString());
    System.out.println(p2);

}

}
