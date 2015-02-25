package exemploTDD;

public class FizzBuzz {
	
	//para satistazer o caso de teste 1 : passo 01
	public int fizzBuzz(int i){
		return 1;
	}
	
	
	//para satistazer o caso de teste 2 : passo 02
	public int fizzBuzz2(int i){
		return 2;
	}
	
	//para satistazer o caso de teste 2 : passo3 
	public String fizzBuzz3(int i){
		//para satisfazer os teste 3 e 9 , i devera ser multiplo de 3
		if(i%3 == 0)
			return "fizz";
		return String.valueOf(i);
	}
		
	/*para satistazer o caso de teste 2 : passo4
	public String fizzBuzz4(int i){
		//para satisfazer os teste 3 e 9 , i devera ser multiplo de 3
		if(i%3==0 && i%5==0)
			return "vizzbuzz";
		if(i%3 == 0)
			return "fizz";
				
		if(i%5==0)
			return "buzz";
				
		return String.valueOf(i);
	}*/
	
	
	//refatorando o código 1.1
	public boolean multiploDe3(int i){
		return i%3 ==0;
	}
	
	public boolean multiploDe5(int i){
		return i%5 ==0;
	}
	
	//refatorando o código 1.2
	public String fizzBuzz4(int i){
		if(multiploDe3(i) && i%5==0)
			return "vizzbuzz";
		if(multiploDe3(i))
			return "fizz";
				
		if(multiploDe5(i))
			return "buzz";
				
		return String.valueOf(i);
	}
		
}
