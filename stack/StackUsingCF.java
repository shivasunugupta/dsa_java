import java.util.*;
public class StackUsingCF
{
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
