public class ReturnTest{
    static void func(int n) {
        System.out.print(n);
        return;
    }
    public static void main(String args[]) {
        int n = 5;
        func(n);
    }
}