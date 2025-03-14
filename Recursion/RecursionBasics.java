
public class RecursionBasics {
public static void main(String[] args) {
    int n = 6;
    // DecreasingNo(n);

    System.out.println(Factorial(n));
    System.out.println(SumOfNatural(5));
}

public static void DecreasingNo(int n){
    if(n == 1){
System.out.print(n);
        return;
    }
    System.out.print(n+" ");
    DecreasingNo(n-1);
}




//Factorial of N

public static int Factorial(int n){
    if(n==0){
        return 1;
    }
    int fact = n * Factorial(n-1);
    return fact;
}


// Sum of N natural No

public static int SumOfNatural(int n){
    if(n==1){
        return 1;
    }

    int sum = n + SumOfNatural(n-1);
    return sum;
}

}


