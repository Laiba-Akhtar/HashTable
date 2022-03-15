public class Comparisionmain {
    public static void main(String[] args) {
        System.out.println("Quadrartic probing");
        QuadrarticProbing  h=new  QuadrarticProbing (10);
        h.put(22, 2);
        h.put(12, 2);
        h.put(32, 9);
        System.out.println("Showing results for 22 ");
         h.get(22);
         System.out.println("Showing results for 12");
         h.get(12);
         System.out.println("Showing results for 12");
         h.get(32);
         System.out.println("Linear probing");
         Linear  h1=new  Linear (10);
         h1.put(22, 2);
         h1.put(12, 2);
         h1.put(32, 9);
         System.out.println("Showing results for 22 ");
          h1.get(22);
          System.out.println("Showing results for 12");
          h1.get(12);
          System.out.println("Showing results for 12");
          h1.get(32);
    }
}
