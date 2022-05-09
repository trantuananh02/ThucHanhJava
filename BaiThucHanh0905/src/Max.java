import java.util.ArrayList;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> arrListIntegers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number; // phần tử của mảng 

        System.out.println("Nhập số phần tử của ArrayList: ");
        int n = scanner.nextInt();
        // Nhập và thêm phần tử cho ArrayList
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + i + " : ");
            number = scanner.nextInt();
            arrListIntegers.add(number);
        }
        // tìm phần tử lớn nhất trong mảng sử dụng phương thức compareTo()
        // giả sử phần lớn nhất là phần tử đầu tiên trong ArrayList
        int max = arrListIntegers.get(0);

        for (int i= 1; i <arrListIntegers.size(); i++) {
            // ney ket qua cua phep so sanh nay lon hon o
            // tuc bien max nho hon phan tu vi tri thu i trong Arraylist
            // thi gan max = phan tu tai vi tri i
            // va do chinh la phan tu lon nhat
            if (arrListIntegers.get(i).compareTo(max)>0){
                max = arrListIntegers.get(i);
    }
}
System.out.println("Phan tu lon nhat trong arrListInteger = " + max);
    }
}