class CipherSimple 
{  
    public static void main(String args[])
    {
        String msg = "This is а test";
        String encmsg = "";
        String decmsg = "";
        String key = "dfdsdjkf";
        int j = 0;
        
        System.out.print("Иcxoднoe сообщение: ");
        System.out.println(msg);
         
        for(int i=0; i < msg.length(); i++) {
         encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
         j++;
         if(j == 8) j = 0;
        }
        
        System.out.print("Зamифpoвaннoe сообщение: ");
        System.out.println(encmsg);
        
        j = 0;
        for(int i=0; i < msg.length(); i++) {
         decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
         j++;
         if(j == 8) j = 0;
        }
        
        System.out.print("Дeшифpoвaннoe сообщение: ");
        System.out.println(decmsg);
    }
}