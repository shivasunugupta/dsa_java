import java.util.*;
class addition
{
    int sum=0;
    public int add(int a,int b)
    {
        int c = a+b;
        return c;
    }
}

class methods
{
    public static void main(String[] args)
    {
        addition add1= new addition();  //creating object

        int q= add1.add(3,5);  //calling method of above class using instance

        System.out.println("sum of two integers "+ q);
    }
}


