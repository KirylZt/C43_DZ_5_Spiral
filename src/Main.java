import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int s = 1;
        int [][] mass= new int[n][n];
        for (int i = 0; i < n; i++){
            mass[0][i]=s;
            s++;
        }
        for (int i = 1; i < n; i++){
            mass[i][n-1]=s;
            s++;
        }
        for (int i = 0; i<n-1; i++){
            mass[n-1][n-2-i] = s;
            s++;
        }
        for (int i = 0; i<n-2; i++){
            mass[n-2-i][0] = s;
            s++;
        }
        int a = 1;
        int b = 1;
        while (s < n*n){
            while (mass[a][b+1] == 0){
                mass[a][b] = s;
                b++;
                s++;
            }
            while (mass[a+1][b] == 0){
                mass[a][b] = s;
                a++;
                s++;
            }
            while (mass[a][b-1] == 0){
                mass[a][b] = s;
                b--;
                s++;
            }
            while (mass[a-1][b] == 0){
                mass[a][b] = s;
                a--;
                s++;
            }
        }
        for (int i = 0; i < mass.length; i++){
            for (int j = 0; j < mass[i].length; j++){
                if (mass[i][j] == 0) {
                    mass[i][j] = s;
                }
            }
            System.out.println(Arrays.toString(mass[i]));
        }
    }
}
