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
			field.setName(name.toLowerCase());
			field.setName(capitalize(name));
			field.setNAME(name.toUpperCase());
			field.setTypeName(type);
			fields.add(field);
		}
		this.fields = fields.toArray();
	}
	private Object[] fields;
	public Object[] getFields() {
		return fields;
	}
	public void setFields(Object[] fields) {
		this.fields = fields;
	}
	public String getPackage() {
		return _package;
	}
	public void setPackage(String _package) {
		this._package = _package;
	}
	public String getMODEL() {
		return MODEL;
	}
	public void setMODEL(String mODEL) {
		MODEL = mODEL;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	private String _package;
	private String MODEL = "";
	private String Model = "";
	private String model = "";
}
