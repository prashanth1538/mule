package com.coca;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class PipelineToComma implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		
		
		String s=eventContext.getMessageAsString();
		s=s.replace("|", ",");
		return s;
	}

}
