import java.util.Scanner;
public class Pizzeria {

  public static void main (String[] args){
      /*Scanner input = new Scanner(System.in);
      System.out.println("introduzca el ancho de la bandeja");
      float height = input.nextFloat();
      System.out.println("introduzca el largo de la bandeja");
      float large = input.nextFloat();
      System.out.println("introduzca el precio de la pizza");
      float price = input.nextInt();*/
      Square_Slice cuadrado = new Square_Slice("Cuadrado" ,3);
      Triangle_Slice triangulo = new Triangle_Slice("Triangulo" ,4 ,5);
      Circle_Slice circulo = new Circle_Slice ("Circulo" ,9);
      Pizza pizza1 = new Pizza(126 ,35,cuadrado);
      System.out.println("precio de la pizza 1: " + pizza1.getPriceForSlice());
      Pizza pizza2 = new Pizza(127 ,9 ,triangulo);
      System.out.println("precio de la pizza 2: " + pizza2.getPriceForSlice());
      Pizza pizza3 = new Pizza(150 ,3 ,circulo);
      System.out.println("precio de la pizza 3: " + pizza3.getPriceForSlice());
  }
}
