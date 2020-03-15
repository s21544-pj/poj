/*
Summary:Kod cezara dla imienia
Author: Mariusz Krzyżopolski
*/
public class Main
{
	public static void main(String[] args) {
	        Cipher c = new Cipher("mariusz");
	        System.out.println(c.getName());
	        System.out.println(c.getCipherName());
	    } 

	}
class Cipher {
    private String name,ciphername="";
    public Cipher(String n){
        this.name = n;
        for (int i=0;i<name.length();i++){
	        int a=(int)name.charAt(i)+3;
	        if(a>(int)'z'){a=a-26;}
	        this.ciphername=ciphername+(char)a;
        }
    }
    public String getName(){
        return name;
    }
    public String getCipherName(){
        return ciphername;
    }
}