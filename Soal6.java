import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        int n = data.length;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai k (berapa langkah rotasi ke kanan): ");
        int k = input.nextInt();
        input.close();

        k = k % n;
       
        reverse(data, 0, n - 1);    
        reverse(data, 0, k - 1);     
        reverse(data, k, n - 1);     

        System.out.print("Hasil setelah rotasi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}


