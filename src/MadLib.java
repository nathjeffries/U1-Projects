import javax.swing.*;
import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String timeOfDay, adj1, noun1, noun2, verbEndS1, verb1, noun3, noun4, verbEndS2, bodyParts, verbEndED, adj2, animal, verb2, verbEndING, noun5;
        System.out.println("Type a time of day, an adjective, a noun, a noun, a verb ending in S, a verb, a noun, a noun, a verb ending in S, a plural body part, a verb ending in ED, an adjective, an animal, a verb, a verb ending in ING, and a noun.");
        timeOfDay = read.nextLine();
        adj1 = read.next();
        noun1 = read.next();
        noun2 = read.next();
        verbEndS1 = read.next();
        verb1 = read.next();
        noun3 = read.next();
        noun4 = read.next();
        verbEndS2 = read.next();
        bodyParts = read.next();
        verbEndED = read.next();
        adj2 = read.next();
        animal = read.next();
        verb2 = read.next();
        verbEndING = read.next();
        noun5 = read.next();

        System.out.println("It's close to " + timeOfDay + " and something " + adj1 + "'s lurking in the " + noun1 + " Under the " + noun2 + " light you see a sight that almost " + verbEndS1 + " your heart. You try to " + verb1 + " but " + noun3 + " takes the " + noun4 + " before you make it. You start to freeze as horror " + verbEndS2 + " you right between the " + bodyParts + " You're " + verbEndED + " cause this is " + adj2 + ", " + adj2 + " And no one's gonna save you from the " + animal + " about to " +verb2 + ". You know it's " + adj2+ ", " + adj2 + " night You're " +verbEndING + " for your " + noun5 + " inside a killer, " + adj2 + " tonight.");





    }

}