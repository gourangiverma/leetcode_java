import utils.charStack;

public class LC0020 {
    public boolean isValid(String s) {
        charStack brackets = new charStack();
        char c, d;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                brackets.push(c);
            } else {
                if(brackets.isEmpty()) return false;
                d = brackets.peek();
                if      (c == ']' && d == '[' ||
                        (c == '}' && d == '{') ||
                        (c == ')' && d == '(')) {
                    brackets.pop();
                } else return false;
            }
        }
        return brackets.isEmpty();
    }
}
