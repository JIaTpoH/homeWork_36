public class Triangle {
  private int side1;
  private int side2;
  private int side3;

  public Triangle(int a, int b, int c) {
    if (a <= 0 || b <= 0 || c <= 0) {
      System.out.println("Ошибка: длины сторон треугольника не могут быть отрицательными или равными нулю.");
    } else if (!checkSides(a, b, c)) {
      System.out.println("Ошибка: невозможно построить треугольник с заданными сторонами.");
    }
  }
}