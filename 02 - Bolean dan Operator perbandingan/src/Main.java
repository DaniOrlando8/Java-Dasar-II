/* Bolean & operator perbandingan
    Kita akan mempelajari tipe data baru yang disebut boolean.
    Nilai boolean hanya dapat berupa true atau false.
    Berhati-hatilah agar tidak menggunakan tanda kutip ganda untuk true dan false!
    Contoh : System.out.println(true);  | true  = 1
             System.out.println(False); | false = 0

    Anda juga dapat mencetak boolean. 
    Namun, Anda tidak bisa memasukkan true dan false dalam tanda kutip.
    Jadi berhati-hatilah! Saat operator perbandingan mengembalikan nilai boolean.
    Mereka juga akan dicetak sebagai true atau false.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(true);
        System.out.println(false);
    //--------------------------//
        boolean a = true;
        boolean b = false;
        System.out.println(a);
        System.out.println(b);
    //--------------------------//
        boolean bool  = 2 * 3 == 6; // == "Sama/sama dengan"
        boolean boole = 2 * 3 != 6; // != "Tidak Sama dengan"
        System.out.println(bool);
        System.out.println(boole);

    }
}
/*
    Operator perbandingan akan membandingkan dua nilai, dan mengembalikan true atau false.
    Contoh, x == y akan memeriksa apakah x dan y merujuk ke nilai yang sama.
    Hasilnya akan menjadi true jika iya, dan false jika tidak.
    Pastikan Anda tidak bingung dengan = (tetapkan) dan == (bandingkan).
*/