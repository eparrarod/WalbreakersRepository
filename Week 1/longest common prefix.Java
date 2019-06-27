class Solution {
    public String longestCommonPrefix(String[] strs) {
        String lcp = "";
        
        if(strs.length > 0){
            String base = strs[0];
            for(int i = 1 ; i < strs.length ;i++){
                if(strs[i].length() < base.length()){
                    base = strs[i];
                }
            }
            String currentlcp = "";
            boolean done = false;
            for(int j = 0 ; j < base.length() ;j++){
                char c = base.charAt(j);
                currentlcp = currentlcp.concat(String.valueOf(c));
                for(int i = 0 ; i < strs.length ;i++){
                    if(strs[i].startsWith(currentlcp) == false){
                        currentlcp = "";
                        done = true;
                        break;
                    }
                }
                if(done){
                    break;
                }
                if(!currentlcp.equals("")){
                    if(currentlcp.length()>lcp.length()){
                        lcp = currentlcp;
                    }
                }
            }
        }
        return lcp;
    }
}