package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier exampleText = new PoemBeautifier();
        String normalText = "tekst z dodatkami";
        System.out.println(normalText + "\n");
        String beautifulText1 = exampleText.beautify(normalText, text -> "ABC " + normalText + " ABC");
        System.out.println(beautifulText1);
        String beautifulText2 = exampleText.beautify(normalText, text -> text.toUpperCase());
        System.out.println(beautifulText2);
        String beautifulText3 = exampleText.beautify(normalText, text -> text.toLowerCase());
        System.out.println(beautifulText3);
        String beautifulText4 = exampleText.beautify(normalText, text -> text.replace("t", "*"));
        System.out.println(beautifulText4);
        String beautifulText5 = exampleText.beautify(normalText, text -> text.replace(" ", "/"));
        System.out.println(beautifulText5);

    }
}
