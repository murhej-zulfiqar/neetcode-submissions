class Solution {
    public boolean isPalindrome(String s) {

        
        String modifiedS = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0, j=modifiedS.length() -1;
        while(i<j){
            if(modifiedS.charAt(i) != modifiedS.charAt(j) )
                return false;
            j--;
            i++;
        }
        return true;
        
    }
}
