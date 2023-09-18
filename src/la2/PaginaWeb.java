package la2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaginaWeb {

    public static void main(String[] args) {
        
        String texto = """
                       Este es un texto de ejemplo que contiene algunas direcciones de p´aginas web.
                       Puedes encontrar URLs como https://www.ejemplo.com, http://www.otra-url.com,
                       o incluso www.sitio-web.org Aseg´urate de buscar todas las URLs, independientemente de si comienzan con ”https://”, ”http://”, o simplemente ”www.”.
                       Recuerda que las URLs pueden www.contener.com letras n´umeros y caracteres especiales como guiones y puntos. Tambi´en pueden tener extensiones como ”.html”
                       o ”.php”. ¡Buena suerte en tu b´usqueda!
                       """;
        
        String regex = "\\b(https?://)?www.([A-Za-z0-9]+[-_.]*)+.[A-Za-z]{2,3}\\b";
      
        //patron de busqueda
        Pattern pattern = Pattern.compile(regex);
        
        //texto completo donde queremos buscar el patron de busqued
        Matcher matcher = pattern.matcher(texto);

        
        while (matcher.find()) {    
                        
            String match = matcher.group();
            System.out.println("La URL es: " + match);
        }
        
    }
    
}
