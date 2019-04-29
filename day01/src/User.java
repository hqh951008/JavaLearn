public class User {
    public void run(){
        String[] s = new String[10];

        if (s == null) {
            System.out.println("s is null");
        }else{
            System.out.println(s);
        }
    }
}

class Test{
    public static void main(String[] args) {
        User u = new User();
        u.run();
    }
}