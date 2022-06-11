package com.mycompany.proxectocalculadora;

// asd
        
/**
 *
 * @author Alex García Losas
 */
public class Calculadora {
    
    private int num1;
    public int suma;
    public int resta;
    public int multiplicacion;
    public int division;
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    private int num2;
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public Calculadora() {
    }
    
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void suma() {
        int suma = num1 + num2;
    }
    public void resta() {
        int resta = num1 - num2;
    }    
    public void multiplicacion() {
        int multiplicacion = num1 * num2;
    }
    public void division() {
        int division = num1 / num2;
    }    
}
