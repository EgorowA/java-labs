class lab2 {
	public static void main (String[] args){
		
		//part 1
		double a = 1.27;
		double b = 10.99;
		double c = 2.73;
		double d = 25.32;
		
		double pow_1 = Math.pow(a, b);
		double sh_1 = Math.sinh(Math.abs(b));
		double ln_2 = Math.log10(c);
		double sqrt_2 = Math.pow(d, 0.25);
		
		double result = (pow_1/sh_1) + 4 * (ln_2/sqrt_2);
		System.out.println(result);
		
		//part 2
		double a1 = 0.478;
		double b1 = -1.26;
		double c1 = 2.68;
		double d1 = 18.24;
			
		double result1 = 9 * (Math.asin(a1)/Math.cos(Math.sqrt((Math.abs(b1)))) + Math.pow(2.43, d1) + Math.log10(c1));
		System.out.println(result1);
		
		//part 3
		double a2 = 1.478;
		double b2 = 9.26;
		double c2 = 0.68;
		double d2 = 2.24;
			
		double sin1 = Math.sin(Math.abs(2 * a2));
		double result2 = 6 * (Math.pow(sin1, Math.log10(b2))) + Math.sqrt(c2 * Math.cosh(-d2));
		System.out.println(result2);
	}
}