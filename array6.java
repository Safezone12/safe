public class array6 {
    public static void main(String[] args) {
        int ages[] = {20,22,18,35,48,26,87,70};
        float avg, sum = 0;
        int length = ages.length;
        int lowerAge = ages[0];
        for (int i = 0; i < length; i++) {
            if (lowerAge > ages[i]) {
                lowerAge = ages[i];
            }
        }
        System.out.println("The lowest age in the array is:" + lowerAge);
    }
}
