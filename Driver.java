public class Driver{
    public static void main (String [] args){
        HashSet test = new HashSet();
        test.insert(18);
        test.insert(112);
        System.out.println(test.toString());
        System.out.println(test.contains(18));
        System.out.println(test.contains(119));
        System.out.println(test.remove(18));
        System.out.println(test.toString());
        test.insert(12);
        test.insert(1112);
        System.out.println(test.remove(12));
        System.out.println(test.toString());
    }
}
