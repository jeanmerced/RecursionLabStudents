package exercise1;

import helperStructures.Pair;
/**
 * 
 * @author Herbert Perez
 *
 */
public class fibTester {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.out.println("Testing Implementation A:");
		double a=System.nanoTime();
		System.out.println(" "+fibA(50)+"  ");
		double b=System.nanoTime();
		System.out.println("Time="+(b-a)+" ns");
		
		
		System.out.println("Testing Implementation B:");
		double c=System.nanoTime();
		System.out.println(" "+fibB(50)+"  ");
		double d=System.nanoTime();
		System.out.println("Time="+(d-c)+" ns");
	}
	public static long fibA(int n){
		if(n == 0 || n == 1)
			return 1;
		return fibA(n - 1) + fibA(n - 2);
	}
	public static Pair<Long> fibB(int n){
		if(n == 0 || n == 1)
			return new Pair<Long>(1l, 1l);
		Pair<Long> p = fibB(n - 1);
		return new Pair<Long>(p.getFirst() + p.second(), p.getFirst());
	}
}
