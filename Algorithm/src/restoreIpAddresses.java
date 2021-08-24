import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> addresses = new ArrayList<String>();
        doRestore(0,new StringBuilder(),addresses,s);
        return null;
    }

    private void doRestore(int i, StringBuilder stringBuilder, List<String> addresses, String s) {
        if(i == 4 || s.length() == 0){
            if(i == 4 && s.length() == 0)
                addresses.add(stringBuilder.toString());
            return;
        }
        
    }
}
