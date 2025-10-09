package BT_JavaBasic1;

public class SinhVien {
    String name = "Nguyễn Ngọc Yến Nhi";  // Biến toàn cục
    int age = 23;  // Biến toàn cục
    static String truong = "Đại học Thủy Lợi";  // Biến static


    public static void main(String[] args) {
        String lop = "62TH1";  // Biến cục bộ

        //Tạo đối tượng để khai báo
        SinhVien sv = new SinhVien();

        System.out.println("Tên: " + sv.name);
        System.out.println("Tuổi: " + sv.age);
        System.out.println("Lớp: " + lop);
        System.out.println("Trường: " + truong);
        System.out.println("Quê quán: " + ThongTin.quequan);
        System.out.println("Quốc gia: " + ThongTin.quocgia);
    }
}
