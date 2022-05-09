import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) {
        //Khai bao 1 Arraylist co ten la arrListstring
        //co the khai bao la String
        ArrayList<String> arrListString = new ArrayList<>();

        //Them cac phan tu su dung phuong thuc add()
        arrListString.add ("JAVA");
        arrListString.add ("PHP");
        arrListString.add ("C#");
        arrListString.add ("C++");

        // duyệt theo kích thước của arrlistString
        // sử dụng vòng lặp for thông thường
        // phương thức arrListString.size() sẽ trả về số phần tử của arrListString 
        //và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get
        // sau đó hiện thị giá trị phần tử đó ra
        System.out.println("Các phần tử có trong arrListString");
        for (int i = 0; i < arrListString.size(); i++ ){
            System.out.println(arrListString.get(i) + "\t");
        }

    }
}
