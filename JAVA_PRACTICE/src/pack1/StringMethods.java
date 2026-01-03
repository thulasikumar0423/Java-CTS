package pack1;

public class StringMethods {
    public static void main(String [] args){
        // String methods
        String text = "  Java Programming  ";

        // Length
        System.out.println("Length: " + text.length());

        // Trimming
        System.out.println("Trimmed: '" + text.trim() + "'");

        // Case conversion
        System.out.println("Upper: " + text.toUpperCase());
        System.out.println("Lower: " + text.toLowerCase());

        // Substring
        System.out.println("Substring: " + text.substring(2, 6));

        // Character at index
        System.out.println("Char at 2: " + text.charAt(2));

        // Index of
        System.out.println("Index of 'a': " + text.indexOf('a'));
        System.out.println("Last index of 'a': " + text.lastIndexOf('a'));

        // Contains
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // Replace
        System.out.println("Replace: " + text.replace("Java", "Python"));

        // Split
        String csv = "apple,banana,orange";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Starts with / Ends with
        System.out.println("Starts with ' Java': " + text.startsWith(" Java"));
        System.out.println("Ends with 'ing ': " + text.endsWith("ing "));

        // Empty check
        String empty = "";
        System.out.println("Is empty: " + empty.isEmpty());
        System.out.println("Is blank: " + text.trim().isEmpty());

        // Concatenation
        String str1= "Hello";
        String concat = str1 + " " + "World";
        String concat2 = str1.concat(" World");
        System.out.println(concat);

        // String immutability
        String original = "Immutable";
        original.toUpperCase(); // Doesn't change original
        System.out.println(original); // Still "Immutable"

        String modified = original.toUpperCase(); // Need to assign
        System.out.println(modified); // "IMMUTABLE"
    }
}
