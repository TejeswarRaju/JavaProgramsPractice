

class Sample{
	static Sample Instance=new Sample();
	private Sample(){}
	public static Sample getInstance(){
		return Instance;
	}

}
public class Singleton {
	public static void main(String[] a){
	Sample s=Sample.getInstance();
	Sample s1=Sample.getInstance();
	if(s==s1){
		System.out.println("true");
	}else{
		System.out.println("false");
	}

}
}
