package campuseventhub;

public class Peserta {
    private String nama;
    private String nim;
    private String noHp;

    public Peserta(String nama, String nim, String noHp) {
        this.nama = nama;
        this.nim = nim;
        this.noHp = noHp;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("No HP: " + noHp);
    }
}