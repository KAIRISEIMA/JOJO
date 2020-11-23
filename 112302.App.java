package pak;

public class Loo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    int a[][]={
    		{5,6},
    		{114,514},
    		{1919,810},
    		{7,0},
    };
    while(true){
    	Thread.sleep(1000);
        System.out.println("1秒过去了");
        int rdm = (int)(Math.random()*10%4);
        System.out.println(a[rdm][0]+","+a[rdm][1]);
    }
	}

}
