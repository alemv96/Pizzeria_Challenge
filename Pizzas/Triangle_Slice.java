public class Triangle_Slice extends Slice_Form{
  //Atributos.
  private float base;
  private float height;
  public Triangle_Slice(String shape ,float height ,float base){
    super(shape);
    this.height = height;
    this.base = base;
  }

  public float getArea(){
    return((this.height)*(this.base)/2);
  }
}
