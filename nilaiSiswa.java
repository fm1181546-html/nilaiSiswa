import java.util.Scanner;

public class NilaiSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama siswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.print("Masukkan nis sekolah: ");
        int nis = input.nextInt();

        System.out.println("Nama Siswa : " + nama);
        System.out.println("Nilai      : " + nilai);
        System.out.println("NIS        : " + nis);

        if (nilai >= 80) {
            System.out.println("Keterangan : LULUS");
        } else {
            System.out.println("Keterangan : TIDAK LULUS");
        }
    }
}
