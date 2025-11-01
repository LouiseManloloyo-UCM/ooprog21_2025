public class characterinfo {
    public static void main(String[] args) {
char achar = 'c';

System.out.println("the character is " + achar);

if (Character.isUpperCase(achar))
System.out.println(achar + " is uppercase");
 else
System.out.println(achar + " is not uppercase");

if (Character.isLowerCase(achar))
System.out.println(achar + " is lowercase");
else
System.out.println(achar + " is not lowercase");

char lowerchar = Character.toLowerCase(achar);
System.out.println("after tolowercase(), achar is " + lowerchar);

char upperchar = Character.toUpperCase(lowerchar);
System.out.println("after touppercase(), achar is " + upperchar);
      
if (Character.isLetterOrDigit(achar))
System.out.println(achar + " is a letter or digit");
else
System.out.println(achar + " is not a letter or digit");

if (Character.isWhitespace(achar))
System.out.println(achar + " is whitespace");
else
System.out.println(achar + " is not whitespace");
}
}
