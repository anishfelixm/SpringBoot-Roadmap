public class WrapperClasses {
    public static void main(String[] args) {
        /*
         * Autoboxing - automatically converts primitive data to Wrapper class
         */
        Boolean a = true;
        Character b = '#';
        Integer c = 8;
        Double d = 3.14;

        /*
         * unboxing - reverse of autoboxing. Allows us to treat wrapper class data as primitive type
         */
        if (c == 8) {
            System.out.println(c);
        }
    }
}
