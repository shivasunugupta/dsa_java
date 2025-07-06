import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.util.HashSet;

public class recursion_2
{

    //que1 tower of hanoi
//        public static void towerOfHanoi(int n,String src,String helper,String dest)
//    {
//        if (n==1)
//        {
//            System.out.println("transfer disc "+n+" from "+src+" to "+dest);
//            return;
//        }
//
//        transfer top n-1 from src to helper using dest as 'helper'
//        towerOfHanoi(n-1, src,dest,helper);
//
//        transfer nth from src to dest
//        System.out.println("transfer disc "+n+" from "+src+" to "+dest);
//
//        transfer n-1 from helper to dest using src as 'helper'
//        towerOfHanoi(n-1,helper,src,dest);
//
//

    //que 2 string in reverse
//    public static void printReverse(String str,int idx)
//    {
//        if (idx ==0)
//        {
//            System.out.println(str.charAt(idx));
//        }
//        System.out.print(str.charAt(idx));
//        printReverse(str,idx-1);
//    }

    //que 3 first and last occ of an element in string
//    public static int first =-1;
//    public static int last =-1;
//    public static void findOccurance(String str,int idx,char element)
//    {
//        if (idx == str.length())
//        {
//            System.out.println(first);
//            System.out.println(last);
//            return;
//        }
//        char currentchar=str.charAt(idx);
//        if (currentchar==element)
//        {
//            if (first==-1)
//            {
//                first=idx;
//            }
//            else {
//                last=idx;
//            }
//        }
//        findOccurance(str,idx+1,element);
//    }

    //que 4 strictly inc arr
//    public static boolean isSorted(int arr[],int idx)
//    {
//        if (idx == arr.length-1)
//        {
//            return true;
//        }
//        if (arr[idx] < arr[idx+1])
//        {
//           return isSorted(arr,idx+1);
//        }
//        else
//        {
//            return false;
//        }
//    }

    //que 5 moving a charecter at the end of string
//    public static void moveAllX(String str,int idx,int count,String newString)
//    {
//        if (idx ==str.length()) {
//            for (int i = 0; i < count; i++)
//            {
//                newString +='x';
//            }
//            System.out.println(newString);
//            return;
//        }
//        char currchar = str.charAt(idx);
//        if (currchar == 'x')
//        {
//            count++;
//            moveAllX(str,idx+1, count,newString);
//        }
//        else
//        {
//            newString += currchar;
//            moveAllX(str,idx+1,count,newString);
//        }
//    }

    //que 6 remove duplicate aacddba ->acdb
//    public static boolean[] map=new boolean[26];
//    public static void removeDupl(String str,int idx,String newString)
//    {
//        if(idx == str.length())
//        {
//            System.out.println(newString);
//            return;
//        }
//
//        char currchar=str.charAt(idx);
//        if (map[currchar - 'a']==true)
//        {
//            removeDupl(str,idx+1,newString);
//        }
//        else
//        {
//            newString += currchar;
//            map[currchar-'a']=true;
//            removeDupl(str,idx+1,newString);
//        }
//    }

    //IMPORTANT que 7 subsequences of a string
//    public static void subsequence(String str,int idx,String newString)
//    {
//        if(idx == str.length())
//        {
//            System.out.println(newString);
//            return;
//        }
//        char currchar = str.charAt(idx);
//
//        subsequence(str,idx+1,newString+currchar);
//
//        subsequence(str,idx+1,newString);
//    }

    //que 8 special case of que 7 -> to print all the unique subsequence of 'aaa'
//    public static void subsequence(String str,int idx,String newString,HashSet<String> set)
//    {
//
//        if(idx == str.length())
//        {
//            if (set.contains(newString))
//            {
//                return;
//            }
//            else
//            {
//                System.out.println(newString);
//                set.add(newString);
//                return;
//            }
//
//        }
//        char currchar = str.charAt(idx);
//
//        subsequence(str,idx+1,newString+currchar,set);
//
//        subsequence(str,idx+1,newString,set);
//    }

    //que 9 print keypad combination
//    public static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//
//    public static void printcomb(String str,int idx,String combination)
//    {
//        if (idx == str.length())
//        {
//            System.out.println(combination);
//            return;
//        }
//        char currchar = str.charAt(idx);
//        String mapping = keypad[currchar - '0'];
//        for (int i=0;i<mapping.length();i++)
//        {
//            printcomb(str,idx+1,combination+mapping.charAt(i));
//        }
//    }


    public static void main(String[] args)
    {
//        int n=5;
//        towerOfHanoi(n,"S","H","D");

//        String str = "fuck you";
//        printReverse(str,str.length()-1);

//        String str="fuck you motherfucker";
//        findOccurance(str,0,'u');

//        String str = "axbcxxdclx";
//        moveAllX(str,0,0,"");

//        String str="abbccdaefgffe";
//        removeDupl(str,0,"");

//        String str = "aaaa";
//        HashSet<String> set = new HashSet<>();
//        subsequence(str,0,"",set);St

//        String str = "666";
//        printcomb(str,0,"");



    }
}
