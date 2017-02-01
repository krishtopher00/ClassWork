import java.util.ArrayList;

public class Sandwich{
  private String meat;
  private String cheese;
  private String bread;
  private String condiment;
  private ArrayList<String> toppings;
  private String name;

  //constructors
  public Sandwich(){
    /*
    This constructor creates a default turkey and cheese Sandwich
    */
    ArrayList<String> t = new ArrayList<String>();
    t.add("lettuce");
    t.add("tomato");
    meat = "turkey";
    cheese = "american cheese";
    bread = "white bread";
    condiment = "mayo";
    toppings = t;
    name = "turkey and cheese";
  }

  //overloaded constructor
  public Sandwich(String m, String ch, String b, String c, ArrayList<String> t, String n){
    /*
    This constructor is an overloaded default constructor to customize the global variables of the Sandwich
    */
    meat = m;
    cheese = ch;
    bread = b;
    condiment = c;
    toppings = t;
    name = n;
  }


  //accessors
  public String getMeat(){
  /*
  Returns the global variable meat
  @return the global variable meat
  */
    return meat;
  }

  public String getCheese(){
    /*
    Returns the global variable cheese
    @return the global variable cheese
    */
    return cheese;
  }

  public String getBread(){
    /*
    Returns the global variable bread
    @return the global variable bread
    */
    return bread;
  }

  public String getCondiment(){
    /*
    Returns the global variable condiment
    @return the global variable condiment
    */
    return condiment;
  }

  public ArrayList<String> getToppings(){
    /*
    Returns the global variable toppings
    @return the global variable toppings
    */
    return toppings;
  }

  public String getName(){
    /*
    Returns the global variable name
    @return the global variable name
    */
    return name;
  }

  //modifiers
  public void setMeat(String m){
    /*
    Sets the global variable meat
    @param the type of meat for the sandwich
    */
    meat = m;
  }

  public void setCheese(String ch){
    /*
    Sets the global variable cheese
    @param the type of cheese for the sandwich
    */
    cheese = ch;
  }

  public void setBread(String b){
    /*
    Sets the global variable bread
    @param the type of bread for the sandwich
    */
    bread = b;
  }

  public void setCondiment(String c){
    /*
    Sets the global variable condiment
    @param the condiment for the sandwich
    */
    condiment = c;
  }

  public void setToppings(ArrayList<String> t){
    /*
    Sets the global variable toppings
    @param the toppings for the sandwich
    */
    toppings = t;
  }

  public void setName(String s){
    /*
    Sets the global variable name
    */
    name = s;
  }

  public String toString(){
    /*
    Prints the name of the sandwich and its contents
    */
    return name + ": " + meat + ", " + cheese + ", " + bread + ", " + condiment +  ", and " + toppings;
  }

  public double getPrice(){
    /*
    Calculates the price of the sandwich based on the type of meat inside
    @return price of the sandwich
    */
    double price = 1.99;
    if(meat.equalsIgnoreCase("turkey")){
      price += 2;
    } else if(meat.equalsIgnoreCase("ham")){
      price += 1.5;
    } else if(meat.equalsIgnoreCase("roast beef")){
      price += 3;
    } else if(meat.equalsIgnoreCase("pastrami")){
      price += 3.5;
    } else{
      price += 2.5;
    }
    return price;
  }
}
