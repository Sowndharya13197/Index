import java.io.*;
import java.util.Scanner;
public class Array {
    public static void main(String args[])
    {
        int n,i;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {if(a[i]==i)
        {System.out.println(i);
            }
    }
    
}}
