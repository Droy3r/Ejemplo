/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package er_estudiante;

import java.util.Scanner;

/**
 *
 * @author Clase
 */
public class Er_Estudiante {

 
    public static void main(String[] args) {
     Estudiante est1= new Estudiante();
        Scanner entrada= new Scanner(System.in);
       //variables
        String nombre,lic;
        int sem,grupo,cuenta;
        float prom;
        //pide los datos de la clase
        System.out.println("Ingrese el No.Cuenta: ");
        cuenta = entrada.nextInt();
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese el semestre: ");
        sem = entrada.nextInt();
        System.out.println("Ingrese el grupo: ");
        grupo = entrada.nextInt();
        System.out.println("Ingrese la licenciatura: ");
        lic = entrada.next();
        System.out.println("Ingrese el promedio: ");
        prom = entrada.nextFloat();
        // 
        est1.setCuenta(cuenta);
        est1.setNombre(nombre);
        est1.setSem(sem);
        est1.setGrupo(grupo);
        est1.setLic(lic);
        est1.setProm(prom);
        
        //salidas de datos
        System.out.println("Los datos del estudiante son:  ");
        System.out.println("No.Cuenta: "+est1.getCuenta());
        System.out.println("Nombre: "+est1.getNombre());
        System.out.println("Semestre: "+est1.getSem());
        System.out.println("Grupo: "+est1.getGrupo());
        System.out.println("Licenciatura: "+est1.getLic());
        System.out.println("Promedio General: "+est1.getProm());
        
        System.out.println("----salida de datos----");
        System.out.println(est1.getDatos());
    }
    }
    

