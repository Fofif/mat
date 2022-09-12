import java.util.Random;

public class Matrica {
    int [][] mas1;
    int dlina, hirina;
    int [][]mas2;
    public Matrica ( int dlina, int hirina){
        mas1 = new int[dlina][hirina];
        mas2 = new int[dlina][hirina];
        Random random = new Random();
        System.out.println("Матрица 1:");
        for (int i = 0; i < mas1.length; i++) {
            for (int j = 0; j < mas1[i].length; j++){
                mas1 [i][j]= random.nextInt(11);
                System.out.print(mas1[i][j] + " " );
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Матрица 2:");
        for ( int i = 0; i < mas2.length; i++){
            for ( int j = 0; j < mas2[i].length; j++){
                mas2 [i][j] = random.nextInt(11);
                System.out.print(mas2 [i][j] + " ");
            }
            System.out.println();
        }
        this.mas1 = mas1;
        this.mas2 = mas2;
        this.dlina = dlina;
        this.hirina = hirina;
    }
    void clogenie (int[][]mas1, int[][]mas2){
        int[][] mas3 = new int[dlina][hirina];
        System.out.println("Результат сложения матриц: ");
        for (int i = 0; i < mas3.length;i++){
            for ( int j = 0; j < mas3[i].length; j++){
                mas3[i][j] = mas1[i][j] + mas2[i][j];
                System.out.print(mas3[i][j]+ " ");
            }
            System.out.println();
        }

    }
    void ymnNaCh(int a, int[][] mas2){
        int[][] mas4 = new int[dlina][hirina];
        System.out.println("Результат умножения матрицы на число:");
        for (int i = 0; i < mas4.length; i++){
            for (int j= 0; j < mas4[i].length; j++){
                mas4[i][j] = a * mas2[i][j];
                System.out.print(mas4[i][j]+ " ");
            }
            System.out.println();
        }
    }
    void ymnNaMat (int [][]mas1, int [][] mas2){
         int[][] mas5 = new int [dlina][hirina];
         int l = 0;
         for (int i = 0; i < mas5.length; i++){
             for (int j = 0; j < mas5[i].length; j++){
                for (int k = 0;k < mas5.length; k++){
                    l = l + mas1[i][k] * mas2[k][j];
                }
                mas5[i][j] = l;
                l=0;
                System.out.print(mas5[i][j]+ " ");
             }
             System.out.println();
         }

    }
}
