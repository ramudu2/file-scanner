import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException'

public class TextFileScannerTest1{
public static void main(String[] args)
   throws FileNotFoundException{
   try
   {
   int n1;
   double n2;
   string name;
   Scanner SC=new scanner("ram.text");
   n1=SC.nextInt();
   n2=SC.nextDouble();
   name=SC.next();
   system.out.println("hai---%s---the n1,value is:%d--the n2 name is %2f",n1,n2,name);
   in.close();
   }
   catch(FileNotFoundException ex)
   {
   ex.printstackTrace();
   }
   