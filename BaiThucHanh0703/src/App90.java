import java.util.Scanner;
public class App90 {
    public static void main(String[] args){
        String chuoi;
        char kytu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.println("Các ký tự có trong chuỗi là: ");
        for(int i = 0 ; i < chuoi.length() ; i++ ){
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }
    }
}
