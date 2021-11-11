import java.util.*;
class pattern21	
{
     public static void main(String arg[])
    {
        try{
            int n,i,j,k;
            Scanner t=new Scanner(System.in);
            System.out.println("Enter n");
            n=t.nextInt();
          for (i=1; i<= n ; i++)   
          {  
	for (j = n; j > i ; j--)   
	{  
	   System.out.print(" ");  
	}  
  	  System.out.print("*");  
	for (k = 1; k < 2*(i -1) ;k++)   
	{   
	  System.out.print(" ");   
	}  
	if( i==1)   
	{   
	   System.out.println("");  
	}  
	else  
	{  
	  System.out.println("*");   
	}  
	}   
	for (i=n-1; i>= 1 ; i--)  
	{  
	  for ( j = n; j > i ; j--)   
 	  {  
	     System.out.print(" ");  
	   }  
                       System.out.print("*");  
                    for ( k = 1; k < 2*(i -1) ;k++)   
                       {  
                            System.out.print(" ");  
                         }  
                          if(i==1) { 
                               System.out.println(""); 
                              } 
                            else  {
                                       System.out.println("*");  
                                  }
                  }  
  
       }
       catch(Exception e)
	{
	   System.out.println(e);
	 }
       }
}
