Requirements:
- Spoofax 2.5.0

Working
- Language Definition (syntax/Fsml.sdf3)
- Tests (test/TurnstileTest.spt) 
- Code Generation (trans/codegen/java.str, Spoofax > Transform > Generate Java Class)
- Graphviz Dot file generation (trans/codegen/java.str, Spoofax > Transform > Generate Graphviz Dot file)
- Outline showing states and transitions in when .fsm file is open. (trans/transform/outline.str, )
- Name binding  (trans/statics/fsml.nabl2)
  - Unique state names (in states, transitions)
  - Single initial state
  - get missing states
  - get unreachable states 


Info:
To show scope graph: When Turnstile opened, Spoofax > Analysis > Debug Project scope graph