public class Copy {
    public static void main(String [] args) {
        int orig = 42;
        Copy c = new Copy();
        int y = c.go(orig);
        System.out.println(orig +" " + y);
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}



