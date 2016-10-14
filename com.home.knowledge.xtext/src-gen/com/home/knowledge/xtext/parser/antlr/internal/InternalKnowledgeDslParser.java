package com.home.knowledge.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.home.knowledge.xtext.services.KnowledgeDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKnowledgeDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Organisation'", "'{'", "'currentProblem'", "'experiences'", "','", "'}'", "'Experience'", "'problems'", "'solutions'", "'Problem'", "'Solution'", "'description'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalKnowledgeDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKnowledgeDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKnowledgeDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKnowledgeDsl.g"; }



     	private KnowledgeDslGrammarAccess grammarAccess;

        public InternalKnowledgeDslParser(TokenStream input, KnowledgeDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Organisation";
       	}

       	@Override
       	protected KnowledgeDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOrganisation"
    // InternalKnowledgeDsl.g:64:1: entryRuleOrganisation returns [EObject current=null] : iv_ruleOrganisation= ruleOrganisation EOF ;
    public final EObject entryRuleOrganisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganisation = null;


        try {
            // InternalKnowledgeDsl.g:64:53: (iv_ruleOrganisation= ruleOrganisation EOF )
            // InternalKnowledgeDsl.g:65:2: iv_ruleOrganisation= ruleOrganisation EOF
            {
             newCompositeNode(grammarAccess.getOrganisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrganisation=ruleOrganisation();

            state._fsp--;

             current =iv_ruleOrganisation; 
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
    // $ANTLR end "entryRuleOrganisation"


    // $ANTLR start "ruleOrganisation"
    // InternalKnowledgeDsl.g:71:1: ruleOrganisation returns [EObject current=null] : ( () otherlv_1= 'Organisation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentProblem' ( ( ruleEString ) ) )? (otherlv_6= 'experiences' otherlv_7= '{' ( (lv_experiences_8_0= ruleExperience ) ) (otherlv_9= ',' ( (lv_experiences_10_0= ruleExperience ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleOrganisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_experiences_8_0 = null;

        EObject lv_experiences_10_0 = null;



        	enterRule();

        try {
            // InternalKnowledgeDsl.g:77:2: ( ( () otherlv_1= 'Organisation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentProblem' ( ( ruleEString ) ) )? (otherlv_6= 'experiences' otherlv_7= '{' ( (lv_experiences_8_0= ruleExperience ) ) (otherlv_9= ',' ( (lv_experiences_10_0= ruleExperience ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalKnowledgeDsl.g:78:2: ( () otherlv_1= 'Organisation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentProblem' ( ( ruleEString ) ) )? (otherlv_6= 'experiences' otherlv_7= '{' ( (lv_experiences_8_0= ruleExperience ) ) (otherlv_9= ',' ( (lv_experiences_10_0= ruleExperience ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalKnowledgeDsl.g:78:2: ( () otherlv_1= 'Organisation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentProblem' ( ( ruleEString ) ) )? (otherlv_6= 'experiences' otherlv_7= '{' ( (lv_experiences_8_0= ruleExperience ) ) (otherlv_9= ',' ( (lv_experiences_10_0= ruleExperience ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalKnowledgeDsl.g:79:3: () otherlv_1= 'Organisation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'currentProblem' ( ( ruleEString ) ) )? (otherlv_6= 'experiences' otherlv_7= '{' ( (lv_experiences_8_0= ruleExperience ) ) (otherlv_9= ',' ( (lv_experiences_10_0= ruleExperience ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalKnowledgeDsl.g:79:3: ()
            // InternalKnowledgeDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOrganisationAccess().getOrganisationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOrganisationAccess().getOrganisationKeyword_1());
            		
            // InternalKnowledgeDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKnowledgeDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalKnowledgeDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalKnowledgeDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOrganisationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrganisationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.home.knowledge.xtext.KnowledgeDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getOrganisationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalKnowledgeDsl.g:113:3: (otherlv_4= 'currentProblem' ( ( ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKnowledgeDsl.g:114:4: otherlv_4= 'currentProblem' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getOrganisationAccess().getCurrentProblemKeyword_4_0());
                    			
                    // InternalKnowledgeDsl.g:118:4: ( ( ruleEString ) )
                    // InternalKnowledgeDsl.g:119:5: ( ruleEString )
                    {
                    // InternalKnowledgeDsl.g:119:5: ( ruleEString )
                    // InternalKnowledgeDsl.g:120:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOrganisationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOrganisationAccess().getCurrentProblemProblemCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalKnowledgeDsl.g:135:3: (otherlv_6= 'experiences' otherlv_7= '{' ( (lv_experiences_8_0= ruleExperience ) ) (otherlv_9= ',' ( (lv_experiences_10_0= ruleExperience ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKnowledgeDsl.g:136:4: otherlv_6= 'experiences' otherlv_7= '{' ( (lv_experiences_8_0= ruleExperience ) ) (otherlv_9= ',' ( (lv_experiences_10_0= ruleExperience ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getOrganisationAccess().getExperiencesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getOrganisationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalKnowledgeDsl.g:144:4: ( (lv_experiences_8_0= ruleExperience ) )
                    // InternalKnowledgeDsl.g:145:5: (lv_experiences_8_0= ruleExperience )
                    {
                    // InternalKnowledgeDsl.g:145:5: (lv_experiences_8_0= ruleExperience )
                    // InternalKnowledgeDsl.g:146:6: lv_experiences_8_0= ruleExperience
                    {

                    						newCompositeNode(grammarAccess.getOrganisationAccess().getExperiencesExperienceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_experiences_8_0=ruleExperience();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrganisationRule());
                    						}
                    						add(
                    							current,
                    							"experiences",
                    							lv_experiences_8_0,
                    							"com.home.knowledge.xtext.KnowledgeDsl.Experience");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKnowledgeDsl.g:163:4: (otherlv_9= ',' ( (lv_experiences_10_0= ruleExperience ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalKnowledgeDsl.g:164:5: otherlv_9= ',' ( (lv_experiences_10_0= ruleExperience ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getOrganisationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalKnowledgeDsl.g:168:5: ( (lv_experiences_10_0= ruleExperience ) )
                    	    // InternalKnowledgeDsl.g:169:6: (lv_experiences_10_0= ruleExperience )
                    	    {
                    	    // InternalKnowledgeDsl.g:169:6: (lv_experiences_10_0= ruleExperience )
                    	    // InternalKnowledgeDsl.g:170:7: lv_experiences_10_0= ruleExperience
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrganisationAccess().getExperiencesExperienceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_experiences_10_0=ruleExperience();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOrganisationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"experiences",
                    	    								lv_experiences_10_0,
                    	    								"com.home.knowledge.xtext.KnowledgeDsl.Experience");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getOrganisationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getOrganisationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleOrganisation"


    // $ANTLR start "entryRuleEString"
    // InternalKnowledgeDsl.g:201:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalKnowledgeDsl.g:201:47: (iv_ruleEString= ruleEString EOF )
            // InternalKnowledgeDsl.g:202:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalKnowledgeDsl.g:208:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalKnowledgeDsl.g:214:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalKnowledgeDsl.g:215:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalKnowledgeDsl.g:215:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalKnowledgeDsl.g:216:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKnowledgeDsl.g:224:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExperience"
    // InternalKnowledgeDsl.g:235:1: entryRuleExperience returns [EObject current=null] : iv_ruleExperience= ruleExperience EOF ;
    public final EObject entryRuleExperience() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperience = null;


        try {
            // InternalKnowledgeDsl.g:235:51: (iv_ruleExperience= ruleExperience EOF )
            // InternalKnowledgeDsl.g:236:2: iv_ruleExperience= ruleExperience EOF
            {
             newCompositeNode(grammarAccess.getExperienceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperience=ruleExperience();

            state._fsp--;

             current =iv_ruleExperience; 
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
    // $ANTLR end "entryRuleExperience"


    // $ANTLR start "ruleExperience"
    // InternalKnowledgeDsl.g:242:1: ruleExperience returns [EObject current=null] : (otherlv_0= 'Experience' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'problems' otherlv_4= '{' ( (lv_problems_5_0= ruleProblem ) ) (otherlv_6= ',' ( (lv_problems_7_0= ruleProblem ) ) )* otherlv_8= '}' )? otherlv_9= 'solutions' otherlv_10= '{' ( (lv_solutions_11_0= ruleSolution ) ) (otherlv_12= ',' ( (lv_solutions_13_0= ruleSolution ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleExperience() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_problems_5_0 = null;

        EObject lv_problems_7_0 = null;

        EObject lv_solutions_11_0 = null;

        EObject lv_solutions_13_0 = null;



        	enterRule();

        try {
            // InternalKnowledgeDsl.g:248:2: ( (otherlv_0= 'Experience' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'problems' otherlv_4= '{' ( (lv_problems_5_0= ruleProblem ) ) (otherlv_6= ',' ( (lv_problems_7_0= ruleProblem ) ) )* otherlv_8= '}' )? otherlv_9= 'solutions' otherlv_10= '{' ( (lv_solutions_11_0= ruleSolution ) ) (otherlv_12= ',' ( (lv_solutions_13_0= ruleSolution ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalKnowledgeDsl.g:249:2: (otherlv_0= 'Experience' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'problems' otherlv_4= '{' ( (lv_problems_5_0= ruleProblem ) ) (otherlv_6= ',' ( (lv_problems_7_0= ruleProblem ) ) )* otherlv_8= '}' )? otherlv_9= 'solutions' otherlv_10= '{' ( (lv_solutions_11_0= ruleSolution ) ) (otherlv_12= ',' ( (lv_solutions_13_0= ruleSolution ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalKnowledgeDsl.g:249:2: (otherlv_0= 'Experience' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'problems' otherlv_4= '{' ( (lv_problems_5_0= ruleProblem ) ) (otherlv_6= ',' ( (lv_problems_7_0= ruleProblem ) ) )* otherlv_8= '}' )? otherlv_9= 'solutions' otherlv_10= '{' ( (lv_solutions_11_0= ruleSolution ) ) (otherlv_12= ',' ( (lv_solutions_13_0= ruleSolution ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalKnowledgeDsl.g:250:3: otherlv_0= 'Experience' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'problems' otherlv_4= '{' ( (lv_problems_5_0= ruleProblem ) ) (otherlv_6= ',' ( (lv_problems_7_0= ruleProblem ) ) )* otherlv_8= '}' )? otherlv_9= 'solutions' otherlv_10= '{' ( (lv_solutions_11_0= ruleSolution ) ) (otherlv_12= ',' ( (lv_solutions_13_0= ruleSolution ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExperienceAccess().getExperienceKeyword_0());
            		
            // InternalKnowledgeDsl.g:254:3: ( (lv_name_1_0= ruleEString ) )
            // InternalKnowledgeDsl.g:255:4: (lv_name_1_0= ruleEString )
            {
            // InternalKnowledgeDsl.g:255:4: (lv_name_1_0= ruleEString )
            // InternalKnowledgeDsl.g:256:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExperienceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExperienceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.home.knowledge.xtext.KnowledgeDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalKnowledgeDsl.g:277:3: (otherlv_3= 'problems' otherlv_4= '{' ( (lv_problems_5_0= ruleProblem ) ) (otherlv_6= ',' ( (lv_problems_7_0= ruleProblem ) ) )* otherlv_8= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKnowledgeDsl.g:278:4: otherlv_3= 'problems' otherlv_4= '{' ( (lv_problems_5_0= ruleProblem ) ) (otherlv_6= ',' ( (lv_problems_7_0= ruleProblem ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getExperienceAccess().getProblemsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_4, grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalKnowledgeDsl.g:286:4: ( (lv_problems_5_0= ruleProblem ) )
                    // InternalKnowledgeDsl.g:287:5: (lv_problems_5_0= ruleProblem )
                    {
                    // InternalKnowledgeDsl.g:287:5: (lv_problems_5_0= ruleProblem )
                    // InternalKnowledgeDsl.g:288:6: lv_problems_5_0= ruleProblem
                    {

                    						newCompositeNode(grammarAccess.getExperienceAccess().getProblemsProblemParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_problems_5_0=ruleProblem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExperienceRule());
                    						}
                    						add(
                    							current,
                    							"problems",
                    							lv_problems_5_0,
                    							"com.home.knowledge.xtext.KnowledgeDsl.Problem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalKnowledgeDsl.g:305:4: (otherlv_6= ',' ( (lv_problems_7_0= ruleProblem ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalKnowledgeDsl.g:306:5: otherlv_6= ',' ( (lv_problems_7_0= ruleProblem ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_11); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getExperienceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalKnowledgeDsl.g:310:5: ( (lv_problems_7_0= ruleProblem ) )
                    	    // InternalKnowledgeDsl.g:311:6: (lv_problems_7_0= ruleProblem )
                    	    {
                    	    // InternalKnowledgeDsl.g:311:6: (lv_problems_7_0= ruleProblem )
                    	    // InternalKnowledgeDsl.g:312:7: lv_problems_7_0= ruleProblem
                    	    {

                    	    							newCompositeNode(grammarAccess.getExperienceAccess().getProblemsProblemParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_problems_7_0=ruleProblem();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExperienceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"problems",
                    	    								lv_problems_7_0,
                    	    								"com.home.knowledge.xtext.KnowledgeDsl.Problem");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getExperienceAccess().getSolutionsKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalKnowledgeDsl.g:343:3: ( (lv_solutions_11_0= ruleSolution ) )
            // InternalKnowledgeDsl.g:344:4: (lv_solutions_11_0= ruleSolution )
            {
            // InternalKnowledgeDsl.g:344:4: (lv_solutions_11_0= ruleSolution )
            // InternalKnowledgeDsl.g:345:5: lv_solutions_11_0= ruleSolution
            {

            					newCompositeNode(grammarAccess.getExperienceAccess().getSolutionsSolutionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_solutions_11_0=ruleSolution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExperienceRule());
            					}
            					add(
            						current,
            						"solutions",
            						lv_solutions_11_0,
            						"com.home.knowledge.xtext.KnowledgeDsl.Solution");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKnowledgeDsl.g:362:3: (otherlv_12= ',' ( (lv_solutions_13_0= ruleSolution ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKnowledgeDsl.g:363:4: otherlv_12= ',' ( (lv_solutions_13_0= ruleSolution ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_12, grammarAccess.getExperienceAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalKnowledgeDsl.g:367:4: ( (lv_solutions_13_0= ruleSolution ) )
            	    // InternalKnowledgeDsl.g:368:5: (lv_solutions_13_0= ruleSolution )
            	    {
            	    // InternalKnowledgeDsl.g:368:5: (lv_solutions_13_0= ruleSolution )
            	    // InternalKnowledgeDsl.g:369:6: lv_solutions_13_0= ruleSolution
            	    {

            	    						newCompositeNode(grammarAccess.getExperienceAccess().getSolutionsSolutionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_solutions_13_0=ruleSolution();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperienceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"solutions",
            	    							lv_solutions_13_0,
            	    							"com.home.knowledge.xtext.KnowledgeDsl.Solution");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_14, grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleExperience"


    // $ANTLR start "entryRuleProblem"
    // InternalKnowledgeDsl.g:399:1: entryRuleProblem returns [EObject current=null] : iv_ruleProblem= ruleProblem EOF ;
    public final EObject entryRuleProblem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblem = null;


        try {
            // InternalKnowledgeDsl.g:399:48: (iv_ruleProblem= ruleProblem EOF )
            // InternalKnowledgeDsl.g:400:2: iv_ruleProblem= ruleProblem EOF
            {
             newCompositeNode(grammarAccess.getProblemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProblem=ruleProblem();

            state._fsp--;

             current =iv_ruleProblem; 
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
    // $ANTLR end "entryRuleProblem"


    // $ANTLR start "ruleProblem"
    // InternalKnowledgeDsl.g:406:1: ruleProblem returns [EObject current=null] : (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'solutions' otherlv_4= '{' ( (lv_solutions_5_0= ruleSolution ) ) (otherlv_6= ',' ( (lv_solutions_7_0= ruleSolution ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleProblem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_solutions_5_0 = null;

        EObject lv_solutions_7_0 = null;



        	enterRule();

        try {
            // InternalKnowledgeDsl.g:412:2: ( (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'solutions' otherlv_4= '{' ( (lv_solutions_5_0= ruleSolution ) ) (otherlv_6= ',' ( (lv_solutions_7_0= ruleSolution ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalKnowledgeDsl.g:413:2: (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'solutions' otherlv_4= '{' ( (lv_solutions_5_0= ruleSolution ) ) (otherlv_6= ',' ( (lv_solutions_7_0= ruleSolution ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalKnowledgeDsl.g:413:2: (otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'solutions' otherlv_4= '{' ( (lv_solutions_5_0= ruleSolution ) ) (otherlv_6= ',' ( (lv_solutions_7_0= ruleSolution ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalKnowledgeDsl.g:414:3: otherlv_0= 'Problem' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'solutions' otherlv_4= '{' ( (lv_solutions_5_0= ruleSolution ) ) (otherlv_6= ',' ( (lv_solutions_7_0= ruleSolution ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProblemAccess().getProblemKeyword_0());
            		
            // InternalKnowledgeDsl.g:418:3: ( (lv_name_1_0= ruleEString ) )
            // InternalKnowledgeDsl.g:419:4: (lv_name_1_0= ruleEString )
            {
            // InternalKnowledgeDsl.g:419:4: (lv_name_1_0= ruleEString )
            // InternalKnowledgeDsl.g:420:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProblemAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProblemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"com.home.knowledge.xtext.KnowledgeDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getProblemAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getProblemAccess().getSolutionsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getProblemAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalKnowledgeDsl.g:449:3: ( (lv_solutions_5_0= ruleSolution ) )
            // InternalKnowledgeDsl.g:450:4: (lv_solutions_5_0= ruleSolution )
            {
            // InternalKnowledgeDsl.g:450:4: (lv_solutions_5_0= ruleSolution )
            // InternalKnowledgeDsl.g:451:5: lv_solutions_5_0= ruleSolution
            {

            					newCompositeNode(grammarAccess.getProblemAccess().getSolutionsSolutionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_solutions_5_0=ruleSolution();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProblemRule());
            					}
            					add(
            						current,
            						"solutions",
            						lv_solutions_5_0,
            						"com.home.knowledge.xtext.KnowledgeDsl.Solution");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKnowledgeDsl.g:468:3: (otherlv_6= ',' ( (lv_solutions_7_0= ruleSolution ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKnowledgeDsl.g:469:4: otherlv_6= ',' ( (lv_solutions_7_0= ruleSolution ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getProblemAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalKnowledgeDsl.g:473:4: ( (lv_solutions_7_0= ruleSolution ) )
            	    // InternalKnowledgeDsl.g:474:5: (lv_solutions_7_0= ruleSolution )
            	    {
            	    // InternalKnowledgeDsl.g:474:5: (lv_solutions_7_0= ruleSolution )
            	    // InternalKnowledgeDsl.g:475:6: lv_solutions_7_0= ruleSolution
            	    {

            	    						newCompositeNode(grammarAccess.getProblemAccess().getSolutionsSolutionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_solutions_7_0=ruleSolution();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProblemRule());
            	    						}
            	    						add(
            	    							current,
            	    							"solutions",
            	    							lv_solutions_7_0,
            	    							"com.home.knowledge.xtext.KnowledgeDsl.Solution");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getProblemAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProblemAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleProblem"


    // $ANTLR start "entryRuleSolution"
    // InternalKnowledgeDsl.g:505:1: entryRuleSolution returns [EObject current=null] : iv_ruleSolution= ruleSolution EOF ;
    public final EObject entryRuleSolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSolution = null;


        try {
            // InternalKnowledgeDsl.g:505:49: (iv_ruleSolution= ruleSolution EOF )
            // InternalKnowledgeDsl.g:506:2: iv_ruleSolution= ruleSolution EOF
            {
             newCompositeNode(grammarAccess.getSolutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSolution=ruleSolution();

            state._fsp--;

             current =iv_ruleSolution; 
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
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // InternalKnowledgeDsl.g:512:1: ruleSolution returns [EObject current=null] : ( () otherlv_1= 'Solution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalKnowledgeDsl.g:518:2: ( ( () otherlv_1= 'Solution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalKnowledgeDsl.g:519:2: ( () otherlv_1= 'Solution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalKnowledgeDsl.g:519:2: ( () otherlv_1= 'Solution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalKnowledgeDsl.g:520:3: () otherlv_1= 'Solution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalKnowledgeDsl.g:520:3: ()
            // InternalKnowledgeDsl.g:521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSolutionAccess().getSolutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSolutionAccess().getSolutionKeyword_1());
            		
            // InternalKnowledgeDsl.g:531:3: ( (lv_name_2_0= ruleEString ) )
            // InternalKnowledgeDsl.g:532:4: (lv_name_2_0= ruleEString )
            {
            // InternalKnowledgeDsl.g:532:4: (lv_name_2_0= ruleEString )
            // InternalKnowledgeDsl.g:533:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSolutionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSolutionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"com.home.knowledge.xtext.KnowledgeDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalKnowledgeDsl.g:554:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKnowledgeDsl.g:555:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSolutionAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalKnowledgeDsl.g:559:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalKnowledgeDsl.g:560:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalKnowledgeDsl.g:560:5: (lv_description_5_0= ruleEString )
                    // InternalKnowledgeDsl.g:561:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSolutionAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSolutionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"com.home.knowledge.xtext.KnowledgeDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleSolution"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000410000L});

}