class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> addresses = new ArrayList<String>();
        doRestore(0,new StringBuilder(),addresses,s);
        return addresses;
    }

    private void doRestore(int k, StringBuilder stringBuilder, List<String> addresses, String s) {
        if(k == 4 || s.length() == 0){
            if(k == 4 && s.length() == 0)
                addresses.add(stringBuilder.toString());
            return;
        }
        for(int i = 0; i < s.length() && i <= 2; i++){
            if(i != 0 && s.charAt(0) == '0')
                break;
            String part = s.substring(0, i + 1);
            if(Integer.valueOf(part) <= 255){
                if(stringBuilder.length() != 0)
                    part = "." + part;
                stringBuilder.append(part);
                doRestore(k + 1, stringBuilder, addresses, s.substring(i + 1));
                stringBuilder.delete(stringBuilder.length() - part.length(), stringBuilder.length());
            }
        }
    }
}