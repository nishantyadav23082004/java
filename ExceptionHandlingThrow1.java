class ExceptionHandlingDemo1{
	void check(){
		try{
			if(20>10){
				throw new Exception("use this throw to throw the exception by considering your situation/scenario");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args){
		new ExceptionHandlingDemo1().check();
	}
}
