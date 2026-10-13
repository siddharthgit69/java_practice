class test{
    int num1;
    int num2;

    int sum(){
       int sum = num1 + num2;
       System.out.println("Sum = "+sum);
       return sum;
    }

    public static void main (String[] args){
        test s1 = new test();
        s1.num1 = 12;
        s1.num2 = 24;
        s1.sum();
    }
}