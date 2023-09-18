package la2;

public class Pruebas {

    public enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }//Cierra enum
    
    
    public static void main(String[] args) {

        DiaSemana diaActual = DiaSemana.LUNES;
        
        if (diaActual == DiaSemana.SABADO || diaActual == DiaSemana.DOMINGO) {
            System.out.println("Fin de semana");
        }else{
            System.out.println("Dia Laboral");
        }//Cierra else
        
        System.out.println("---------------------");
 
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
        
    }
    
}
