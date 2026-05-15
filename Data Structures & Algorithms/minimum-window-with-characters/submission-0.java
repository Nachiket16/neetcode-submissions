class Solution {
    public String minWindow(String s, String t) {
            if (s == null || t == null || s.length() < t.length()) {
        return "";
    }

    Map<Character, Integer> tMap = new HashMap<>();
    for (char c : t.toCharArray()) {
        tMap.put(c, tMap.getOrDefault(c, 0) + 1);
    }

    Map<Character, Integer> windowMap = new HashMap<>();

    int required = tMap.size(); // unique chars
    int formed = 0;

    int left = 0, right = 0;

    int minLen = Integer.MAX_VALUE;
    int start = 0;

    while (right < s.length()) {
        char c = s.charAt(right);
        windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

        if (tMap.containsKey(c) &&
            windowMap.get(c).intValue() == tMap.get(c).intValue()) {
            formed++;
        }

        // shrink window
        while (left <= right && formed == required) {
            if (right - left + 1 < minLen) {
                minLen = right - left + 1;
                start = left;
            }

            char leftChar = s.charAt(left);
            windowMap.put(leftChar, windowMap.get(leftChar) - 1);

            if (tMap.containsKey(leftChar) &&
                windowMap.get(leftChar) < tMap.get(leftChar)) {
                formed--;
            }

            left++;
        }

        right++;
    }

    return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

    }

}
