/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras1;
import  javax.swing.*;
/**
 *
 * @author USER
 */
public class Figuras1 {

    /**
     * @param args the command line arguments
     */
    //Definion de atributos publicos area y perimetro
    public Integer area;
    public Integer perimetro;
           
    //Constructor de la clase que asigna valores a las variables
    public Figuras1(){
        this.area=5;
        this.perimetro=10;
    } 
    //Metodo para pintar el valor de la variable en la consola
    public void pintarArea(){
        System.out.println(this.area);
        
     }
    public void pintarPerimetro(){
        System.out.println(this.perimetro);
        
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Figuras1 figuras1=new Figuras1();
        
        figuras1.pintarArea();
        figuras1.pintarPerimetro();
        
        figuras1.area=15;
        
        figuras1.pintarArea();
        
        
    }   
    
}
