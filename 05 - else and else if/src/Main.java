/* ~ else and else if ~
    
    Dengan menggunakan statement else, Anda dapat menambahkan beberapa code yang ingin Anda jalankan ketika kondisi statement if adalah false. 
    Pikirkan else seperti permainan ketika Anda tidak memiliki gerakan lagi. 
    Lihat contoh di bawah ini untuk mempelajari sintaksnya. 
    Pastikan untuk memperhatikan posisi kurung kurawal { }.
*/
public class Main {
    public static void main(String[] args) {
       int x = 15;
       if(x <= 10){
            System.out.println("x Lebih kecil dari 10"); //false
       }else if (x > 10 ){
            System.out.println("x Lebih besar dari 10"); //true
       }else{
            System.out.println("x Lebih kecil atau sama dengan 10"); //false
       }
    }
}
