class Main { 
	public static void main(String[] args) {
        byte v_byte = 120;
        short v_short = 129;
        char v_char = 'a';
        int v_int = 65999;
        long v_long = 429496729;  // was too large
        float v_float = 0.33333334F;
        double v_double = 0.3333333333333333;
        boolean v_boolean = true;
        
	System.out.println("This is a byte: "+v_byte);
        System.out.println("This is a short: "+v_short);
        System.out.println("This is a char: "+v_char);
        System.out.println("This is a int: "+v_int);
        System.out.println("This is a long: "+v_long);
        System.out.println("This is a v_float: "+v_float);
        System.out.println("This is a double: "+v_double);
        System.out.println("This is a boolean: "+v_boolean);
	}
}
