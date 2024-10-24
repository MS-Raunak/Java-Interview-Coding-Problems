package pkg2_strings;

public class P3_ReverseWord {
    public static void main(String[] args) {
        reverseEachStr("Hi Chhaya"); //expected op: iH ayahhC
        reverseStrPosition("Hi Chhaya"); //expected op: Chhaya Hi
    }

    //Reverse each string
    private static void reverseEachStr(String s) {
        String[]arr = s.split(" ");
       int i=0;
        for (String str: arr){
            arr[i] = reverse(str);
            i++;
        }
        System.out.println(String.join(" ", arr));
    }

    private static String reverse(String s) {
        char[]chars = s.toCharArray();
        int i=0;
        int j=s.length()-1;

        while (i<j){
            char ch = chars[i];
            chars[i] = chars[j];
            chars[j] = ch;
            i++;
            j--;
        }
        return new String(chars);
    }

    //Reverse string position
    private static void reverseStrPosition(String s) {
        String[]arr = s.split(" ");
        int i=0;
        int j= arr.length-1;

        while (i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String res = String.join(" ", arr);
        System.out.println(res);
    }
}
