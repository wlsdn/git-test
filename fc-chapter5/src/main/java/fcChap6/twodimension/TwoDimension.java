package fcChap6.twodimension;

public class TwoDimension {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}}; // 2행 3열

        System.out.println(arr.length); // 전체 arr의 length
        // 6개일 것 같죠? 아니다! 이건 행의 개수다. 그럼 2가 나온다.

        System.out.println(arr[0].length); // arr[0]의 length
        // 이건 arr[0]번째의 열의 개수를 물어보는것이다. 즉 3이 나온다.

        System.out.println(arr[1].length); // arr[1]의 length
        // 이건 arr[1]번째의 열의 개수를 물어보는것이다. 즉 3이 나온다.

        System.out.println();

        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
