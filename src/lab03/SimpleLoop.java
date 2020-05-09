package lab03;

public class SimpleLoop {

    public static void main(String[] args){

        int sum = 50;

        System.out.println("Prints out all Even Numbers from 0 and " + sum);

        for(int i=0; i <= sum; i++){

            //Number divisible by 2
            if ( i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
