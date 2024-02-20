import  java.util.Scanner;
public class codelab {

    public static void main(String[] args) {
        //VARIABEL
        String nama;
        char jenisKelamin;
        String tanggalLahir;

    //OBJEK DARI CLASS SCANNER
        Scanner input = new Scanner(System.in);
        System.out.print("Nama                            :");
        nama = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin (P/L)    :");
        jenisKelamin = input.next().charAt(0);
        input.nextLine();
        System.out.print("Tanggal Lahir (DD/MM/YYYY)       :");
        tanggalLahir = input.nextLine();

        if (jenisKelamin == 'P' || jenisKelamin == 'p'){
            System.out.println("Nama            :"+nama);
            System.out.println("Jenis Kelamin   : Perempuan");
            System.out.println("Tanggal Lahir   :"+tanggalLahir);
        } else if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            System.out.println("Nama            :"+nama);
            System.out.println("Jenis Kelamin   : Laki laki");
            System.out.println("Tanggal Lahir   :"+tanggalLahir);
        }else {
            System.out.println("Input Jenis Kelamin tidak valid");
        }

    }
}
