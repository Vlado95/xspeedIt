package com.xspeedid.robot;

public class Fizzbuzz {
	
	private enum FizzBuzzer{


		FIZZBUZZ("fuzzBuzz"){
			@Override
			public String isMe(int number) {
				if(number%5==0 && number%3==0)
				return "fuzzBuzz";
			 return null;
			}
		},
		BUZZ("fuzz"){
			@Override
			public String isMe(int number) {
				if(number%3==0)
					return "fuzz";
				return null;
			}
		},
		FUZZ("buzz"){
			@Override
			public String isMe(int number) {
				if(number%5==0)
					return "buzz";
				return null;
			}
		};
		
	    String label;
		
		FizzBuzzer(String label){
			this.label= label;
		}
		public abstract String isMe(int number);
	};
	
	private static String res(final int number) {
		return FizzBuzzer.FIZZBUZZ.isMe(number);
		

	}
	
	public static void main(String[] args) {
		System.out.println(Fizzbuzz.res(15));
	}
}
