package util;

import java.util.Stack;

public class XmlValidator {

    public boolean isValid(String xml) {

        Stack<String> stack = new Stack<>();

        boolean opening = false;
        boolean closing = false;
        String currentTag = "";

        for (char c : xml.toCharArray()) {

            if (c == '<') {

                if (opening == true) {
                    return false;
                }

                opening = true;

            } else if (c == '/') {

                if (closing == true) {
                    return false;
                }

                closing = true;

            } else if (c == '>') {

                if (!closing) {
                    stack.push(currentTag);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }

                    String lastTag = stack.pop();

                    if (!currentTag.equals(lastTag)) {
                        return false;
                    }
                }

                currentTag = "";
                opening = false;
                closing = false;
            } else {
                currentTag += c;
            }
        }

        return stack.isEmpty();
    }
}
