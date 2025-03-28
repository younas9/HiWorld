public class IterateThroughArray {

    public static void main(String[] args) {

     double[] array = {4.5, 25.3, 12.1, 34.0, 15.5};

     for (int i = 0; i < array.length; i++) {
         double andenpotens = Math.pow(array[i], 2);
         System.out.println(andenpotens);

         System.out.println();
         double mindste = array[0];
         double stoerst = array[0];

         if (array[i] < mindste) mindste = array[i];
         if (array[i] > stoerst) stoerst = array[i];

         System.out.println(mindste);
         System.out.println(stoerst);

         System.out.println();

         boolean fundet = false;

         if (array[i] == 12.2) {
             fundet = true;
             System.out.println("Hurra! jeg fandt 12,1. Det stod på index " + i);
             break;
         }


     }


    }
}
