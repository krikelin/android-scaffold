package com.krikelin.android.scaffold;

import java.io.Console;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

import org.xml.sax.HandlerBase;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Jackson2Helper;
import com.github.jknack.handlebars.Options;
import com.github.jknack.handlebars.TemplateLoader;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;

public class AndroidScaffold {
	

	public static String[] types = {"String", "Integer", "Date"};
	public static ArrayList<String> Types = new ArrayList<String>();
	static {
		for(int i = 0; i < types.length; i++)
			Types.add(types[i]);
	}
	public static String capitalize(String text) {
		return Character.toUpperCase(text.charAt(0)) + text.substring(1);
		
	}
	public static void main(String[] args) {
		TemplateLoader loader = new ClassPathTemplateLoader();
		Model model = new Model(args);
		
		// Create 
		try {
			TemplateLoader tl = new  ClassPathTemplateLoader();
			
			tl.setPrefix("/com/krikelin/android/scaffold");
			tl.setSuffix(".hbs");
		
			Handlebars handleBars = new Handlebars(tl);
			handleBars.registerHelper("ifCond", new Helper<Boolean>() {

				@Override
				public CharSequence apply(Boolean val, Options options)
						throws IOException {
					String left = options.fn.apply(this);
					String right = options.inverse.apply(this);
					
					// TODO Auto-generated method stub
					return null;
				}
				
			});
			String modelJava = handleBars.compile(URI.create("Model.java")).apply(model);
			System.out.println(modelJava);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
}
