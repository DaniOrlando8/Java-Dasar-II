/* ~ Statement continue ~

    Tidak seperti statement break yang mengakhiri loop, statement continue melewati loop untuk iterasi tertentu. 
    Statement continue bisa digunakan dengan cara yang sama dengan loop for dan loop while.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++){
            if (i % 3 == 0){ // Menghiraukan sisah kode di loop jika angkanya habis dibagi 3.
                continue;
            }
            System.out.println(i);
        }
    }
}
