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
public class Persona {
    
    //Variables
    private String nombre, DNI;
    private int edad, peso;
    private float altura;
    private char sexo;
    private final char csexo = 'H';
    public final int debpi = -1;
    public final int norpi = 0;
    public final int sobpi = 1;
        
    //Constructores
    
    public Persona(){
        this.nombre="";
        this.edad=0;        
        this.sexo=csexo; 
        this.peso=0;
        this.altura=0;
        GenDNI();
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        CompSexo(sexo);
        this.peso=0;
        this.altura=0;
        GenDNI();
    }
   
    public Persona(String nombre, int edad, char sexo, int peso, float altura){
        this.nombre=nombre;
        this.edad=edad;
        CompSexo(sexo);
        this.peso=peso;
        this.altura=altura;
        GenDNI();
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //Métodos
         
    public void GenDNI(){
        int divisor=23;
        int numDNI=((int)Math.floor(Math.random()*(100000000-10000000)+10000000));
        int res=numDNI-(numDNI/divisor*divisor);
        char letraDNI=generarLetraDNI(res);
        DNI=Integer.toString(numDNI)+letraDNI;
    }    
    private char generarLetraDNI(int res){
        char letras[]={'T','R','W','A','G','M','Y','F','P','D','X'
                ,'B','N','J','Z','S','Q','V','H','L','K','E'};        
        return letras[res];
    }
    
    public void CompSexo(char sexo){
        if(sexo!='H' && sexo!='M'){
            this.sexo='H';
        }
        else{
            this.sexo=sexo;
        }
    }
    
    public int CalcularPeso(){
        double pesoActual=peso/(Math.pow(altura, 2));
        if(pesoActual>=20 && pesoActual<=25){
            return norpi;
        }
        else if(pesoActual<20){
            return debpi;
        }
        else{
            return sobpi;
        }
    }
    
    public boolean MayorEdad(){
        boolean mayore=false;
        if(edad>=18){
            mayore=true;
        }
        return mayore;
    }
    
    @Override
    public String toString(){
        return "Datos de la persona: "
                +"Nombre: "+nombre+" Sexo: "+sexo+" Edad: "+edad+
                " DNI: "+DNI+" Peso: "+peso+" Altura: "+altura;
    }
}
