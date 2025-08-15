class BetaA{
	int x,y;
	
	BetaA(int x,int y){
		this.x = x;
		this.y = y;
	}
	BetaA(){
		x=10;
		y=10;
	}
}

class BetaB extends BetaA{
	int p,q;
	BetaB(int p,int q) {
		this.p = p;
		this.q = q;
	}
	BetaB(){
		p = 999;
		q = 888;
	}
	BetaB(int x,int y, int p ,int q){
		super(x,y);
		this.p = p;
		this.q = q;
	}
}


public class ConstructorChainingProg {

	public static void main(String[] args) {
	  BetaB obj	= new BetaB(100,200,300,400);
	  System.out.println(obj.x);
	  System.out.println(obj.y);
	  System.out.println(obj.p);
	  System.out.println(obj.q);

	}

}
