package praktikumuts.com.utspraktikum;

public class tamuhotel {
    public static void main(String[] args) {
        var customer = new CustomerHotel();
        customer.name = "Zaqy Munif";
        customer.address = "Kudus";

        customer.infoTamu();
        customer.waktuCheckin("10:42 AM");
        customer.waktuCheckout("12:54 PM");
        customer.informasiPembayaran(150.000);
        customer.pesananMakanan("Nasi Goreng Kuah");

    }
}
