public class JavaHelloWorld {
	public static void main (String[] arg){
		System.out.println("Привет Мир !!!");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
        int rez=first+second;
		System.out.println("REZ="+rez);
	}	
}