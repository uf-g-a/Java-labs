package practica2;

public class AuthorTest {
    public static void main(String[] args) {
        Author author = new Author("Анатолий Мирской",  'M');
        author.setEmail();
        char flag = author.getGender();
        System.out.println(flag);
        firstBlock:
        {
            if (flag != 'M' && flag != 'F' && flag != 'U') {
                System.out.println("Введено неправильное обозначение пола.");
                break firstBlock;
            } else {
                author.ToString();
            }
        }
    }
}
