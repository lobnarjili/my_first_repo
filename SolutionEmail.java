import java.util.HashMap;
import java.util.Map;

public class SolutionEmail {

    public static void main(String[] args) {
        // Define an array of email addresses
        String[] emails = {
                "jpp@gmail.com", "tom@sfr.com", "fred@hotmail.com", "paul@sfr.com", "victor@aol.com",
                "jhon@outlook.com", "lise@yahoo.com", "mike@gmail.com", "steve@outlook.com", "jane@gmail.com"
        };

        // Define an array to store the provider names
        String[] providers = new String[emails.length];

        // Extract the provider name from each email address and add it to the providers array
        for (int i = 0; i < emails.length; i++) {
            int atIndex = emails[i].lastIndexOf("@");
            providers[i] = emails[i].substring(atIndex + 1);
        }

        // Remove duplicates from the providers array
        providers = removeDuplicates(providers);

        // Define a Map to store the count of each provider
        Map<String, Integer> providerCountMap = new HashMap<>();

        // Count the occurrences of each provider
        for (String provider : providers) {
            for (String email : emails) {
                if (email.endsWith("@" + provider)) {
                    providerCountMap.put(provider, providerCountMap.getOrDefault(provider, 0) + 1);
                }
            }
        }

        // Define an array to store the market share of each provider
        double[] marketShare = new double[providers.length];

        // Calculate the market share of each provider
        for (int i = 0; i < providers.length; i++) {
            marketShare[i] = ((double) providerCountMap.get(providers[i]) / emails.length) * 100;
        }

        // Print the market share of each provider
        for (int i = 0; i < providers.length; i++) {
            System.out.println("Market share of " + providers[i] + ": " + marketShare[i] + "%");
        }
    }

    // Remove duplicates from the array
    private static String[] removeDuplicates(String[] array) {
        Map<String, Boolean> seen = new HashMap<>();
        int newSize = 0;

        for (String element : array) {
            if (seen.put(element, Boolean.TRUE) == null) {
                newSize++;
            }
        }

        String[] result = new String[newSize];
        int i = 0;

        for (String element : array) {
            if (seen.put(element, Boolean.TRUE) == null) {
                result[i++] = element;
            }
        }

        return result;
    }
}



