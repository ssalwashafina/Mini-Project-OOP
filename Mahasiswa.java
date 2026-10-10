public class Mahasiswa {
    String nama;
    Long NIM;
    double nilai;
    
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Nilai: " + nilai);
    }

    public void cekKelulusan() {
        if(nilai >= 60) {
            System.out.println("Status Kelulusan: Lulus");
        } else {
            System.out.println("Status Kelulusan: Tidak Lulus");
        }
    }
}
