public class Problem_Twelve {
    public static void RemoveDuplicate(String str, int idx, StringBuilder newstr , boolean map[]) {
    if (idx == str.length()){
        System.out.println(newstr);
        return;
    }
    //Kaam
    char currChar = str.charAt(idx);
    if (map[currChar-'a'] == true) {
        // duplicate
        RemoveDuplicate(str, idx+1, newstr, map);
    }else {
        map[currChar-'a'] = true;
        RemoveDuplicate(str, idx+1, newstr.append(currChar), map);
    }
    }
    public static void main (String args []) {
        String str = "appnnacollege";
        RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
