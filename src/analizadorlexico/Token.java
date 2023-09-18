package analizadorlexico;

public class Token {
    
    public String valorString;
    public Tipos tipo;

    public String getValorString() {
        return valorString;
    }

    public void setValorString(String valorString) {
        this.valorString = valorString;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    enum Tipos{
        NUMERO ("[0-9]+"),
        OPERADOR ("[*|/|+|-]"),
        VARIABLE("[w,x,y,z]"),
        CONSTANTE("[\bpi\b\be\b]"),
        DESCONOCIDO ("[^([w,x,y,z]|[\bpi\b\be\b]|0-9|[*|/|+|-])]+");//expresion regular para cualquier otro digito/palabra que no sean las anterioers
        
        public final String patron;
        
        Tipos(String s){
            this.patron = s;
        
        }//Cierra constructor Tipos
    }//Cierra enum Tipos
    
}
