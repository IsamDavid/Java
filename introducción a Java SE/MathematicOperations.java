public class MathematicOperations {
    public static void main(String[] args) {
        int lado = 4;
        double x = 2.1;
        double y = 3;

        // System.out.println(Math.ceil(x));

        // System.out.println(Math.floor(x));
        
        // System.out.println(Math.pow(x,y));

        // System.out.println(Math.max(x,y));
        
        System.out.println(area(lado));
        

    }
    /**
     * 
     * @param lado El valor del lado de un cuadrado
     * @return El área de un cuadrado
     */
    public static int area(int lado){
        
        return lado*lado;
    }
}
