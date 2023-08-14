import java.util.Scanner;
public class percentage{
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
     System.out.println("english");
     int english=sc.nextInt();
     
     System.out.println("Hindi");
     int Hindi=sc.nextInt();
     
     System.out.println("maths");
     int maths=sc.nextInt();
     
     System.out.println("science");
     int science=sc.nextInt();
     
     System.out.println("coding");
     int programming=sc.nextInt();
     System.out.println("Total Marks obtained:");
     int total=english+Hindi+maths+science+programming;
     System.out.println(total);
     float percentage=total/5;
     System.out.println("Overall Percentage is:");
     System.out.println(percentage);
    

}
}