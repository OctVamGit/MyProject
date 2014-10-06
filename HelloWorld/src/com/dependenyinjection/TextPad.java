package com.dependenyinjection;

public class TextPad {
	
	private SpellChecker spell;
	private String inject;
	
	TextPad(SpellChecker spell, String inject){
		this.spell = spell;
		this.inject =  inject;
	}
	
	public void init(){
		System.out.println("In Textpad init method");
	}

	public String getSpellMessage(){
		System.out.println(inject);
		return spell.getMessage();
		
	
	}
	
	public void destroy(){
		System.out.println("InTextPad destroy method");
	}
	
}
