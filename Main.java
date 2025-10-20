
    class Mahasiswa {
    private String nama;
    private int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return nilai;
    }

    public void tampilData() {
        System.out.println("Nama: " + nama + " - Nilai: " + nilai);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] mhs = {
            new Mahasiswa("King Zaki", 95),
            new Mahasiswa("Prince Ardi", 85),
            new Mahasiswa("Ajudan Farrash", 60)
        };

        for (Mahasiswa m : mhs) {
            m.tampilData();
        }
        Mahasiswa tertinggi = mhs[0]; 
        for (Mahasiswa m : mhs) {
            if (m.getNilai() > tertinggi.getNilai()) {
                tertinggi = m;
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi: " 
            + tertinggi.getNama() + " (" + tertinggi.getNilai() + ")");
    }
}


