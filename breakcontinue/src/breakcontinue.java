public class breakcontinue {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  breaktest bt = new breaktest();
      //  bt.breaktest();
		continuetest ct = new continuetest();
		ct.continuetest();
	}

}
class breaktest{
	public void breaktest(){
    out:	for(int i = 0; i < 10; i++){
        	    System.out.println("i��ѭ����"+i+"��");
    in:    	    for(int j = 0; j<10; j++){
        		    System.out.println("j��ѭ����"+j+"��");
        		    if(j == 5){
        		    	break out;
        		    }
        	     }
            }
	}
}
class continuetest{
	public void continuetest(){
    out:	for(int i = 0; i < 10; i++){
        	    System.out.println("i��ѭ����"+i+"��");
    in:    	    for(int j = 0; j<10; j++){
        		    System.out.println("j��ѭ����"+j+"��");
               	    if(j == 5){
        		    	continue out;
        		    }
        	     }
            }
	}
}
