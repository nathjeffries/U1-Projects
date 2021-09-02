import javax.swing.*;
public class RPGCharacter {

    public static void main(String[] args) {
        String firstName, lastName;
        double strength, dexterity, resistance, speed, intelligence;
        double damage, armor, handling, stealth, overall;
        firstName = JOptionPane.showInputDialog("What is your first name?");
        lastName = JOptionPane.showInputDialog("What is your last name?");
     strength = Integer.parseInt(JOptionPane.showInputDialog("What is your strength rating, 0-99?"));
     dexterity = Integer.parseInt(JOptionPane.showInputDialog("What is your dexterity rating, 0-99?"));
     resistance = Integer.parseInt(JOptionPane.showInputDialog("What is your resistance rating, 0-99?"));
     speed = Integer.parseInt(JOptionPane.showInputDialog("What is your speed rating, 0-99?"));
     intelligence = Integer.parseInt(JOptionPane.showInputDialog("What is your intelligence rating, 0-99?"));

damage = (strength * 0.7) + (speed * 0.2) + (intelligence * 0.1);
armor = (resistance * 0.7) + (strength * 0.2) + (intelligence * 0.1);
handling = (dexterity *0.6) + (speed * 0.2) + (intelligence * 0.2);
stealth = (speed * 0.7) + (intelligence * 0.3);
overall = (damage + armor + handling + stealth) / 4;

        JOptionPane.showMessageDialog(null, "Here is your damage rating: " + damage);
        JOptionPane.showMessageDialog(null, "Here is your armor rating: " + armor);
        JOptionPane.showMessageDialog(null, "Here is your handling rating: " + handling);
        JOptionPane.showMessageDialog(null, "Here is your stealth rating: " + stealth);
        JOptionPane.showMessageDialog(null, "Here is your overall rating: " + overall);

        System.exit(0);

    }




    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
}
