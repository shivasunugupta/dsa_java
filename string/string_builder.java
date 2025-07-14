public class string_builder
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'p');
        System.out.println(sb);

        sb.insert(1,'n');
        System.out.println(sb);

        sb.delete(1,2);  //(n,m) this means char from n to m ,without including m will be deleted.
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("h");
        sb2.append("e");
        sb2.append("l");
        sb2.append("l");
        sb2.append("o");
        System.out.println(sb2);
        System.out.println(sb2.length());






    }
}
