package Lesson_1;

public class Program {

    public static void main(String[] args){
        System.out.println(div(10,0));
    }
    
    public static int div(int a, int b){
    
        if (b == 0) {
            throw new RuntimeException("Нельзя делить на 0");        
        }
        return a / b;
    }
    
}
