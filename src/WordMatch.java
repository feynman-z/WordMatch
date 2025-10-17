public class WordMatch {
    private String secret;


    /**
     * Constructs a WordMatch object with the given secret string of lowercase
     * letters.
     */
    public WordMatch(String word) {
        /* implementation not shown */
    }


    /**
     * Returns a score for guess, as described in part (a).
     * Precondition: 0 < guess.length() <= secret.length()
     */
    public int scoreGuess(String guess) {
        substring_occurences = 0;
        /* convert to list*/
        char[] list = guess.toCharArray();
        char[] sec_list = secret.toCharArray();
        for (int i = 0; i < 9999; i++){
            if (list[i] == sec_list[0]) {
                for (int j =1; j < list.size(); j++) {
                    if (list[j] == sec_list[i + 1] ){
                        System.out.println("YAY");


                    }
                }



            }
        }
        return substring_occurences;
    }


    /**
     * Returns the better of two guesses, as determined by scoreGuess and the rules
     * for a
     * tie-breaker that are described in part (b).
     * Precondition: guess1 and guess2 contain all lowercase letters.
     * guess1 is not the same as guess2.
     */
    public String findBetterGuess(String guess1, String guess2) {
        return null;
    }
}
