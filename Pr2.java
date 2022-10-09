public class Pr2 {
    static int countOccurrences(String str, String word) {
        String a[] = str.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i]))
                count++;
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "Manan Patel ";
        String word = "Patel";
        System.out.println(countOccurrences(str, word));
    }
}
