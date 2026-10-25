package modelo;

import java.util.Objects;

public class Contacto implements Comparable<Contacto> {
    private String nombreCompleto;
    private String apodo;
    private String telefono;
    private int añoNacimiento;
    private int mesNacimiento;
    private int diaNacimiento;

    public Contacto(String nombreCompleto, String apodo, String telefono, int añoNacimiento, int mesNacimiento, int diaNacimiento){
        this.nombreCompleto=nombreCompleto;
        this.apodo=apodo;
        this.telefono=telefono;
        this.añoNacimiento=añoNacimiento;
        this.mesNacimiento=mesNacimiento;
        this.diaNacimiento=diaNacimiento;
    }

    
    public String getNombreCompleto() {
        return nombreCompleto;
    }


    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    public String getApodo() {
        return apodo;
    }


    public void setApodo(String apodo) {
        this.apodo = apodo;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public int getAñoNacimiento() {
        return añoNacimiento;
    }


    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }


    public int getMesNacimiento() {
        return mesNacimiento;
    }


    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }


    public int getDiaNacimiento() {
        return diaNacimiento;
    }


    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }


    @Override
    public int compareTo(Contacto o) {
        return this.nombreCompleto.compareTo(o.nombreCompleto);
    }

    @Override 
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o instanceof Contacto && (o!=null)){
            Contacto objeto = (Contacto) o;
            if(this.nombreCompleto.equals(objeto.getNombreCompleto())){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    @Override 
    public int hashCode(){
        return Objects.hash(this.nombreCompleto);
    }

    
}
