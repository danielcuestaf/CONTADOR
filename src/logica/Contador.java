/*
 * clase contador.java
 *@version 0.1
 */
package logica;

/**
 *clase que permite implementar un contador
 * @author Estudiantes
 */
public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }
    /**
     * metodo que retorna el valor del cronometro
     * @return : retorna el valor de "valor"
     */
    public int getValor() {
        return valor;
    }
    /**
     * metodo que establece el valor del cronometro
     * @param valor: entero que se setea en el atributo de la clase 
     */

    public void setValor(int valor) {
        this.valor = 0;
    }
    public Contador(){
        this.valor = 0;
    }
    /**
     * metodo que avanza el valor del contador
     */
    
    public void avanzar(){
        this.valor += 1;
    }
    /**
     * metodo que retrocede el valor del contador
     */
    
    public void retroceder(){
        this.valor -= 1;
    }
    /**
     * metdo que reinicia el valor de un contador
     */
    public void borrar(){
        this.valor = 0;
    }
    
    
}
