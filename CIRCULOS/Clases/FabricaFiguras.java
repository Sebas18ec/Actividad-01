package Clases;

import java.util.HashMap;

import javax.annotation.processing.SupportedOptions;


public class FabricaFiguras {

   private static final HashMap circleMap = new HashMap();

   public static Figura getCircle(String color) {
      Circulo circulo = (Circulo)circleMap.get(color);

      if(circulo == null) {
         circulo = new Circulo(color);
         circleMap.put(color, circulo);
         System.out.println("AQUI SE CREA UN NUEVO OBJETO Circulo color : " + color);
      }
      
      return circulo;
   }
}