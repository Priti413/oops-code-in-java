public class StringMathDemo
 {
    public static void main(String[]args)
    {
        String str1="Hello\n";
        String str2="World";
        
        String str3=str1.concat(" " + str2);

        System.out.println("Concatentation:" +str3);
        System.out.println("Length of str1:" +str1.length());
        System.out.println("Chracter at index 1:" +str1.charAt(1));
        System.out.println("Substrating of str2(0-3):" + str2.substring(0,3));
        System.out.println("Equals str 1 nd str2: "+ str1.equals(str2) );
        System.out.println("Uppercase str1:" +str1.toUpperCase());
        System.out.println("LowerCase str1:" +str1.toLowerCase());



        double a=16.0;
        double b=3.7;

        System.out.println("Square Root of a:" +Math.sqrt(a));
        System.out.println("A raised to b:" +Math.pow(a,b));
        System.out.println("Max of a and b:" +Math.max(a,b));
        System.out.println("min of a and b:"+ Math.min(a,b));
        System.out.println("Random numbers 0 to 1(0-1)"+Math.random());
        System.out.println("Random number (10 to 20):"+(20+Math.random() * (30- 20)));
        System.out.println("Random number (1-100):"+(1+Math.random() * (100- 1)));
        System.out.println("Ceil of b:" +Math.ceil(b));
        System.out.println("floor of b:" +Math.floor(b));
        System.out.println("round of b:" +Math.round(b));



    }
}
