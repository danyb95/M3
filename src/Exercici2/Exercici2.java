/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercici2;

/**
 *
 * @author Alex
 */
import java.util.Scanner;
import java.util.Vector;
public class Exercici2 {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        
        //Alta vector
        Vector persona = new Vector();
        int largo;
        
        //Introducir usuarios
        System.out.println("-------------- Alta Persona -------------");
        System.out.print("Introduce nombre: ");
        String nombre=teclado.next();
        System.out.print("Introduce edad: ");
        int edad=teclado.nextInt();
        System.out.print("Introduce sexo: ");
        String s=teclado.next();
        char sexo=s.charAt(0);
        System.out.print("Introduce peso: ");
        int peso=teclado.nextInt();
        System.out.print("Introduce altura: ");
        float altura=teclado.nextFloat();
        System.out.println("------------------------------------------");
        
        //Alta objeto
        Persona p1 = new Persona();
        persona.addElement(p1);
        
        Persona p2 = new Persona(nombre, edad, sexo);
        persona.addElement(p2);
        
        Persona p3 = new Persona(nombre, edad, sexo, peso, altura);
        persona.addElement(p3);
        
        largo=persona.size()-1;
        
            //Setters
        ((Persona)persona.elementAt(0)).setNombre("Persona1");
        ((Persona)persona.elementAt(0)).setEdad(23);
        ((Persona)persona.elementAt(0)).setSexo('M');
        ((Persona)persona.elementAt(0)).setPeso(60);
        ((Persona)persona.elementAt(0)).setAltura(1.70F);
        
        ((Persona)persona.elementAt(1)).setPeso(75);
        ((Persona)persona.elementAt(1)).setAltura(1.72F);
        
            //Métodos
        for(int x=0; x<=largo; x++){
            System.out.println("Datos de la persona "+(x+1));            
            ((Persona)persona.elementAt(x)).CompSexo(sexo);   
            System.out.println(((Persona)persona.elementAt(x)).toString()); 
            ImprimirPeso(((Persona)persona.elementAt(x)));
            ImprimirMayorEdad(((Persona)persona.elementAt(x)));         
            System.out.println("");
        }     
        
    }
    //Métodos internos
    
    public static void ImprimirPeso(Persona pers){
        int imprpeso = pers.CalcularPeso();
        if(imprpeso==pers.norpi){
            System.out.println("Estás en tu peso ideal.");
        }
        else if(imprpeso==pers.debpi){
            System.out.println("Estás por debajo de tu peso ideal.");
        }
        else{
            System.out.println("Tienes sobrepeso.");
        }
    }
    
    public static void ImprimirMayorEdad(Persona pers){
        boolean imprmayoredad = pers.MayorEdad();
        if(imprmayoredad==true){
            System.out.println("Eres mayor de edad.");
        }
        else{
            System.out.println("No eres mayor de edad.");
        }
    }
}
