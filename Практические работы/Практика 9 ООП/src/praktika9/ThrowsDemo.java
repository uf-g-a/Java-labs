package praktika9;

public class ThrowsDemo {
        public static void printMessage(String key) {
            try {
                String message = getDetails(key);
                System.out.println(message);
            }
            catch (NullPointerException E){
                System.out.println("null key in getDetails");
            }
        }

        public static String getDetails(String key) {
            if(key == null) {
                throw new NullPointerException();
            }
            return "data for" + key;
        }
        public static void main(String[] args){
            printMessage(null);
        }
}
