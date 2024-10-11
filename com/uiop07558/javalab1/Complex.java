package com.uiop07558.javalab1;

public class Complex {
  private double real;
  private double imaginary;

  public Complex(double real, double imaginary) {
      this.real = real;
      this.imaginary = imaginary;
  }

  public Complex add(Complex other) {
      return new Complex(this.real + other.real, this.imaginary + other.imaginary);
  }

  public Complex subtract(Complex other) {
      return new Complex(this.real - other.real, this.imaginary - other.imaginary);
  }

  public Complex multiply(Complex other) {
      double newReal = this.real * other.real - this.imaginary * other.imaginary;
      double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
      return new Complex(newReal, newImaginary);
  }

  public double getReal() {
      return real;
  }

  public double getImaginary() {
      return imaginary;
  }

  @Override
  public String toString() {
      return String.format("%f + %fi", real, imaginary);
  }
}
  