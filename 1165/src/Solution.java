class Solution {
    public int calculateTime(String keyboard, String word) {
        int dist = 0;
        int ind = 0;
        for(int i = 0; i < word.length(); i++){
            int curInd = keyboard.indexOf(word.charAt(i));
            dist += Math.abs(curInd - ind);
            ind = curInd;
        }
        return dist;
    }
}