import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    private static NextGreaterElement n ;
    private NextGreaterElement(){

    }

    public static NextGreaterElement getInstance(){
        if( n== null){
            synchronized (NextGreaterElement.class){
                if(n==null){
                    n = new NextGreaterElement();
                }
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,1,2,6,0};
        int[] ints = nextElement(arr);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] nextElement(int[] arr) {
        int n= arr.length;
        int[] newArr = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }

            newArr[i] = s.isEmpty()?-1: s.peek();
            s.push(newArr[i]);

        }
        return newArr;
    }
}
