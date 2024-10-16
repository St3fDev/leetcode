class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();

        while (a > 0 || b > 0 || c > 0) {
            // Controlla gli ultimi due caratteri
            int n = sb.length();
            char last1 = n > 0 ? sb.charAt(n - 1) : ' ';
            char last2 = n > 1 ? sb.charAt(n - 2) : ' ';

            if (last1 == 'a' && last2 == 'a') {
                if (b > c && b > 0) {
                    sb.append('b');
                    b--;
                } else if (c > 0) {
                    sb.append('c');
                    c--;
                } else {
                    break; // Nessun carattere può essere aggiunto
                }
            } else if (last1 == 'b' && last2 == 'b') {
                if (a > c && a > 0) {
                    sb.append('a');
                    a--;
                } else if (c > 0) {
                    sb.append('c');
                    c--;
                } else {
                    break; // Nessun carattere può essere aggiunto
                }
            } else if (last1 == 'c' && last2 == 'c') {
                if (a > b && a > 0) {
                    sb.append('a');
                    a--;
                } else if (b > 0) {
                    sb.append('b');
                    b--;
                } else {
                    break; // Nessun carattere può essere aggiunto
                }
            } else {
                // Aggiungi il carattere con il conteggio maggiore
                if (a >= b && a >= c && a > 0) {
                    sb.append('a');
                    a--;
                } else if (b >= a && b >= c && b > 0) {
                    sb.append('b');
                    b--;
                } else if (c > 0) {
                    sb.append('c');
                    c--;
                }
            }
        }
        return sb.toString();
    }
}