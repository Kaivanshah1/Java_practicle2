/*
Created by 21CE125 Kaivan Shah
Develop a Program that illustrate method overloading concept.
*/
class area{
  int length;
  int b;


  float area1(int l, int b)
  {
     length =  l;
     this.b = b;
     float area = length * b;
     return area;
  }

  float area1(int length)
  {
     float area = length * 4;
     return area;
  }
}

class Main 
{
 public static void main(String[] args) {
    area a1 = new area();

    System.out.println("area by 1st method- " + a1.area1(2));
    System.out.println("area by 2st method- " +a1.area1(2,3));
     System.out.println("21CE125 Kaivan Shah");
 }
    
}
