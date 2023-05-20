
package paquete;

/**
 * @author diego
 */
public class Pila {
    
    private int numElementos;
    private int tam;
    public Object[] A;


    public Pila(int tam)
    {
      this.tam = tam;
      numElementos = 0;
      A = new Object[tam];
  
    }

    public int Size()
    {
        return this.numElementos;
    }
    
    public boolean Llena()
    {
        if (numElementos == tam) {
            return true;
        }
        else
        return false;
    }

    public boolean Vacia()
    {
      if (numElementos == 0) {
        return true;
      } else {
        return false;
      }  
    }

    public void Apilar(Object elemento)
    {
        if (!Llena()) {
            A[numElementos] = elemento;
            numElementos++;
        
        } 

    }

    public Object Desapilar()
    {
        if (!Vacia()) {
            Object aux = A[numElementos-1];
            A[numElementos-1] = null;
            numElementos--;
            return aux;
        }

        return false;
    }
    
    public Object Peek()
    {
        if (!Vacia()) {
            Object aux = A[numElementos - 1];
            return aux;
        }

        return false;
    }

//    public String Reporte()
//    {
//        String salida = "";
//        Notas nota;
//        
//        for (int i = 0; i < numElementos; i++) {
//            
//            nota = (Notas)A[i];
//            salida = "CI: "+nota.getCedula()+"| CodM: "+nota.getCodMateria()+"| N1: "+nota.getNota1()+"| N2: "+nota.getNota2()+"\n"+ salida;
//        }
//        return salida;
//    }
//    
    @Override
    public String toString()
    {
        String salida = "";
        for (int i = A.length-1; i >= 0; i--) 
        {
            if (A[i] != null) {
                salida += A[i]+"\n"; 
            }
           
        }

        return salida;
    }
    public String Imprimir(){
        return "Cambios";
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Object[] getA() {
        return A;
    }

    public void setA(Object[] A) {
        this.A = A;
    }
    
    
}
