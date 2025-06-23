package campuseventhub;

public class Seminar extends Event {
    private String pembicara;

    public Seminar(String nama, String tanggal, String lokasi, String status, String pembicara) {
        super(nama, tanggal, lokasi, "Seminar", status);
        this.pembicara = pembicara;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Pembicara: " + pembicara);
    }
}