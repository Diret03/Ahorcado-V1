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
    
    private ArrayList<String> palabras; //arraylist para almacenar las palabras del archivo de texto palabras.txt
    public String[] letras;  //arreglo de String que almacena el estado del juego, dicho arreglo se llenara de letra en letra hasta adivinar toda la palabra
    String[] palabraAux;  //arreglo de String para almacenar la palabra a adivinar
    public Pila pila;  //uso de la clase Pila creada en clase
    public int intentoActual = 0;

    



    
    public Ahorcado() 
    {
        palabras = new ArrayList<>();   //se inicializa el arraylist
              
        //try y catch para leer archivo de texto que contiene palabras, dichas palabras seran almacenadas en una arraylist
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
    

     /**
     * <h2>Método para obtener una palabra aleatorio</h2>
     * Se obtiene palabra aleatoria de una posición aleatoria del ArrayList de palabras.
     *
     * @return Palabra aleatoria
     */ 
    public String PalabraRandom() {

        return palabras.get(new Random().nextInt(palabras.size())).toUpperCase(); //se pone en mayusculas la palabra obtenida
        
    }
    
     /**
     * <h2>Método para iniciar el juego</h2>
     * Se obtiene una letra aleatoria de la palabra a adivinar y se la asigna en en la primera jugada del juego.
     *
     * No retorna nada.
     *
     */ 
    public void Inicio()  
    {
        palabraAux = PalabraRandom().split("");    //se obtiene una palabra 
        pila = new Pila(palabraAux.length);         //se crea una pila del tamaño de la longitud de la palabra a adivinar
        letras = new String[palabraAux.length];         //se crea el arreglo de letras el cual contiene las jugadas
      
        
        Random ran = new Random();                             
        int indiceRandom = ran.nextInt(letras.length);   //se obtiene un numero aleatorio en el rango de longitud del arreglo de letras
        letras[indiceRandom] = palabraAux[indiceRandom];      //se asigna una letra aleatoria en su respectiva posición en el arreglo de letras
        pila.Apilar(letras.clone());                   //se apila la primera jugada del juego
         System.out.println("Pila inicial:\n"+PrintPila());

    }

     /**
     * <h2>Método para retornar cadena de la jugada actual</h2>
     * Se genera una cadena que representa de forma visual la jugada. Se Asigna las letras en su respectiva posición
     * y si la posición es null se asigna un guión bajo.
     * @return Cadena que contiene la jugada actual
     */      
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
    
    /**
     * <h4>Método que recibe un arreglo de String que retorna una cadena en forma de palabra</h4>
     * Se genera una cadena que representa de forma visual la jugada. Se Asigna las letras en su respectiva posición
     * y si la posición es null se asigna un guión bajo.
     * Método utilizado para imprimir las ayudas del juego.
     *
     * @param palabra Arreglo de String
     * @return Cadena que contiene la jugada actual
     */
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
    
    public String StringArray(String[] arreglo) //metodo de ayuda para imprimir un arreglo de String
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
