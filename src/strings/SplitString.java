package strings;

public class SplitString {

    public static void main(String[] args) {

        String s = "abc-2019";

        String[] arr = s.split("-");
        
        System.out.println("["+ arr[0]+ "]");
        
        System.out.println(arr[1]+" ");

       // System.out.println("[" + arr[0] + "]");
        //System.out.println("[" + arr[1] + "]");
    }
}