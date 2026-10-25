package modelo;

import java.util.Comparator;

public class ComparadorPorFechaDeNacimiento implements Comparator <Contacto> {

    @Override
    public int compare(Contacto arg0, Contacto arg1) {
        
        if(arg0.getAñoNacimiento()!=arg1.getAñoNacimiento()){
            if(arg0.getAñoNacimiento()<arg1.getAñoNacimiento()){
                return -1;
            }
            else{
                return 1;
            }
        }
        else if(arg0.getMesNacimiento()!=arg1.getMesNacimiento()){
            if(arg0.getMesNacimiento()<arg1.getMesNacimiento()){
                return -1;
            }
            else{
                return 1;
            }
        }
        else if(arg0.getDiaNacimiento()!=arg1.getDiaNacimiento()){
            if(arg0.getDiaNacimiento()<arg1.getDiaNacimiento()){
                return -1;
            }
            else{
                return 1;
            }
        }
        else{
            return 0;
        }
        //return -1; Si arg0<arg1
        //return 1; Si arg0>arg1
        //return 0; Si arg0=arg1
    }

}
