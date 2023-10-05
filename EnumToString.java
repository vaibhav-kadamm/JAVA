public class EnumToString {
    enum fruits{
         Orange,
         Apple,
         Pomogranate,
         Mango;
    }
    public static void main(String[] args) {
        System.out.println(fruits.Apple.toString());
        System.out.println(fruits.Mango.toString());
        System.out.println(fruits.Pomogranate.toString());
        System.out.println(fruits.Orange.toString());
    }
}
