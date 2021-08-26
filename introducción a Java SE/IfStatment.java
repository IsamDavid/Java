
public class IfStatment {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if(isBluetoothEnabled){
            //Es verdadero
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
        }else{
            System.out.println("Archivo NO enviado");
        }
    }
        
}