class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String>set=new HashSet<>();
        String[] freq={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuffer s=new StringBuffer();
        for(String i:words)
        {
            s=new StringBuffer();
            for(int j=0;j<i.length();j++)
            {
                s.append(freq[i.charAt(j)-97]);
            }
            set.add(String.valueOf(s));
        }
        return set.size();

    }
}