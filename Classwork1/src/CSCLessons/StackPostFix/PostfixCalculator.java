package CSCLessons.StackPostFix;

/**
 * Started by Zach Kohlberg
 *
 * Finished by Vishal Nigam
 *
 * Simple postfix calculator that evaluates expressions with integers
 * Can only input single-digit numbers
 */

public class PostfixCalculator
{
    //Test the postfix calculator!
    public static void main(String[] args)
    {
        /*
         * We're going to use a command line argument for our expression.
         * You can write your own test, but this one is very convenient
         * if you're running this from a terminal/command prompt.
         *
         * For example, to evaluate 1 2 3 + - and print the answer, run:
         *
         * java PostfixCalculator 123+-p
         */
        if (args.length > 0)
        {
            PostfixCalculator calc = new PostfixCalculator();
            for (int i = 0; i < args[0].length(); i++)
            {
                char c = args[0].charAt(i);
                if (c != ' ')
                {
                    calc.evaluate(c);
                }
            }
        }
        else
        {
            System.out.println("USAGE: java PostfixCalculator expression");
        }
    }

    private IntStack stack;

    public PostfixCalculator()
    {
        stack = new IntStack();
    }

    public void evaluate(char c)
    {
        if (c >= '0' && c <= '9') //Check if c is a digit
        {
            //Digits get pushed onto the stack
            stack.push(c - '0');
        }
        else {
            if (checkSize(c)) //Make sure we have enough operands on the stack
            {
                //Declare these here, we can't do this multiple times inside a switch
                int x, y, z;
                //Operators are evaluated here
                switch (c) {
                    case 'p': //print top number of stack
                        x = stack.peek();
                        System.out.println(x);
                        break;
                    case 'P': //print and remove top number of stack
                        x = stack.pop();
                        System.out.println(x);
                        break;
                    case '+':
                        x = stack.pop();
                        y = stack.pop();
                        //It's best to order these y, x, because that's the order
                        //they appear in the postfix expression. This matters with
                        //operators like - and /, where order makes a difference
                        stack.push(y + x);
                        break;
                    case '-':
                        x = stack.pop();
                        y = stack.pop();
                        stack.push(y - x);
                        break;
                    case '*':
                        x = stack.pop();
                        y = stack.pop();
                        stack.push(y * x);
                        break;
                    case '/':
                        x = stack.pop();
                        y = stack.pop();
                        stack.push(y / x);
                        break;
                    case '%':
                        x = stack.pop();
                        y = stack.pop();
                        stack.push(y % x);
                        break;
                    case 'd':
                        x = stack.pop();
                        y = stack.pop();
                        stack.push(y / x);
                        stack.push(y % x);
                        break;
                    case 'M':
                        x = stack.pop();
                        y = stack.pop();
                        if (x > y) {
                            stack.push(x);
                        } else stack.push(y);
                        break;
                    case 'm':
                        x = stack.pop();
                        y = stack.pop();
                        if (x > y) {
                            stack.push(y);
                        } else {
                            stack.push(x);
                        }
                        break;
                    case '~':
                        x = stack.pop();
                        stack.push(-1 * x);
                        break;
                    case 'w':
                        x = stack.pop();
                        y = stack.pop();
                        stack.push(x);
                        stack.push(y);
                        break;
                    case '^':
                        x = stack.pop();
                        y = stack.pop();
                        z = y;
                        for (int i = 1; i < x; i++) {
                            z = z * y;
                        }
                        stack.push(z);
                        break;
                    case 's':
                        x = stack.pop();
                        y = stack.pop();
                        z = stack.pop();
                        if (x > y) {
                            if (x > z) {
                                stack.push(x);
                                if (y > z) {
                                    stack.push(y);
                                    stack.push(z);
                                } else if (z > y) {
                                    stack.push(z);
                                    stack.push(y);
                                }
                            } else if (z > x) {
                                stack.push(z);
                                stack.push(x);
                                stack.push(y);
                            }
                        } else if (x < y) {
                            if (y > z) {
                                stack.push(y);
                                if (x > z) {
                                    stack.push(x);
                                    stack.push(z);
                                } else if (x < z) {
                                    stack.push(z);
                                    stack.push(x);
                                }
                            } else if (z > y) {
                                stack.push(z);
                                stack.push(y);
                                stack.push(x);
                            }
                        }
                        break;
                    case 'S':
                        x = stack.pop();
                        y = stack.pop();
                        z = stack.pop();
                        if (x < y) {
                            if (x < z) {
                                stack.push(x);
                                if (y < z) {
                                    stack.push(y);
                                    stack.push(z);
                                } else if (z < y) {
                                    stack.push(z);
                                    stack.push(y);
                                }
                            } else if (z < x) {
                                stack.push(z);
                                stack.push(x);
                                stack.push(y);
                            }
                        }
                        else if (x > y) {
                            if (y < z) {
                                stack.push(y);
                                if (x < z) {
                                    stack.push(x);
                                    stack.push(z);
                                } else if (x > z) {
                                    stack.push(z);
                                    stack.push(x);
                                }
                            }
                            else if (z < y) {
                                stack.push(z);
                                stack.push(y);
                                stack.push(x);
                            }
                        }
                        break;
                    //Add remaining operators here
                    default:
                        System.out.println("ERROR: Unknown operator " + c);
                }
            }
        }
    }

    //You don't have to change any of these methods, they're just for testing and error-checking

    //Allows answer to be checked by certain tests if necessary
    public int getResult()
    {
        return stack.peek();
    }

    //Guarantees that the stack is the right size for an operation
    public boolean checkSize(char op)
    {
        //Minimum number of operands for the operator
        int min = numOperands(op);

        if (stack.size() < min)
        {
            System.out.println("ERROR: Operation " + op
                    + " requires at least " + min + " numbers, stack only has "
                    + stack.size() + " numbers.");
            return false;
        }
        return true;
    }

    //Returns the number of operands for the operator
    public static int numOperands(char op)
    {
        switch (op)
        {
            case 'p':
            case 'P':
            case '~':
                return 1;
            case '+':
            case '-':
            case '*':
            case '/':
            case 'm':
            case 'M':
            case '%':
            case 'w':
            case 'd':
            case '^':
                return 2;
            case 'S':
            case 's':
                return 3;
            default:
                return 0;
        }
    }
}

