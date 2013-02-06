package com.paldaps.system.core.json;

import com.google.gson.ExclusionStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GjsonProvider {

  public  static Gson createGsonFromBuilder( ExclusionStrategy exs ){ 
	    GsonBuilder gsonbuilder = new GsonBuilder(); 
	    gsonbuilder.setExclusionStrategies(exs); 
	    return gsonbuilder.serializeNulls().create(); 
	} 

}
