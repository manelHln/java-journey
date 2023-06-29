import java.util.Arrays;

public class FirstProgram {
    public static void main(String[] args) {
        String a = "2";
        String b = a + 3;
        char[] grades = new char[] {'A', 'B', 'C'};
        int[] ages = new int[5];
        String[][] fullNames = new String[3][];
        fullNames[0] = new String[]{"John", "Doe"};
        fullNames[1] = new String[]{"Jack", "The Ripper"};
        fullNames[2] = new String[]{"Elliot", "Anderson"};
        for(String[] fullName : fullNames){
            System.out.println(Arrays.toString(fullName));
        }
    }
}

class Person{
    String name;
    int age;
    String gender;
    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    boolean isAdult(){
        return this.age >= 18;
    }
}