package Misc;
import java.util.Random;
public class GuessTheNumber {
        public static void main(String[] args) {
            // bilgisayara 1 ile 100 arasinda bir sayi tutturun
            // kullanicidan bu sayiyi tahmin etmesini isteyin
            // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
            // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
            Random rnd=new Random();
            int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        }
}
