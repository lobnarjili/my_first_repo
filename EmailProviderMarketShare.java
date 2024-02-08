public class EmailProviderMarketShare {

    public static void main(String[] args) {
        // Array of email addresses
        String[] emails = {
                "jpp@gmail.com", "tom@sfr.com", "fred@hotmail.com", "paul@sfr.com", "victor@aol.com",
                "jhon@outlook.com", "lise@yahoo.com", "mike@gmail.com", "steve@outlook.com", "jane@gmail.com"
        };

        // Extract provider names
        String[] providers = extractProviders(emails);

        // Remove duplicates
        providers = removeDuplicates(providers);

        // Calculate and print market share
        calculateAndPrintMarketShare(emails, providers);
    }

    // Extract provider names from email addresses
    private static String[] extractProviders(String[] emails) {
        String[] providers = new String[emails.length];

        for (int i = 0; i < emails.length; i++) {
            int atIndex = emails[i].lastIndexOf("@");
            providers[i] = emails[i].substring(atIndex + 1);
        }

        return providers;
    }

    // Remove duplicate provider names
    private static String[] removeDuplicates(String[] array) {
        // Use a HashSet to remove duplicates
        java.util.HashSet<String> set = new java.util.HashSet<>(java.util.Arrays.asList(array));

        // Convert the HashSet back to an array
        return set.toArray(new String[0]);
    }

    // Calculate and print market share
    private static void calculateAndPrintMarketShare(String[] emails, String[] providers) {
        for (String provider : providers) {
            int count = 0;

            for (String email : emails) {
                if (email.endsWith("@" + provider)) {
                    count++;
                }
            }

            double marketShare = ((double) count / emails.length) * 100;
            System.out.println( provider + ": " + marketShare + "%");
            System.out.println("");
        }
    }
}
