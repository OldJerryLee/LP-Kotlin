package org.xtext.example.kotlin.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.kotlin.services.KotlinGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKotlinParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_TEXT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'when'", "'('", "')'", "'{'", "'->'", "'}'", "'else'", "'!'", "'is'", "'Long'", "'Int'", "'String'", "'println('"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_TEXT=6;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKotlinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKotlinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKotlinParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKotlin.g"; }



     	private KotlinGrammarAccess grammarAccess;

        public InternalKotlinParser(TokenStream input, KotlinGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected KotlinGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalKotlin.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalKotlin.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalKotlin.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalKotlin.g:71:1: ruleModel returns [EObject current=null] : ( (lv_when_0_0= ruleWhen ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_when_0_0 = null;



        	enterRule();

        try {
            // InternalKotlin.g:77:2: ( ( (lv_when_0_0= ruleWhen ) ) )
            // InternalKotlin.g:78:2: ( (lv_when_0_0= ruleWhen ) )
            {
            // InternalKotlin.g:78:2: ( (lv_when_0_0= ruleWhen ) )
            // InternalKotlin.g:79:3: (lv_when_0_0= ruleWhen )
            {
            // InternalKotlin.g:79:3: (lv_when_0_0= ruleWhen )
            // InternalKotlin.g:80:4: lv_when_0_0= ruleWhen
            {

            				newCompositeNode(grammarAccess.getModelAccess().getWhenWhenParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_when_0_0=ruleWhen();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				set(
            					current,
            					"when",
            					lv_when_0_0,
            					"org.xtext.example.kotlin.Kotlin.When");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWhen"
    // InternalKotlin.g:100:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalKotlin.g:100:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalKotlin.g:101:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalKotlin.g:107:1: ruleWhen returns [EObject current=null] : (otherlv_0= 'when' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= '->' ( (lv_output_7_0= ruleOutput ) )? otherlv_8= '}' ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_condition_5_0 = null;

        AntlrDatatypeRuleToken lv_output_7_0 = null;



        	enterRule();

        try {
            // InternalKotlin.g:113:2: ( (otherlv_0= 'when' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= '->' ( (lv_output_7_0= ruleOutput ) )? otherlv_8= '}' ) )
            // InternalKotlin.g:114:2: (otherlv_0= 'when' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= '->' ( (lv_output_7_0= ruleOutput ) )? otherlv_8= '}' )
            {
            // InternalKotlin.g:114:2: (otherlv_0= 'when' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= '->' ( (lv_output_7_0= ruleOutput ) )? otherlv_8= '}' )
            // InternalKotlin.g:115:3: otherlv_0= 'when' otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= '->' ( (lv_output_7_0= ruleOutput ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getLeftParenthesisKeyword_1());
            		
            // InternalKotlin.g:123:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalKotlin.g:124:4: (lv_name_2_0= RULE_ID )
            {
            // InternalKotlin.g:124:4: (lv_name_2_0= RULE_ID )
            // InternalKotlin.g:125:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getWhenAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getWhenAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getWhenAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalKotlin.g:149:3: ( (lv_condition_5_0= ruleCondition ) )
            // InternalKotlin.g:150:4: (lv_condition_5_0= ruleCondition )
            {
            // InternalKotlin.g:150:4: (lv_condition_5_0= ruleCondition )
            // InternalKotlin.g:151:5: lv_condition_5_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getConditionConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_condition_5_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_5_0,
            						"org.xtext.example.kotlin.Kotlin.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getWhenAccess().getHyphenMinusGreaterThanSignKeyword_6());
            		
            // InternalKotlin.g:172:3: ( (lv_output_7_0= ruleOutput ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKotlin.g:173:4: (lv_output_7_0= ruleOutput )
                    {
                    // InternalKotlin.g:173:4: (lv_output_7_0= ruleOutput )
                    // InternalKotlin.g:174:5: lv_output_7_0= ruleOutput
                    {

                    					newCompositeNode(grammarAccess.getWhenAccess().getOutputOutputParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_output_7_0=ruleOutput();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getWhenRule());
                    					}
                    					set(
                    						current,
                    						"output",
                    						lv_output_7_0,
                    						"org.xtext.example.kotlin.Kotlin.Output");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWhenAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleCondition"
    // InternalKotlin.g:199:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalKotlin.g:199:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalKotlin.g:200:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalKotlin.g:206:1: ruleCondition returns [EObject current=null] : ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_TEXT_2= RULE_TEXT | ( ( (lv_conditional_3_0= ruleConditional ) ) ( (lv_type_4_0= ruleType ) ) ) | otherlv_5= 'else' ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token this_TEXT_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_conditional_3_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalKotlin.g:212:2: ( ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_TEXT_2= RULE_TEXT | ( ( (lv_conditional_3_0= ruleConditional ) ) ( (lv_type_4_0= ruleType ) ) ) | otherlv_5= 'else' ) ) )
            // InternalKotlin.g:213:2: ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_TEXT_2= RULE_TEXT | ( ( (lv_conditional_3_0= ruleConditional ) ) ( (lv_type_4_0= ruleType ) ) ) | otherlv_5= 'else' ) )
            {
            // InternalKotlin.g:213:2: ( () ( ( (lv_value_1_0= RULE_INT ) ) | this_TEXT_2= RULE_TEXT | ( ( (lv_conditional_3_0= ruleConditional ) ) ( (lv_type_4_0= ruleType ) ) ) | otherlv_5= 'else' ) )
            // InternalKotlin.g:214:3: () ( ( (lv_value_1_0= RULE_INT ) ) | this_TEXT_2= RULE_TEXT | ( ( (lv_conditional_3_0= ruleConditional ) ) ( (lv_type_4_0= ruleType ) ) ) | otherlv_5= 'else' )
            {
            // InternalKotlin.g:214:3: ()
            // InternalKotlin.g:215:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            // InternalKotlin.g:221:3: ( ( (lv_value_1_0= RULE_INT ) ) | this_TEXT_2= RULE_TEXT | ( ( (lv_conditional_3_0= ruleConditional ) ) ( (lv_type_4_0= ruleType ) ) ) | otherlv_5= 'else' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case RULE_TEXT:
                {
                alt2=2;
                }
                break;
            case 19:
            case 20:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalKotlin.g:222:4: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalKotlin.g:222:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalKotlin.g:223:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalKotlin.g:223:5: (lv_value_1_0= RULE_INT )
                    // InternalKotlin.g:224:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getConditionAccess().getValueINTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKotlin.g:241:4: this_TEXT_2= RULE_TEXT
                    {
                    this_TEXT_2=(Token)match(input,RULE_TEXT,FOLLOW_2); 

                    				newLeafNode(this_TEXT_2, grammarAccess.getConditionAccess().getTEXTTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalKotlin.g:246:4: ( ( (lv_conditional_3_0= ruleConditional ) ) ( (lv_type_4_0= ruleType ) ) )
                    {
                    // InternalKotlin.g:246:4: ( ( (lv_conditional_3_0= ruleConditional ) ) ( (lv_type_4_0= ruleType ) ) )
                    // InternalKotlin.g:247:5: ( (lv_conditional_3_0= ruleConditional ) ) ( (lv_type_4_0= ruleType ) )
                    {
                    // InternalKotlin.g:247:5: ( (lv_conditional_3_0= ruleConditional ) )
                    // InternalKotlin.g:248:6: (lv_conditional_3_0= ruleConditional )
                    {
                    // InternalKotlin.g:248:6: (lv_conditional_3_0= ruleConditional )
                    // InternalKotlin.g:249:7: lv_conditional_3_0= ruleConditional
                    {

                    							newCompositeNode(grammarAccess.getConditionAccess().getConditionalConditionalParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_11);
                    lv_conditional_3_0=ruleConditional();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConditionRule());
                    							}
                    							set(
                    								current,
                    								"conditional",
                    								lv_conditional_3_0,
                    								"org.xtext.example.kotlin.Kotlin.Conditional");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalKotlin.g:266:5: ( (lv_type_4_0= ruleType ) )
                    // InternalKotlin.g:267:6: (lv_type_4_0= ruleType )
                    {
                    // InternalKotlin.g:267:6: (lv_type_4_0= ruleType )
                    // InternalKotlin.g:268:7: lv_type_4_0= ruleType
                    {

                    							newCompositeNode(grammarAccess.getConditionAccess().getTypeTypeParserRuleCall_1_2_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConditionRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_4_0,
                    								"org.xtext.example.kotlin.Kotlin.Type");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalKotlin.g:287:4: otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getElseKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditional"
    // InternalKotlin.g:296:1: entryRuleConditional returns [String current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final String entryRuleConditional() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConditional = null;


        try {
            // InternalKotlin.g:296:51: (iv_ruleConditional= ruleConditional EOF )
            // InternalKotlin.g:297:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalKotlin.g:303:1: ruleConditional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' )? kw= 'is' ) ;
    public final AntlrDatatypeRuleToken ruleConditional() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKotlin.g:309:2: ( ( (kw= '!' )? kw= 'is' ) )
            // InternalKotlin.g:310:2: ( (kw= '!' )? kw= 'is' )
            {
            // InternalKotlin.g:310:2: ( (kw= '!' )? kw= 'is' )
            // InternalKotlin.g:311:3: (kw= '!' )? kw= 'is'
            {
            // InternalKotlin.g:311:3: (kw= '!' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKotlin.g:312:4: kw= '!'
                    {
                    kw=(Token)match(input,19,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getConditionalAccess().getExclamationMarkKeyword_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,20,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getConditionalAccess().getIsKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleType"
    // InternalKotlin.g:327:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalKotlin.g:327:44: (iv_ruleType= ruleType EOF )
            // InternalKotlin.g:328:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalKotlin.g:334:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Long' | kw= 'Int' | kw= 'String' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalKotlin.g:340:2: ( (kw= 'Long' | kw= 'Int' | kw= 'String' ) )
            // InternalKotlin.g:341:2: (kw= 'Long' | kw= 'Int' | kw= 'String' )
            {
            // InternalKotlin.g:341:2: (kw= 'Long' | kw= 'Int' | kw= 'String' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalKotlin.g:342:3: kw= 'Long'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getLongKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKotlin.g:348:3: kw= 'Int'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalKotlin.g:354:3: kw= 'String'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleOutput"
    // InternalKotlin.g:363:1: entryRuleOutput returns [String current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final String entryRuleOutput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutput = null;


        try {
            // InternalKotlin.g:363:46: (iv_ruleOutput= ruleOutput EOF )
            // InternalKotlin.g:364:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalKotlin.g:370:1: ruleOutput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'println(' this_TEXT_1= RULE_TEXT kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleOutput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_TEXT_1=null;


        	enterRule();

        try {
            // InternalKotlin.g:376:2: ( (kw= 'println(' this_TEXT_1= RULE_TEXT kw= ')' ) )
            // InternalKotlin.g:377:2: (kw= 'println(' this_TEXT_1= RULE_TEXT kw= ')' )
            {
            // InternalKotlin.g:377:2: (kw= 'println(' this_TEXT_1= RULE_TEXT kw= ')' )
            // InternalKotlin.g:378:3: kw= 'println(' this_TEXT_1= RULE_TEXT kw= ')'
            {
            kw=(Token)match(input,24,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOutputAccess().getPrintlnKeyword_0());
            		
            this_TEXT_1=(Token)match(input,RULE_TEXT,FOLLOW_5); 

            			current.merge(this_TEXT_1);
            		

            			newLeafNode(this_TEXT_1, grammarAccess.getOutputAccess().getTEXTTerminalRuleCall_1());
            		
            kw=(Token)match(input,14,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getOutputAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001C0060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});

}