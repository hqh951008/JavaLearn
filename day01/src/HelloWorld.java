import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
        ArrayList list2 = new ArrayList();
        list2.add(1);
        list2.add(2);
        String s = new String();
        getFood();
    }

    public static void getFood(){
        String ss = new String();
        ss = "dddd";
        System.out.println(ss);
        int[] nums = new int[]{1,2,3};
//        int[] nums2 = new int[5];
      /*  String[] strs = new String[10];
        String[] abc = new String[10];*/
        Date date = new Date();
        Integer giu  = new Integer("123");
        try {
            try (FileInputStream fis = new FileInputStream("abc.txt")) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList list = new ArrayList();

    }
}
class Dog{
    String color;
    int age;
    public Dog() {
    }
    public Dog(String s){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        return color != null ? color.equals(dog.color) : dog.color == null;
    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
