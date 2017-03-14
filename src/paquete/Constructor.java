package paquete;

public class Constructor {

	public static void main(String[] args) {
		
		D d1 = new D();
		System.out.println("_______________________\n");
		Dh d2 = new Dh();

	}

}

class B1{
	public B1(){
		System.out.println("Constructor-B1");
	}
}

class B2{
	public B2(){
		System.out.println("Constructor-B2");
	}
}

class D extends B1{
	public D(){
		System.out.println("Constructor-D");
	}
}

class H extends B2{
	public H(){
		System.out.println("Constructor-H");
	}
}

class Dh extends H{
	public Dh(){
		System.out.println("Constructor-Dh");
	}
}