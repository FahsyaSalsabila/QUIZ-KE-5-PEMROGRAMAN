public class Soal7 {
   
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Pola Zig-Zag:");
        
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + "   "); 
        }
        
        System.out.println(); 
        System.out.print("  "); 
        
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + "   ");
        }
    }
}

