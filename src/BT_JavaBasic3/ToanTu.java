package BT_JavaBasic3;

public class ToanTu {
// Tạo ra ít nhất 3 biến bất kỳ lưu giá trị trong class đó

    // Phải khai báo là static --> vì biến static thuộc class, còn biến toàn cục thuộc đối tượng
    static int a = 5;
    static int b = 7;
    static int c = 10;

    public void OnTapToanTu(){
        // Toán tử quan hệ
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("Kết quả so sánh a > b: " + (a > b));
        System.out.println("Kết quả so sánh a == b: " + (a == b));
        System.out.println("Kết quả so sánh a < c: " + (a < c));

        // Toán tử logic
        System.out.println("Kết quả so sánh của (a < b) && (b == c): " + ((a < b) && (b == c)));
        System.out.println("Kết quả so sánh của (a < b) || (b > c): " + ((a < b) || (b > c)));
    }


    int number = 100;

    public void kiemtra(int n){
        if (n == number){
            System.out.println("n bằng number");
        } else if(n < number){
            System.out.println("n nhỏ hơn number");
        } else {
            System.out.println("n lớn hơn number");
        }
    }


    public static void main(String[] args) {

         ToanTu toanTu = new ToanTu();
         toanTu.OnTapToanTu();

         toanTu.kiemtra(100);
         toanTu.kiemtra(99);
         toanTu.kiemtra(102);

    }
}
