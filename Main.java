
class Main{
  public static void main(String[] args)
  {
  int h = 4;

    for(int i=1; i<=h; i++)
      {
        for (int j=h;j>=i; j--)System.out.print(" ");
        for (int j = i; j>0; j--)System.out.print("*");
        System.out.println(" ");
      }
    for (int i=1;i<=h;i++){
      System.out.print("   ");
    }
    for (int i=1; i<=h; i++){
      for (int j=h; j>=i;j--)System.out.print(" ");
      for (int j=i; j>0; j--)System.out.print("*");
      System.out.println(" ");
    }

  for (int i=1; i<h; i++){
    System.out.print("    ");
    for (int j=1; j<=i; j++)System.out.print("*");
    System.out.println(" ");
     
   
   

      }
  }
  
}