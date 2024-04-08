package Sample;

public class ForSample {

    public static void main(String[] args) {
        for (var i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
        }
        for (int i = 2; i <= 100; i+=2) {
            if (i > 20) {
                break;
            }
            System.out.println(i);
        }
        
        var numbers = new int[] {1,2,3,4,5};
        
        for (var number : numbers) {
            System.out.println(number);
        }

    }

}
