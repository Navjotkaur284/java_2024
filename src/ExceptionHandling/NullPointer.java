package ExceptionHandling;

public class NullPointer {
    public static void main(String[] args) {

        String s = null;
        try {
            String s1 = s.toString();
            System.out.println(s);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(s);
    }
}

