package goldmansachs;

public class StringReverse {
    public static void main(String ar[])
    {
        System.out.println(reverseMe("SRINIVAS"));
        
        //Other way to reverse string        
        rev("hello");
    }
    
    static String reverseMe(String s){
    
    	StringBuffer sb=new StringBuffer();
        
    	for(int i=s.length()-1;i>=0;--i){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    
    
    static private void rev(String st) {
        
        String b="";
        for(int i=st.length()-1;i>=0;i--){
            b=b+st.charAt(i);
        }

        System.out.println("reverse:::"+b);
    }


}

