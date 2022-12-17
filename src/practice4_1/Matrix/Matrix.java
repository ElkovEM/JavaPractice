package practice4_1.Matrix;

/*
4. Создать класс Матрица. Класс должен иметь следующие поля: 1)
двумерный массив вещественных чисел; 2) количество строк и столбцов в
матрице. Класс должен иметь следующие методы: 1) сложение с другой
матрицей; 2) умножение на число; 3) вывод на печать; 4) умножение матриц -
по желанию.

 */

public class Matrix {
    private double[][] m;
    private int rowsQuantity;
    private int columnsQuantity;

    public Matrix(int rowsQuantity, int columnsQuantity) {
        m = new double[rowsQuantity][columnsQuantity];
        this.rowsQuantity = rowsQuantity;
        this.columnsQuantity = columnsQuantity;
    }

    public Matrix(double[][] matrix) {
        this.m = matrix;
        rowsQuantity = matrix.length;
        columnsQuantity = matrix[0].length;
    }

    public int getRowsQuantity() {
        return rowsQuantity;
    }

    public int getColumnsQuantity() {
        return columnsQuantity;
    }

    public void setElement(int row, int column, double value) {
        this.m[row][column] = value;
    }

    public void fillRandom() {
        for (int row = 0; row < rowsQuantity; row++) {
            for (int col = 0; col < columnsQuantity; col++) {
                this.setElement(row, col, Math.random());
            }
        }
    }
    public double getElement(int row, int column) {
        return m[row][column];
    }

    // Сложение с другой матрицей
    public void add(Matrix a) {
        if (rowsQuantity != a.getRowsQuantity() || columnsQuantity != a.getColumnsQuantity()) {
            return;
        }
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                double value = this.getElement(i, j) + a.getElement(i, j);
                this.setElement(i, j,  value);
            }
        }
    }

    // Умножение матрицы на число
    public void multiply(double a) {
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                double value = this.getElement(i, j) * a;
                this.setElement(i, j, value);
            }
        }
    }

    // Вывод матрицы
    public void print() {
        for (int i = 0; i < this.getRowsQuantity(); i++) {
            for (int j = 0; j < this.getColumnsQuantity(); j++) {
                System.out.print(this.getElement(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
