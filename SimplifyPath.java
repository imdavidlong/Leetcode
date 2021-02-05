import java.io.*; 
import java.util.*; 

class SimplifyPath {
    public static void main(String [ ] args)
    {
        String path = "/a/./b/../../c/";
        //String path = "/home/";
        System.out.println(path);
        System.out.println(simplifyPath(path));
    }

    
class Solution {
    public String simplifyPath(String path) {
        if(path.equals(""))
            return "/";
        
        //use a String array to store by split "/"
        String[] newPath = path.split("/");
        if(newPath.length==0)
            return "/";
        
        
        //Deque<Integer> stack = new ArrayDeque<Integer>();
        Stack<String> s1 = new Stack<String>();
        Stack<String> s2 = new Stack<String>();
        // Deque<String> s1 = new ArrayDeque<String>();
        // Deque<String> s2 = new ArrayDeque<String>();
        
        //brute force to store a reverse order to a stack1
        for(int i=newPath.length-1; i>=0;i--){
            if(!(newPath[i].length()==0) && !newPath.equals("/")){
                s1.push(newPath[i]);
            }
        }
        
        //do work here
        while(!s1.empty()){
            String e = s1.pop();
            if(e.equals(".")){
                continue;
            }else if(e.equals("..")){
                //if any ele in s2,just pop
                if(!s2.empty())
                    s2.pop();
            }else{
                s2.push(e);
            }
        }
        
        //reverse stack s2 to s1
        while (!s2.empty()){
            s1.push(s2.pop());
        }
        
        String ans="/";
        //print s1 using .concat(s)
        while(!s1.empty()){
            ans=ans.concat(s1.pop());
            if(!s1.empty())
                ans=ans.concat("/");
        }
        
        return ans;
    }
}
}