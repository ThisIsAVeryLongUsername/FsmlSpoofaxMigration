
	package de.sschauss.fsml;
	
	public class Sample {
		
		public static Fsm fsm;
		
		static {
			fsm = new Fsm();
			
			
			fsm.getStates().add(new State(true, "locked)");     
			fsm.getTransitions().add(new Transition("ticket", "collect", "unlocked"));
			fsm.getTransitions().add(new Transition("pass", "alarm", "exception"));
			
			fsm.getStates().add(new State(false, "juhu)");	      
			    				
		}
		
	} 
