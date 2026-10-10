import java.util.Scanner;

public class ProgramMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] mahasiswa = new Mahasiswa[3];

        for (int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i] = new Mahasiswa();
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Masukkan Nama Mahasiswa: ");
            mahasiswa[i].nama = input.nextLine();

            System.out.print("Masukkan NIM Mahasiswa: ");
            mahasiswa[i].NIM = Long.parseLong(input.nextLine());

            System.out.print("Masukkan Nilai Mahasiswa: ");
            mahasiswa[i].nilai = Double.parseDouble(input.nextLine());
        }

        System.out.println("\nDATA MAHASISWA");

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            mahasiswa[i].tampilkanData();
            mahasiswa[i].cekKelulusan();
        }

        input.close();
    }
}