class StringOb{
    String str;
    
    StringOb(String s) {
        str = s;
    }
    
    void strOb(int idx) {
        if(idx != str.length()-1) strOb(idx+1);
        
        System.out.print(str.charAt(idx));
    }
}
    
class StringObDemo {
    public static void main(String args[]) { 
        StringOb ob = new StringOb("abcd");
        
        ob.strOb(0);
    }
}