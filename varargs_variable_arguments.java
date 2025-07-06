public class varargs_variable_arguments
{
    static int sum(int ...arr)       //  ...arr -> all the variable arguments in
    {
        int result=0;
        for (int a: arr)
        {
            result+=a;
        }
        return result;

    }

    static int sum2(int x,int ...arr)  //1 arg is compulsory  and 'public' can or cannot be used will discuss it further
    {
        int result =x;
        for (int a: arr)
        {
            result +=a;
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("sum of " + sum(6,8,4));
        System.out.println("sum of nothing " + sum());

        System.out.println(sum2(1,7,8,8));
        System.out.println(sum2(1));

    }
}
