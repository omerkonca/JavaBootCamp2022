public class Main {
    public static void main(String[] args) {

        //return bitir demek

        sayiBulmaca();
        String sehir = sehirVer();
        int toplam = topla(5,8);
        int sayilarToplami= topla2(3,4,5,6);//istediğimiz kadar yolluyoruz arkaplanda diziye çevirir..
        System.out.println(sayilarToplami
        );
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 11;

        boolean bulunduMu = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                bulunduMu = true;

            }
        }
        if (bulunduMu) {
            System.out.println("Sayi bulundu");
        } else {
            System.out.println("Sayi bulunamadı");
        }

    }

    //değer döndüren fonksiyon
    public static String sehirVer() {
        return "İstanbul";
    }

    //paramtreli değer döndüren fonksiyon
    public static int topla(int a, int b) {
        return a + b;
    }
    //pek kullanılmazz koleksiyon ve nesne yönelimli kullanırız test edilebilirliği azaltır.variable arguments birden fazla değer yollucaksan 3 nokta konur
    public static int topla2(int... sayilar) {
        int toplam=0;
        for(int sayi : sayilar){
            toplam +=sayi;
        }
        return toplam;
    }

}