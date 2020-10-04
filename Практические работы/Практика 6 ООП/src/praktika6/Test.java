package praktika6;

public class Test{
    public static void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        double opora = array[middle].GPA;

        int i = low, j = high;
        while (i <= j) {
            while (array[i].GPA < opora) {
                i++;
            }

            while (array[j].GPA > opora) {
                j--;
            }

            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Петров", "Михаил", 3.1);
        students[1] = new Student("Крюков", "Иван", 3.8);
        students[2] = new Student("Петров", "Григорий", 4.8);
        students[3] = new Student("Петров", "Алексей", 3.4);
        students[4] = new Student("Петров", "Дмитрий", 4.6);
        quickSort(students, 0, 4);
        for (int i = 0; i < 5; i++){
            System.out.println(students[i].toString());
        }
    }
}
