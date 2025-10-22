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
        int substring_occurences = 0;
        int current_index = 0;
        if (guess.length() > secret.length()) {
            return 0;
        }
        /* convert to list*/
        char[] list = guess.toCharArray();
        char[] sec_list = secret.toCharArray();
        for (int i = current_index; i <= secret.length() ; i++) {
            if (guess.length() == 1) {
                if (list[i] == sec_list[i] && (i <= secret.length())) {
                    substring_occurences += 1;
                    current_index += 1;
                }
            }
            else if (guess.length() > 1) {
                if (list[i] == sec_list[i] && i <= secret.length()) {
                    current_index += 1;
                    for (int j = current_index; j <= guess.length() ; j++) {
                        if (list[j] == sec_list[j] && j <= secret.length()) {
                            j += 1;
                        }
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
