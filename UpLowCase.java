import java.io.*;
import java.util.*;
  public class UpLowCase{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The String:");
      String str=sc.nextLine();
	    String emp="";
      for(int i=0;i<str.length();i++)
      {
	      char c=str.charAt(i);
        if(Character.isUpperCase(c))
          {
	          char c1=(char)(c+32);
	          emp=emp+c1;
	        }
	      else if(Character.isLowerCase(c))
          {
	          char c2=(char)(c-32);
	          emp=emp+c2;
	        }
	  }
    System.out.println(emp);
   }
 }  
