class Solution {

    public String encode(List<String> strs) {
        List<Integer> lengths = new ArrayList<>();
        StringBuilder sblen = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int i=0;
        if(strs.size() == 0){
            return "";
        }
        for (String str : strs){
            lengths.add(str.length());
            sb.append(str);
            if(i==0){
                sblen.append(str.length());
            }else {
                sblen.append(",").append(str.length());
            }
            
            i++;
        }
        sblen.append("#");
        String response = sblen.toString()+sb.toString();
        System.out.println("encoded - "+response);
        return response;
        
    }

    public List<String> decode(String str) {
        List<String> response = new ArrayList<>();
        if(str == null || str.length() ==0 ){
            return response;
        }
        Pattern pattern = Pattern.compile("^(.*?)#(.*)$");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()){
            String lengths = matcher.group(1);
            String encoded = matcher.group(2);
            String[] lengthArr = lengths.split(",");
            int begin=0;
            int end=0;
            for(String lenStr:lengthArr){
                int length = Integer.valueOf(lenStr);
                end += length;
                String line = encoded.substring(begin, end);
                response.add(line);
                begin += length;
            }
        }
        return response;

    }
}
