import java.util.Scanner;

class QuarRoot {
    public static double quadDisc(float a, float b, float c) {
        double discriminant = (Math.pow(b,2)) - (4 * a * c);
        return discriminant;
    }

    public static double quadRootPos(float a, float b, float c) {
        double rootPos = (-b + Math.sqrt(quadDisc(a, b, c))) / (2 * a);
        return rootPos;
    }

    public static double quadRootNeg(float a, float b, float c) {
        double rootNeg = (-b - Math.sqrt(quadDisc(a, b, c))) / (2 * a);
        return rootNeg;
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = inp.nextDouble();
        System.out.print("Enter b: ");
        b = inp.nextDouble();
        System.out.print("Enter c: ");
        c = inp.nextDouble();
        if (quadDisc((float) a, (float) b, (float) c) < 0) {
            System.out.println("No real roots exist.");
            return;
        }
        else if (quadDisc((float) a, (float) b, (float) c) == 0) {
            System.out.println("One real root exists.");
            System.out.printf("%.2f\n", quadRootPos((float) a, (float) b, (float) c));
        }
        else {
            System.out.println("Two real roots exist.");
            double quadRootPlus = quadRootPos((float) a, (float) b, (float) c);
            double quadRootMinus = quadRootNeg((float) a, (float) b, (float) c);
            System.out.printf("quadRootPos: %.2f\nquadRootNeg: %.2f\n", quadRootPlus, quadRootMinus);
        }
        inp.close();
    }
}