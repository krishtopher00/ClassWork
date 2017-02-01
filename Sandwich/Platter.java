public class Platter{
  private Sandwich s1;
  private Sandwich s2;
  private Sandwich s3;

  //constructor
  public Platter(){
    /* Default constructor method that creates 3 standard sandwiches
    */
    s1 = new Sandwich();
    s2 = new Sandwich();
    s3 = new Sandwich();
  }

  //overloaded constructor
  public Platter(Sandwich a, Sandwich b, Sandwich c){
    /* Overloaded constructor method that creates 3 customizable sandwiches
    */
    s1 = a;
    s2 = b;
    s3 = c;
  }

  //accessors
  public Sandwich getSandwich1(){
    /* Return the first sandwich on the Platter
    @return the global varaible s1
    */
    return s1;
  }

  public Sandwich getSandwich2(){
    /* Return the second sandwich on the Platter
    @return the global varaible s2
    */
    return s2;
  }

  public Sandwich getSandwich(){
    /* Return the third sandwich on the Platter
    @return the global varaible s3
    */
    return s3;
  }

  //modifiers
  public void setS1(Sandwich x){
    /* Sets the first sandwich of the Platter
    @param The sandwich to be set to the first sandwich on the platter
    */
    s1 = x;
  }

  public void setS2(Sandwich y){
    /* Sets the second sandwich of the Platter
    @param The sandwich to be set to the second sandwich on the platter
    */
    s2 = y;
  }

  public void setS3(Sandwich z){
    /* Sets the third sandwich of the Platter
    @param The sandwich to be set to the third sandwich on the platter
    */
    s3 = z;
  }

  public String toString(){
    /* Returns the 3 types of sandwiches on the platter and uses the getname method for the sandwiches
    from the sandwiches class
    @return The name of the sandwiches on the platter
    */
    return "Platter of sandwiches: " + s1.getName() + ", " + s2.getName() + ", and " + s3.getName();
  }

  public String getPrice(){
    /* Method gets the price of the platter by adding all of the prices of each of the sandwiches
    using the getprice method from the sandwich glass
    @return Price of the whole platter
    */
    double price = s1.getPrice() + s2.getPrice() + s3.getPrice();
    return "$" + price;
  }

}
