package pr3.SortedQ;

public class SortedQ {
    public static void main(String[] args) {
        int[] array = arrayInit();
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nЯвляется строго возрастающей последовательностью: " + checkIfSubsequence(array));
    }

    public static boolean checkIfSubsequence(int[] arrayOfInteger){
        for (int i = 1; i < arrayOfInteger.length; i++){
            if (arrayOfInteger[i] <= arrayOfInteger[i-1]){
                return false;
            }
        }
        return true;
    }
    public static int[] arrayInit(){
        int[] arrayOfInteger = new int[4];
        for (int i =0; i<arrayOfInteger.length; i++){
            arrayOfInteger[i] = (int)(Math.random()*89+10+1);
        }

        return arrayOfInteger;
    }
}
