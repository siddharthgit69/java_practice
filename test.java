import java.util.Scanner;

class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Digits: ");

        int sum = 1;
        int n = sc.nextInt();

        for(int i = 1 ; i  <= n ; i++){
            for(int j = 0 ; j  <= i ; j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }
}