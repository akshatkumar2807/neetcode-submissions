class Solution {
    public boolean isAnagram(String s, String t) {
                    if (s.length() != t.length()){
                        return false;
                    }
                    char[]esort = s.toCharArray();
                    char[]tsort = t.toCharArray();
                    Arrays.sort(esort);
                    Arrays.sort(tsort);
                      return Arrays.equals(esort , tsort);

    }
}
