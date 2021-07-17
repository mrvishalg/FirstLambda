package com.vishal.vishalLambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class VishalLambda implements RequestHandler<Object, Object> 
{
    

	@Override
	public Object handleRequest(Object arg0, Context arg1) {
		System.out.println("hello vishal ! Congrats on your frist java lambda execution !!");
		return null;
	}
}
