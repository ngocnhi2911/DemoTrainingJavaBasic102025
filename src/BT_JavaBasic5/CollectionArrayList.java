package BT_JavaBasic5;

import java.util.ArrayList;

public class CollectionArrayList {

    // Tạo class mới tại bài tập JAVA BASIC 5 để xử lý bài tập Java Basic 4 với ArrayList

    public void soChan(){
        // Khai báo một ArrayList để lưu trữ các số chẵn
        ArrayList<Integer> listSoChan = new ArrayList<>();
        System.out.println("Các số chẵn trong mảng là:" );

        // Tạo vòng lặp FOR để duyệt từ 0 đến 50
        for (int i = 0; i <= 50; i++) {
            // Kiểm tra xem số có phải là số chẵn không (chia hết cho 2)
            if (i % 2 == 0) {
                // Lưu số chẵn đó vào ArrayList
                listSoChan.add(i);
            }
        }

        // Duyệt mảng (ArrayList) để in ra kết quả sau khi nạp vào
        for (int i = 0 ; i < listSoChan.size(); i++){
            System.out.println(listSoChan.get(i));
            listSoChan.get(i);
        }

    }

    // Tạo hàm riêng để thêm thông tin cơ bản của một nhân viên vào collection đã học phù hợp
    public void NhanVien(String ma, String ten, String gioiTinh, String chucVu){
        ArrayList<String> listNhanVien = new ArrayList<>();

      listNhanVien.add("Mã nhân viên: " + ma);
      listNhanVien.add("Tên nhân viên: " + ten);
      listNhanVien.add("Giới tính: " + gioiTinh);
      listNhanVien.add("Chức vụ: " + chucVu);

      System.out.println("Thông tin nhân viên: ");

      for (int i = 0 ; i < listNhanVien.size(); i++){
            System.out.println(listNhanVien.get(i));
        }



    }

    public static void main(String[] args) {
        CollectionArrayList cal = new CollectionArrayList();

        cal.soChan();
        cal.NhanVien("NV001", "Nguyễn Ngọc Yến Nhi", "Nữ", "Tester");

    }

}
