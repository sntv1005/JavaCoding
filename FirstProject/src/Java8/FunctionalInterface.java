package Java8;

public class FunctionalInterface {
    /* An Interface that contains only one abstract method is known as functional interface. 
    It can have any number of default and static methods.
     It can also declare methods of object class.
    Functional interfaces are also known as Single Abstract Method Interfaces (SAM Interfaces). */

    public static void main(String[] args) {  
        // Using the Converter functional interface with a lambda expression  
        Converter<String, Integer> stringToInteger = Integer::valueOf;  
        // Applying the converter to convert a string to an integer  
        int convertedValue = stringToInteger.convert("123");  
        System.out.println("Converted Value: " + convertedValue);  
        // Another example, converting case of a string  
        Converter<String, String> upperCaseConverter = String::toUpperCase;  
        String convertedString = upperCaseConverter.convert("java");  
        System.out.println("Converted String: " + convertedString);  
    }  
}


@FunctionalInterface  
interface Converter<F, T> {  
    T convert(F from);  
}  