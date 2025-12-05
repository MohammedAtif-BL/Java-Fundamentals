package datatypes;

public class LoopDemo {
    public static void main(String[] args) {
        //Enhanced for loop
        int[] arr = {10, 21, 30, 43, 50};
        System.out.println("For loop output:");
        for( int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                continue;
            }
            System.out.println(arr[i]);
        }
        System.out.println("Enhanced for loop output:");
        for (int num:arr){
            System.out.println(num);
        }

        System.out.println("Return statement output:");
        test();
    }

    static void test(){
        for ( int i= 1; i<=5; i++){
            if( i == 3) return;
            System.out.println(i);
        }

        System.out.println("End of the method");
    }
}
