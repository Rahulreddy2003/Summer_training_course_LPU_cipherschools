public class lec_19{
    static boolean isPrime1(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    static boolean isPrime2(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=100000;
        long start=System.currentTimeMillis();//note time before function call
        System.out.println(isPrime1(n));
        long end=System.currentTimeMillis();//note time after the function executed
        System.out.println("Time taken by isPrime1() : "+(end-start));//time taken by function1 to be executed

        start=System.currentTimeMillis();//note time before function call
        System.out.println(isPrime2(n));
        end=System.currentTimeMillis();//note time after the function executed
        System.out.println("Time taken by isPrime2() : "+(end-start));//time taken by function2 to be executed
    }
}
