//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String S;
            S = br.readLine();

            int target;
            target = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            ArrayList<String> res = obj.addOperators(S, target);
            Collections.sort(res);
            for (String s : res) System.out.print(s + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<String> addOperators(String S, int target)
    
    {
        ArrayList<String> result = new ArrayList<>();
        genExpression(S, target, 0, 0, 0,"",result);
        return result;
    }
    
    private static void genExpression(String num, int target, int index, long value, long prevOp, String exp, ArrayList<String> result){
        if (index == num.length())
        {
            if (value == target)
            {
                result.add(exp);
            }
            return;
        }
        long currOp = 0;
        for (int i = index; i < num.length(); i++)
        {
            if (i != index && num.charAt(index) == '0')
                break;
                
            currOp = currOp* 10 +(num.charAt(i) - '0');
            
            if(index == 0)
                genExpression(num, target, i+1, currOp,currOp, Long.toString(currOp), result);
            else
            {
                genExpression(num, target, i+1, value + currOp, currOp, exp + '+' + currOp, result);
                genExpression(num, target, i+1, value - currOp, -currOp, exp + '-' + currOp, result);
                genExpression(num, target, i+1, value - prevOp + prevOp * currOp, prevOp * currOp, exp + '*' + currOp, result);
            }    
        }
    }
}
