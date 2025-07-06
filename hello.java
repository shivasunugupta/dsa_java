public class hello {
    public static int editorMiss(String s){
        int answer = 0;
        if(s== null || s.isEmpty()){
            return 0;
        } else {
            String ss = s.replace("[a-zA-Z0-9]","");
            answer = ss.length();
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
