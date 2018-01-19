Modified https://github.com/MetaBorgCube/metaborg-calc Spoofax 2.5.0 project

Requirements:
- Spoofax 2.5.0

Working
- Lanugage Definition (syntax/Calc.sdf3)
- Code Generation (trans\codegen\java.str, Spoofax > Transform > Generate Java Fsm)
- Name bindung *partial (trans\statics\calc.nabl2)

Todo
- Unique names (in states, transitions)
	- distinct/name D(s)/Var | error @NAMES ?   http://www.metaborg.org/en/latest/source/langdev/meta/lang/nabl2/reference.html#constraints
- Single initial state
- ...
- Remove stuff from calc project