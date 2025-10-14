package BT_JavaBasic4;

public class ForMang {


    public static void main(String[] args) {

        // Bước 1: Tạo mảng để lưu số chẵn
        int[] soChan = new int[26]; // Từ 0 đến 50 có 26 số chẵn (0, 2, 4, ..., 50)
        int index = 0;

        // Bước 2: Tạo vòng lặp FOR để đưa số chẵn vào mảng
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) { // Kiểm tra số chẵn
                soChan[index] = i; // Lưu vào mảng
                index++;
            }
        }

        // Bước 3: Duyệt mảng để in ra các số chẵn đã lưu
        System.out.println("Các số chẵn trong mảng là:" );
        for (int i = 0; i < soChan.length; i++) {
            System.out.print(soChan[i] + " ");
        }
    }

}
