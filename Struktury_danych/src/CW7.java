public class CW7 {
    public static void main(String[] args) {
        StackExample stackExample = new StackExample(10);

        stackExample.put(3);
        stackExample.put(4);
        stackExample.put(5);
        System.out.println(stackExample.size());
        System.out.println(stackExample.get());
        System.out.println(stackExample.size());
        stackExample.get();
        stackExample.get();
        System.out.println(stackExample.size());
        stackExample.get();
    }
}
