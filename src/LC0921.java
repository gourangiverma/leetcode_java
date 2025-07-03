import utils.charStack;

public class LC0921 {
    public int minAddToMakeValid(String s) {
        charStack brackets = new charStack();
        int count = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(c == '(') brackets.push(c);
            else {
                if (brackets.isEmpty()) count++;
                else if (brackets.peek() == '(') brackets.pop();
                else count++;
            }
        }
        return count + brackets.pointer+1;
    }
}
