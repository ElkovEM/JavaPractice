package practice4_1.Matrix;

public class tester {
    public static void main(String[] args) {
        Matrix mat1 = new Matrix(2,2);
        double[][] matrix = new double[2][2];
        Matrix mat2 = new Matrix(matrix);

        System.out.println("Matrix 2");
        mat2.fillRandom();
        mat2.print();
        System.out.println("Matrix 2 * 2");
        mat2.multiply(2);
        mat2.print();

        System.out.println("Matrix 1");
        mat1.fillRandom();
        mat1.print();
        System.out.println("Matrix 1 + Matrix 2");
        mat1.add(mat2);
        mat1.print();
    }
}
