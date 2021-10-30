/* ~ Operator Logika ~

    Operator logika digunakan untuk mengekspresikan hubungan seperti DAN, ATAU, dan BUKAN.
    
    (&&) Digunakan untuk mengekspresikan DAN, dan dapat digunakan untuk menggabungkan kondisi. 
    Contohnya, kondisi1 && kondisi2 akan mengembalikan true hanya jika kondisi1 dan kondisi2 adalah true. 
    Ini akan mengembalikan false jika salah satu kondisi1 atau kondisi2 adalah false.
    
    (||) Digunakan untuk ATAU, dan juga bisa digunakan untuk menggabungkan kondisi. 
    Misalnya, kondisi1 || kondisi2 akan mengembalikan true jika salah satu kondisi1 atau kondisi2 mengembalikan true.

    (!) Digunakan untuk BUKAN, dan dapat digunakan untuk meniadakan kondisi. 
    Misalnya, kondisi !(X >= 30) mengembalikan true jika x lebih kecil dari 30 dan false jika x lebih besar dari atau sama dengan 30.

*/
public class Main {
    public static void main(String[] args) {
        System.out.println(true  || true );
        System.out.println(false && false);
    //--------------------------------------//
        System.out.println(8 < 5 && 3 >= 2);
    //--------------------------------------//
        System.out.println(8 < 5 || 3 >= 2);
    //--------------------------------------//
        System.out.println(!(8 < 5));
    }
}
