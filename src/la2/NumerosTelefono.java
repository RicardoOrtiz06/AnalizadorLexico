package la2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumerosTelefono {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingresa el telefono");
        String texto = read.nextLine();
        
                  
          String regex = "(\\(\\d{2}\\)\\s*\\d{4}-\\d{4})|(\\(\\d{3}\\)\\s*\\d{3}-\\d{4})";
      
        //patron de busqueda
        Pattern pattern = Pattern.compile(regex);
        
        //texto completo donde queremos buscar el patron de busqued
        Matcher matcher = pattern.matcher(texto);
        
        if (matcher.matches()) {
                        
            String match = matcher.group();
            
            System.out.println("Telefono valido en formato de Mexico: " + match);

        } else {
            System.err.println("Telefono invalido en formato mexicano");
        }
        
    }
    
}
