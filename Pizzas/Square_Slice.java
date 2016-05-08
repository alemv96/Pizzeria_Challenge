public class Square_Slice extends Slice_Form{
//Atributos.
  private float side ;
  public Square_Slice(String shape ,float side){
    super(shape);
    this.side = side;
  }
  public float getArea(){
      return((this.side)*(this.side));
  }
}
