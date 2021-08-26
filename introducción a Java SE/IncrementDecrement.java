public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        // lives -=1;
        // System.out.println(lives);
        
        lives--;
        System.out.println(lives);
    
        lives++;
        System.out.println(lives);

        //Prefija
        //Gana un regalo por ganar una vida
        int gift = 100 + lives++;
        System.out.println(gift);  //105
        //Primero accede a la variable y le toma su valor, esto es de forma prefija


        //Posfija
        int gift$ = 100 + ++lives; //lives + 1 
        System.out.println(gift$);




    }
}
