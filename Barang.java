import java.util.Date;

public class Barang { //Super Class

    public String kode_barang;
    public String nama_barang;
    public float harga_barang;
    User user;

    public int no_faktur;
    public int jumlah_beli;
    public float total;

    public Barang (String kode_barang, String nama_barang, float harga_barang, User user){
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.harga_barang = harga_barang;
        this.user = user;
    }

    public void faktur () {
        Date date = new Date(); //membuat objek date
        String str = String.format("Current Date/Time : %tc", date);
        System.out.printf(str);
        
        System.out.printf(str);
        System.out.println("\n=============================================================\n");
        System.out.println("No. Faktur   : " + no_faktur);
        System.out.println("Kode Barang  : " + kode_barang);
        System.out.println("Nama Barang  : " + nama_barang);
        System.out.println("Harga Barang : " + harga_barang);
        System.out.println("Jumlah Beli  : " + jumlah_beli);
        System.out.println("Total        : " + total);
        System.out.println("=============================================================\n");
        System.out.println("Kasir: " + user.user_name.get(0));
        System.out.println("=============================================================\n");
        System.out.println("Terimakasih Telah Berbelanja");
    }
}

class Sepatu extends Barang { //Child Class Dari Kelas Barang
    public Sepatu (User user){
        super("b01", "Sepatu Hijau", 300000, user);
    }
}

class Celana extends Barang { //Child Class Dari Kelas Barang
    public Celana (User user){
        super("b02", "Celana Panjang", 200000, user);
    }
}

class Baju extends Barang { //Child Class Dari Kelas Barang
    public Baju (User user){
        super("b03", "Baju Kemeja", 100000, user);
    }
}