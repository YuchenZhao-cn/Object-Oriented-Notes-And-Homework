package edu.neu.csye6200.command;

public abstract class Command {
	
	protected StringBuffer doc = null;
	
	// Constructor
	public Command(StringBuffer doc) {
		this.doc = doc;
	}
	
	abstract public void execute();
	abstract public void undo();
	
}
