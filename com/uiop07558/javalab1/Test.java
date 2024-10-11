package com.uiop07558.javalab1;

class Test {
  public static void main(String[] args) {
      Matrix matrix1 = new Matrix(2, 2);
      matrix1.setElement(0, 0, new Complex(1, 1));
      matrix1.setElement(0, 1, new Complex(2, 2));
      matrix1.setElement(1, 0, new Complex(3, 3));
      matrix1.setElement(1, 1, new Complex(4, 4));

      Matrix matrix2 = new Matrix(2, 2);
      matrix2.setElement(0, 0, new Complex(5, 5));
      matrix2.setElement(0, 1, new Complex(6, 6));
      matrix2.setElement(1, 0, new Complex(7, 7));
      matrix2.setElement(1, 1, new Complex(8, 8));

      System.out.println("Matrix 1:");
      System.out.println(matrix1);

      System.out.println("Matrix 2:");
      System.out.println(matrix2);

      System.out.println("Matrix 1 + Matrix 2:");
      System.out.println(matrix1.add(matrix2));

      System.out.println("Matrix 1 - Matrix 2:");
      System.out.println(matrix1.subtract(matrix2));

      System.out.println("Matrix 1 * Matrix 2:");
      System.out.println(matrix1.multiply(matrix2));

      System.out.println("Transpose of Matrix 1:");
      System.out.println(matrix1.transpose());
  }
}
