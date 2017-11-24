package edu.utdallas.pitextutils;

public final class PITExtUtils {
	
	public static long __pi1__(long f, long s) {
		return f;
	}
	
	public static long __pi2__(long f, long s) {
		return s;
	}
	
	public static double __pi1__(double f, double s) {
		return f;
	}
	
	public static double __pi2__(double f, double s) {
		return s;
	}
	
	public static int __failOnZero__(int x) {
		if(x != 0) {
			return x;
		}
		throw new RuntimeException("failed on zero!");
	}
	
	public static long __failOnZero__(long x) {
		if(x != 0) {
			return x;
		}
		throw new RuntimeException("failed on zero!");
	}
	
	public static float __failOnZero__(float x) {
		if(x != 0.F) {
			return x;
		}
		throw new RuntimeException("failed on zero!");
	}
	
	public static double __failOnZero__(double x) {
		if(x != 0.D) {
			return x;
		}
		throw new RuntimeException("failed on zero!");
	}
	
	public static int __bitwise_negation__(int x) {
		return ~x;
	}
	
	public static int __neutralize_bitwise_neg__(int x, int y) {
		if(x == -1) {
			return y;
		} else if(y == -1) {
			return x;
		} else {
			return x ^ y;
		}
	}

	public static int __increment__(int x) {
		return x + 1;
	}
	
	public static long __increment__(long x) {
		return x + 1;
	}
	
	public static float __increment__(float x) {
		return x + 1.F;
	}
	
	public static double __increment__(double x) {
		return x + 1.D;
	}
	
	public static int __decrement__(int x) {
		return x - 1;
	}
	
	public static long __decrement__(long x) {
		return x - 1;
	}
	
	public static float __decrement__(float x) {
		return x - 1.F;
	}
	
	public static double __decrement__(double x) {
		return x - 1.D;
	}
}
