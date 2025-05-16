package day5;

public class TextProcessor {
    public static void main(String[] args) {
//        countWords("I love ROUTE Academy.dahdavjdvsha.adhjahdiwdqw");
//        reverseString("Ahmed");
//
//          addSpace("ILoveRouteAcademyAndJava");
//        String s = "     Ahmed";
////         s.trim();
////        System.out.println(s);
////        System.out.println(s2);
//        s = "Mohamed";
//        System.out.println(s);

        String s1 = "Ahmed";
        String s2 = "Ahmed";
        String s3 = new String("Ahmed");
        String s4 = new String("Ahmed");
        System.out.println(s1==s2);   //true
        System.out.println(s1.equals(s2));   //true
        System.out.println(s1==s3);    //false
        System.out.println(s1.equals(s3));   //true
        System.out.println(s3==s4);



    }

    public static void countWords(String text){
        String[] words =text.split("\\.");   // . |  * + ? ^ $ ( ) {  } [ ]
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words",numberOfWords);
        System.out.println(message);
        for (int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
    public static void reverseString(String text){
        String reversedString = "";
        for(int i = text.length()-1;i>=0;i--){
            reversedString = reversedString+text.charAt(i);  //[i]
        }
        System.out.println(reversedString);
    }
    public static void addSpace(String text){
        StringBuilder modifiedText = new StringBuilder(text);
        for(int i=1;i<modifiedText.length();i++){
            if(Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);

    }
}
