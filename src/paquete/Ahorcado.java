/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete;

import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author AORUS
 */
public class Ahorcado {
    
    private ArrayList<String> palabras;
    public String[] letras;  //arreglo de String que almacena el juego como tal, dicho arreglo se llenara de letra en letra hasta adivinar toda la palabra
    String[] palabraAux;  //arreglo de String para almacenar palabra a adivinar
    public Pila pila;  //uso de pila de Java, no use la clase Pila creada en clases debido a la limitacion de tama?o
    public int intentoActual = 0;

    



    
    public Ahorcado() 
    {
        palabras = new ArrayList<>();
       
        //this.intentoActual = intentoActual;
           
        //try y catch para leer archivo de texto que contiene 50 palabras, dichas palabras seran almacenadas en una arraylist
        try {  
            Scanner sc = new Scanner(new File("palabras.txt"));
            while (sc.hasNextLine()) {
                palabras.add(sc.nextLine());         
            }
   
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
            System.out.println("Palabras...2");
            
        }          
    }
    

    public String PalabraRandom() {
        //Palabras del juego
        //se obtiene una palabra aleatoria del arraylist
        return palabras.get(new Random().nextInt(palabras.size())).toUpperCase();
        
    }
    
    public void Inicio()  //metodo para asignar una letra aleatoria en una posicion aleatoria en el arreglo de letras, basandose en la palabra a adivinar
    {
        palabraAux = PalabraRandom().split("");  
        pila = new Pila(palabraAux.length);
        letras = new String[palabraAux.length];
      
        
        Random ran = new Random();
        int indiceRandom = ran.nextInt(letras.length);
        letras[indiceRandom] = palabraAux[indiceRandom];
        pila.Apilar(letras.clone());
         System.out.println("Pila inicial:\n"+PrintPila());
        
        //System.out.println(this.StringArray(letras));
    }

            
    public String Palabra()
    {
        
        String[] operacion = (String[]) pila.Peek();  
        String r = "";
                 
        for (int i = 0; i < letras.length; i++) {
           
            if (operacion[i] == null) {
                r+="_"+" "; // se asigna un guion bajo si la posicion esta vacia
            }
            else r += operacion[i]+" ";
        }
        return r;
    }
    
    public String Palabra(String[] palabra)
    {
         
        String r = "";
                 
        for (int i = 0; i < palabra.length; i++) {
           
            if (palabra[i] == null) {
                r+="_"+" "; // se asigna un guion bajo si la posicion esta vacia
            }
            else r += palabra[i]+" ";
        }
        return r;
    }
    
    public String StringArray(String[] arreglo) //metodo de ayuda para imprimir el arreglo de letras 
    {
        String resultado = "";
        for (String r : arreglo) {
            resultado += r+" ";
        }
        return resultado;
    }
    
    public String PrintPila() //metodo de ayuda para ver el estado de la pila
    {
        String r = "";
        for (int i = 0; i < pila.Size(); i++) {
            
            if (pila.A[i] instanceof String[]) {
                
                String[] aux = (String[])pila.A[i];
                r+= this.StringArray(aux) + "\n";
            }
            else
                r+=pila.A[i]+ "\n";
        }
        return r;
    }

    public int getIntentoActual() {
        return intentoActual;
    }
    
 


    
    
    
       
}
