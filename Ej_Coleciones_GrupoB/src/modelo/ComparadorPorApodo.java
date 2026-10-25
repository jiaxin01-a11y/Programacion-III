package modelo;

import java.util.Comparator;

public class ComparadorPorApodo implements Comparator <Contacto>{

    @Override
    public int compare(Contacto arg0, Contacto arg1) {
        return arg0.getApodo().compareTo(arg1.getApodo());
        
    }

}
