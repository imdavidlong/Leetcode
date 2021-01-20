class Solution {
    public String[] reorderLogFiles(String[] logs) {
        ArrayList<String> let_group= new ArrayList<>();
        ArrayList<String> dig_group= new ArrayList<>();
        
        //To tell the let or dig
        for(String log:logs){
            if(log.split(" ")[1].charAt(0)<'a'){
            //log.split(" ")[1].charAt(0) < 'a'
                dig_group.add(log);
            }else{
                let_group.add(log);
            }
        }
        
        //reorder log_group,"l"
        
        Collections.sort(let_group, (l1,l2)->{
            String[] A = l1.split(" ");
            String[] B = l2.split(" ");
            
            for(int i =1 ; i<Math.min(A.length, B.length);i++){
                if(!A[i].equals(B[i])){
                    return A[i].compareTo(B[i]);
                }
            }
            //if all same, check the first one
            return A[0].compareTo(B[0]);
            
        });
        
        int count = 0;
        for(int i =0; i<let_group.size() ; i++){
            logs[i]=let_group.get(i);
            count++;
        }
        
        for(int i=0; i<dig_group.size(); i++){
            logs[count++]=dig_group.get(i);
            
        }
        
        
        return logs;
        
    }
        
    
}