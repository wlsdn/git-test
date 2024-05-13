package fcChap6;

public class ArrayTest {
    public static void main(String[] args) {

        // int[] arr = new int[10]; 크키가 10인 배열 생성

        // 1. int[] arr = new int[] {1, 2, 3}; 생성과 동시에 초기화
        // 2. int[] arr = {1, 2, 3} new가 생략 가능

        // 1부터 10까지 합을 구하여라
        int[] arr = new int[10];
        int num = 1;
        int total = 0;
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = num;
            ++num;
        }
        for(int i = 0; i < arr.length; ++i) {
            total += arr[i];
            // System.out.println(arr[i]);
        }
        System.out.println(total);

        double[] dArr = new double[5];
        int count = 0;
        dArr[0] = 1.1;
        ++count;
        dArr[1] = 2.1;
        ++count;
        dArr[2] = 3.1;
        ++count;

        double mTotal = 1;
        for(int i = 0; i < count; ++i) {
            mTotal *= dArr[i];
        }
        System.out.println(mTotal);   // (count 사용하기 전)이건 0이 나옴 => count를 사용해서 고쳐보자
    }
}
