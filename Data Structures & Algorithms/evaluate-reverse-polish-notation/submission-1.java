class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

            for(String str : tokens){
                if(str.equals("+") ||
                        str.equals("-") ||
                        str.equals("*") ||
                        str.equals("/")
                ){
                    int b = stack.pop();
                    int a = stack.pop();
                    int result = 0;

                    switch(str){
                        case "+":
                            result = a + b;
                            break;
                        case "-":
                            result = a - b;
                            break;
                        case "*":
                            result = a * b;
                            break;
                        case "/":
                            result = a / b;
                            break;
                    }
                    stack.push(result);

                }else{
                    stack.push(Integer.valueOf(str));
                }
            }
            return stack.pop();
    }
}
