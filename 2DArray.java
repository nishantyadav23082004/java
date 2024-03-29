public class SuffixArrayMatch {

    public static List<Integer> findPatternOccurrences(String text, String pattern) {
        int[] suffixArray = constructSuffixArray(text); // Implement efficient suffix array construction
        int n = text.length();
        List<Integer> occurrences = new ArrayList<>();

        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            String midSuffix = text.substring(suffixArray[mid]);
            int cmp = pattern.compareTo(midSuffix);
            if (cmp < 0) {
                high = mid - 1;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                occurrences.add(suffixArray[mid]);
                int left = mid - 1;
                while (left >= 0 && text.substring(suffixArray[left]).startsWith(pattern)) {
                    occurrences.add(suffixArray[left]);
                    left--;
                }
                int right = mid + 1;
                while (right < n && text.substring(suffixArray[right]).startsWith(pattern)) {
                    occurrences.add(suffixArray[right]);
                    right++;
                }
                break;
            }
        }

        return occurrences;
    }

    // Implementation for constructing the suffix array omitted for brevity

    public static void main(String[] args) {
        String text = "banana";
        String pattern = "an";
        List<Integer> occurrences = findPatternOccurrences(text, pattern);
        System.out.println("Occurrences: " + occurrences);
    }
}
you have specific constraints or limitations, providing more details about your use case can help me suggest a more tailored approach.