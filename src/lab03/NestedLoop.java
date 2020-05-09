package lab03;

public class NestedLoop {
    public static void main(String[] args) {

        //Number of Rows
        int rows = 5;

        for (int i = rows; i >=1; --i){
            for (int j = 1; j <= i; ++j){
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        System.out.println();

        for (int i = 1; i <= rows; ++i){
            for (int j = 1; j <= i; ++j){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
