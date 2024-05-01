public class QuadraticEquationSolver {
    // Метод для вычисления корней квадратного уравнения
    public static double[] solve(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            // Два различных вещественных корня
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        } else if (discriminant == 0) {
            // Один вещественный корень (корень кратности 2)
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // Два комплексных корня
            return null;
        }
    }
}
