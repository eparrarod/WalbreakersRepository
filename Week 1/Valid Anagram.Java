class Solution {
    public boolean isAnagram(String s, String t) {
       boolean result = true;
        if(s.length() != t.length()){
            result = false;
        }else{
            HashMap<Character, Integer> mapS = new HashMap();
            HashMap<Character, Integer> mapT = new HashMap();
            
            for(int i =0; i < s.length(); i++){
                char currentChar = s.charAt(i);
                if(mapS.containsKey(currentChar)){
                    int count = mapS.get(currentChar)+1;
                    mapS.remove(currentChar);
                    mapS.put(currentChar,count);
                }else{
                    mapS.put(currentChar,1);
                }
            } 
            
            for(int i =0; i < t.length(); i++){
                char currentChar = t.charAt(i);
                if(mapT.containsKey(currentChar)){
                    int count = mapT.get(currentChar)+1;
                    mapT.remove(currentChar);
                    mapT.put(currentChar,count);
                }else{
                    mapT.put(currentChar,1);
                }
            }
            
            for(Character c : mapS.keySet()){
                if(mapT.containsKey(c)){
                    if(mapS.get(c) != mapT.get(c)){
                        System.out.println(c + " doesnt match count " + mapS.get(c) +" != " + mapT.get(c) + " = " + (mapS.get(c) - mapT.get(c)));
                        result = false;
                        break;
                    }
                }else{
                    System.out.println(c + " doesnt exist in T");
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}