/* ~ Arrray dan Loop ~

    Dengan menggunakan loop for dan mengatur kondisi loop ke i < 3.
    Anda dapat dengan mudah mendapatkan nilai dari setiap element dan mencetaknya.
    Perhatikan bahwa 3 adalah jumlah element di array.
*/
public class Main {
    public static void main(String[] args) {
        
        String [] nama = {"DTS", "PROGATE", "DICODING", "DQLab"};
        for (int i = 0; i < 3; i++){ 
          //(int i = 0; i < nama.length; i++){
            System.out.println("Belajar yuk di " + nama[i]);
        }

        System.out.println("Panjang Array " + nama.length);
    }
}
/* ~ Panjang Array ~
    
    Array memiliki method yang disebut length, yang menghitung jumlah element dalam sebuah array.
    Dengan menggunakan length, Anda dapat mengganti i < 3 (kondisi loop for dari slide sebelumnya) dengan i < nama.length
    Dengan cara ini Anda tidak perlu menghitung sendiri jumlah element.
*/