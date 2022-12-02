import java.util.Scanner;

public class bilet {
    public static void main(String[] args) {
        int age, direction, distance;


        Scanner ticket = new Scanner(System.in);
        System.out.print("lütfen yaşnınızı giriniz:");
        age = ticket.nextInt();
        System.out.print("\n lütfen mesafeyi giriniz:");
        distance = ticket.nextInt();
        System.out.print("\n lütfen gideceginiz yönü giriniz(1=tek yön , 2= gidiş/dünüş):");
        direction = ticket.nextInt();

        double standart, yasIndirimi, distanceIndirimi;

        if (distance > 0 && age > 0 && (direction == 1 || direction == 2)) {
            standart = distance * 0.10;
            if (age < 12) {
                yasIndirimi = standart * 0.50; // ne kadar indrim yapılacagını hesapalama
                standart = standart - yasIndirimi;


            } else if (age >= 12 && age <= 24) {
                yasIndirimi = standart * 0.1; // yapılan indirim
                standart = standart - yasIndirimi;

            } else if (65 >= age) {
                yasIndirimi = standart * 0.3;
                standart = standart - yasIndirimi;

            } else {
                yasIndirimi = 0;
            }
            standart = standart - yasIndirimi;
            if (direction == 2) {
                distanceIndirimi = standart * 0.20;
                standart = (standart - distanceIndirimi) * 2;
            }
            System.out.println("BİLET TUTARINIZ:" + standart + "TL");


        } else {
            System.out.println("girdiler yanlış");
        }



/*
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */

    }
}
