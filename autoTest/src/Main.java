public class Main {
    public static void main(String[] args) {
        System.out.println(isEvent(20));
        System.out.println(isPositive(-1));
        System.out.println(checkAccess(19));
        System.out.println(getGrade(90));
    }

    public  static boolean isEvent (int n){
        return (n % 2 == 0) ? true : false;
    }
    public  static boolean isPositive (int n){
        return (n >= 0) ? true : false;
    }

    public  static String checkAccess (int age){
        return (age > 18) ? "Allowed" : "Denied";
    }

    public  static String getGrade (int score) {
        if (score < 0 || score > 100) {
            return "Error";
        }
        if(score <= 20){
            return "E";
        } else if(score <= 40){
            return "D";
        }  else if(score <= 60){
            return "C";
        }  else if(score <= 80){
            return "B";
        } else {
            return "A";
        }
    }
}
