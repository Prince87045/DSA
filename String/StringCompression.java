/*String Compression
    input-"aaabbcccdd"
    output-"a3b2c3d2"
 */
public class StringCompression {
    public static String compression(String str){
        StringBuilder sb=new StringBuilder(" ");

        //loop
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                sb.append(ch+count.toString());
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(compression(str));        
    }
    
}
