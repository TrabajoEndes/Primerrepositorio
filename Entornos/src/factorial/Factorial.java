package factorial;

public class Factorial {

	
		// TODO Auto-generated method stub
		
		static int factorial (int num) {
			int contador=num; //1
			int res=0;
			
			//1,2,5
			//1,2,3,5
			//1,2,3,4
			
			if(num >= 0) { //2
				res=0;
				while(contador > 1 ) { //3
					res=res*contador; //4
					contador--;
				}
			}
			return res; //5
		}

		static int factorialRecursivo(int num) {
			int res;
			if(num ==0)
				return 1;
			else {
				res=num * factorialRecursivo(num-1);
				return res;
			}
		}
	}


