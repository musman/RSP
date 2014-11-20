// $ANTLR 3.5-rc-2 /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g 2014-10-08 14:46:56

	package service.workflow.ast;
	import service.workflow.ast.ASTNode.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class rspParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMP", "AND", "ARGUMENT", "ARGUMENT_LIST", 
		"ARRAY_ACCESS", "ARRAY_DECL", "ASSIGNMENT", "ASSIGNMENT_LIST", "ASSIGNMENT_OP", 
		"ATTRIBUTE", "ATTRIBUTE_LIST", "BITWISE_EXCL_OR", "BITWISE_INCL_OR", "BLOCK", 
		"BOOL", "COMMA", "COMMENT", "CONST", "DECLARATION", "DIVISION", "DO_WHILE", 
		"ELSE", "EQUAL_OP", "EXPO_RATE", "EXPR_LIST", "FALSE", "FIELD_DECL", "FOR_LOOP", 
		"FUNCTION", "FUNC_LIST", "GT", "GT_EQUAL_OP", "GUARD", "HEX", "ID", "IF", 
		"IMPLY", "INIT", "INITIALISER", "INSTANTIATION", "INT", "INTEGER", "INVARIANT", 
		"ITERATION", "LEFT_SHIFT", "LOCATION", "LOCATION_LIST", "LOGIC_AND", "LOGIC_OR", 
		"LT", "LT_EQUAL_OP", "MAX", "META", "METHOD_REF", "MIN", "MINUS", "MULT", 
		"MULTI_FIELD_DECL", "NAME", "NEGATE", "NOT", "NOT_EQUAL_OP", "NULL", "OR", 
		"PARALLEL", "PARAM", "PARAM_LIST", "PLUS", "POST_DECREMENT", "POST_INCREMENT", 
		"PREFIX", "PREFIX_LIST", "PRE_DECREMENT", "PRE_INCREMENT", "PRIME", "QUALIFIED_ACCESS", 
		"RANGE", "RATE", "REMAINDER", "RETURN", "RIGHT_SHIFT", "SCALAR", "SELECT", 
		"SELECT_DECL", "SELECT_LIST", "START", "STMNT", "STMNT_LIST", "STRUCT", 
		"TEMPLATE_DEF", "TEMPLATE_REF", "TERNARY_OP", "TRUE", "TYPE", "TYPE_DEF", 
		"TYPE_DEF_LIST", "TYPE_REF", "VAR", "VAR_DECL", "VAR_DECL_LIST", "VAR_DEF", 
		"VAR_DEF_LIST", "VAR_LIST", "VAR_REF", "WHILE", "WS", "'%='", "'&='", 
		"'('", "')'", "'*='", "'++'", "'+='", "'--'", "'-='", "'.'", "'/='", "':'", 
		"';'", "'<<='", "'='", "'>>='", "'PARALLEL'", "'RETURN'", "'START'", "'^='", 
		"'do'", "'for'", "'parallel'", "'return'", "'start'", "'{'", "'|='", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int T__133=133;
	public static final int T__134=134;
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int T__137=137;
	public static final int AMP=4;
	public static final int AND=5;
	public static final int ARGUMENT=6;
	public static final int ARGUMENT_LIST=7;
	public static final int ARRAY_ACCESS=8;
	public static final int ARRAY_DECL=9;
	public static final int ASSIGNMENT=10;
	public static final int ASSIGNMENT_LIST=11;
	public static final int ASSIGNMENT_OP=12;
	public static final int ATTRIBUTE=13;
	public static final int ATTRIBUTE_LIST=14;
	public static final int BITWISE_EXCL_OR=15;
	public static final int BITWISE_INCL_OR=16;
	public static final int BLOCK=17;
	public static final int BOOL=18;
	public static final int COMMA=19;
	public static final int COMMENT=20;
	public static final int CONST=21;
	public static final int DECLARATION=22;
	public static final int DIVISION=23;
	public static final int DO_WHILE=24;
	public static final int ELSE=25;
	public static final int EQUAL_OP=26;
	public static final int EXPO_RATE=27;
	public static final int EXPR_LIST=28;
	public static final int FALSE=29;
	public static final int FIELD_DECL=30;
	public static final int FOR_LOOP=31;
	public static final int FUNCTION=32;
	public static final int FUNC_LIST=33;
	public static final int GT=34;
	public static final int GT_EQUAL_OP=35;
	public static final int GUARD=36;
	public static final int HEX=37;
	public static final int ID=38;
	public static final int IF=39;
	public static final int IMPLY=40;
	public static final int INIT=41;
	public static final int INITIALISER=42;
	public static final int INSTANTIATION=43;
	public static final int INT=44;
	public static final int INTEGER=45;
	public static final int INVARIANT=46;
	public static final int ITERATION=47;
	public static final int LEFT_SHIFT=48;
	public static final int LOCATION=49;
	public static final int LOCATION_LIST=50;
	public static final int LOGIC_AND=51;
	public static final int LOGIC_OR=52;
	public static final int LT=53;
	public static final int LT_EQUAL_OP=54;
	public static final int MAX=55;
	public static final int META=56;
	public static final int METHOD_REF=57;
	public static final int MIN=58;
	public static final int MINUS=59;
	public static final int MULT=60;
	public static final int MULTI_FIELD_DECL=61;
	public static final int NAME=62;
	public static final int NEGATE=63;
	public static final int NOT=64;
	public static final int NOT_EQUAL_OP=65;
	public static final int NULL=66;
	public static final int OR=67;
	public static final int PARALLEL=68;
	public static final int PARAM=69;
	public static final int PARAM_LIST=70;
	public static final int PLUS=71;
	public static final int POST_DECREMENT=72;
	public static final int POST_INCREMENT=73;
	public static final int PREFIX=74;
	public static final int PREFIX_LIST=75;
	public static final int PRE_DECREMENT=76;
	public static final int PRE_INCREMENT=77;
	public static final int PRIME=78;
	public static final int QUALIFIED_ACCESS=79;
	public static final int RANGE=80;
	public static final int RATE=81;
	public static final int REMAINDER=82;
	public static final int RETURN=83;
	public static final int RIGHT_SHIFT=84;
	public static final int SCALAR=85;
	public static final int SELECT=86;
	public static final int SELECT_DECL=87;
	public static final int SELECT_LIST=88;
	public static final int START=89;
	public static final int STMNT=90;
	public static final int STMNT_LIST=91;
	public static final int STRUCT=92;
	public static final int TEMPLATE_DEF=93;
	public static final int TEMPLATE_REF=94;
	public static final int TERNARY_OP=95;
	public static final int TRUE=96;
	public static final int TYPE=97;
	public static final int TYPE_DEF=98;
	public static final int TYPE_DEF_LIST=99;
	public static final int TYPE_REF=100;
	public static final int VAR=101;
	public static final int VAR_DECL=102;
	public static final int VAR_DECL_LIST=103;
	public static final int VAR_DEF=104;
	public static final int VAR_DEF_LIST=105;
	public static final int VAR_LIST=106;
	public static final int VAR_REF=107;
	public static final int WHILE=108;
	public static final int WS=109;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public rspParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public rspParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return rspParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g"; }


	public static class start_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "start"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:154:1: start : ( 'start' | 'START' ) ( parameters )? ( statement )+ -> ^( START ( parameters )? ^( STMNT_LIST ( statement )+ ) ) ;
	public final rspParser.start_return start() throws RecognitionException {
		rspParser.start_return retval = new rspParser.start_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token string_literal2=null;
		ParserRuleReturnScope parameters3 =null;
		ParserRuleReturnScope statement4 =null;

		Object string_literal1_tree=null;
		Object string_literal2_tree=null;
		RewriteRuleTokenStream stream_134=new RewriteRuleTokenStream(adaptor,"token 134");
		RewriteRuleTokenStream stream_128=new RewriteRuleTokenStream(adaptor,"token 128");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:2: ( ( 'start' | 'START' ) ( parameters )? ( statement )+ -> ^( START ( parameters )? ^( STMNT_LIST ( statement )+ ) ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:5: ( 'start' | 'START' ) ( parameters )? ( statement )+
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:5: ( 'start' | 'START' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==134) ) {
				alt1=1;
			}
			else if ( (LA1_0==128) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:6: 'start'
					{
					string_literal1=(Token)match(input,134,FOLLOW_134_in_start635); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_134.add(string_literal1);

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:14: 'START'
					{
					string_literal2=(Token)match(input,128,FOLLOW_128_in_start637); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_128.add(string_literal2);

					}
					break;

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:24: ( parameters )?
			int alt2=2;
			switch ( input.LA(1) ) {
				case ID:
					{
					int LA2_1 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case INT:
					{
					int LA2_2 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case TRUE:
					{
					int LA2_3 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case FALSE:
					{
					int LA2_4 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case NULL:
					{
					int LA2_5 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case 112:
					{
					int LA2_6 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case 115:
					{
					int LA2_7 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case 117:
					{
					int LA2_8 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case PLUS:
					{
					int LA2_9 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case MINUS:
					{
					int LA2_10 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case NEGATE:
					{
					int LA2_11 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case NOT:
					{
					int LA2_12 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case 131:
					{
					int LA2_13 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case WHILE:
					{
					int LA2_14 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case 130:
					{
					int LA2_15 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case IF:
					{
					int LA2_16 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case 132:
					{
					int LA2_17 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case 126:
					{
					int LA2_18 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case 133:
					{
					int LA2_19 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
				case 127:
					{
					int LA2_20 = input.LA(2);
					if ( (synpred2_rsp()) ) {
						alt2=1;
					}
					}
					break;
			}
			switch (alt2) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:24: parameters
					{
					pushFollow(FOLLOW_parameters_in_start641);
					parameters3=parameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameters.add(parameters3.getTree());
					}
					break;

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:37: ( statement )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==FALSE||(LA3_0 >= ID && LA3_0 <= IF)||LA3_0==INT||LA3_0==MINUS||(LA3_0 >= NEGATE && LA3_0 <= NOT)||LA3_0==NULL||LA3_0==PLUS||LA3_0==TRUE||LA3_0==WHILE||LA3_0==112||LA3_0==115||LA3_0==117||(LA3_0 >= 126 && LA3_0 <= 127)||(LA3_0 >= 130 && LA3_0 <= 133)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:37: statement
					{
					pushFollow(FOLLOW_statement_in_start645);
					statement4=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement4.getTree());
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			// AST REWRITE
			// elements: statement, parameters
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 155:48: -> ^( START ( parameters )? ^( STMNT_LIST ( statement )+ ) )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:51: ^( START ( parameters )? ^( STMNT_LIST ( statement )+ ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new Start(START), root_1);
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:66: ( parameters )?
				if ( stream_parameters.hasNext() ) {
					adaptor.addChild(root_1, stream_parameters.nextTree());
				}
				stream_parameters.reset();

				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:78: ^( STMNT_LIST ( statement )+ )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(new StmntList(STMNT_LIST), root_2);
				if ( !(stream_statement.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_2, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "start"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:163:1: block : ( '{' ( statement )* '}' -> ^( STMNT_LIST ( statement )* ) | statement -> ^( STMNT_LIST statement ) );
	public final rspParser.block_return block() throws RecognitionException {
		rspParser.block_return retval = new rspParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal5=null;
		Token char_literal7=null;
		ParserRuleReturnScope statement6 =null;
		ParserRuleReturnScope statement8 =null;

		Object char_literal5_tree=null;
		Object char_literal7_tree=null;
		RewriteRuleTokenStream stream_135=new RewriteRuleTokenStream(adaptor,"token 135");
		RewriteRuleTokenStream stream_137=new RewriteRuleTokenStream(adaptor,"token 137");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:164:2: ( '{' ( statement )* '}' -> ^( STMNT_LIST ( statement )* ) | statement -> ^( STMNT_LIST statement ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==135) ) {
				alt5=1;
			}
			else if ( (LA5_0==FALSE||(LA5_0 >= ID && LA5_0 <= IF)||LA5_0==INT||LA5_0==MINUS||(LA5_0 >= NEGATE && LA5_0 <= NOT)||LA5_0==NULL||LA5_0==PLUS||LA5_0==TRUE||LA5_0==WHILE||LA5_0==112||LA5_0==115||LA5_0==117||(LA5_0 >= 126 && LA5_0 <= 127)||(LA5_0 >= 130 && LA5_0 <= 133)) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:164:4: '{' ( statement )* '}'
					{
					char_literal5=(Token)match(input,135,FOLLOW_135_in_block681); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_135.add(char_literal5);

					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:164:8: ( statement )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==FALSE||(LA4_0 >= ID && LA4_0 <= IF)||LA4_0==INT||LA4_0==MINUS||(LA4_0 >= NEGATE && LA4_0 <= NOT)||LA4_0==NULL||LA4_0==PLUS||LA4_0==TRUE||LA4_0==WHILE||LA4_0==112||LA4_0==115||LA4_0==117||(LA4_0 >= 126 && LA4_0 <= 127)||(LA4_0 >= 130 && LA4_0 <= 133)) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:164:8: statement
							{
							pushFollow(FOLLOW_statement_in_block683);
							statement6=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_statement.add(statement6.getTree());
							}
							break;

						default :
							break loop4;
						}
					}

					char_literal7=(Token)match(input,137,FOLLOW_137_in_block686); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_137.add(char_literal7);

					// AST REWRITE
					// elements: statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 165:2: -> ^( STMNT_LIST ( statement )* )
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:165:6: ^( STMNT_LIST ( statement )* )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new StmntList(STMNT_LIST), root_1);
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:165:31: ( statement )*
						while ( stream_statement.hasNext() ) {
							adaptor.addChild(root_1, stream_statement.nextTree());
						}
						stream_statement.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:166:4: statement
					{
					pushFollow(FOLLOW_statement_in_block706);
					statement8=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement8.getTree());
					// AST REWRITE
					// elements: statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 167:2: -> ^( STMNT_LIST statement )
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:167:6: ^( STMNT_LIST statement )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new StmntList(STMNT_LIST), root_1);
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:169:1: statement : ( expression | forLoop | whileLoop | doWhileLoop | ifStatement | parallelStatement | returnStatement );
	public final rspParser.statement_return statement() throws RecognitionException {
		rspParser.statement_return retval = new rspParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression9 =null;
		ParserRuleReturnScope forLoop10 =null;
		ParserRuleReturnScope whileLoop11 =null;
		ParserRuleReturnScope doWhileLoop12 =null;
		ParserRuleReturnScope ifStatement13 =null;
		ParserRuleReturnScope parallelStatement14 =null;
		ParserRuleReturnScope returnStatement15 =null;


		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:170:2: ( expression | forLoop | whileLoop | doWhileLoop | ifStatement | parallelStatement | returnStatement )
			int alt6=7;
			switch ( input.LA(1) ) {
			case FALSE:
			case ID:
			case INT:
			case MINUS:
			case NEGATE:
			case NOT:
			case NULL:
			case PLUS:
			case TRUE:
			case 112:
			case 115:
			case 117:
				{
				alt6=1;
				}
				break;
			case 131:
				{
				alt6=2;
				}
				break;
			case WHILE:
				{
				alt6=3;
				}
				break;
			case 130:
				{
				alt6=4;
				}
				break;
			case IF:
				{
				alt6=5;
				}
				break;
			case 126:
			case 132:
				{
				alt6=6;
				}
				break;
			case 127:
			case 133:
				{
				alt6=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:173:19: expression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_statement756);
					expression9=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression9.getTree());

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:174:22: forLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_statement780);
					forLoop10=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forLoop10.getTree());

					}
					break;
				case 3 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:175:5: whileLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_statement786);
					whileLoop11=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileLoop11.getTree());

					}
					break;
				case 4 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:176:5: doWhileLoop
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_doWhileLoop_in_statement793);
					doWhileLoop12=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileLoop12.getTree());

					}
					break;
				case 5 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:177:5: ifStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifStatement_in_statement799);
					ifStatement13=ifStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement13.getTree());

					}
					break;
				case 6 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:178:4: parallelStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_parallelStatement_in_statement805);
					parallelStatement14=parallelStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parallelStatement14.getTree());

					}
					break;
				case 7 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:179:5: returnStatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_returnStatement_in_statement811);
					returnStatement15=returnStatement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, returnStatement15.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class forLoop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "forLoop"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:183:1: forLoop : 'for' '(' a= expression_list ';' b= expression_list ';' c= expression_list ')' block -> ^( FOR_LOOP $a $b $c block ) ;
	public final rspParser.forLoop_return forLoop() throws RecognitionException {
		rspParser.forLoop_return retval = new rspParser.forLoop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		Token char_literal17=null;
		Token char_literal18=null;
		Token char_literal19=null;
		Token char_literal20=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope block21 =null;

		Object string_literal16_tree=null;
		Object char_literal17_tree=null;
		Object char_literal18_tree=null;
		Object char_literal19_tree=null;
		Object char_literal20_tree=null;
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
		RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
		RewriteRuleSubtreeStream stream_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule expression_list");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:184:2: ( 'for' '(' a= expression_list ';' b= expression_list ';' c= expression_list ')' block -> ^( FOR_LOOP $a $b $c block ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:184:4: 'for' '(' a= expression_list ';' b= expression_list ';' c= expression_list ')' block
			{
			string_literal16=(Token)match(input,131,FOLLOW_131_in_forLoop825); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_131.add(string_literal16);

			char_literal17=(Token)match(input,112,FOLLOW_112_in_forLoop827); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_112.add(char_literal17);

			pushFollow(FOLLOW_expression_list_in_forLoop831);
			a=expression_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression_list.add(a.getTree());
			char_literal18=(Token)match(input,122,FOLLOW_122_in_forLoop833); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_122.add(char_literal18);

			pushFollow(FOLLOW_expression_list_in_forLoop837);
			b=expression_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression_list.add(b.getTree());
			char_literal19=(Token)match(input,122,FOLLOW_122_in_forLoop839); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_122.add(char_literal19);

			pushFollow(FOLLOW_expression_list_in_forLoop843);
			c=expression_list();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression_list.add(c.getTree());
			char_literal20=(Token)match(input,113,FOLLOW_113_in_forLoop845); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal20);

			pushFollow(FOLLOW_block_in_forLoop847);
			block21=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block21.getTree());
			// AST REWRITE
			// elements: a, c, block, b
			// token labels: 
			// rule labels: retval, b, c, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 185:2: -> ^( FOR_LOOP $a $b $c block )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:185:5: ^( FOR_LOOP $a $b $c block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new ForLoop(FOR_LOOP), root_1);
				adaptor.addChild(root_1, stream_a.nextTree());
				adaptor.addChild(root_1, stream_b.nextTree());
				adaptor.addChild(root_1, stream_c.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class whileLoop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:187:1: whileLoop : 'while' '(' expression ')' block -> ^( WHILE expression block ) ;
	public final rspParser.whileLoop_return whileLoop() throws RecognitionException {
		rspParser.whileLoop_return retval = new rspParser.whileLoop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal22=null;
		Token char_literal23=null;
		Token char_literal25=null;
		ParserRuleReturnScope expression24 =null;
		ParserRuleReturnScope block26 =null;

		Object string_literal22_tree=null;
		Object char_literal23_tree=null;
		Object char_literal25_tree=null;
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:188:2: ( 'while' '(' expression ')' block -> ^( WHILE expression block ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:188:4: 'while' '(' expression ')' block
			{
			string_literal22=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileLoop884); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHILE.add(string_literal22);

			char_literal23=(Token)match(input,112,FOLLOW_112_in_whileLoop886); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_112.add(char_literal23);

			pushFollow(FOLLOW_expression_in_whileLoop888);
			expression24=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression24.getTree());
			char_literal25=(Token)match(input,113,FOLLOW_113_in_whileLoop890); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal25);

			pushFollow(FOLLOW_block_in_whileLoop892);
			block26=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block26.getTree());
			// AST REWRITE
			// elements: block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 189:2: -> ^( WHILE expression block )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:189:5: ^( WHILE expression block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new While(WHILE), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class doWhileLoop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "doWhileLoop"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:191:1: doWhileLoop : 'do' block 'while' '(' expression ')' -> ^( DO_WHILE block expression ) ;
	public final rspParser.doWhileLoop_return doWhileLoop() throws RecognitionException {
		rspParser.doWhileLoop_return retval = new rspParser.doWhileLoop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal27=null;
		Token string_literal29=null;
		Token char_literal30=null;
		Token char_literal32=null;
		ParserRuleReturnScope block28 =null;
		ParserRuleReturnScope expression31 =null;

		Object string_literal27_tree=null;
		Object string_literal29_tree=null;
		Object char_literal30_tree=null;
		Object char_literal32_tree=null;
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:192:2: ( 'do' block 'while' '(' expression ')' -> ^( DO_WHILE block expression ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:192:4: 'do' block 'while' '(' expression ')'
			{
			string_literal27=(Token)match(input,130,FOLLOW_130_in_doWhileLoop915); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_130.add(string_literal27);

			pushFollow(FOLLOW_block_in_doWhileLoop917);
			block28=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block28.getTree());
			string_literal29=(Token)match(input,WHILE,FOLLOW_WHILE_in_doWhileLoop919); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_WHILE.add(string_literal29);

			char_literal30=(Token)match(input,112,FOLLOW_112_in_doWhileLoop921); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_112.add(char_literal30);

			pushFollow(FOLLOW_expression_in_doWhileLoop923);
			expression31=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression31.getTree());
			char_literal32=(Token)match(input,113,FOLLOW_113_in_doWhileLoop925); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal32);

			// AST REWRITE
			// elements: block, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 193:2: -> ^( DO_WHILE block expression )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:193:5: ^( DO_WHILE block expression )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new DoWhile(DO_WHILE), root_1);
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doWhileLoop"


	public static class ifStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifStatement"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:195:1: ifStatement : 'if' '(' expression ')' block ( ELSE block )? -> ^( IF expression block ( block )? ) ;
	public final rspParser.ifStatement_return ifStatement() throws RecognitionException {
		rspParser.ifStatement_return retval = new rspParser.ifStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal33=null;
		Token char_literal34=null;
		Token char_literal36=null;
		Token ELSE38=null;
		ParserRuleReturnScope expression35 =null;
		ParserRuleReturnScope block37 =null;
		ParserRuleReturnScope block39 =null;

		Object string_literal33_tree=null;
		Object char_literal34_tree=null;
		Object char_literal36_tree=null;
		Object ELSE38_tree=null;
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
		RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:196:2: ( 'if' '(' expression ')' block ( ELSE block )? -> ^( IF expression block ( block )? ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:196:4: 'if' '(' expression ')' block ( ELSE block )?
			{
			string_literal33=(Token)match(input,IF,FOLLOW_IF_in_ifStatement948); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IF.add(string_literal33);

			char_literal34=(Token)match(input,112,FOLLOW_112_in_ifStatement950); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_112.add(char_literal34);

			pushFollow(FOLLOW_expression_in_ifStatement952);
			expression35=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression35.getTree());
			char_literal36=(Token)match(input,113,FOLLOW_113_in_ifStatement954); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_113.add(char_literal36);

			pushFollow(FOLLOW_block_in_ifStatement956);
			block37=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block37.getTree());
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:196:34: ( ELSE block )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ELSE) ) {
				int LA7_1 = input.LA(2);
				if ( (synpred12_rsp()) ) {
					alt7=1;
				}
			}
			switch (alt7) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:196:36: ELSE block
					{
					ELSE38=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement960); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ELSE.add(ELSE38);

					pushFollow(FOLLOW_block_in_ifStatement962);
					block39=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block39.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: block, expression, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 197:2: -> ^( IF expression block ( block )? )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:197:5: ^( IF expression block ( block )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new If(IF), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:197:31: ( block )?
				if ( stream_block.hasNext() ) {
					adaptor.addChild(root_1, stream_block.nextTree());
				}
				stream_block.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifStatement"


	public static class parallelStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parallelStatement"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:199:1: parallelStatement : ( 'parallel' | 'PARALLEL' ) block -> ^( PARALLEL block ) ;
	public final rspParser.parallelStatement_return parallelStatement() throws RecognitionException {
		rspParser.parallelStatement_return retval = new rspParser.parallelStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal40=null;
		Token string_literal41=null;
		ParserRuleReturnScope block42 =null;

		Object string_literal40_tree=null;
		Object string_literal41_tree=null;
		RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
		RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:200:2: ( ( 'parallel' | 'PARALLEL' ) block -> ^( PARALLEL block ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:200:4: ( 'parallel' | 'PARALLEL' ) block
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:200:4: ( 'parallel' | 'PARALLEL' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==132) ) {
				alt8=1;
			}
			else if ( (LA8_0==126) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:200:5: 'parallel'
					{
					string_literal40=(Token)match(input,132,FOLLOW_132_in_parallelStatement993); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_132.add(string_literal40);

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:200:16: 'PARALLEL'
					{
					string_literal41=(Token)match(input,126,FOLLOW_126_in_parallelStatement995); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_126.add(string_literal41);

					}
					break;

			}

			pushFollow(FOLLOW_block_in_parallelStatement998);
			block42=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block42.getTree());
			// AST REWRITE
			// elements: block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 201:2: -> ^( PARALLEL block )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:201:5: ^( PARALLEL block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new Parallel(PARALLEL), root_1);
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parallelStatement"


	public static class returnStatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returnStatement"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:203:1: returnStatement : ( 'return' | 'RETURN' ) ( expression )? -> ^( RETURN ( expression )? ) ;
	public final rspParser.returnStatement_return returnStatement() throws RecognitionException {
		rspParser.returnStatement_return retval = new rspParser.returnStatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal43=null;
		Token string_literal44=null;
		ParserRuleReturnScope expression45 =null;

		Object string_literal43_tree=null;
		Object string_literal44_tree=null;
		RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
		RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:204:2: ( ( 'return' | 'RETURN' ) ( expression )? -> ^( RETURN ( expression )? ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:204:4: ( 'return' | 'RETURN' ) ( expression )?
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:204:4: ( 'return' | 'RETURN' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==133) ) {
				alt9=1;
			}
			else if ( (LA9_0==127) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:204:5: 'return'
					{
					string_literal43=(Token)match(input,133,FOLLOW_133_in_returnStatement1020); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_133.add(string_literal43);

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:204:14: 'RETURN'
					{
					string_literal44=(Token)match(input,127,FOLLOW_127_in_returnStatement1022); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_127.add(string_literal44);

					}
					break;

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:204:24: ( expression )?
			int alt10=2;
			switch ( input.LA(1) ) {
				case ID:
					{
					int LA10_1 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case INT:
					{
					int LA10_2 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case TRUE:
					{
					int LA10_3 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case FALSE:
					{
					int LA10_4 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case NULL:
					{
					int LA10_5 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case 112:
					{
					int LA10_6 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case 115:
					{
					int LA10_7 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case 117:
					{
					int LA10_8 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case PLUS:
					{
					int LA10_9 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case MINUS:
					{
					int LA10_10 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case NEGATE:
					{
					int LA10_11 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
				case NOT:
					{
					int LA10_12 = input.LA(2);
					if ( (synpred15_rsp()) ) {
						alt10=1;
					}
					}
					break;
			}
			switch (alt10) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:204:26: expression
					{
					pushFollow(FOLLOW_expression_in_returnStatement1027);
					expression45=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression45.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 205:2: -> ^( RETURN ( expression )? )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:205:5: ^( RETURN ( expression )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new Return(RETURN), root_1);
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:205:22: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returnStatement"


	public static class parameters_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parameters"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:207:1: parameters : ( parameter ( ',' parameter )* )? -> ^( PARAM_LIST ( parameter )* ) ;
	public final rspParser.parameters_return parameters() throws RecognitionException {
		rspParser.parameters_return retval = new rspParser.parameters_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal47=null;
		ParserRuleReturnScope parameter46 =null;
		ParserRuleReturnScope parameter48 =null;

		Object char_literal47_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:2: ( ( parameter ( ',' parameter )* )? -> ^( PARAM_LIST ( parameter )* ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:4: ( parameter ( ',' parameter )* )?
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:4: ( parameter ( ',' parameter )* )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ID) ) {
				int LA12_1 = input.LA(2);
				if ( (synpred17_rsp()) ) {
					alt12=1;
				}
			}
			switch (alt12) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:6: parameter ( ',' parameter )*
					{
					pushFollow(FOLLOW_parameter_in_parameters1055);
					parameter46=parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameter.add(parameter46.getTree());
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:16: ( ',' parameter )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==COMMA) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:17: ',' parameter
							{
							char_literal47=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameters1058); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(char_literal47);

							pushFollow(FOLLOW_parameter_in_parameters1060);
							parameter48=parameter();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_parameter.add(parameter48.getTree());
							}
							break;

						default :
							break loop11;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: parameter
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 208:36: -> ^( PARAM_LIST ( parameter )* )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:39: ^( PARAM_LIST ( parameter )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new ParamList(PARAM_LIST), root_1);
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:63: ( parameter )*
				while ( stream_parameter.hasNext() ) {
					adaptor.addChild(root_1, stream_parameter.nextTree());
				}
				stream_parameter.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameters"


	public static class parameter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "parameter"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:210:1: parameter : ID -> ^( PARAM[$ID.text] ) ;
	public final rspParser.parameter_return parameter() throws RecognitionException {
		rspParser.parameter_return retval = new rspParser.parameter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID49=null;

		Object ID49_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:211:2: ( ID -> ^( PARAM[$ID.text] ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:211:4: ID
			{
			ID49=(Token)match(input,ID,FOLLOW_ID_in_parameter1088); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID49);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 211:8: -> ^( PARAM[$ID.text] )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:211:11: ^( PARAM[$ID.text] )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new Param(PARAM, (ID49!=null?ID49.getText():null)), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter"


	public static class expression_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression_list"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:215:1: expression_list :e+= expression ( ',' e+= expression )* -> ^( EXPR_LIST ( $e)+ ) ;
	public final rspParser.expression_list_return expression_list() throws RecognitionException {
		rspParser.expression_list_return retval = new rspParser.expression_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal50=null;
		List<Object> list_e=null;
		RuleReturnScope e = null;
		Object char_literal50_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:216:2: (e+= expression ( ',' e+= expression )* -> ^( EXPR_LIST ( $e)+ ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:216:4: e+= expression ( ',' e+= expression )*
			{
			pushFollow(FOLLOW_expression_in_expression_list1112);
			e=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(e.getTree());
			if (list_e==null) list_e=new ArrayList<Object>();
			list_e.add(e.getTree());
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:216:18: ( ',' e+= expression )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:216:19: ',' e+= expression
					{
					char_literal50=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression_list1115); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(char_literal50);

					pushFollow(FOLLOW_expression_in_expression_list1119);
					e=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(e.getTree());
					if (list_e==null) list_e=new ArrayList<Object>();
					list_e.add(e.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: e
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: e
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"token e",list_e);
			root_0 = (Object)adaptor.nil();
			// 216:39: -> ^( EXPR_LIST ( $e)+ )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:216:42: ^( EXPR_LIST ( $e)+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new ExprList(EXPR_LIST), root_1);
				if ( !(stream_e.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_e.hasNext() ) {
					adaptor.addChild(root_1, stream_e.nextTree());
				}
				stream_e.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_list"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:218:1: expression : (a= ternary_expression -> $a) (o= assignment_operator b= expression -> ^( ASSIGNMENT_OP $o $a $b) )* ;
	public final rspParser.expression_return expression() throws RecognitionException {
		rspParser.expression_return retval = new rspParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope o =null;
		ParserRuleReturnScope b =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_ternary_expression=new RewriteRuleSubtreeStream(adaptor,"rule ternary_expression");
		RewriteRuleSubtreeStream stream_assignment_operator=new RewriteRuleSubtreeStream(adaptor,"rule assignment_operator");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:219:2: ( (a= ternary_expression -> $a) (o= assignment_operator b= expression -> ^( ASSIGNMENT_OP $o $a $b) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:219:4: (a= ternary_expression -> $a) (o= assignment_operator b= expression -> ^( ASSIGNMENT_OP $o $a $b) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:219:4: (a= ternary_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:219:5: a= ternary_expression
			{
			pushFollow(FOLLOW_ternary_expression_in_expression1146);
			a=ternary_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_ternary_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 219:26: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:220:2: (o= assignment_operator b= expression -> ^( ASSIGNMENT_OP $o $a $b) )*
			loop14:
			while (true) {
				int alt14=2;
				switch ( input.LA(1) ) {
				case 124:
					{
					int LA14_2 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				case 114:
					{
					int LA14_3 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				case 120:
					{
					int LA14_4 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				case 110:
					{
					int LA14_5 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				case 116:
					{
					int LA14_6 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				case 118:
					{
					int LA14_7 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				case 123:
					{
					int LA14_8 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				case 125:
					{
					int LA14_9 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				case 111:
					{
					int LA14_10 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				case 129:
					{
					int LA14_11 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				case 136:
					{
					int LA14_12 = input.LA(2);
					if ( (synpred19_rsp()) ) {
						alt14=1;
					}

					}
					break;
				}
				switch (alt14) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:220:3: o= assignment_operator b= expression
					{
					pushFollow(FOLLOW_assignment_operator_in_expression1158);
					o=assignment_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_operator.add(o.getTree());
					pushFollow(FOLLOW_expression_in_expression1162);
					b=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(b.getTree());
					// AST REWRITE
					// elements: o, a, b
					// token labels: 
					// rule labels: retval, b, a, o
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
					RewriteRuleSubtreeStream stream_o=new RewriteRuleSubtreeStream(adaptor,"rule o",o!=null?o.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 220:38: -> ^( ASSIGNMENT_OP $o $a $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:220:41: ^( ASSIGNMENT_OP $o $a $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new AssignmentStmt(ASSIGNMENT_OP), root_1);
						adaptor.addChild(root_1, stream_o.nextTree());
						adaptor.addChild(root_1, stream_a.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class ternary_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ternary_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:222:1: ternary_expression : (a= logical_or_expression -> $a) ( TERNARY_OP b= expression ':' c= expression -> ^( TERNARY_OP $a $b $c) )* ;
	public final rspParser.ternary_expression_return ternary_expression() throws RecognitionException {
		rspParser.ternary_expression_return retval = new rspParser.ternary_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TERNARY_OP51=null;
		Token char_literal52=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		Object TERNARY_OP51_tree=null;
		Object char_literal52_tree=null;
		RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
		RewriteRuleTokenStream stream_TERNARY_OP=new RewriteRuleTokenStream(adaptor,"token TERNARY_OP");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_logical_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:223:2: ( (a= logical_or_expression -> $a) ( TERNARY_OP b= expression ':' c= expression -> ^( TERNARY_OP $a $b $c) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:223:4: (a= logical_or_expression -> $a) ( TERNARY_OP b= expression ':' c= expression -> ^( TERNARY_OP $a $b $c) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:223:4: (a= logical_or_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:223:5: a= logical_or_expression
			{
			pushFollow(FOLLOW_logical_or_expression_in_ternary_expression1194);
			a=logical_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logical_or_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 223:29: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:224:2: ( TERNARY_OP b= expression ':' c= expression -> ^( TERNARY_OP $a $b $c) )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==TERNARY_OP) ) {
					int LA15_2 = input.LA(2);
					if ( (synpred20_rsp()) ) {
						alt15=1;
					}

				}

				switch (alt15) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:224:3: TERNARY_OP b= expression ':' c= expression
					{
					TERNARY_OP51=(Token)match(input,TERNARY_OP,FOLLOW_TERNARY_OP_in_ternary_expression1204); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TERNARY_OP.add(TERNARY_OP51);

					pushFollow(FOLLOW_expression_in_ternary_expression1208);
					b=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(b.getTree());
					char_literal52=(Token)match(input,121,FOLLOW_121_in_ternary_expression1210); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_121.add(char_literal52);

					pushFollow(FOLLOW_expression_in_ternary_expression1214);
					c=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(c.getTree());
					// AST REWRITE
					// elements: a, b, TERNARY_OP, c
					// token labels: 
					// rule labels: retval, b, c, a
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 224:44: -> ^( TERNARY_OP $a $b $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:224:47: ^( TERNARY_OP $a $b $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new TernaryOp(stream_TERNARY_OP.nextToken()), root_1);
						adaptor.addChild(root_1, stream_a.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ternary_expression"


	public static class logical_or_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logical_or_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:226:1: logical_or_expression : (a= or_expression -> $a) ( LOGIC_OR b= or_expression -> ^( LOGIC_OR $logical_or_expression $b) )* ;
	public final rspParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
		rspParser.logical_or_expression_return retval = new rspParser.logical_or_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOGIC_OR53=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object LOGIC_OR53_tree=null;
		RewriteRuleTokenStream stream_LOGIC_OR=new RewriteRuleTokenStream(adaptor,"token LOGIC_OR");
		RewriteRuleSubtreeStream stream_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule or_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:227:2: ( (a= or_expression -> $a) ( LOGIC_OR b= or_expression -> ^( LOGIC_OR $logical_or_expression $b) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:227:4: (a= or_expression -> $a) ( LOGIC_OR b= or_expression -> ^( LOGIC_OR $logical_or_expression $b) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:227:4: (a= or_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:227:5: a= or_expression
			{
			pushFollow(FOLLOW_or_expression_in_logical_or_expression1246);
			a=or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_or_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 227:21: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:230:2: ( LOGIC_OR b= or_expression -> ^( LOGIC_OR $logical_or_expression $b) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==LOGIC_OR) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:230:4: LOGIC_OR b= or_expression
					{
					LOGIC_OR53=(Token)match(input,LOGIC_OR,FOLLOW_LOGIC_OR_in_logical_or_expression1262); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LOGIC_OR.add(LOGIC_OR53);

					pushFollow(FOLLOW_or_expression_in_logical_or_expression1266);
					b=or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_or_expression.add(b.getTree());
					// AST REWRITE
					// elements: logical_or_expression, b, LOGIC_OR
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 230:29: -> ^( LOGIC_OR $logical_or_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:230:32: ^( LOGIC_OR $logical_or_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new LogicOrOp(stream_LOGIC_OR.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop16;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_or_expression"


	public static class or_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "or_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:232:1: or_expression : (a= imply_expression -> $a) ( OR b= imply_expression -> ^( OR $or_expression $b) )* ;
	public final rspParser.or_expression_return or_expression() throws RecognitionException {
		rspParser.or_expression_return retval = new rspParser.or_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR54=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object OR54_tree=null;
		RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
		RewriteRuleSubtreeStream stream_imply_expression=new RewriteRuleSubtreeStream(adaptor,"rule imply_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:233:2: ( (a= imply_expression -> $a) ( OR b= imply_expression -> ^( OR $or_expression $b) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:233:4: (a= imply_expression -> $a) ( OR b= imply_expression -> ^( OR $or_expression $b) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:233:4: (a= imply_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:233:5: a= imply_expression
			{
			pushFollow(FOLLOW_imply_expression_in_or_expression1297);
			a=imply_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_imply_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 233:24: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:234:2: ( OR b= imply_expression -> ^( OR $or_expression $b) )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==OR) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:234:3: OR b= imply_expression
					{
					OR54=(Token)match(input,OR,FOLLOW_OR_in_or_expression1307); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OR.add(OR54);

					pushFollow(FOLLOW_imply_expression_in_or_expression1311);
					b=imply_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_imply_expression.add(b.getTree());
					// AST REWRITE
					// elements: b, OR, or_expression
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 234:25: -> ^( OR $or_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:234:28: ^( OR $or_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new OrOp(stream_OR.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "or_expression"


	public static class imply_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "imply_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:236:1: imply_expression : (a= logical_and_expression -> $a) ( IMPLY b= logical_and_expression -> ^( IMPLY $imply_expression $b) )* ;
	public final rspParser.imply_expression_return imply_expression() throws RecognitionException {
		rspParser.imply_expression_return retval = new rspParser.imply_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IMPLY55=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object IMPLY55_tree=null;
		RewriteRuleTokenStream stream_IMPLY=new RewriteRuleTokenStream(adaptor,"token IMPLY");
		RewriteRuleSubtreeStream stream_logical_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_and_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:237:2: ( (a= logical_and_expression -> $a) ( IMPLY b= logical_and_expression -> ^( IMPLY $imply_expression $b) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:237:4: (a= logical_and_expression -> $a) ( IMPLY b= logical_and_expression -> ^( IMPLY $imply_expression $b) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:237:4: (a= logical_and_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:237:5: a= logical_and_expression
			{
			pushFollow(FOLLOW_logical_and_expression_in_imply_expression1340);
			a=logical_and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logical_and_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 237:30: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:238:2: ( IMPLY b= logical_and_expression -> ^( IMPLY $imply_expression $b) )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==IMPLY) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:238:3: IMPLY b= logical_and_expression
					{
					IMPLY55=(Token)match(input,IMPLY,FOLLOW_IMPLY_in_imply_expression1350); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IMPLY.add(IMPLY55);

					pushFollow(FOLLOW_logical_and_expression_in_imply_expression1354);
					b=logical_and_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logical_and_expression.add(b.getTree());
					// AST REWRITE
					// elements: imply_expression, b, IMPLY
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 238:34: -> ^( IMPLY $imply_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:238:37: ^( IMPLY $imply_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new ImplyOp(stream_IMPLY.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop18;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "imply_expression"


	public static class logical_and_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "logical_and_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:240:1: logical_and_expression : (a= and_expression -> $a) ( LOGIC_AND b= and_expression -> ^( LOGIC_AND $logical_and_expression $b) )* ;
	public final rspParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
		rspParser.logical_and_expression_return retval = new rspParser.logical_and_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LOGIC_AND56=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object LOGIC_AND56_tree=null;
		RewriteRuleTokenStream stream_LOGIC_AND=new RewriteRuleTokenStream(adaptor,"token LOGIC_AND");
		RewriteRuleSubtreeStream stream_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule and_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:243:2: ( (a= and_expression -> $a) ( LOGIC_AND b= and_expression -> ^( LOGIC_AND $logical_and_expression $b) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:243:4: (a= and_expression -> $a) ( LOGIC_AND b= and_expression -> ^( LOGIC_AND $logical_and_expression $b) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:243:4: (a= and_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:243:5: a= and_expression
			{
			pushFollow(FOLLOW_and_expression_in_logical_and_expression1387);
			a=and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_and_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 243:22: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:244:2: ( LOGIC_AND b= and_expression -> ^( LOGIC_AND $logical_and_expression $b) )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==LOGIC_AND) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:244:3: LOGIC_AND b= and_expression
					{
					LOGIC_AND56=(Token)match(input,LOGIC_AND,FOLLOW_LOGIC_AND_in_logical_and_expression1398); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LOGIC_AND.add(LOGIC_AND56);

					pushFollow(FOLLOW_and_expression_in_logical_and_expression1403);
					b=and_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_and_expression.add(b.getTree());
					// AST REWRITE
					// elements: LOGIC_AND, b, logical_and_expression
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 244:31: -> ^( LOGIC_AND $logical_and_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:244:34: ^( LOGIC_AND $logical_and_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new LogicalAndOp(stream_LOGIC_AND.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop19;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_and_expression"


	public static class and_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "and_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:246:1: and_expression : (a= inclusive_or_expression -> $a) ( AND b= inclusive_or_expression -> ^( AND $and_expression $b) )* ;
	public final rspParser.and_expression_return and_expression() throws RecognitionException {
		rspParser.and_expression_return retval = new rspParser.and_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND57=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object AND57_tree=null;
		RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
		RewriteRuleSubtreeStream stream_inclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule inclusive_or_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:247:2: ( (a= inclusive_or_expression -> $a) ( AND b= inclusive_or_expression -> ^( AND $and_expression $b) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:247:4: (a= inclusive_or_expression -> $a) ( AND b= inclusive_or_expression -> ^( AND $and_expression $b) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:247:4: (a= inclusive_or_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:247:5: a= inclusive_or_expression
			{
			pushFollow(FOLLOW_inclusive_or_expression_in_and_expression1433);
			a=inclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_inclusive_or_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 247:31: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:248:2: ( AND b= inclusive_or_expression -> ^( AND $and_expression $b) )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==AND) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:248:3: AND b= inclusive_or_expression
					{
					AND57=(Token)match(input,AND,FOLLOW_AND_in_and_expression1443); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AND.add(AND57);

					pushFollow(FOLLOW_inclusive_or_expression_in_and_expression1447);
					b=inclusive_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_inclusive_or_expression.add(b.getTree());
					// AST REWRITE
					// elements: AND, and_expression, b
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 248:33: -> ^( AND $and_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:248:36: ^( AND $and_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new AndOp(stream_AND.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop20;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "and_expression"


	public static class inclusive_or_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inclusive_or_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:250:1: inclusive_or_expression : (a= exclusive_or_expression -> $a) ( BITWISE_INCL_OR b= exclusive_or_expression -> ^( BITWISE_INCL_OR $inclusive_or_expression $b) )* ;
	public final rspParser.inclusive_or_expression_return inclusive_or_expression() throws RecognitionException {
		rspParser.inclusive_or_expression_return retval = new rspParser.inclusive_or_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BITWISE_INCL_OR58=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object BITWISE_INCL_OR58_tree=null;
		RewriteRuleTokenStream stream_BITWISE_INCL_OR=new RewriteRuleTokenStream(adaptor,"token BITWISE_INCL_OR");
		RewriteRuleSubtreeStream stream_exclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule exclusive_or_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:251:2: ( (a= exclusive_or_expression -> $a) ( BITWISE_INCL_OR b= exclusive_or_expression -> ^( BITWISE_INCL_OR $inclusive_or_expression $b) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:251:4: (a= exclusive_or_expression -> $a) ( BITWISE_INCL_OR b= exclusive_or_expression -> ^( BITWISE_INCL_OR $inclusive_or_expression $b) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:251:4: (a= exclusive_or_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:251:5: a= exclusive_or_expression
			{
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1476);
			a=exclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exclusive_or_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 251:31: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:252:2: ( BITWISE_INCL_OR b= exclusive_or_expression -> ^( BITWISE_INCL_OR $inclusive_or_expression $b) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==BITWISE_INCL_OR) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:252:3: BITWISE_INCL_OR b= exclusive_or_expression
					{
					BITWISE_INCL_OR58=(Token)match(input,BITWISE_INCL_OR,FOLLOW_BITWISE_INCL_OR_in_inclusive_or_expression1486); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BITWISE_INCL_OR.add(BITWISE_INCL_OR58);

					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1490);
					b=exclusive_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exclusive_or_expression.add(b.getTree());
					// AST REWRITE
					// elements: b, BITWISE_INCL_OR, inclusive_or_expression
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 252:45: -> ^( BITWISE_INCL_OR $inclusive_or_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:252:48: ^( BITWISE_INCL_OR $inclusive_or_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new BitwiseInclOrOp(stream_BITWISE_INCL_OR.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inclusive_or_expression"


	public static class exclusive_or_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exclusive_or_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:254:1: exclusive_or_expression : (a= bitwise_and_expression -> $a) ( BITWISE_EXCL_OR b= bitwise_and_expression -> ^( BITWISE_EXCL_OR $exclusive_or_expression $b) )* ;
	public final rspParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
		rspParser.exclusive_or_expression_return retval = new rspParser.exclusive_or_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BITWISE_EXCL_OR59=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object BITWISE_EXCL_OR59_tree=null;
		RewriteRuleTokenStream stream_BITWISE_EXCL_OR=new RewriteRuleTokenStream(adaptor,"token BITWISE_EXCL_OR");
		RewriteRuleSubtreeStream stream_bitwise_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule bitwise_and_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:255:2: ( (a= bitwise_and_expression -> $a) ( BITWISE_EXCL_OR b= bitwise_and_expression -> ^( BITWISE_EXCL_OR $exclusive_or_expression $b) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:255:4: (a= bitwise_and_expression -> $a) ( BITWISE_EXCL_OR b= bitwise_and_expression -> ^( BITWISE_EXCL_OR $exclusive_or_expression $b) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:255:4: (a= bitwise_and_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:255:5: a= bitwise_and_expression
			{
			pushFollow(FOLLOW_bitwise_and_expression_in_exclusive_or_expression1520);
			a=bitwise_and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_bitwise_and_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 255:30: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:256:2: ( BITWISE_EXCL_OR b= bitwise_and_expression -> ^( BITWISE_EXCL_OR $exclusive_or_expression $b) )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==BITWISE_EXCL_OR) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:256:3: BITWISE_EXCL_OR b= bitwise_and_expression
					{
					BITWISE_EXCL_OR59=(Token)match(input,BITWISE_EXCL_OR,FOLLOW_BITWISE_EXCL_OR_in_exclusive_or_expression1531); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BITWISE_EXCL_OR.add(BITWISE_EXCL_OR59);

					pushFollow(FOLLOW_bitwise_and_expression_in_exclusive_or_expression1535);
					b=bitwise_and_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_bitwise_and_expression.add(b.getTree());
					// AST REWRITE
					// elements: BITWISE_EXCL_OR, b, exclusive_or_expression
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 256:44: -> ^( BITWISE_EXCL_OR $exclusive_or_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:256:47: ^( BITWISE_EXCL_OR $exclusive_or_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new BitwiseExclOrOp(stream_BITWISE_EXCL_OR.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop22;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exclusive_or_expression"


	public static class bitwise_and_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bitwise_and_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:258:1: bitwise_and_expression : (a= equality_expression -> $a) ( AMP b= equality_expression -> ^( AMP $bitwise_and_expression $b) )* ;
	public final rspParser.bitwise_and_expression_return bitwise_and_expression() throws RecognitionException {
		rspParser.bitwise_and_expression_return retval = new rspParser.bitwise_and_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AMP60=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object AMP60_tree=null;
		RewriteRuleTokenStream stream_AMP=new RewriteRuleTokenStream(adaptor,"token AMP");
		RewriteRuleSubtreeStream stream_equality_expression=new RewriteRuleSubtreeStream(adaptor,"rule equality_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:259:2: ( (a= equality_expression -> $a) ( AMP b= equality_expression -> ^( AMP $bitwise_and_expression $b) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:259:4: (a= equality_expression -> $a) ( AMP b= equality_expression -> ^( AMP $bitwise_and_expression $b) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:259:4: (a= equality_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:259:5: a= equality_expression
			{
			pushFollow(FOLLOW_equality_expression_in_bitwise_and_expression1565);
			a=equality_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_equality_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 259:27: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:260:2: ( AMP b= equality_expression -> ^( AMP $bitwise_and_expression $b) )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==AMP) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:260:3: AMP b= equality_expression
					{
					AMP60=(Token)match(input,AMP,FOLLOW_AMP_in_bitwise_and_expression1575); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AMP.add(AMP60);

					pushFollow(FOLLOW_equality_expression_in_bitwise_and_expression1579);
					b=equality_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equality_expression.add(b.getTree());
					// AST REWRITE
					// elements: bitwise_and_expression, AMP, b
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 260:29: -> ^( AMP $bitwise_and_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:260:32: ^( AMP $bitwise_and_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new BitwiseAndOp(stream_AMP.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitwise_and_expression"


	public static class equality_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "equality_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:262:1: equality_expression : (a= relational_expression -> $a) ( ( PRIME EQUAL_OP b= relational_expression -> ^( EQUAL_OP ^( PRIME $equality_expression) $b) ) | ( EQUAL_OP b= relational_expression -> ^( EQUAL_OP $equality_expression $b) ) | ( NOT_EQUAL_OP c= relational_expression -> ^( NOT_EQUAL_OP $equality_expression $c) ) )* ;
	public final rspParser.equality_expression_return equality_expression() throws RecognitionException {
		rspParser.equality_expression_return retval = new rspParser.equality_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRIME61=null;
		Token EQUAL_OP62=null;
		Token EQUAL_OP63=null;
		Token NOT_EQUAL_OP64=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		Object PRIME61_tree=null;
		Object EQUAL_OP62_tree=null;
		Object EQUAL_OP63_tree=null;
		Object NOT_EQUAL_OP64_tree=null;
		RewriteRuleTokenStream stream_PRIME=new RewriteRuleTokenStream(adaptor,"token PRIME");
		RewriteRuleTokenStream stream_NOT_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL_OP");
		RewriteRuleTokenStream stream_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token EQUAL_OP");
		RewriteRuleSubtreeStream stream_relational_expression=new RewriteRuleSubtreeStream(adaptor,"rule relational_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:263:2: ( (a= relational_expression -> $a) ( ( PRIME EQUAL_OP b= relational_expression -> ^( EQUAL_OP ^( PRIME $equality_expression) $b) ) | ( EQUAL_OP b= relational_expression -> ^( EQUAL_OP $equality_expression $b) ) | ( NOT_EQUAL_OP c= relational_expression -> ^( NOT_EQUAL_OP $equality_expression $c) ) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:263:4: (a= relational_expression -> $a) ( ( PRIME EQUAL_OP b= relational_expression -> ^( EQUAL_OP ^( PRIME $equality_expression) $b) ) | ( EQUAL_OP b= relational_expression -> ^( EQUAL_OP $equality_expression $b) ) | ( NOT_EQUAL_OP c= relational_expression -> ^( NOT_EQUAL_OP $equality_expression $c) ) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:263:4: (a= relational_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:263:5: a= relational_expression
			{
			pushFollow(FOLLOW_relational_expression_in_equality_expression1609);
			a=relational_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_relational_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 263:29: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:264:2: ( ( PRIME EQUAL_OP b= relational_expression -> ^( EQUAL_OP ^( PRIME $equality_expression) $b) ) | ( EQUAL_OP b= relational_expression -> ^( EQUAL_OP $equality_expression $b) ) | ( NOT_EQUAL_OP c= relational_expression -> ^( NOT_EQUAL_OP $equality_expression $c) ) )*
			loop24:
			while (true) {
				int alt24=4;
				switch ( input.LA(1) ) {
				case PRIME:
					{
					alt24=1;
					}
					break;
				case EQUAL_OP:
					{
					alt24=2;
					}
					break;
				case NOT_EQUAL_OP:
					{
					alt24=3;
					}
					break;
				}
				switch (alt24) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:265:2: ( PRIME EQUAL_OP b= relational_expression -> ^( EQUAL_OP ^( PRIME $equality_expression) $b) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:265:2: ( PRIME EQUAL_OP b= relational_expression -> ^( EQUAL_OP ^( PRIME $equality_expression) $b) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:265:3: PRIME EQUAL_OP b= relational_expression
					{
					PRIME61=(Token)match(input,PRIME,FOLLOW_PRIME_in_equality_expression1622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PRIME.add(PRIME61);

					EQUAL_OP62=(Token)match(input,EQUAL_OP,FOLLOW_EQUAL_OP_in_equality_expression1624); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL_OP.add(EQUAL_OP62);

					pushFollow(FOLLOW_relational_expression_in_equality_expression1628);
					b=relational_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relational_expression.add(b.getTree());
					// AST REWRITE
					// elements: equality_expression, PRIME, b, EQUAL_OP
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 265:42: -> ^( EQUAL_OP ^( PRIME $equality_expression) $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:265:45: ^( EQUAL_OP ^( PRIME $equality_expression) $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new EqualOp(stream_EQUAL_OP.nextToken()), root_1);
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:265:65: ^( PRIME $equality_expression)
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot(new Prime(stream_PRIME.nextToken()), root_2);
						adaptor.addChild(root_2, stream_retval.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:267:2: ( EQUAL_OP b= relational_expression -> ^( EQUAL_OP $equality_expression $b) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:267:2: ( EQUAL_OP b= relational_expression -> ^( EQUAL_OP $equality_expression $b) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:267:3: EQUAL_OP b= relational_expression
					{
					EQUAL_OP63=(Token)match(input,EQUAL_OP,FOLLOW_EQUAL_OP_in_equality_expression1659); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL_OP.add(EQUAL_OP63);

					pushFollow(FOLLOW_relational_expression_in_equality_expression1663);
					b=relational_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relational_expression.add(b.getTree());
					// AST REWRITE
					// elements: equality_expression, b, EQUAL_OP
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 267:36: -> ^( EQUAL_OP $equality_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:267:39: ^( EQUAL_OP $equality_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new EqualOp(stream_EQUAL_OP.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 3 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:269:2: ( NOT_EQUAL_OP c= relational_expression -> ^( NOT_EQUAL_OP $equality_expression $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:269:2: ( NOT_EQUAL_OP c= relational_expression -> ^( NOT_EQUAL_OP $equality_expression $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:269:3: NOT_EQUAL_OP c= relational_expression
					{
					NOT_EQUAL_OP64=(Token)match(input,NOT_EQUAL_OP,FOLLOW_NOT_EQUAL_OP_in_equality_expression1687); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT_EQUAL_OP.add(NOT_EQUAL_OP64);

					pushFollow(FOLLOW_relational_expression_in_equality_expression1691);
					c=relational_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relational_expression.add(c.getTree());
					// AST REWRITE
					// elements: equality_expression, NOT_EQUAL_OP, c
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 269:40: -> ^( NOT_EQUAL_OP $equality_expression $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:269:43: ^( NOT_EQUAL_OP $equality_expression $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new NotEqualOp(stream_NOT_EQUAL_OP.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;

				default :
					break loop24;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equality_expression"


	public static class relational_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relational_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:272:1: relational_expression : (a= min_max_expression -> $a) ( ( LT b= min_max_expression -> ^( LT $relational_expression $b) ) | ( GT c= min_max_expression -> ^( GT $relational_expression $c) ) | ( LT_EQUAL_OP d= min_max_expression -> ^( LT_EQUAL_OP $relational_expression $d) ) | ( GT_EQUAL_OP e= min_max_expression -> ^( GT_EQUAL_OP $relational_expression $e) ) )* ;
	public final rspParser.relational_expression_return relational_expression() throws RecognitionException {
		rspParser.relational_expression_return retval = new rspParser.relational_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT65=null;
		Token GT66=null;
		Token LT_EQUAL_OP67=null;
		Token GT_EQUAL_OP68=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope d =null;
		ParserRuleReturnScope e =null;

		Object LT65_tree=null;
		Object GT66_tree=null;
		Object LT_EQUAL_OP67_tree=null;
		Object GT_EQUAL_OP68_tree=null;
		RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
		RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
		RewriteRuleTokenStream stream_GT_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token GT_EQUAL_OP");
		RewriteRuleTokenStream stream_LT_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token LT_EQUAL_OP");
		RewriteRuleSubtreeStream stream_min_max_expression=new RewriteRuleSubtreeStream(adaptor,"rule min_max_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:273:2: ( (a= min_max_expression -> $a) ( ( LT b= min_max_expression -> ^( LT $relational_expression $b) ) | ( GT c= min_max_expression -> ^( GT $relational_expression $c) ) | ( LT_EQUAL_OP d= min_max_expression -> ^( LT_EQUAL_OP $relational_expression $d) ) | ( GT_EQUAL_OP e= min_max_expression -> ^( GT_EQUAL_OP $relational_expression $e) ) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:273:4: (a= min_max_expression -> $a) ( ( LT b= min_max_expression -> ^( LT $relational_expression $b) ) | ( GT c= min_max_expression -> ^( GT $relational_expression $c) ) | ( LT_EQUAL_OP d= min_max_expression -> ^( LT_EQUAL_OP $relational_expression $d) ) | ( GT_EQUAL_OP e= min_max_expression -> ^( GT_EQUAL_OP $relational_expression $e) ) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:273:4: (a= min_max_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:273:5: a= min_max_expression
			{
			pushFollow(FOLLOW_min_max_expression_in_relational_expression1724);
			a=min_max_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_min_max_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 273:26: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:274:2: ( ( LT b= min_max_expression -> ^( LT $relational_expression $b) ) | ( GT c= min_max_expression -> ^( GT $relational_expression $c) ) | ( LT_EQUAL_OP d= min_max_expression -> ^( LT_EQUAL_OP $relational_expression $d) ) | ( GT_EQUAL_OP e= min_max_expression -> ^( GT_EQUAL_OP $relational_expression $e) ) )*
			loop25:
			while (true) {
				int alt25=5;
				switch ( input.LA(1) ) {
				case LT:
					{
					alt25=1;
					}
					break;
				case GT:
					{
					alt25=2;
					}
					break;
				case LT_EQUAL_OP:
					{
					alt25=3;
					}
					break;
				case GT_EQUAL_OP:
					{
					alt25=4;
					}
					break;
				}
				switch (alt25) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:275:2: ( LT b= min_max_expression -> ^( LT $relational_expression $b) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:275:2: ( LT b= min_max_expression -> ^( LT $relational_expression $b) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:275:3: LT b= min_max_expression
					{
					LT65=(Token)match(input,LT,FOLLOW_LT_in_relational_expression1737); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LT.add(LT65);

					pushFollow(FOLLOW_min_max_expression_in_relational_expression1741);
					b=min_max_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_min_max_expression.add(b.getTree());
					// AST REWRITE
					// elements: relational_expression, LT, b
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 275:27: -> ^( LT $relational_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:275:30: ^( LT $relational_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new LtOp(stream_LT.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:276:3: ( GT c= min_max_expression -> ^( GT $relational_expression $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:276:3: ( GT c= min_max_expression -> ^( GT $relational_expression $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:276:4: GT c= min_max_expression
					{
					GT66=(Token)match(input,GT,FOLLOW_GT_in_relational_expression1764); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GT.add(GT66);

					pushFollow(FOLLOW_min_max_expression_in_relational_expression1768);
					c=min_max_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_min_max_expression.add(c.getTree());
					// AST REWRITE
					// elements: relational_expression, c, GT
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 276:28: -> ^( GT $relational_expression $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:276:31: ^( GT $relational_expression $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new GtOp(stream_GT.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 3 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:277:3: ( LT_EQUAL_OP d= min_max_expression -> ^( LT_EQUAL_OP $relational_expression $d) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:277:3: ( LT_EQUAL_OP d= min_max_expression -> ^( LT_EQUAL_OP $relational_expression $d) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:277:4: LT_EQUAL_OP d= min_max_expression
					{
					LT_EQUAL_OP67=(Token)match(input,LT_EQUAL_OP,FOLLOW_LT_EQUAL_OP_in_relational_expression1789); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LT_EQUAL_OP.add(LT_EQUAL_OP67);

					pushFollow(FOLLOW_min_max_expression_in_relational_expression1793);
					d=min_max_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_min_max_expression.add(d.getTree());
					// AST REWRITE
					// elements: LT_EQUAL_OP, d, relational_expression
					// token labels: 
					// rule labels: retval, d
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 277:37: -> ^( LT_EQUAL_OP $relational_expression $d)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:277:40: ^( LT_EQUAL_OP $relational_expression $d)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new LtEqualOp(stream_LT_EQUAL_OP.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_d.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 4 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:278:3: ( GT_EQUAL_OP e= min_max_expression -> ^( GT_EQUAL_OP $relational_expression $e) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:278:3: ( GT_EQUAL_OP e= min_max_expression -> ^( GT_EQUAL_OP $relational_expression $e) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:278:4: GT_EQUAL_OP e= min_max_expression
					{
					GT_EQUAL_OP68=(Token)match(input,GT_EQUAL_OP,FOLLOW_GT_EQUAL_OP_in_relational_expression1814); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GT_EQUAL_OP.add(GT_EQUAL_OP68);

					pushFollow(FOLLOW_min_max_expression_in_relational_expression1818);
					e=min_max_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_min_max_expression.add(e.getTree());
					// AST REWRITE
					// elements: GT_EQUAL_OP, relational_expression, e
					// token labels: 
					// rule labels: retval, e
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 278:37: -> ^( GT_EQUAL_OP $relational_expression $e)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:278:40: ^( GT_EQUAL_OP $relational_expression $e)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new GtEqualOp(stream_GT_EQUAL_OP.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_e.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;

				default :
					break loop25;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational_expression"


	public static class min_max_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "min_max_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:281:1: min_max_expression : (a= shift_expression -> $a) ( ( MIN b= shift_expression -> ^( MIN $min_max_expression $b) ) | ( MAX c= shift_expression -> ^( MAX $min_max_expression $c) ) )* ;
	public final rspParser.min_max_expression_return min_max_expression() throws RecognitionException {
		rspParser.min_max_expression_return retval = new rspParser.min_max_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MIN69=null;
		Token MAX70=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		Object MIN69_tree=null;
		Object MAX70_tree=null;
		RewriteRuleTokenStream stream_MAX=new RewriteRuleTokenStream(adaptor,"token MAX");
		RewriteRuleTokenStream stream_MIN=new RewriteRuleTokenStream(adaptor,"token MIN");
		RewriteRuleSubtreeStream stream_shift_expression=new RewriteRuleSubtreeStream(adaptor,"rule shift_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:282:2: ( (a= shift_expression -> $a) ( ( MIN b= shift_expression -> ^( MIN $min_max_expression $b) ) | ( MAX c= shift_expression -> ^( MAX $min_max_expression $c) ) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:282:4: (a= shift_expression -> $a) ( ( MIN b= shift_expression -> ^( MIN $min_max_expression $b) ) | ( MAX c= shift_expression -> ^( MAX $min_max_expression $c) ) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:282:4: (a= shift_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:282:5: a= shift_expression
			{
			pushFollow(FOLLOW_shift_expression_in_min_max_expression1851);
			a=shift_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_shift_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 282:24: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:283:2: ( ( MIN b= shift_expression -> ^( MIN $min_max_expression $b) ) | ( MAX c= shift_expression -> ^( MAX $min_max_expression $c) ) )*
			loop26:
			while (true) {
				int alt26=3;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==MIN) ) {
					alt26=1;
				}
				else if ( (LA26_0==MAX) ) {
					alt26=2;
				}

				switch (alt26) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:284:2: ( MIN b= shift_expression -> ^( MIN $min_max_expression $b) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:284:2: ( MIN b= shift_expression -> ^( MIN $min_max_expression $b) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:284:3: MIN b= shift_expression
					{
					MIN69=(Token)match(input,MIN,FOLLOW_MIN_in_min_max_expression1864); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MIN.add(MIN69);

					pushFollow(FOLLOW_shift_expression_in_min_max_expression1869);
					b=shift_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_shift_expression.add(b.getTree());
					// AST REWRITE
					// elements: b, MIN, min_max_expression
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 284:27: -> ^( MIN $min_max_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:284:30: ^( MIN $min_max_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new MinOp(stream_MIN.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:285:4: ( MAX c= shift_expression -> ^( MAX $min_max_expression $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:285:4: ( MAX c= shift_expression -> ^( MAX $min_max_expression $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:285:5: MAX c= shift_expression
					{
					MAX70=(Token)match(input,MAX,FOLLOW_MAX_in_min_max_expression1891); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MAX.add(MAX70);

					pushFollow(FOLLOW_shift_expression_in_min_max_expression1895);
					c=shift_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_shift_expression.add(c.getTree());
					// AST REWRITE
					// elements: min_max_expression, MAX, c
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 285:28: -> ^( MAX $min_max_expression $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:285:31: ^( MAX $min_max_expression $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new MaxOp(stream_MAX.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;

				default :
					break loop26;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "min_max_expression"


	public static class shift_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "shift_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:288:1: shift_expression : (a= additive_expression -> $a) ( ( LEFT_SHIFT b= additive_expression -> ^( LEFT_SHIFT $shift_expression $b) ) | ( RIGHT_SHIFT c= additive_expression -> ^( RIGHT_SHIFT $shift_expression $c) ) )* ;
	public final rspParser.shift_expression_return shift_expression() throws RecognitionException {
		rspParser.shift_expression_return retval = new rspParser.shift_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LEFT_SHIFT71=null;
		Token RIGHT_SHIFT72=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		Object LEFT_SHIFT71_tree=null;
		Object RIGHT_SHIFT72_tree=null;
		RewriteRuleTokenStream stream_LEFT_SHIFT=new RewriteRuleTokenStream(adaptor,"token LEFT_SHIFT");
		RewriteRuleTokenStream stream_RIGHT_SHIFT=new RewriteRuleTokenStream(adaptor,"token RIGHT_SHIFT");
		RewriteRuleSubtreeStream stream_additive_expression=new RewriteRuleSubtreeStream(adaptor,"rule additive_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:289:2: ( (a= additive_expression -> $a) ( ( LEFT_SHIFT b= additive_expression -> ^( LEFT_SHIFT $shift_expression $b) ) | ( RIGHT_SHIFT c= additive_expression -> ^( RIGHT_SHIFT $shift_expression $c) ) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:289:4: (a= additive_expression -> $a) ( ( LEFT_SHIFT b= additive_expression -> ^( LEFT_SHIFT $shift_expression $b) ) | ( RIGHT_SHIFT c= additive_expression -> ^( RIGHT_SHIFT $shift_expression $c) ) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:289:4: (a= additive_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:289:5: a= additive_expression
			{
			pushFollow(FOLLOW_additive_expression_in_shift_expression1927);
			a=additive_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_additive_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 289:27: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:290:2: ( ( LEFT_SHIFT b= additive_expression -> ^( LEFT_SHIFT $shift_expression $b) ) | ( RIGHT_SHIFT c= additive_expression -> ^( RIGHT_SHIFT $shift_expression $c) ) )*
			loop27:
			while (true) {
				int alt27=3;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==LEFT_SHIFT) ) {
					alt27=1;
				}
				else if ( (LA27_0==RIGHT_SHIFT) ) {
					alt27=2;
				}

				switch (alt27) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:291:2: ( LEFT_SHIFT b= additive_expression -> ^( LEFT_SHIFT $shift_expression $b) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:291:2: ( LEFT_SHIFT b= additive_expression -> ^( LEFT_SHIFT $shift_expression $b) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:291:3: LEFT_SHIFT b= additive_expression
					{
					LEFT_SHIFT71=(Token)match(input,LEFT_SHIFT,FOLLOW_LEFT_SHIFT_in_shift_expression1941); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_SHIFT.add(LEFT_SHIFT71);

					pushFollow(FOLLOW_additive_expression_in_shift_expression1945);
					b=additive_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_additive_expression.add(b.getTree());
					// AST REWRITE
					// elements: LEFT_SHIFT, b, shift_expression
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 291:36: -> ^( LEFT_SHIFT $shift_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:291:39: ^( LEFT_SHIFT $shift_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new LeftShiftOp(stream_LEFT_SHIFT.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:292:3: ( RIGHT_SHIFT c= additive_expression -> ^( RIGHT_SHIFT $shift_expression $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:292:3: ( RIGHT_SHIFT c= additive_expression -> ^( RIGHT_SHIFT $shift_expression $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:292:4: RIGHT_SHIFT c= additive_expression
					{
					RIGHT_SHIFT72=(Token)match(input,RIGHT_SHIFT,FOLLOW_RIGHT_SHIFT_in_shift_expression1966); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_SHIFT.add(RIGHT_SHIFT72);

					pushFollow(FOLLOW_additive_expression_in_shift_expression1970);
					c=additive_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_additive_expression.add(c.getTree());
					// AST REWRITE
					// elements: shift_expression, c, RIGHT_SHIFT
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 292:38: -> ^( RIGHT_SHIFT $shift_expression $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:292:41: ^( RIGHT_SHIFT $shift_expression $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new RightShiftOp(stream_RIGHT_SHIFT.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;

				default :
					break loop27;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "shift_expression"


	public static class additive_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "additive_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:295:1: additive_expression : (a= multiplicative_expression -> $a) ( ( PLUS b= multiplicative_expression -> ^( PLUS $additive_expression $b) ) | ( MINUS c= multiplicative_expression -> ^( MINUS $additive_expression $c) ) )* ;
	public final rspParser.additive_expression_return additive_expression() throws RecognitionException {
		rspParser.additive_expression_return retval = new rspParser.additive_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS73=null;
		Token MINUS74=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		Object PLUS73_tree=null;
		Object MINUS74_tree=null;
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_multiplicative_expression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:296:2: ( (a= multiplicative_expression -> $a) ( ( PLUS b= multiplicative_expression -> ^( PLUS $additive_expression $b) ) | ( MINUS c= multiplicative_expression -> ^( MINUS $additive_expression $c) ) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:296:4: (a= multiplicative_expression -> $a) ( ( PLUS b= multiplicative_expression -> ^( PLUS $additive_expression $b) ) | ( MINUS c= multiplicative_expression -> ^( MINUS $additive_expression $c) ) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:296:4: (a= multiplicative_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:296:5: a= multiplicative_expression
			{
			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2003);
			a=multiplicative_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_multiplicative_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 296:33: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:297:2: ( ( PLUS b= multiplicative_expression -> ^( PLUS $additive_expression $b) ) | ( MINUS c= multiplicative_expression -> ^( MINUS $additive_expression $c) ) )*
			loop28:
			while (true) {
				int alt28=3;
				alt28 = dfa28.predict(input);
				switch (alt28) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:298:2: ( PLUS b= multiplicative_expression -> ^( PLUS $additive_expression $b) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:298:2: ( PLUS b= multiplicative_expression -> ^( PLUS $additive_expression $b) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:298:3: PLUS b= multiplicative_expression
					{
					PLUS73=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression2016); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS73);

					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2020);
					b=multiplicative_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiplicative_expression.add(b.getTree());
					// AST REWRITE
					// elements: PLUS, b, additive_expression
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 298:36: -> ^( PLUS $additive_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:298:39: ^( PLUS $additive_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PlusOp(stream_PLUS.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:299:3: ( MINUS c= multiplicative_expression -> ^( MINUS $additive_expression $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:299:3: ( MINUS c= multiplicative_expression -> ^( MINUS $additive_expression $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:299:4: MINUS c= multiplicative_expression
					{
					MINUS74=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression2041); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS74);

					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression2045);
					c=multiplicative_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiplicative_expression.add(c.getTree());
					// AST REWRITE
					// elements: additive_expression, c, MINUS
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 299:38: -> ^( MINUS $additive_expression $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:299:41: ^( MINUS $additive_expression $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new MinusOp(stream_MINUS.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;

				default :
					break loop28;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_expression"


	public static class multiplicative_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiplicative_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:302:1: multiplicative_expression : (a= unary_expression -> $a) ( ( MULT b= unary_expression -> ^( MULT $multiplicative_expression $b) ) | ( DIVISION c= unary_expression -> ^( DIVISION $multiplicative_expression $c) ) | ( REMAINDER d= unary_expression -> ^( REMAINDER $multiplicative_expression $d) ) )* ;
	public final rspParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
		rspParser.multiplicative_expression_return retval = new rspParser.multiplicative_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token MULT75=null;
		Token DIVISION76=null;
		Token REMAINDER77=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope d =null;

		Object MULT75_tree=null;
		Object DIVISION76_tree=null;
		Object REMAINDER77_tree=null;
		RewriteRuleTokenStream stream_DIVISION=new RewriteRuleTokenStream(adaptor,"token DIVISION");
		RewriteRuleTokenStream stream_MULT=new RewriteRuleTokenStream(adaptor,"token MULT");
		RewriteRuleTokenStream stream_REMAINDER=new RewriteRuleTokenStream(adaptor,"token REMAINDER");
		RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:303:2: ( (a= unary_expression -> $a) ( ( MULT b= unary_expression -> ^( MULT $multiplicative_expression $b) ) | ( DIVISION c= unary_expression -> ^( DIVISION $multiplicative_expression $c) ) | ( REMAINDER d= unary_expression -> ^( REMAINDER $multiplicative_expression $d) ) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:303:4: (a= unary_expression -> $a) ( ( MULT b= unary_expression -> ^( MULT $multiplicative_expression $b) ) | ( DIVISION c= unary_expression -> ^( DIVISION $multiplicative_expression $c) ) | ( REMAINDER d= unary_expression -> ^( REMAINDER $multiplicative_expression $d) ) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:303:4: (a= unary_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:303:5: a= unary_expression
			{
			pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2077);
			a=unary_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unary_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 303:24: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:304:2: ( ( MULT b= unary_expression -> ^( MULT $multiplicative_expression $b) ) | ( DIVISION c= unary_expression -> ^( DIVISION $multiplicative_expression $c) ) | ( REMAINDER d= unary_expression -> ^( REMAINDER $multiplicative_expression $d) ) )*
			loop29:
			while (true) {
				int alt29=4;
				switch ( input.LA(1) ) {
				case MULT:
					{
					alt29=1;
					}
					break;
				case DIVISION:
					{
					alt29=2;
					}
					break;
				case REMAINDER:
					{
					alt29=3;
					}
					break;
				}
				switch (alt29) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:305:2: ( MULT b= unary_expression -> ^( MULT $multiplicative_expression $b) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:305:2: ( MULT b= unary_expression -> ^( MULT $multiplicative_expression $b) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:305:3: MULT b= unary_expression
					{
					MULT75=(Token)match(input,MULT,FOLLOW_MULT_in_multiplicative_expression2091); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MULT.add(MULT75);

					pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2095);
					b=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(b.getTree());
					// AST REWRITE
					// elements: b, MULT, multiplicative_expression
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 305:27: -> ^( MULT $multiplicative_expression $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:305:30: ^( MULT $multiplicative_expression $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new MultOp(stream_MULT.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:306:3: ( DIVISION c= unary_expression -> ^( DIVISION $multiplicative_expression $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:306:3: ( DIVISION c= unary_expression -> ^( DIVISION $multiplicative_expression $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:306:4: DIVISION c= unary_expression
					{
					DIVISION76=(Token)match(input,DIVISION,FOLLOW_DIVISION_in_multiplicative_expression2117); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DIVISION.add(DIVISION76);

					pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2121);
					c=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(c.getTree());
					// AST REWRITE
					// elements: DIVISION, multiplicative_expression, c
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 306:32: -> ^( DIVISION $multiplicative_expression $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:306:35: ^( DIVISION $multiplicative_expression $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new DivisionOp(stream_DIVISION.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 3 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:307:3: ( REMAINDER d= unary_expression -> ^( REMAINDER $multiplicative_expression $d) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:307:3: ( REMAINDER d= unary_expression -> ^( REMAINDER $multiplicative_expression $d) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:307:4: REMAINDER d= unary_expression
					{
					REMAINDER77=(Token)match(input,REMAINDER,FOLLOW_REMAINDER_in_multiplicative_expression2143); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REMAINDER.add(REMAINDER77);

					pushFollow(FOLLOW_unary_expression_in_multiplicative_expression2147);
					d=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(d.getTree());
					// AST REWRITE
					// elements: REMAINDER, d, multiplicative_expression
					// token labels: 
					// rule labels: retval, d
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 307:33: -> ^( REMAINDER $multiplicative_expression $d)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:307:36: ^( REMAINDER $multiplicative_expression $d)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new RemainderOp(stream_REMAINDER.nextToken()), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_d.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;

				default :
					break loop29;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative_expression"


	public static class unary_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:310:1: unary_expression : ( (a= postfix_expression -> $a) | ( '++' b= postfix_expression -> ^( PRE_INCREMENT $b) ) | ( '--' c= postfix_expression -> ^( PRE_DECREMENT $c) ) | ( PLUS c= postfix_expression -> ^( PLUS $c) ) | ( MINUS c= postfix_expression -> ^( MINUS $c) ) | ( NEGATE c= postfix_expression -> ^( NEGATE $c) ) | ( NOT c= postfix_expression -> ^( NOT $c) ) );
	public final rspParser.unary_expression_return unary_expression() throws RecognitionException {
		rspParser.unary_expression_return retval = new rspParser.unary_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal78=null;
		Token string_literal79=null;
		Token PLUS80=null;
		Token MINUS81=null;
		Token NEGATE82=null;
		Token NOT83=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		Object string_literal78_tree=null;
		Object string_literal79_tree=null;
		Object PLUS80_tree=null;
		Object MINUS81_tree=null;
		Object NEGATE82_tree=null;
		Object NOT83_tree=null;
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleTokenStream stream_NEGATE=new RewriteRuleTokenStream(adaptor,"token NEGATE");
		RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_postfix_expression=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:311:2: ( (a= postfix_expression -> $a) | ( '++' b= postfix_expression -> ^( PRE_INCREMENT $b) ) | ( '--' c= postfix_expression -> ^( PRE_DECREMENT $c) ) | ( PLUS c= postfix_expression -> ^( PLUS $c) ) | ( MINUS c= postfix_expression -> ^( MINUS $c) ) | ( NEGATE c= postfix_expression -> ^( NEGATE $c) ) | ( NOT c= postfix_expression -> ^( NOT $c) ) )
			int alt30=7;
			switch ( input.LA(1) ) {
			case FALSE:
			case ID:
			case INT:
			case NULL:
			case TRUE:
			case 112:
				{
				alt30=1;
				}
				break;
			case 115:
				{
				alt30=2;
				}
				break;
			case 117:
				{
				alt30=3;
				}
				break;
			case PLUS:
				{
				alt30=4;
				}
				break;
			case MINUS:
				{
				alt30=5;
				}
				break;
			case NEGATE:
				{
				alt30=6;
				}
				break;
			case NOT:
				{
				alt30=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:312:2: (a= postfix_expression -> $a)
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:312:2: (a= postfix_expression -> $a)
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:312:3: a= postfix_expression
					{
					pushFollow(FOLLOW_postfix_expression_in_unary_expression2181);
					a=postfix_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix_expression.add(a.getTree());
					// AST REWRITE
					// elements: a
					// token labels: 
					// rule labels: retval, a
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 312:23: -> $a
					{
						adaptor.addChild(root_0, stream_a.nextTree());
					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:313:4: ( '++' b= postfix_expression -> ^( PRE_INCREMENT $b) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:313:4: ( '++' b= postfix_expression -> ^( PRE_INCREMENT $b) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:313:5: '++' b= postfix_expression
					{
					string_literal78=(Token)match(input,115,FOLLOW_115_in_unary_expression2192); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_115.add(string_literal78);

					pushFollow(FOLLOW_postfix_expression_in_unary_expression2196);
					b=postfix_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix_expression.add(b.getTree());
					// AST REWRITE
					// elements: b
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 313:31: -> ^( PRE_INCREMENT $b)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:313:34: ^( PRE_INCREMENT $b)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PreIncrementOp(PRE_INCREMENT), root_1);
						adaptor.addChild(root_1, stream_b.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 3 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:314:4: ( '--' c= postfix_expression -> ^( PRE_DECREMENT $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:314:4: ( '--' c= postfix_expression -> ^( PRE_DECREMENT $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:314:5: '--' c= postfix_expression
					{
					string_literal79=(Token)match(input,117,FOLLOW_117_in_unary_expression2215); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_117.add(string_literal79);

					pushFollow(FOLLOW_postfix_expression_in_unary_expression2219);
					c=postfix_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix_expression.add(c.getTree());
					// AST REWRITE
					// elements: c
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 314:31: -> ^( PRE_DECREMENT $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:314:34: ^( PRE_DECREMENT $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PreDecrementOp(PRE_DECREMENT), root_1);
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 4 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:315:4: ( PLUS c= postfix_expression -> ^( PLUS $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:315:4: ( PLUS c= postfix_expression -> ^( PLUS $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:315:5: PLUS c= postfix_expression
					{
					PLUS80=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression2238); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS.add(PLUS80);

					pushFollow(FOLLOW_postfix_expression_in_unary_expression2242);
					c=postfix_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix_expression.add(c.getTree());
					// AST REWRITE
					// elements: c, PLUS
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 315:31: -> ^( PLUS $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:315:34: ^( PLUS $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new UnaryPlusOp(stream_PLUS.nextToken()), root_1);
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 5 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:316:4: ( MINUS c= postfix_expression -> ^( MINUS $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:316:4: ( MINUS c= postfix_expression -> ^( MINUS $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:316:5: MINUS c= postfix_expression
					{
					MINUS81=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expression2261); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS81);

					pushFollow(FOLLOW_postfix_expression_in_unary_expression2265);
					c=postfix_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix_expression.add(c.getTree());
					// AST REWRITE
					// elements: c, MINUS
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 316:32: -> ^( MINUS $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:316:35: ^( MINUS $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new UnaryMinusOp(stream_MINUS.nextToken()), root_1);
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 6 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:317:4: ( NEGATE c= postfix_expression -> ^( NEGATE $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:317:4: ( NEGATE c= postfix_expression -> ^( NEGATE $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:317:5: NEGATE c= postfix_expression
					{
					NEGATE82=(Token)match(input,NEGATE,FOLLOW_NEGATE_in_unary_expression2284); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NEGATE.add(NEGATE82);

					pushFollow(FOLLOW_postfix_expression_in_unary_expression2288);
					c=postfix_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix_expression.add(c.getTree());
					// AST REWRITE
					// elements: NEGATE, c
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 317:33: -> ^( NEGATE $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:317:36: ^( NEGATE $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new UnaryNotOp(stream_NEGATE.nextToken()), root_1);
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 7 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:318:4: ( NOT c= postfix_expression -> ^( NOT $c) )
					{
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:318:4: ( NOT c= postfix_expression -> ^( NOT $c) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:318:5: NOT c= postfix_expression
					{
					NOT83=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expression2307); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NOT.add(NOT83);

					pushFollow(FOLLOW_postfix_expression_in_unary_expression2311);
					c=postfix_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix_expression.add(c.getTree());
					// AST REWRITE
					// elements: NOT, c
					// token labels: 
					// rule labels: retval, c
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 318:30: -> ^( NOT $c)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:318:33: ^( NOT $c)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new UnaryNotOp(stream_NOT.nextToken()), root_1);
						adaptor.addChild(root_1, stream_c.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_expression"


	public static class postfix_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "postfix_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:320:1: postfix_expression : (a= primary_expression -> $a) ( '.' ID ( '(' (b= arguments )? ')' -> ^( METHOD_REF[$ID.text] $postfix_expression ( $b)? ) ) | '++' -> ^( POST_INCREMENT $postfix_expression) | '--' -> ^( POST_DECREMENT $postfix_expression) )* ;
	public final rspParser.postfix_expression_return postfix_expression() throws RecognitionException {
		rspParser.postfix_expression_return retval = new rspParser.postfix_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal84=null;
		Token ID85=null;
		Token char_literal86=null;
		Token char_literal87=null;
		Token string_literal88=null;
		Token string_literal89=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		Object char_literal84_tree=null;
		Object ID85_tree=null;
		Object char_literal86_tree=null;
		Object char_literal87_tree=null;
		Object string_literal88_tree=null;
		Object string_literal89_tree=null;
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
		RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:321:2: ( (a= primary_expression -> $a) ( '.' ID ( '(' (b= arguments )? ')' -> ^( METHOD_REF[$ID.text] $postfix_expression ( $b)? ) ) | '++' -> ^( POST_INCREMENT $postfix_expression) | '--' -> ^( POST_DECREMENT $postfix_expression) )* )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:321:4: (a= primary_expression -> $a) ( '.' ID ( '(' (b= arguments )? ')' -> ^( METHOD_REF[$ID.text] $postfix_expression ( $b)? ) ) | '++' -> ^( POST_INCREMENT $postfix_expression) | '--' -> ^( POST_DECREMENT $postfix_expression) )*
			{
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:321:4: (a= primary_expression -> $a)
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:321:5: a= primary_expression
			{
			pushFollow(FOLLOW_primary_expression_in_postfix_expression2338);
			a=primary_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primary_expression.add(a.getTree());
			// AST REWRITE
			// elements: a
			// token labels: 
			// rule labels: retval, a
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 321:26: -> $a
			{
				adaptor.addChild(root_0, stream_a.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:322:2: ( '.' ID ( '(' (b= arguments )? ')' -> ^( METHOD_REF[$ID.text] $postfix_expression ( $b)? ) ) | '++' -> ^( POST_INCREMENT $postfix_expression) | '--' -> ^( POST_DECREMENT $postfix_expression) )*
			loop32:
			while (true) {
				int alt32=4;
				alt32 = dfa32.predict(input);
				switch (alt32) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:325:2: '.' ID ( '(' (b= arguments )? ')' -> ^( METHOD_REF[$ID.text] $postfix_expression ( $b)? ) )
					{
					char_literal84=(Token)match(input,119,FOLLOW_119_in_postfix_expression2353); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_119.add(char_literal84);

					ID85=(Token)match(input,ID,FOLLOW_ID_in_postfix_expression2355); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID85);

					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:325:9: ( '(' (b= arguments )? ')' -> ^( METHOD_REF[$ID.text] $postfix_expression ( $b)? ) )
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:326:2: '(' (b= arguments )? ')'
					{
					char_literal86=(Token)match(input,112,FOLLOW_112_in_postfix_expression2361); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(char_literal86);

					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:326:7: (b= arguments )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==FALSE||LA31_0==ID||LA31_0==INT||LA31_0==MINUS||(LA31_0 >= NEGATE && LA31_0 <= NOT)||LA31_0==NULL||LA31_0==PLUS||LA31_0==TRUE||LA31_0==112||LA31_0==115||LA31_0==117) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:326:7: b= arguments
							{
							pushFollow(FOLLOW_arguments_in_postfix_expression2365);
							b=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(b.getTree());
							}
							break;

					}

					char_literal87=(Token)match(input,113,FOLLOW_113_in_postfix_expression2368); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_113.add(char_literal87);

					// AST REWRITE
					// elements: postfix_expression, b
					// token labels: 
					// rule labels: retval, b
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 327:3: -> ^( METHOD_REF[$ID.text] $postfix_expression ( $b)? )
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:327:6: ^( METHOD_REF[$ID.text] $postfix_expression ( $b)? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new MethodRef(METHOD_REF, (ID85!=null?ID85.getText():null)), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:327:61: ( $b)?
						if ( stream_b.hasNext() ) {
							adaptor.addChild(root_1, stream_b.nextTree());
						}
						stream_b.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:332:4: '++'
					{
					string_literal88=(Token)match(input,115,FOLLOW_115_in_postfix_expression2399); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_115.add(string_literal88);

					// AST REWRITE
					// elements: postfix_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 332:9: -> ^( POST_INCREMENT $postfix_expression)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:332:12: ^( POST_INCREMENT $postfix_expression)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PostIncrement(POST_INCREMENT), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:333:3: '--'
					{
					string_literal89=(Token)match(input,117,FOLLOW_117_in_postfix_expression2415); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_117.add(string_literal89);

					// AST REWRITE
					// elements: postfix_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 333:8: -> ^( POST_DECREMENT $postfix_expression)
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:333:10: ^( POST_DECREMENT $postfix_expression)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new PostDecrement(POST_DECREMENT), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop32;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "postfix_expression"


	public static class arguments_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arguments"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:336:1: arguments :x+= expression ( ',' x+= expression )* -> ^( ARGUMENT_LIST ( $x)* ) ;
	public final rspParser.arguments_return arguments() throws RecognitionException {
		rspParser.arguments_return retval = new rspParser.arguments_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal90=null;
		List<Object> list_x=null;
		RuleReturnScope x = null;
		Object char_literal90_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:337:2: (x+= expression ( ',' x+= expression )* -> ^( ARGUMENT_LIST ( $x)* ) )
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:337:4: x+= expression ( ',' x+= expression )*
			{
			pushFollow(FOLLOW_expression_in_arguments2442);
			x=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(x.getTree());
			if (list_x==null) list_x=new ArrayList<Object>();
			list_x.add(x.getTree());
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:337:18: ( ',' x+= expression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==COMMA) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:337:19: ',' x+= expression
					{
					char_literal90=(Token)match(input,COMMA,FOLLOW_COMMA_in_arguments2445); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(char_literal90);

					pushFollow(FOLLOW_expression_in_arguments2449);
					x=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(x.getTree());
					if (list_x==null) list_x=new ArrayList<Object>();
					list_x.add(x.getTree());
					}
					break;

				default :
					break loop33;
				}
			}

			// AST REWRITE
			// elements: x
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: x
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"token x",list_x);
			root_0 = (Object)adaptor.nil();
			// 337:40: -> ^( ARGUMENT_LIST ( $x)* )
			{
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:337:43: ^( ARGUMENT_LIST ( $x)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(new ArgumentList(ARGUMENT_LIST), root_1);
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:337:74: ( $x)*
				while ( stream_x.hasNext() ) {
					adaptor.addChild(root_1, stream_x.nextTree());
				}
				stream_x.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arguments"


	public static class primary_expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "primary_expression"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:339:1: primary_expression : ( ID -> ^( VAR_REF[$ID.text] ) | INT -> INT[$INT.int] | TRUE -> TRUE[true] | FALSE -> FALSE[false] | NULL -> NULL[null] | '(' ! expression ')' !);
	public final rspParser.primary_expression_return primary_expression() throws RecognitionException {
		rspParser.primary_expression_return retval = new rspParser.primary_expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID91=null;
		Token INT92=null;
		Token TRUE93=null;
		Token FALSE94=null;
		Token NULL95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		ParserRuleReturnScope expression97 =null;

		Object ID91_tree=null;
		Object INT92_tree=null;
		Object TRUE93_tree=null;
		Object FALSE94_tree=null;
		Object NULL95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
		RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
		RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:340:2: ( ID -> ^( VAR_REF[$ID.text] ) | INT -> INT[$INT.int] | TRUE -> TRUE[true] | FALSE -> FALSE[false] | NULL -> NULL[null] | '(' ! expression ')' !)
			int alt34=6;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt34=1;
				}
				break;
			case INT:
				{
				alt34=2;
				}
				break;
			case TRUE:
				{
				alt34=3;
				}
				break;
			case FALSE:
				{
				alt34=4;
				}
				break;
			case NULL:
				{
				alt34=5;
				}
				break;
			case 112:
				{
				alt34=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:340:4: ID
					{
					ID91=(Token)match(input,ID,FOLLOW_ID_in_primary_expression2474); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID91);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 340:7: -> ^( VAR_REF[$ID.text] )
					{
						// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:340:10: ^( VAR_REF[$ID.text] )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(new VarRef(VAR_REF, (ID91!=null?ID91.getText():null)), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:341:4: INT
					{
					INT92=(Token)match(input,INT,FOLLOW_INT_in_primary_expression2489); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT92);

					// AST REWRITE
					// elements: INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 341:8: -> INT[$INT.int]
					{
						adaptor.addChild(root_0, new IntegerLiteral(INT, (INT92!=null?Integer.valueOf(INT92.getText()):0)));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:342:4: TRUE
					{
					TRUE93=(Token)match(input,TRUE,FOLLOW_TRUE_in_primary_expression2502); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TRUE.add(TRUE93);

					// AST REWRITE
					// elements: TRUE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 342:9: -> TRUE[true]
					{
						adaptor.addChild(root_0, new BooleanLiteral(TRUE, true));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:343:4: FALSE
					{
					FALSE94=(Token)match(input,FALSE,FOLLOW_FALSE_in_primary_expression2515); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FALSE.add(FALSE94);

					// AST REWRITE
					// elements: FALSE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 343:10: -> FALSE[false]
					{
						adaptor.addChild(root_0, new BooleanLiteral(FALSE, false));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:344:4: NULL
					{
					NULL95=(Token)match(input,NULL,FOLLOW_NULL_in_primary_expression2528); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NULL.add(NULL95);

					// AST REWRITE
					// elements: NULL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 344:9: -> NULL[null]
					{
						adaptor.addChild(root_0, new NullLiteral(NULL, null));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:345:5: '(' ! expression ')' !
					{
					root_0 = (Object)adaptor.nil();


					char_literal96=(Token)match(input,112,FOLLOW_112_in_primary_expression2542); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_primary_expression2545);
					expression97=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression97.getTree());

					char_literal98=(Token)match(input,113,FOLLOW_113_in_primary_expression2547); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary_expression"


	public static class assignment_operator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment_operator"
	// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:348:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final rspParser.assignment_operator_return assignment_operator() throws RecognitionException {
		rspParser.assignment_operator_return retval = new rspParser.assignment_operator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal99=null;
		Token string_literal100=null;
		Token string_literal101=null;
		Token string_literal102=null;
		Token string_literal103=null;
		Token string_literal104=null;
		Token string_literal105=null;
		Token string_literal106=null;
		Token string_literal107=null;
		Token string_literal108=null;
		Token string_literal109=null;

		Object char_literal99_tree=null;
		Object string_literal100_tree=null;
		Object string_literal101_tree=null;
		Object string_literal102_tree=null;
		Object string_literal103_tree=null;
		Object string_literal104_tree=null;
		Object string_literal105_tree=null;
		Object string_literal106_tree=null;
		Object string_literal107_tree=null;
		Object string_literal108_tree=null;
		Object string_literal109_tree=null;

		try {
			// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:349:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			int alt35=11;
			switch ( input.LA(1) ) {
			case 124:
				{
				alt35=1;
				}
				break;
			case 114:
				{
				alt35=2;
				}
				break;
			case 120:
				{
				alt35=3;
				}
				break;
			case 110:
				{
				alt35=4;
				}
				break;
			case 116:
				{
				alt35=5;
				}
				break;
			case 118:
				{
				alt35=6;
				}
				break;
			case 123:
				{
				alt35=7;
				}
				break;
			case 125:
				{
				alt35=8;
				}
				break;
			case 111:
				{
				alt35=9;
				}
				break;
			case 129:
				{
				alt35=10;
				}
				break;
			case 136:
				{
				alt35=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:349:4: '='
					{
					root_0 = (Object)adaptor.nil();


					char_literal99=(Token)match(input,124,FOLLOW_124_in_assignment_operator2560); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal99_tree = new AssignOp(char_literal99) ;
					adaptor.addChild(root_0, char_literal99_tree);
					}

					}
					break;
				case 2 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:350:4: '*='
					{
					root_0 = (Object)adaptor.nil();


					string_literal100=(Token)match(input,114,FOLLOW_114_in_assignment_operator2568); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal100_tree = new MultAssignOp(string_literal100) ;
					adaptor.addChild(root_0, string_literal100_tree);
					}

					}
					break;
				case 3 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:351:4: '/='
					{
					root_0 = (Object)adaptor.nil();


					string_literal101=(Token)match(input,120,FOLLOW_120_in_assignment_operator2576); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal101_tree = new DivideAssignOp(string_literal101) ;
					adaptor.addChild(root_0, string_literal101_tree);
					}

					}
					break;
				case 4 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:352:4: '%='
					{
					root_0 = (Object)adaptor.nil();


					string_literal102=(Token)match(input,110,FOLLOW_110_in_assignment_operator2584); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal102_tree = new RemainderAssignOp(string_literal102) ;
					adaptor.addChild(root_0, string_literal102_tree);
					}

					}
					break;
				case 5 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:353:4: '+='
					{
					root_0 = (Object)adaptor.nil();


					string_literal103=(Token)match(input,116,FOLLOW_116_in_assignment_operator2592); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal103_tree = new PlusAssignOp(string_literal103) ;
					adaptor.addChild(root_0, string_literal103_tree);
					}

					}
					break;
				case 6 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:354:4: '-='
					{
					root_0 = (Object)adaptor.nil();


					string_literal104=(Token)match(input,118,FOLLOW_118_in_assignment_operator2600); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal104_tree = new MinusAssignOp(string_literal104) ;
					adaptor.addChild(root_0, string_literal104_tree);
					}

					}
					break;
				case 7 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:355:4: '<<='
					{
					root_0 = (Object)adaptor.nil();


					string_literal105=(Token)match(input,123,FOLLOW_123_in_assignment_operator2608); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal105_tree = new LeftShiftAssignOp(string_literal105) ;
					adaptor.addChild(root_0, string_literal105_tree);
					}

					}
					break;
				case 8 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:356:4: '>>='
					{
					root_0 = (Object)adaptor.nil();


					string_literal106=(Token)match(input,125,FOLLOW_125_in_assignment_operator2616); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal106_tree = new RightShiftAssignOp(string_literal106) ;
					adaptor.addChild(root_0, string_literal106_tree);
					}

					}
					break;
				case 9 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:357:4: '&='
					{
					root_0 = (Object)adaptor.nil();


					string_literal107=(Token)match(input,111,FOLLOW_111_in_assignment_operator2624); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal107_tree = new BitwiseAndAssignOp(string_literal107) ;
					adaptor.addChild(root_0, string_literal107_tree);
					}

					}
					break;
				case 10 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:358:4: '^='
					{
					root_0 = (Object)adaptor.nil();


					string_literal108=(Token)match(input,129,FOLLOW_129_in_assignment_operator2632); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal108_tree = new BitwiseXorAssignOp(string_literal108) ;
					adaptor.addChild(root_0, string_literal108_tree);
					}

					}
					break;
				case 11 :
					// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:359:4: '|='
					{
					root_0 = (Object)adaptor.nil();


					string_literal109=(Token)match(input,136,FOLLOW_136_in_assignment_operator2640); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal109_tree = new BitwiseOrAssignOp(string_literal109) ;
					adaptor.addChild(root_0, string_literal109_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_operator"

	// $ANTLR start synpred2_rsp
	public final void synpred2_rsp_fragment() throws RecognitionException {
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:24: ( parameters )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:155:24: parameters
		{
		pushFollow(FOLLOW_parameters_in_synpred2_rsp641);
		parameters();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_rsp

	// $ANTLR start synpred12_rsp
	public final void synpred12_rsp_fragment() throws RecognitionException {
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:196:36: ( ELSE block )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:196:36: ELSE block
		{
		match(input,ELSE,FOLLOW_ELSE_in_synpred12_rsp960); if (state.failed) return;

		pushFollow(FOLLOW_block_in_synpred12_rsp962);
		block();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_rsp

	// $ANTLR start synpred15_rsp
	public final void synpred15_rsp_fragment() throws RecognitionException {
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:204:26: ( expression )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:204:26: expression
		{
		pushFollow(FOLLOW_expression_in_synpred15_rsp1027);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred15_rsp

	// $ANTLR start synpred17_rsp
	public final void synpred17_rsp_fragment() throws RecognitionException {
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:6: ( parameter ( ',' parameter )* )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:6: parameter ( ',' parameter )*
		{
		pushFollow(FOLLOW_parameter_in_synpred17_rsp1055);
		parameter();
		state._fsp--;
		if (state.failed) return;

		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:16: ( ',' parameter )*
		loop37:
		while (true) {
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==COMMA) ) {
				alt37=1;
			}

			switch (alt37) {
			case 1 :
				// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:208:17: ',' parameter
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred17_rsp1058); if (state.failed) return;

				pushFollow(FOLLOW_parameter_in_synpred17_rsp1060);
				parameter();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop37;
			}
		}

		}

	}
	// $ANTLR end synpred17_rsp

	// $ANTLR start synpred19_rsp
	public final void synpred19_rsp_fragment() throws RecognitionException {
		ParserRuleReturnScope o =null;
		ParserRuleReturnScope b =null;


		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:220:3: (o= assignment_operator b= expression )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:220:3: o= assignment_operator b= expression
		{
		pushFollow(FOLLOW_assignment_operator_in_synpred19_rsp1158);
		o=assignment_operator();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred19_rsp1162);
		b=expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_rsp

	// $ANTLR start synpred20_rsp
	public final void synpred20_rsp_fragment() throws RecognitionException {
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;


		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:224:3: ( TERNARY_OP b= expression ':' c= expression )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:224:3: TERNARY_OP b= expression ':' c= expression
		{
		match(input,TERNARY_OP,FOLLOW_TERNARY_OP_in_synpred20_rsp1204); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred20_rsp1208);
		b=expression();
		state._fsp--;
		if (state.failed) return;

		match(input,121,FOLLOW_121_in_synpred20_rsp1210); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred20_rsp1214);
		c=expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_rsp

	// $ANTLR start synpred40_rsp
	public final void synpred40_rsp_fragment() throws RecognitionException {
		ParserRuleReturnScope b =null;


		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:298:2: ( ( PLUS b= multiplicative_expression ) )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:298:2: ( PLUS b= multiplicative_expression )
		{
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:298:2: ( PLUS b= multiplicative_expression )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:298:3: PLUS b= multiplicative_expression
		{
		match(input,PLUS,FOLLOW_PLUS_in_synpred40_rsp2016); if (state.failed) return;

		pushFollow(FOLLOW_multiplicative_expression_in_synpred40_rsp2020);
		b=multiplicative_expression();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred40_rsp

	// $ANTLR start synpred41_rsp
	public final void synpred41_rsp_fragment() throws RecognitionException {
		ParserRuleReturnScope c =null;


		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:299:3: ( ( MINUS c= multiplicative_expression ) )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:299:3: ( MINUS c= multiplicative_expression )
		{
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:299:3: ( MINUS c= multiplicative_expression )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:299:4: MINUS c= multiplicative_expression
		{
		match(input,MINUS,FOLLOW_MINUS_in_synpred41_rsp2041); if (state.failed) return;

		pushFollow(FOLLOW_multiplicative_expression_in_synpred41_rsp2045);
		c=multiplicative_expression();
		state._fsp--;
		if (state.failed) return;

		}

		}

	}
	// $ANTLR end synpred41_rsp

	// $ANTLR start synpred53_rsp
	public final void synpred53_rsp_fragment() throws RecognitionException {
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:332:4: ( '++' )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:332:4: '++'
		{
		match(input,115,FOLLOW_115_in_synpred53_rsp2399); if (state.failed) return;

		}

	}
	// $ANTLR end synpred53_rsp

	// $ANTLR start synpred54_rsp
	public final void synpred54_rsp_fragment() throws RecognitionException {
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:333:3: ( '--' )
		// /Users/ryf/Dropbox/Architectures for Service-based Systems/code/grammar/rsp.g:333:3: '--'
		{
		match(input,117,FOLLOW_117_in_synpred54_rsp2415); if (state.failed) return;

		}

	}
	// $ANTLR end synpred54_rsp

	// Delegated rules

	public final boolean synpred41_rsp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred41_rsp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_rsp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_rsp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_rsp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_rsp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_rsp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_rsp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_rsp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_rsp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_rsp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred40_rsp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_rsp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_rsp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_rsp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_rsp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_rsp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_rsp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred54_rsp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred54_rsp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA28 dfa28 = new DFA28(this);
	protected DFA32 dfa32 = new DFA32(this);
	static final String DFA28_eotS =
		"\75\uffff";
	static final String DFA28_eofS =
		"\1\1\74\uffff";
	static final String DFA28_minS =
		"\1\4\50\uffff\2\0\22\uffff";
	static final String DFA28_maxS =
		"\1\u0089\50\uffff\2\0\22\uffff";
	static final String DFA28_acceptS =
		"\1\uffff\1\3\71\uffff\1\1\1\2";
	static final String DFA28_specialS =
		"\51\uffff\1\0\1\1\22\uffff}>";
	static final String[] DFA28_transitionS = {
			"\2\1\11\uffff\2\1\2\uffff\1\1\5\uffff\2\1\2\uffff\1\1\4\uffff\2\1\2\uffff"+
			"\3\1\3\uffff\1\1\3\uffff\1\1\2\uffff\5\1\2\uffff\1\1\1\52\3\uffff\5\1"+
			"\3\uffff\1\51\6\uffff\1\1\5\uffff\1\1\12\uffff\2\1\13\uffff\1\1\1\uffff"+
			"\11\1\1\uffff\10\1\1\uffff\5\1\2\uffff\2\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
	static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
	static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
	static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
	static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
	static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
	static final short[][] DFA28_transition;

	static {
		int numStates = DFA28_transitionS.length;
		DFA28_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
		}
	}

	protected class DFA28 extends DFA {

		public DFA28(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 28;
			this.eot = DFA28_eot;
			this.eof = DFA28_eof;
			this.min = DFA28_min;
			this.max = DFA28_max;
			this.accept = DFA28_accept;
			this.special = DFA28_special;
			this.transition = DFA28_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 297:2: ( ( PLUS b= multiplicative_expression -> ^( PLUS $additive_expression $b) ) | ( MINUS c= multiplicative_expression -> ^( MINUS $additive_expression $c) ) )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA28_41 = input.LA(1);
						 
						int index28_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred40_rsp()) ) {s = 59;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_41);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA28_42 = input.LA(1);
						 
						int index28_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred41_rsp()) ) {s = 60;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index28_42);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 28, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA32_eotS =
		"\101\uffff";
	static final String DFA32_eofS =
		"\1\1\100\uffff";
	static final String DFA32_minS =
		"\1\4\53\uffff\2\0\23\uffff";
	static final String DFA32_maxS =
		"\1\u0089\53\uffff\2\0\23\uffff";
	static final String DFA32_acceptS =
		"\1\uffff\1\4\74\uffff\1\1\1\2\1\3";
	static final String DFA32_specialS =
		"\54\uffff\1\0\1\1\23\uffff}>";
	static final String[] DFA32_transitionS = {
			"\2\1\11\uffff\2\1\2\uffff\1\1\3\uffff\1\1\1\uffff\2\1\2\uffff\1\1\4\uffff"+
			"\2\1\2\uffff\3\1\3\uffff\1\1\3\uffff\1\1\2\uffff\5\1\2\uffff\3\1\2\uffff"+
			"\5\1\3\uffff\1\1\6\uffff\1\1\3\uffff\1\1\1\uffff\1\1\12\uffff\2\1\13"+
			"\uffff\1\1\1\uffff\5\1\1\54\1\1\1\55\1\1\1\76\10\1\1\uffff\5\1\2\uffff"+
			"\2\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 322:2: ( '.' ID ( '(' (b= arguments )? ')' -> ^( METHOD_REF[$ID.text] $postfix_expression ( $b)? ) ) | '++' -> ^( POST_INCREMENT $postfix_expression) | '--' -> ^( POST_DECREMENT $postfix_expression) )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA32_44 = input.LA(1);
						 
						int index32_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_rsp()) ) {s = 63;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index32_44);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA32_45 = input.LA(1);
						 
						int index32_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred54_rsp()) ) {s = 64;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index32_45);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 32, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_134_in_start635 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x000000000000003CL});
	public static final BitSet FOLLOW_128_in_start637 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x000000000000003CL});
	public static final BitSet FOLLOW_parameters_in_start641 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x000000000000003CL});
	public static final BitSet FOLLOW_statement_in_start645 = new BitSet(new long[]{0x880010C020000002L,0xC029100100000085L,0x000000000000003CL});
	public static final BitSet FOLLOW_135_in_block681 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x000000000000023CL});
	public static final BitSet FOLLOW_statement_in_block683 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x000000000000023CL});
	public static final BitSet FOLLOW_137_in_block686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_block706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_statement756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_statement780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_statement786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_statement793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStatement_in_statement799 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parallelStatement_in_statement805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnStatement_in_statement811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_131_in_forLoop825 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_forLoop827 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_list_in_forLoop831 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_forLoop833 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_list_in_forLoop837 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_122_in_forLoop839 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_list_in_forLoop843 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_forLoop845 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x00000000000000BCL});
	public static final BitSet FOLLOW_block_in_forLoop847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileLoop884 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_whileLoop886 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_whileLoop888 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_whileLoop890 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x00000000000000BCL});
	public static final BitSet FOLLOW_block_in_whileLoop892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_130_in_doWhileLoop915 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x00000000000000BCL});
	public static final BitSet FOLLOW_block_in_doWhileLoop917 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_WHILE_in_doWhileLoop919 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_doWhileLoop921 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop923 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_doWhileLoop925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStatement948 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_ifStatement950 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_ifStatement952 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_ifStatement954 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x00000000000000BCL});
	public static final BitSet FOLLOW_block_in_ifStatement956 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_ELSE_in_ifStatement960 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x00000000000000BCL});
	public static final BitSet FOLLOW_block_in_ifStatement962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_132_in_parallelStatement993 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x00000000000000BCL});
	public static final BitSet FOLLOW_126_in_parallelStatement995 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x00000000000000BCL});
	public static final BitSet FOLLOW_block_in_parallelStatement998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_133_in_returnStatement1020 = new BitSet(new long[]{0x8800104020000002L,0x0029000100000085L});
	public static final BitSet FOLLOW_127_in_returnStatement1022 = new BitSet(new long[]{0x8800104020000002L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_returnStatement1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_in_parameters1055 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COMMA_in_parameters1058 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_parameter_in_parameters1060 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_ID_in_parameter1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_list1112 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COMMA_in_expression_list1115 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_expression_list1119 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_ternary_expression_in_expression1146 = new BitSet(new long[]{0x0000000000000002L,0x3954C00000000000L,0x0000000000000102L});
	public static final BitSet FOLLOW_assignment_operator_in_expression1158 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_expression1162 = new BitSet(new long[]{0x0000000000000002L,0x3954C00000000000L,0x0000000000000102L});
	public static final BitSet FOLLOW_logical_or_expression_in_ternary_expression1194 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_TERNARY_OP_in_ternary_expression1204 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_ternary_expression1208 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_121_in_ternary_expression1210 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_ternary_expression1214 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_or_expression_in_logical_or_expression1246 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_LOGIC_OR_in_logical_or_expression1262 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_or_expression_in_logical_or_expression1266 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_imply_expression_in_or_expression1297 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_or_expression1307 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_imply_expression_in_or_expression1311 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_logical_and_expression_in_imply_expression1340 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_IMPLY_in_imply_expression1350 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_logical_and_expression_in_imply_expression1354 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_and_expression_in_logical_and_expression1387 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_LOGIC_AND_in_logical_and_expression1398 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_and_expression_in_logical_and_expression1403 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_and_expression1433 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_and_expression1443 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_and_expression1447 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1476 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BITWISE_INCL_OR_in_inclusive_or_expression1486 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1490 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_bitwise_and_expression_in_exclusive_or_expression1520 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_BITWISE_EXCL_OR_in_exclusive_or_expression1531 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_bitwise_and_expression_in_exclusive_or_expression1535 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_equality_expression_in_bitwise_and_expression1565 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AMP_in_bitwise_and_expression1575 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_equality_expression_in_bitwise_and_expression1579 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1609 = new BitSet(new long[]{0x0000000004000002L,0x0000000000004002L});
	public static final BitSet FOLLOW_PRIME_in_equality_expression1622 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_EQUAL_OP_in_equality_expression1624 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1628 = new BitSet(new long[]{0x0000000004000002L,0x0000000000004002L});
	public static final BitSet FOLLOW_EQUAL_OP_in_equality_expression1659 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1663 = new BitSet(new long[]{0x0000000004000002L,0x0000000000004002L});
	public static final BitSet FOLLOW_NOT_EQUAL_OP_in_equality_expression1687 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1691 = new BitSet(new long[]{0x0000000004000002L,0x0000000000004002L});
	public static final BitSet FOLLOW_min_max_expression_in_relational_expression1724 = new BitSet(new long[]{0x0060000C00000002L});
	public static final BitSet FOLLOW_LT_in_relational_expression1737 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_min_max_expression_in_relational_expression1741 = new BitSet(new long[]{0x0060000C00000002L});
	public static final BitSet FOLLOW_GT_in_relational_expression1764 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_min_max_expression_in_relational_expression1768 = new BitSet(new long[]{0x0060000C00000002L});
	public static final BitSet FOLLOW_LT_EQUAL_OP_in_relational_expression1789 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_min_max_expression_in_relational_expression1793 = new BitSet(new long[]{0x0060000C00000002L});
	public static final BitSet FOLLOW_GT_EQUAL_OP_in_relational_expression1814 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_min_max_expression_in_relational_expression1818 = new BitSet(new long[]{0x0060000C00000002L});
	public static final BitSet FOLLOW_shift_expression_in_min_max_expression1851 = new BitSet(new long[]{0x0480000000000002L});
	public static final BitSet FOLLOW_MIN_in_min_max_expression1864 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_shift_expression_in_min_max_expression1869 = new BitSet(new long[]{0x0480000000000002L});
	public static final BitSet FOLLOW_MAX_in_min_max_expression1891 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_shift_expression_in_min_max_expression1895 = new BitSet(new long[]{0x0480000000000002L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1927 = new BitSet(new long[]{0x0001000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_LEFT_SHIFT_in_shift_expression1941 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1945 = new BitSet(new long[]{0x0001000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_RIGHT_SHIFT_in_shift_expression1966 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1970 = new BitSet(new long[]{0x0001000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2003 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_PLUS_in_additive_expression2016 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2020 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_MINUS_in_additive_expression2041 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression2045 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000080L});
	public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2077 = new BitSet(new long[]{0x1000000000800002L,0x0000000000040000L});
	public static final BitSet FOLLOW_MULT_in_multiplicative_expression2091 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2095 = new BitSet(new long[]{0x1000000000800002L,0x0000000000040000L});
	public static final BitSet FOLLOW_DIVISION_in_multiplicative_expression2117 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2121 = new BitSet(new long[]{0x1000000000800002L,0x0000000000040000L});
	public static final BitSet FOLLOW_REMAINDER_in_multiplicative_expression2143 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression2147 = new BitSet(new long[]{0x1000000000800002L,0x0000000000040000L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression2181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_unary_expression2192 = new BitSet(new long[]{0x0000104020000000L,0x0001000100000004L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression2196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_unary_expression2215 = new BitSet(new long[]{0x0000104020000000L,0x0001000100000004L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression2219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_unary_expression2238 = new BitSet(new long[]{0x0000104020000000L,0x0001000100000004L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression2242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unary_expression2261 = new BitSet(new long[]{0x0000104020000000L,0x0001000100000004L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression2265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATE_in_unary_expression2284 = new BitSet(new long[]{0x0000104020000000L,0x0001000100000004L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression2288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_unary_expression2307 = new BitSet(new long[]{0x0000104020000000L,0x0001000100000004L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression2311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_postfix_expression2338 = new BitSet(new long[]{0x0000000000000002L,0x00A8000000000000L});
	public static final BitSet FOLLOW_119_in_postfix_expression2353 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_ID_in_postfix_expression2355 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_112_in_postfix_expression2361 = new BitSet(new long[]{0x8800104020000000L,0x002B000100000085L});
	public static final BitSet FOLLOW_arguments_in_postfix_expression2365 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_postfix_expression2368 = new BitSet(new long[]{0x0000000000000002L,0x00A8000000000000L});
	public static final BitSet FOLLOW_115_in_postfix_expression2399 = new BitSet(new long[]{0x0000000000000002L,0x00A8000000000000L});
	public static final BitSet FOLLOW_117_in_postfix_expression2415 = new BitSet(new long[]{0x0000000000000002L,0x00A8000000000000L});
	public static final BitSet FOLLOW_expression_in_arguments2442 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COMMA_in_arguments2445 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_arguments2449 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_ID_in_primary_expression2474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_primary_expression2489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_primary_expression2502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_primary_expression2515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_in_primary_expression2528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_112_in_primary_expression2542 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_primary_expression2545 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_113_in_primary_expression2547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_124_in_assignment_operator2560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_114_in_assignment_operator2568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_120_in_assignment_operator2576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_110_in_assignment_operator2584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_116_in_assignment_operator2592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_118_in_assignment_operator2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_123_in_assignment_operator2608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_assignment_operator2616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_111_in_assignment_operator2624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_129_in_assignment_operator2632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_136_in_assignment_operator2640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameters_in_synpred2_rsp641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_synpred12_rsp960 = new BitSet(new long[]{0x880010C020000000L,0xC029100100000085L,0x00000000000000BCL});
	public static final BitSet FOLLOW_block_in_synpred12_rsp962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred15_rsp1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_in_synpred17_rsp1055 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COMMA_in_synpred17_rsp1058 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_parameter_in_synpred17_rsp1060 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred19_rsp1158 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_synpred19_rsp1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TERNARY_OP_in_synpred20_rsp1204 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_synpred20_rsp1208 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_121_in_synpred20_rsp1210 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_expression_in_synpred20_rsp1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_synpred40_rsp2016 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_multiplicative_expression_in_synpred40_rsp2020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_synpred41_rsp2041 = new BitSet(new long[]{0x8800104020000000L,0x0029000100000085L});
	public static final BitSet FOLLOW_multiplicative_expression_in_synpred41_rsp2045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_115_in_synpred53_rsp2399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_117_in_synpred54_rsp2415 = new BitSet(new long[]{0x0000000000000002L});
}
