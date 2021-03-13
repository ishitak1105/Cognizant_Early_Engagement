import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^(?=(?:[^A-Z]*[A-Z]+[^A-Z]*))(?=(?:[^a-z]*[a-z]+[^a-z]*))(?=(?:[^@*#]*[@*#]+[^@*#]*))(?=(?:\\D*\\d+\\D*))[a-zA-Z\\d@*#]{8,}");

        System.out.println("Generate your Security Code");
        String code = scanner.nextLine();
        Matcher matcher = pattern.matcher(code);

        if (matcher.matches()) {
            System.out.println("Security Code Generated Successfully");
        } else {
            System.out.println("Invalid Security Code, Try Again!");
        }
    }
}
