package com.uiop07558.javalab1;

public class Matrix {
  private Complex[][] matrix;
  private int rows;
  private int cols;

  public Matrix(int rows, int cols) {
      this.rows = rows;
      this.cols = cols;
      matrix = new Complex[rows][cols];
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              matrix[i][j] = new Complex(0, 0);
          }
      }
  }

  public void setElement(int row, int col, Complex value) {
      matrix[row][col] = value;
  }

  public Complex getElement(int row, int col) {
      return matrix[row][col];
  }

  public Matrix add(Matrix other) {
      if (this.rows != other.rows || this.cols != other.cols) {
          throw new InvalidDimensionException("Different dimensions");
      }
      Matrix result = new Matrix(rows, cols);
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              result.setElement(i, j, matrix[i][j].add(other.getElement(i, j)));
          }
      }
      return result;
  }

  public Matrix subtract(Matrix other) {
      if (this.rows != other.rows || this.cols != other.cols) {
        throw new InvalidDimensionException("Different dimensions");
      }
      Matrix result = new Matrix(rows, cols);
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              result.setElement(i, j, matrix[i][j].subtract(other.getElement(i, j)));
          }
      }
      return result;
  }

  public Matrix multiply(Matrix other) {
      if (this.cols != other.rows) {
        throw new InvalidDimensionException("1st's cols are not equal to 2nd's rows");
      }
      Matrix result = new Matrix(this.rows, other.cols);
      for (int i = 0; i < this.rows; i++) {
          for (int j = 0; j < other.cols; j++) {
              Complex sum = new Complex(0, 0);
              for (int k = 0; k < this.cols; k++) {
                  sum = sum.add(this.matrix[i][k].multiply(other.getElement(k, j)));
              }
              result.setElement(i, j, sum);
          }
      }
      return result;
  }

  public Matrix transpose() {
      Matrix transposed = new Matrix(cols, rows);
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              transposed.setElement(j, i, matrix[i][j]);
          }
      }
      return transposed;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
              sb.append(matrix[i][j].toString()).append(" ");
          }
          sb.append("\n");
      }
      return sb.toString();
  }

}