import java.util.Random;

public class word_bank1 extends javax.swing.JFrame {
 
public static void main(String[] args){
String words = "engineering:software:testing:compile:protected:private:"+
                       "debug:inheritance:import:semicolon:char:boolean:integer:commenting"+
                       "statistic:coding:umldiagram:array:static:class:void:main:jframe:random"+
                       "generator:system:scanner:loops:statements:program:index:sorting:method"+
                       "private:slider:java:eclipse:netbeans:jgrasp";
String[] wordsAsArray = words.split(":");

int index = new Random().nextInt(wordsAsArray.length);

String randomWord = wordsAsArray[index];
System.out.println( randomWord );//just for testing purposes with the random word generator//


}
}
