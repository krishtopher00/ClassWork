public class SandwichRunner{
  public static void main(String[] args){
    Sandwich s = new Sandwich();
    System.out.println(s);
    System.out.println(s.getPrice());

    System.out.println();

    s.setMeat("pastrami");
    s.setName("pastrami and cheese");
    System.out.println(s.toString());
    System.out.println(s.getPrice());

    Platter p = new Platter();
    System.out.println(p);
    p.setS1(s);
    System.out.println(p);
    System.out.println(p.getPrice());
  }
}
