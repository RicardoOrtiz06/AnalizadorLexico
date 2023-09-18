package la2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGEX {

    public static void main(String[] args) {
        
        String texto = "El dia de hoy es sabado del 2023-09-09";
        
        String regex = "[a-z0-9A-Z]+";
        
        //patron de busqueda
        Pattern pattern = Pattern.compile(regex);
        
        //texto completo donde queremos buscar el patron de busqued
        Matcher matcher = pattern.matcher(texto);
        
        while (matcher.find()) {            
            String match = matcher.group();
            System.out.println("La coincidencia es: " + match);
        }
        
                
        

    }
    
}
