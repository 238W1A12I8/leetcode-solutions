class Solution {
    public String reverseWords(String s) {
        String reversed = Arrays.stream(s.split(" "))
    .map(word -> new StringBuilder(word).reverse())
    .collect(Collectors.joining(" "));
    return reversed;
    }
}