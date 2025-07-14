import java.util.HashSet;
import java.util.Iterator;
public class hashset
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);  // only unique number are added,no element con occur more than one

        //search
        if (set.contains(1))
        {
            System.out.println("set contains 1");
        }
        if (!set.contains(6))
        {
            System.out.println("does not contains 6");
        }

        //delete
//        set.remove(1);
//        if (!set.contains(1))
//        {
//            System.out.println("we deleted 1");
//        }

        //size
        System.out.println("size =" +set.size());

        //print all elements
        System.out.println(set);

        //iterator
        // working of iterator    it.next = null -->  1st ele --> 2nd ele --> 3rd ele
        //has next  it.hasNext --> true or false
        Iterator it = set.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
