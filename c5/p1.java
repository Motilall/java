// to find the sum of any number of integer entered as command line arguments.
public class p1 {
    public static void main(String args[]){
        int x, sum = 0;
        for (int i = 0; i <args.length; i++){
            x = Integer.parseInt(args[i]);
            sum = sum+x;
        }
        System.out.println("sum: " + sum);
    }
}
