public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        //anne çoçuklarını çağırabilir.referans tiplerdir.
        //çeşitli dbler arasında erişimler için bu şekilde yapaabiliriz.

        //polymorphisim
        krediUI.KrediHesapla(new AskerKrediManager());
    }
}