public class Circle_Slice extends Slice_Form{
  //Atributos.
  private float radius;
  static final float pi = 3;
  public Circle_Slice(String shape ,float radius){
    super(shape);
    this.radius = radius;
  }
  public float getArea(){
    return((pi)*(this.radius)*(this.radius));
  }
}
