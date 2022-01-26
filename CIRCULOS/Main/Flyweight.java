package Main;

import Clases.Circulo;
import Clases.FabricaFiguras;

public class Flyweight {
    
    private static final String colores[] = { "ROJO", "VERDE", "AZUL", "BLANCO", "NEGRO" };
    public static void main(String[] args) {
 
       for(int i=0; i < 20; ++i) {
          Circulo circulo = (Circulo)FabricaFiguras.getCircle(getRandomColor());
          circulo.setX(getRandomX());
          circulo.setY(getRandomY());
          circulo.setRadio(100);
          circulo.graficar();
       }
    }
    private static String getRandomColor() {
       return colores[(int)(Math.random()*colores.length)];
    }
    private static int getRandomX() {
       return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
       return (int)(Math.random()*100);
    }
 }
