import java.util.Scanner;
//Complete this program that the user will be able to choose the quadilateral it wants to calculate its perimeter and area

class Main {
  public static void main(String[] args) {
    //Declare a char to store the chosen quadilateral
    scanner sc = new scanner(system.in);
    char opt = sc.next().charAt(0);
    //using a switch chek what the user selected and use it to calculate the perimiter and area of the declined quadilateral
    switch (opt){ case 'p' :
   //this should be in the parallelogram case
    System.out.println("This program calculates the area and perimeter of the parallelogram.");
    System.out.println("Input the base of your Parallelogram");
    Scanner scan = new Scanner(System.in);
    float pBase = scan.nextFloat();
    System.out.println("Input the height of your Parallelogram");
    float pHeight = scan.nextFloat();
    Parallelogram p = new Parallelogram(pBase, pHeight);
    
    Quadilateral q = p;

  
    System.out.println("Input the dimension of the first pair of your Parallelogram");
    q.setLength(scan.nextFloat());
    System.out.println("Input the second pair of your Parallelogram");
    q.setBreadth(scan.nextFloat());
    
    System.out.printf("The area of the parallelogram with base %.2f and height %.2f is %.2f", pBase, pHeight, p.Area());

    System.out.println("");
    System.out.printf("The perimeter of the parallelogram with First Pair: %.2f and SecondPair: %.2f is %.2f", q.getLength(), q.getBreadth(), q.calculatePerimeter());
    System.out.println("");
    System.out.println("");
    System.out.println("");
    break; 
  
     case 't' :
    //this should be in the Trapezoid case
     System.out.println("Calculation for a Trapezoid");
     System.out.println("Input first side");
     float a = scan.nextFloat();
     System.out.println("Input second side");
     float b = scan.nextFloat();
     System.out.println("Input third side");
     float c = scan.nextFloat();
     System.out.println("Input fourth si");
     float d = scan.nextFloat();
     Trapezoid t = new Trapezoid(a, b, c, d);
    System.out.printf("The perimeter of the Trapezoid with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, and Fourth Side: %.2f is %.2f", a, b, c, d, t.calculatePerimeter()); 
  }
}

//Create class for Rhombus
class Rhombus extends Quadilateral{
  private float side1;
  private float side2;
  private float side3;
  private float side4;
  private float diag1;
  private float diag2;

  public Rhombus (float s1,float s2,float s3,float s4,float d1,float d2) {
    side1=s1;
    side2=s2;
    side3=s3;
    side4=s4;
    diag1=d1;
    diag2=d2;
  }
  public float calculatePerimeter (){
    return side1+side2+side3+side4;
  }
  public float area() {
    return (diag1*diag2)/2;
  }
}

//Create class for square
class Square extends Quadilateral{
  private float area side1;

public square (float s1){ 
  if (s1 <=0) {}
    system.out.printin("you cannot have a negarive or zero base. therefore base returns to defult which is 1");
    s1 = 1;
    }
    else 
      side1 = s1;
}
    public float calculateperimiter(){
      return 4*slide1;
    }
    public float area (){
      return side1*side1;
    }
}


//create class for Rectangle
class rectangle extends quadilateral {
  private float length;
  private float breath;

  public rectangle(float 1,float b) {
    length=1;
    brreath=b;
}
  
 public float area (){
   return length*breath;
 }

  public float calculateperimeter (){
  return 2* (length*breath);
  }
}


class Trapezoid extends Quadilateral()
  private float side1;
  private float side2 ;
  private float side3 ;
  private float side4 ;
  public Trapezoid (float a, float b, float c, float d){
    side1 = a;
    side2 = b;
    side3 = c;
    side4 = d;
  }

  public float calculatePerimeter(){
    return side1+side2+side3+side4;
  }

}
class Parallelogram extends Quadilateral{
  private float base;
  private float height;
  public Parallelogram (float b, float h){
    if (b <= 0){
      System.out.println("You cannot have a negative or zero base. Therfore base returns to default which is 1");
      base = 1;
    }
    else
      base = b;
    if (h <= 0){
      System.out.println("You cannot have a negative or zero height. Therfore height returns to default which is 1");
      height = 1;
    }
    else
      height = h;
  }
  public float Area(){
    return base*height;
  }

}
class Quadilateral {
  private float length;
  private float breadth;

  public void setLength(float l){
    length = l;
  }

  public float getLength(){
    return length;
  }

  public void setBreadth(float b){
    breadth = b;
  }

  public float getBreadth(){
    return breadth;
  }

  public float calculatePerimeter(){
    return 2*(length+breadth);
  }
}