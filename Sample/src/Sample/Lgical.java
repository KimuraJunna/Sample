package Sample;

public class Lgical {

    public static void main(String[] args) {
        int score = 59; //成績
        
        System.out.print("scoreが40以上、かつ50以下 ： ");
        System.out.println(score >= 40 && score <= 50);
        
        System.out.print("scoreが40以上、または50以下 ： ");
        System.out.println(score >= 40 || score <= 50 );
        
        System.out.print("scoreが60以上ではない ： ");
        System.out.println(!(score >= 60));
        
    }

}
