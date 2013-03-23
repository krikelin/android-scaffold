package com.krikelin.android.scaffold;

import java.util.ArrayList;
import java.util.List;

public class Model {
	public String capitalize(String text) {
		return Character.toUpperCase(text.charAt(0)) + text.substring(1);
		
	}
	public Model(String[] args) {
		this._package = args[0];
		String model = args[1];
		this.model = args[2];
		this.Model = capitalize(model);
		this.MODEL = model.toUpperCase();
		this.model = model.toLowerCase();
		ArrayList<com.krikelin.android.scaffold.Field> fields = new ArrayList<com.krikelin.android.scaffold.Field>();
		
		for(int i = 3; i < args.length; i++) {
			String a = args[i];
			String name = a.split(":")[0];
			String type = a.split(":")[1];
			
			com.krikelin.android.scaffold.Field field = new com.krikelin.android.scaffold.Field();
			field.name = name.toLowerCase();
			field.Name = capitalize(name);
			field.NAME = name.toUpperCase();
			fields.add(field);
		}
		this.fields = fields.toArray();
	}
	public Object[] fields;
	public String _package;
	public String MODEL = "";
	public String Model = "";
	public String model = "";
}
