package BT_JavaBasic2;

public class Calculator {
    public static int tong(int a, int b){
        return a + b;
    }


    public static float tich(float c, float d){
        return c * d;
    }

    public static void main(String[] args) {
        // Gọi hàm tính tổng (truyền 2 số nguyên)
        int tinhTong = tong(5, 7);

        // Gọi hàm tính tích (truyền 2 số thực)
        float tinhTich = tich(3.5f, 2.0f);

        // In kết quả ra màn hình
        System.out.println("Tổng của 2 số nguyên: " + tinhTong);
        System.out.println("Tích của 2 số thực: " + tinhTich);
    }
}
