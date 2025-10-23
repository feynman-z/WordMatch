//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            WordMatch w = new WordMatch("mississippi");
            System.out.println(w.scoreGuess("i"));
            System.out.println(w.scoreGuess("iss"));
            System.out.println(w.scoreGuess("issipp"));
            System.out.println(w.scoreGuess("mississippi"));

            WordMatch game = new WordMatch("aaaabb");
            System.out.println(game.scoreGuess("a"));
            System.out.println(game.scoreGuess("aa"));
            System.out.println(game.scoreGuess("aaa"));
            System.out.println(game.scoreGuess("aabb"));
            System.out.println(game.scoreGuess("c"));

            WordMatch g = new WordMatch("concatenation");
            System.out.println(g.scoreGuess("ten"));
            System.out.println(g.scoreGuess("nation"));
            System.out.println(g.findBetterGuess("ten", "nation"));
            System.out.println(g.scoreGuess("con"));
            System.out.println(g.scoreGuess("cat"));
            System.out.println(g.findBetterGuess("con", "cat"));







            /* scoreGuess process:
            --- need variable index to be global so we can track which letter we are on everywhere
            1. Move to index n (starting at 0) of secret. Determine length of
            guess (and go to either 2.0 or 3.0)
            2.0 (If guess length is x=1) If the letters match AND the current letter does not have
            an index past the length of secret, add 1 to substring_occurences. move
            onto next letter. (Repeat 2.1 until this terminates)
            -----------------------------
            3.0 (If guess length is x>1) If the first letters match, then go to 3.1
            3.1 If the letters match AND the current letter does not have
            an index past the length of secret, then check the next respective letters of guess
            and secret. (Repeat 3.1 until the letters don't match anymore,
            in which case go back to #1-->3.0)



            guess: i
            mississippi -> no
            ississippi -> +1
            ssissippi -> no
            sissippi -> no
            issippi -> +1
            ssippi -> no
            sippi -> no
            ippi -> +1
            ppi -> no
            pi -> no

            i -> +1

            guess: iss
            mississippi -> no
            ississippi -> yes
                ssissippi -> yes
                sissippi -> yes
                issippi -> no (leave)
            issippi -> yes
                ssippi -> yes
                sippi -> yes
                ippi -> no (leave)
            ippi -> yes
                ppi -> no (leave)
            ppi -> no
            pi -> no
            i -> yes
                *if nothing is after then finish*


            *  */
        }
    }