public class Product {
    //attribute veya field denir.
    //Bu class hem attribute hem fonksiyonlar içermemeli
    //PPUBLİC OLARAK TANIMLAMIŞ OLUYORUZ
    //default önlerinde public vardır
    //private olursa sadece tanımlandığı blockta geçerli anlamındadır.
    //yani product bloğu içinde her yerde geçerlidir demektir.

    public Product(){//overloading(aşırı yükleme) birtane parametresiz bir tanede parametreli var
        //isteğe göre kullanılır ikisde çalışır

    }
    public Product(int id , String name , String description , double price , int stockAmount){
       //bu productu sadece bu prametreleri verirsen kullandırır.
        System.out.println("Ben yapıcı bloğum");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    //getter
    public int getId(){//idyi okuyabilir.
        //veritabnından bir değer geldi değiştirerekte verebiliriz.
        //değer döndürdüğü için int
        return id;
    }
    //product.getId ile id deerini okuyabiliriz Main altında kullanırsak.

    //sadece read only olmasını istiyorsak set vermek zorunda değiliz.
    //Tam tersi sadece write only olması için tek set tanımalyabiliriz.
    //genelde ikiside tanımlanır.

    //setter
    public void setId(int id){//setlenecek değer parametre olarak verilmeli
        //_ olanlar fielddır
        this.id = id; // _id = id bu best practicedir değişken önlerine _ koyarız
        //this.id = id;//this bu class prodcutın idsi
        //id=id// hangi id hangi alan

    }


    public String getName() {
        return this.name.substring(0,1) + id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
