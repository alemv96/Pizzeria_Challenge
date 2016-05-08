/*Ejercicio practico enviado por el profesor Carlos Alonzo.
  Date: 04/05/2016*/
public class Pizza {
  //Que conoce la clase pizza?.
  public Slice_Form priceForm;
  public float priceLA;//precio por centimetros cuadrados
  public float price;
  public Slice_Form shape;

  public Pizza (float priceLA ,float price ,Slice_Form shape){
    this.priceLA = priceLA;
    this.price = price/priceLA;
    this.shape = shape;
  }

  public float getPriceForSlice(){
      return ((this.priceLA)*(this.shape.getArea()));
  }
}
