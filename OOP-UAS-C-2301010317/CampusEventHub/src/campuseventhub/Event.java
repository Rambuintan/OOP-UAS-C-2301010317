package campuseventhub;

public class Event {
    protected String nama;
    protected String tanggal;
    protected String lokasi;
    protected String kategori;
    protected String status;

    public Event(String nama, String tanggal, String lokasi, String kategori, String status) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.kategori = kategori;
        this.status = status;
    }

    public void tampilkanDetail() {
        System.out.println("Nama Event: " + nama);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Kategori: " + kategori);
        System.out.println("Status: " + status);
    }
}