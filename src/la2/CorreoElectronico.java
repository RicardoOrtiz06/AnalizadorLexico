package la2;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorreoElectronico {

    public static void main(String[] args) {
        
        String texto = "ricardo.ortiz.arias_06@hotmail.com";
        
        String regex = "[A-Za-z0-9][A-Za-z0-9_.]+[A-Za-z0-9]@[A-Za-z0-9_.]+.[a-z]+";
      
        //patron de busqueda
        Pattern pattern = Pattern.compile(regex);
        
        //texto completo donde queremos buscar el patron de busqued
        Matcher matcher = pattern.matcher(texto);
        
        if (matcher.matches()) {
                        
            String match = matcher.group();
            
            System.out.println("Correo electronico valido: " + match);

        } else {
            System.out.println("Correo invalido");
        }
        
    }
    
}
