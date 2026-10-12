public class OperatorDemo {
    void add(int a,int b){
        int sum = a + b;
        System.out.println("Additiom: " + sum);
    }
    //Method with return
    int multiplay(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        // Arithmetic Promotion
        byte a = 40, b = 39;
        int result = a + b;
        System.out.println("Arithmetic Promotion Result: " + result);
        //OPerators
        int x = 50, y = 25;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        //Method Calling
        OperatorDemo obj = new OperatorDemo();
        obj.add(41 , 56);
        int product = obj.multiplay(76, 78 );
        System.out.println("Multiplication: " + product);
    }
}
