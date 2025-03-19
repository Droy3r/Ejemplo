/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package er_estudiante;

/**
 *
 * @author Clase
 */
public class Estudiante {
    private int cuenta;
    private String nombre;
    private int sem;
    private int grupo;
    private String lic;
    private float prom;
    
    public void setCuenta(int cuenta){
        this.cuenta=cuenta;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setSem(int sem){
        this.sem=sem;
    }
    public void setGrupo(int grupo){
        this.grupo=grupo;
    }
    public void setLic(String lic){
        this.lic=lic;
    }
    public void setProm(float prom){
        this.prom=prom;
    }
    
    
    public int getCuenta(){
        return cuenta;
    }
    public String getNombre(){
        return nombre;
    }
    public int getSem(){
        return sem;
    }
    public int getGrupo(){
        return grupo;
    }
    public String getLic(){
        return lic;
    }
    public float getProm(){
        return prom;
    }
    
    public String getDatos(){
    return  "----Datos----\n"+
            "\n----NO.Cuenta:   "+ cuenta +
            "\n----Nombre: "+ nombre +
            "\n----Semestre:   "+ sem  +
            "\n----Grupo:   "+ grupo+
            "\n----Licenciatura:"+ lic+
            "\n----Prom.General:"+ prom ;
}
    
}
