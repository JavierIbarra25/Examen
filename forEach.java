public class forEach {
    public static void main(String[] args) {
        String names[] = {"John", "Jane", "Mary", "Mark", "Chris"};
        
        for (String name : names) {
            System.out.println(name);
        }

        for (int i = 0; i < names.length; i--) {
            System.out.println(names[i]);
        }
    }
}
