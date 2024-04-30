public class PerfectSquare{
    public static int solve(int A) {
        for(int i=1;i<=A;i++){
            if(i*i==A){
                System.out.println("Value of I :: " + i);
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(solve(84630800));
    }
}