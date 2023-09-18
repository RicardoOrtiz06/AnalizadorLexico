package la2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionCorreo {

    public static void main(String[] args) {
        
        System.out.println("hola");
        
        String texto = "Ricardoortizarias@hotmail.com";
        
        String regex = "(?!\\\\.)[A-Za-z0-9_]+(\\\\.[A-Za-z0-9_]+)*@([A-Za-z0-9]+\\\\.)+[A-Za-z]{2,}$";
        
        //patron de busqueda
        Pattern pattern = Pattern.compile(regex);
        
        //texto completo donde queremos buscar el patron de busqued
        Matcher matcher = pattern.matcher(texto);
        
        if (matcher.find()) {
                        
            System.out.println("Correo electronico correcto: " + texto);

        }
        
    }
    
}
