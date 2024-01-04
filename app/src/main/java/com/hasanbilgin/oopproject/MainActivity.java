package com.hasanbilgin.oopproject;

import static com.hasanbilgin.oopproject.interface2.aaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //oop->encapsulation/inheritance/abstraction/polymorphism oluşur

        //constructor/yapıcı metot çağırılan sınıfın propertlerini zorunlu kılar o metotda yapılan  işleride işler

        //encapsulation temel olarak bir sınıfın, içinde yer alan metotların ve değişkenlerin koruması işlemine denir.

        //inheritance Bir sınıfın başka bir sınıftan miras alması demek olan inheritance için ortak metot ve özellikler kullanılmaktadır.extends a diye inherit alınır (toplam 1adet)

        //polymorphism  statik ve dinamik
        //statik bi sınıfın aynı isimle birden fazla metotu olmasıdır tabiki o metotlar metot parametereleri farklıdır sum(),sum(int x),sum(String y) gibi
        //dinamik ise inherit alınan classın mesela a metodu var inherit edilen clasında a metodu olup o metodu ezmesi diuyebiliriz

        //abstraction ise inherit edilen classta fonksiyon kullanma zorunluluğu yapar

        //interface ise
        //%100 abstract tiplerdir,metot yazılır ama body şeklinde olmaz ancak public void info(); diye olur implement edildiği yerde ovveride ettilir yani metot body orda girilir,extend değil implements edilirler (birden fazla),obje oluşturamıyor (Interface1 i=new Interface(); olmaz),interfacete oluşturulan String aaa="hasan"; değeri statictir diğer heryerden ulaşılabilir ama değiştirilemez,değişken varsa değeri verilmesi şart













    }


}