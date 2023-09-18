package la2;

public class EjemploNum {

    public enum Resultado {
    EXITO,
    FRACASO
}

    public static void main(String[] args) {
        Resultado resultado = Resultado.EXITO;

        if (resultado == Resultado.EXITO) {
            System.out.println("La operacion se realizo correctamente.");
        } else {
            System.out.println("La operacion no se pudo realizar.");
        }
    }


    
    
    
    
    /*public enum Level{
        FACIL,
        NORMAL,
        DIFICIL
    }
    
    public static void main(String[] args) {

        Level level = Level.DIFICIL;
        
        switch (level) {
            case FACIL:
                System.out.println("El nivel facil");
                break;
            
            case NORMAL:
                System.out.println("El nivel es normal");
                break;
                
            case DIFICIL:
                System.out.println("El nivel es dificil");
                break;
        }
        

    }*/
    
}
