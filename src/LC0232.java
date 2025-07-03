import java.util.Stack;

class LC0232 {
    Stack<Integer> first;
    Stack<Integer> second;

    public LC0232() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        if(first.empty()) {
            while(!second.empty()) {
                first.push(second.pop());
            }
        }
        first.push(x);
    }

    public int pop() {
        if(second.empty()) {
            while(!first.empty()) {
                second.push(first.pop());
            }
        }
        return second.pop();
    }

    public int peek() {
        if(second.empty()) {
            while(!first.empty()) {
                second.push(first.pop());
            }
        }
        return second.peek();
    }

    public boolean empty() {
        return first.empty() && second.empty();
    }
}
