public class swap {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("The first number before swap is :"+a);
        System.out.println("The second number before swap is :"+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The first number after swap:"+a);
        System.out.println("The second number after swap:"+b);
    }
}
