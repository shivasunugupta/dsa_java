import java.util.*;
public class hashMap

    //internally implemented as array of linked list
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India",120);
        map.put("China",110);
        map.put("USA",30);
        map.put("USA",50);   //value will be updated if key is already inserted
//        System.out.print(" "+map +" ");

        //search  ==  lookup
//        if (map.containsKey("Cuba"))
//        {
//            System.out.println("key exist");
//        }
//        else
//        {
//            System.out.println("key does not exist");
//        }
//
//        //get
        System.out.println(map.entrySet());
//        System.out.println(map.get("Japan"));    //null if does not exist

//        int arr[] ={12,15,18};
//        for (int i =0;i<3;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        //iteration in hashmap
//        for (int val : arr)
//        {
//            System.out.println(val +" ");
//        }
//        System.out.println();



//        for (Map.Entry<String,Integer> e : map.entrySet())
//        {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

//        Set<String> keys = map.keySet();
//        for (String key :keys)
//        {
//            System.out.println(key +" "+map.get(key));
//        }
//
//        //remove
//        map.remove("China");
//        System.out.println(map);
    }
}
