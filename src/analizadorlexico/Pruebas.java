package analizadorlexico;

import analizadorlexico.Token.Tipos; //impotacion del enum Tipo
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.UIManager;

public class Pruebas {
  
    public static void main(String[] args) {
        try {
            //set your theme
            //AeroLookAndFeel.setTheme("HiFiLookAndFeel");
            
            // select the Look and Feel
            UIManager.setLookAndFeel(new MintLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        
        InterfazLexico interfazLexico = new InterfazLexico();
        
        interfazLexico.setExtendedState(interfazLexico.MAXIMIZED_BOTH);//Pantalla completa

        interfazLexico.setResizable(false);// no se puede minimizar
        
        interfazLexico.setVisible(true);        //mostramos el frame

/*
        String entrada = "11 + 22 - w - 33 * x - pi * e % A";
        
        ArrayList<Token> tokens = lex(entrada);

        for (Token token : tokens) {
            System.out.println(token.getTipo()+ " : " + token.getValorString());
           
        }
*/
    }
    
    public static ArrayList<Token> lex(String entrada){
    
        final ArrayList<Token> tokens = new ArrayList<>();
        final StringTokenizer st = new StringTokenizer(entrada );
        
        while (st.hasMoreTokens()) {  
            String palabra = st.nextToken();
            boolean bandera = false;
            
            for (Tipos tokenTipo : Tipos.values()) {// llamamos a la clase enum para compara los token
                Pattern patron = Pattern.compile(tokenTipo.patron);//asignamos el patron a buscar 
                Matcher busqueda = patron.matcher(palabra);//buscamos el patron (de la clase enum) en la palabra
                
                if (busqueda.find()) {
                    Token token = new Token();
                    
                    token.setTipo(tokenTipo);
                    token.setValorString(palabra);
                    tokens.add(token);
                    bandera = true;
                    
                }//Cierra if
                
            }// Cierra for
            if (!bandera) {
                throw new RuntimeException("Token Invalido");
            }
        }// Cierra while
        
        return tokens;
    }//cierra ArrayList
            
    
}
