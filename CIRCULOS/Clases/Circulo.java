package Clases;

public class Circulo implements Figura {
    private String color;
    private int x;
    private int y;
    private int radio;
 
    public Circulo(String color){
       this.color = color;		
    }
 //HOLA MUY BUENAS
    public void setX(int x) {
       this.x = x;
    }
 
    public void setY(int y) {
       this.y = y;
    }
 
    public void setRadio(int radio) {
       this.radio = radio;
    }
 
    @Override
    public void graficar() {
       System.out.println("Circle: [Color : " + color + ", x : " + x + ", y :" + y + ", radio :" + radio);
    }
 }
