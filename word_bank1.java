package hangmangame;

import java.util.Random;

/**
 *
 * @author Julie Rodriguez
 * @author Timothy Reser
 */
public class word_bank1 extends javax.swing.JFrame {

    String randomWord;

    public word_bank1() {
        String words = "engineering:software:testing:compile:protected:private:"
                + "debug:inheritance:import:semicolon:char:boolean:integer:commenting:"
                + "statistic:coding:umldiagram:array:static:class:void:main:jframe:random:"
                + "generator:system:scanner:loops:statements:program:index:sorting:method:"
                + "private:slider:java:eclipse:netbeans:jgrasp";
        String[] wordsAsArray = words.split(":");

        int index = new Random().nextInt(wordsAsArray.length);

        this.randomWord = wordsAsArray[index];
        System.out.println(randomWord);//just for testing purposes with the random word generator//
    }//end constructor()

    /**
     * This constructor allows for a custom word bank to be provided and this
     * class's randomWord will be chosen from that array.
     *
     * @param wordBank is a array of words for use in picking a randomWord.
     */
    public word_bank1(String[] wordBank) {
        int index = new Random().nextInt(wordBank.length);
        this.randomWord = wordBank[index];
        System.out.println(randomWord);//just for testing purposes with the random word generator//

    }//end constructor(String[])

    public String getWord() {
        return this.randomWord;
    }//end getWord()
}//end class
