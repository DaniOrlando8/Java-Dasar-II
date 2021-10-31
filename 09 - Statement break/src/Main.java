/* ~ Statement break ~

    Saat Anda ingin keluar dari loop secepatnya, Anda dapat menggunakan statement break. 
    Statement break biasanya digabungkan dengan statement if. 
    Mereka dapat digunakan dengan cara yang sama dengan loop while.
*/
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if (i > 5 ) { //Keluar dari loop ketika i menjadi 6.
                break;
            }
            System.out.println(i);
        }
    }
}
