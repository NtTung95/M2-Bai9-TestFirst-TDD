public class TriangleClassifier {
    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0;
    }
    public static String TriangleClassifier(int a, int b, int c){
        if(isTriangle(a, b, c)){
            if (a == b && b == c){
                return "Tam giác đều";
            } else if (a == b || b == c || c == a){
                return "Tam giác cân";
            } else {
                return "Tam giác thường";
            }
        } else {
            return "Is not Triangle";
        }
    }
}
