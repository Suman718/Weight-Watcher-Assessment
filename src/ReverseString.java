public class ReverseString {
    public static String reverseString(String str){
        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length-1;
        for (left=0; left<right; left++, right --){
            char temp = chars[left];
            chars [left] = chars[right];
            chars[right] = temp;
        }

        return  new String(chars);
    }

    public static void main(String[] args) {
        String str = "hope you are doing well";
        System.out.println(reverseString(str));
    }
}
