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
    private Stack<String[]> pila;  //uso de pila de Java, no use la clase Pila creada en clases debido a la limitacion de tama?o
    private int intentos;
    private int fallos = 0;



    
    public Ahorcado() 
    {
        palabras = new ArrayList<>();
        pila = new Stack<>();
        //this.intentos = intentos;
           
        //try y catch para leer archivo de texto que contiene 50 palabras, dichas palabras seran almacenadas en una arraylist
        try {  
            Scanner sc = new Scanner(new File("palabras.txt"));
            while (sc.hasNextLine()) {
                palabras.add(sc.nextLine());         
            }
   
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }          
    }
    
    public Ahorcado(int intentos) {
        palabras = new ArrayList<>();
        pila = new Stack<>();
        this.intentos = intentos;

        //try y catch para leer archivo de texto que contiene 50 palabras, dichas palabras seran almacenadas en una arraylist
        try {
            Scanner sc = new Scanner(new File("palabras.txt"));
            while (sc.hasNextLine()) {
                palabras.add(sc.nextLine());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String PalabraRandom() {
        
        //se obtiene una palabra aleatoria del arraylist
        return palabras.get(new Random().nextInt(palabras.size())).toUpperCase();
    }
    
    public void Inicio()  //metodo para asignar una letra aleatoria en una posicion aleatoria en el arreglo de letras, basandose en la palabra a adivinar
    {
        palabraAux = PalabraRandom().split("");  
        letras = new String[palabraAux.length];
      
        
        Random ran = new Random();
        int indiceRandom = ran.nextInt(letras.length);
        letras[indiceRandom] = palabraAux[indiceRandom];
        pila.push(letras.clone());

        
        //System.out.println(this.StringArray(letras));
     
        System.out.println("Mis cambios");
    }
  
    public boolean Completado()
    {
        for (int i = 0; i < letras.length; i++) {  //Comprobar si todas las letras de la palabra ya han sido adivinadas
            if (letras[i] == null) {
                return false;
            }
        }
        return true;
    }
    
    public void Intento(String letra)
    {         
        if (!Completado()) 
        {
            if (intentos > 0) 
            {
                boolean encontrado = false;
                for (int i = 0; i < letras.length; i++) {
                    if (palabraAux[i].equals(letra)) {
                        letras[i] = letra;
                        encontrado = true;
                    }

                }

                if (!encontrado) {
                                      
                    intentos--; 
                    fallos++;
                    System.out.println("Intentos: " + intentos);
                }
                //Comprobar si ultimo elemento de la pila no coincide con el estado actual de letras, para que asi no haya elementos repetidos en la pila
                if (!Arrays.equals(letras.clone(), pila.peek())) {
                    pila.push(letras.clone());  //se usa el metodo clone para obtener el estado actual del juego
                }
                
                System.out.println("Pila: " + PrintPila());
            }

            else if (intentos == 0) {
               JOptionPane.showMessageDialog(null, "Perdiste! La palabra era: "+StringArray(palabraAux), "Fin",JOptionPane.ERROR_MESSAGE);
            }
        
        }
    }
    
    public boolean Retroceder()
    {
        if (pila.size()>1) { 
            
            pila.pop();    //se retrocede una accion en el juego
            letras = pila.peek();    //el arreglo de letras pasa a tener el valor de la accion previa almacenada previamente en la pila
            System.out.println("Pila Retro: "+PrintPila());
      
            return true;
        }
        else
            return false;
        
       

    }     
    
    public String Palabra()
    {
        String[] operacion = pila.peek();  
        String r = "";
                 
        for (int i = 0; i < letras.length; i++) {
           
            if (operacion[i] == null) {
                r+="_"+" "; // se asigna un guion bajo si la posicion esta vacia
            }
            else r += operacion[i]+" ";
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
        for (int i = 0; i < pila.size(); i++) {
            
            if (pila.get(i) instanceof String[]) {
                
                String[] aux = (String[])pila.get(i);
                r+= this.StringArray(aux) + "\n";
            }
            else
                r+=pila.get(i)+ "\n";
        }
        return r;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getFallos() {
        return fallos;
    }
    
    
    
       
}
