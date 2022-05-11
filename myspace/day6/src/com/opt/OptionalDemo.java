package com.opt;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Optional<String> opt=Optional.of("pwc");
if(opt.isPresent())
{
	System.out.println("data aviable");
}else {
	opt.ifPresent(s->System.out.println(s.length()));
}
	}

}
