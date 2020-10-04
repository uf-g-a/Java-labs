package praktika5;

public class Program {
    public static void mainFunction(int number){
        int i;
        for(i = 2; i <= number; i++){
            if((number % i) == 0) {
                System.out.print(i + " ");
                break;
            }
        }
        if(number != 1) {
            mainFunction(number / i);
        }
    }

    public static void main(String[] args){
        mainFunction(56);
    }
}
