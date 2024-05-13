package fcChap6;

public class ArrayCopy {
    public static void main(String[] args) {


        // 배열 복사
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5};

        // 배열 복사를 할 때 System이라는 클래스에 static 메소드인 arraycopy() 메소드를 사용할 수 있다.
        // 1. src = 어디서(arr1에서)
        // 2. srcPos = 어디서부터(0번째부터)
        // 3. dest(destination) = 어디에다가(arr2에다가)
        // 4. dsetPos = destination에 첫번째 포지션 1번 위치에서
        // 5. length = 소스로 부터 몇 개
        System.arraycopy(arr1, 0, arr2, 1, 3);
        // length를 5로 하면 OutOfBoundsException이라는 에러가 뜬다.
        // 이건 범위를 넘어섰다는 얘기다.
        // 1번째부터 5개라고하면 6번째도 바꾸라는건데 범위가 5가 최대니깐 에러가 난다.

        for(int i = 0; i < arr2.length; ++i) {
            System.out.println(arr2[i]);
        }
    }
}
