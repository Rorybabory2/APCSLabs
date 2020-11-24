
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mag
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    public String getResponse(String statement) {
        String response = "";
        if (findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
        }else if (findKeyword(statement, "mother") >= 0 ||
                  findKeyword(statement, "father") >= 0 ||
                  findKeyword(statement, "brother") >= 0 ||
                  findKeyword(statement, "sister") >= 0)
        {
            response = "Tell me more about your family.";
        }else {
            response = getRandomResponse();
        }
        return response;
    }
    private int findKeyword(String statement, String goal, int startPos) {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();
        int index = -1;
        
        index = phrase.indexOf(goal);
        while (index > -1) {
            
            boolean front = false;
            boolean back = false;
            if (index-1 >= 0) {
                if (phrase.charAt(index-1) == ' ') {
                  back = true;
                }
            }else {
                back = true;
            }
            if (index+goal.length() < phrase.length()) {
                if (phrase.charAt(index+goal.length()) == ' ') {
                  front = true;
                }
            }else {
                front = true;
            }
            
            if (front == true && back == true) {
                return index;
            }
           
            index = phrase.indexOf(goal, index + 1);
        }
        return -1;
    }
    private int findKeyword(String statement, String goal) {
        return findKeyword(statement, goal, 0);
    }
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int) (r*NUMBER_OF_RESPONSES);
        String response = "";
        if (whichResponse == 0)
        {
            response = "Tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmm";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        
        return response;
    }
    public static void main(String[] args) {
        // int rand = -1;
        // for (int i = 0; i < 10; i++) 
        // {
            // rand = (int)((Math.random()*46.0)+55.0);
            // System.out.print(rand);
            // if ( rand > 89) 
            // {
                // System.out.println("\tA");
            // }else if ( rand > 79) 
            // {
                // System.out.println("\tB");
            // }else if ( rand > 69) 
            // {
                // System.out.println("\tC");
            // }else if ( rand > 59) 
            // {
                // System.out.println("\tD");
            // }else
            // {
                // System.out.println("\tF");
            // }
        // }

    }

}

