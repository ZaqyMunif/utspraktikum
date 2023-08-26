package praktikumuts.com.utspraktikum;

public class CustomerHotel {
    String name;
    String address;
    final int noktp = 2021097;
    final int nokamar = 45;

    public void infoTamu() {
        System.out.println("Info TAMU:");
        System.out.println("Nama: " + name);
        System.out.println("No KTP: " + noktp);
        System.out.println("Alamat: " + address);
        System.out.println("No Kamar: " + nokamar);
    }

    public void waktuCheckin(String checkinTime) {
        System.out.println("Waktu Check-in: " + checkinTime);
    }

    public void waktuCheckout(String checkoutTime) {
        System.out.println("Waktu Check-out: " + checkoutTime);
    }

    public void informasiPembayaran(double amount) {
        System.out.println("Informasi Pembayaran:");
        System.out.println("Total Pembayaran: $" + amount);
        // Add payment processing logic here
    }

    public void pesananMakanan(String foodOrder) {
        System.out.println("Pesanan Makan: " + foodOrder);
        // Add food order processing logic here
    }
}