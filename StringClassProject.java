public class StringClassProject {
public static void main(String args[]){

    String Hello = "He ";
    System.out.println(Hello.trim()+ "llo" + " ,User");

    //Using charAt and indexOf
    System.out.println("Let me show you how to spell Jude and what they are in this index.");
    String str = "Let me show you how to spell Jude and what they are in this index.";
    char char1 = str.charAt(29);
    System.out.println("\n The letter " + char1 + " is in index " + str.indexOf('J'));
    char char2 = str.charAt(30);
    System.out.println("\n The letter " + char2 + " is in index " + str.indexOf('u',29));
    char char3 = str.charAt(31);
    System.out.println("\n The letter " + char3 + " is in index " + str.indexOf('d') );
    char char4 = str.charAt(32);
    System.out.println("\n The letter " + char4 + " is in index " +str.indexOf('e',31) );
    //Using last index of
    System.out.println("\n You will also find that the last index is J was " + str.lastIndexOf('J'));

    //Using concat and substring
    System.out.println("Now I will put my whole name together using concat");
    String FullName = "Jude";
    FullName = FullName.concat(" Stephen");
    FullName = FullName.concat(" Kallista-");
    FullName = FullName.concat("Fitzpatrick");
    System.out.println(FullName);
    System.out.println("Here is my first name: " + FullName.substring(0,4));
    System.out.println("Here is the rest of my name: " + FullName.substring(4));

    //Using equals
    System.out.print("\n Now I will demonstate the use of equals() by showing that my full name and my first name are not the same.");
    String FirstName = "Jude";
    boolean example;
    example = FullName.equals(FirstName);
    System.out.println("\n The answer is " + example);

    //Using equalsIgnoreCase, toUpperCase, toLowerCase, and replace
    System.out.println("\n Now I will compare a capitalised and non capitalised version of my name. It will still come out as true. ");
    String CapFirstName = "JUDE";
    boolean Cases;
    Cases = FirstName.equalsIgnoreCase(CapFirstName);
    System.out.println("\n The answer is " + Cases);
    System.out.println("Here is the capitalised version: " + FirstName.toUpperCase());
    System.out.println("Now here is the lower case version: " + FirstName.toLowerCase());
    String FirstNamePath = "Jude";
    System.out.println("Here is my name, but with no 'e' at the end: " + FirstNamePath.replace('e',' '));

    //Using valueOf
    Integer Age = Integer.valueOf(18);
    System.out.println("Here is my age using valueOf:" + Age);



}
}