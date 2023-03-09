public class Triangle {
  private int sideA;
  private int sideB;
  private int sideC;

  public Triangle(int a, int b, int c) {
    if (a <= 0 || b <= 0 || c <= 0) {
      System.out.println("Ошибка: длины сторон треугольника не могут быть отрицательными или равными нулю.");
    } else if (!checkSides(a, b, c)) {
      System.out.println("Ошибка: невозможно построить треугольник с заданными сторонами.");
    } else {
      sideA = a;
      sideB = b;
      sideC = c;
    }
  }

  public static boolean checkSides(int a, int b, int c) {
    return a + b > c && a + c > b && b + c > a;
  }
}