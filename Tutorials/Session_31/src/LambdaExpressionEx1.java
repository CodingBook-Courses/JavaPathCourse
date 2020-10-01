public class LambdaExpressionEx1 {
    public static void main(String[] args) {
        //Two lowercase two strings passed and then concatenate them
        //Take four strings argument, and then concatenate them with UPPERCASE
        //"Coding" "Book" "Coding" "Book" "CODINGBOOKCODINGBOOK"

//        String name =concatHere((one, two) -> one.toLowerCase() + two.toLowerCase(), "Coding", "Book");
//        System.out.println(name);

        String nameUpper = concatUpperHere((first, second, third, fourth) ->
                first.toUpperCase() + second.toUpperCase() + third.toUpperCase() + fourth.toUpperCase(),
                "Coding", "Book", "Coding", "book");
        System.out.println(nameUpper);
    }

    public static String concatHere(LowerCaseConcat lambda, String one, String two) {
        return lambda.concatLower(one, two);
    }

    public static String concatUpperHere(UpperCaseConcat lambda, String one, String two, String three, String four) {
        return lambda.concatUpper(one, two, three, four);
    }
}

interface LowerCaseConcat {
    String concatLower(String one, String two);
}

interface UpperCaseConcat {
    String concatUpper(String one, String two, String three, String four);
}