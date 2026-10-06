class Solution {
    public int minAddToMakeValid(String s) {
        int opening = 0;
        //opening : How many ( are currently available to match with )
        //How many unmatched ( do I currently have?
        int res = 0;
        //result : How many extra ( we need to add because we found a ) without a matching (
        //How many parentheses do I need to ADD because the string currently has a problem?
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                opening++;
            } else {
                if (opening == 0) {//We found ), but currently we don't have any unmatched (.
                    res++;//We need to add an opening bracket.
                } else {
                    opening--;//We have an available (, so use it to match this ).
                }
            }
        }
        return res + opening;
    }
}
