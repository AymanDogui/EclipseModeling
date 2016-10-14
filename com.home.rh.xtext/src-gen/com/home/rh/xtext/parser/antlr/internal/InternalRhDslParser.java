package com.home.rh.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.home.rh.xtext.services.RhDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRhDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_DATE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Company'", "'{'", "'employees'", "'}'", "'Employee'", "'weight'", "'height'", "'Project'", "'type'", "'Task'", "'responsable'", "'description'", "'startDate'", "'duration'", "'subtasks'", "'hours'", "'days'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_DATE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRhDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRhDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRhDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRhDsl.g"; }



     	private RhDslGrammarAccess grammarAccess;

        public InternalRhDslParser(TokenStream input, RhDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Company";
       	}

       	@Override
       	protected RhDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompany"
    // InternalRhDsl.g:65:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalRhDsl.g:65:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalRhDsl.g:66:2: iv_ruleCompany= ruleCompany EOF
            {
             newCompositeNode(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompany=ruleCompany();

            state._fsp--;

             current =iv_ruleCompany; 
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
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalRhDsl.g:72:1: ruleCompany returns [EObject current=null] : ( () otherlv_1= 'Company' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'employees' otherlv_5= '{' ( (lv_employees_6_0= ruleEmployee ) )* otherlv_7= '}' ) ( (lv_projects_8_0= ruleProject ) )* otherlv_9= '}' ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_employees_6_0 = null;

        EObject lv_projects_8_0 = null;



        	enterRule();

        try {
            // InternalRhDsl.g:78:2: ( ( () otherlv_1= 'Company' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'employees' otherlv_5= '{' ( (lv_employees_6_0= ruleEmployee ) )* otherlv_7= '}' ) ( (lv_projects_8_0= ruleProject ) )* otherlv_9= '}' ) )
            // InternalRhDsl.g:79:2: ( () otherlv_1= 'Company' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'employees' otherlv_5= '{' ( (lv_employees_6_0= ruleEmployee ) )* otherlv_7= '}' ) ( (lv_projects_8_0= ruleProject ) )* otherlv_9= '}' )
            {
            // InternalRhDsl.g:79:2: ( () otherlv_1= 'Company' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'employees' otherlv_5= '{' ( (lv_employees_6_0= ruleEmployee ) )* otherlv_7= '}' ) ( (lv_projects_8_0= ruleProject ) )* otherlv_9= '}' )
            // InternalRhDsl.g:80:3: () otherlv_1= 'Company' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'employees' otherlv_5= '{' ( (lv_employees_6_0= ruleEmployee ) )* otherlv_7= '}' ) ( (lv_projects_8_0= ruleProject ) )* otherlv_9= '}'
            {
            // InternalRhDsl.g:80:3: ()
            // InternalRhDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompanyAccess().getCompanyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompanyAccess().getCompanyKeyword_1());
            		
            // InternalRhDsl.g:91:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalRhDsl.g:92:4: (lv_name_2_0= RULE_ID )
            {
            // InternalRhDsl.g:92:4: (lv_name_2_0= RULE_ID )
            // InternalRhDsl.g:93:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRhDsl.g:113:3: (otherlv_4= 'employees' otherlv_5= '{' ( (lv_employees_6_0= ruleEmployee ) )* otherlv_7= '}' )
            // InternalRhDsl.g:114:4: otherlv_4= 'employees' otherlv_5= '{' ( (lv_employees_6_0= ruleEmployee ) )* otherlv_7= '}'
            {
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getCompanyAccess().getEmployeesKeyword_4_0());
            			
            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            				newLeafNode(otherlv_5, grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_4_1());
            			
            // InternalRhDsl.g:122:4: ( (lv_employees_6_0= ruleEmployee ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRhDsl.g:123:5: (lv_employees_6_0= ruleEmployee )
            	    {
            	    // InternalRhDsl.g:123:5: (lv_employees_6_0= ruleEmployee )
            	    // InternalRhDsl.g:124:6: lv_employees_6_0= ruleEmployee
            	    {

            	    						newCompositeNode(grammarAccess.getCompanyAccess().getEmployeesEmployeeParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_employees_6_0=ruleEmployee();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"employees",
            	    							lv_employees_6_0,
            	    							"com.home.rh.xtext.RhDsl.Employee");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            				newLeafNode(otherlv_7, grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_4_3());
            			

            }

            // InternalRhDsl.g:146:3: ( (lv_projects_8_0= ruleProject ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRhDsl.g:147:4: (lv_projects_8_0= ruleProject )
            	    {
            	    // InternalRhDsl.g:147:4: (lv_projects_8_0= ruleProject )
            	    // InternalRhDsl.g:148:5: lv_projects_8_0= ruleProject
            	    {

            	    					newCompositeNode(grammarAccess.getCompanyAccess().getProjectsProjectParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_projects_8_0=ruleProject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"projects",
            	    						lv_projects_8_0,
            	    						"com.home.rh.xtext.RhDsl.Project");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleEmployee"
    // InternalRhDsl.g:173:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalRhDsl.g:173:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalRhDsl.g:174:2: iv_ruleEmployee= ruleEmployee EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployee=ruleEmployee();

            state._fsp--;

             current =iv_ruleEmployee; 
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
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalRhDsl.g:180:1: ruleEmployee returns [EObject current=null] : (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )? ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_weight_3_0=null;
        Token otherlv_4=null;
        Token lv_height_5_0=null;


        	enterRule();

        try {
            // InternalRhDsl.g:186:2: ( (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )? ) )
            // InternalRhDsl.g:187:2: (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )? )
            {
            // InternalRhDsl.g:187:2: (otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )? )
            // InternalRhDsl.g:188:3: otherlv_0= 'Employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) )? (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
            		
            // InternalRhDsl.g:192:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRhDsl.g:193:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRhDsl.g:193:4: (lv_name_1_0= RULE_ID )
            // InternalRhDsl.g:194:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRhDsl.g:210:3: (otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRhDsl.g:211:4: otherlv_2= 'weight' ( (lv_weight_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getEmployeeAccess().getWeightKeyword_2_0());
                    			
                    // InternalRhDsl.g:215:4: ( (lv_weight_3_0= RULE_INT ) )
                    // InternalRhDsl.g:216:5: (lv_weight_3_0= RULE_INT )
                    {
                    // InternalRhDsl.g:216:5: (lv_weight_3_0= RULE_INT )
                    // InternalRhDsl.g:217:6: lv_weight_3_0= RULE_INT
                    {
                    lv_weight_3_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_weight_3_0, grammarAccess.getEmployeeAccess().getWeightINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEmployeeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"weight",
                    							lv_weight_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRhDsl.g:234:3: (otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRhDsl.g:235:4: otherlv_4= 'height' ( (lv_height_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getHeightKeyword_3_0());
                    			
                    // InternalRhDsl.g:239:4: ( (lv_height_5_0= RULE_INT ) )
                    // InternalRhDsl.g:240:5: (lv_height_5_0= RULE_INT )
                    {
                    // InternalRhDsl.g:240:5: (lv_height_5_0= RULE_INT )
                    // InternalRhDsl.g:241:6: lv_height_5_0= RULE_INT
                    {
                    lv_height_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_height_5_0, grammarAccess.getEmployeeAccess().getHeightINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEmployeeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"height",
                    							lv_height_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


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
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleProject"
    // InternalRhDsl.g:262:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalRhDsl.g:262:48: (iv_ruleProject= ruleProject EOF )
            // InternalRhDsl.g:263:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalRhDsl.g:269:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )* otherlv_6= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_tasks_5_0 = null;



        	enterRule();

        try {
            // InternalRhDsl.g:275:2: ( (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )* otherlv_6= '}' ) )
            // InternalRhDsl.g:276:2: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )* otherlv_6= '}' )
            {
            // InternalRhDsl.g:276:2: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )* otherlv_6= '}' )
            // InternalRhDsl.g:277:3: otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            // InternalRhDsl.g:281:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRhDsl.g:282:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRhDsl.g:282:4: (lv_name_1_0= RULE_ID )
            // InternalRhDsl.g:283:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalRhDsl.g:299:3: (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )
            // InternalRhDsl.g:300:4: otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) )
            {
            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            				newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getTypeKeyword_2_0());
            			
            // InternalRhDsl.g:304:4: ( (lv_type_3_0= RULE_STRING ) )
            // InternalRhDsl.g:305:5: (lv_type_3_0= RULE_STRING )
            {
            // InternalRhDsl.g:305:5: (lv_type_3_0= RULE_STRING )
            // InternalRhDsl.g:306:6: lv_type_3_0= RULE_STRING
            {
            lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            						newLeafNode(lv_type_3_0, grammarAccess.getProjectAccess().getTypeSTRINGTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getProjectRule());
            						}
            						setWithLastConsumed(
            							current,
            							"type",
            							lv_type_3_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRhDsl.g:327:3: ( (lv_tasks_5_0= ruleTask ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRhDsl.g:328:4: (lv_tasks_5_0= ruleTask )
            	    {
            	    // InternalRhDsl.g:328:4: (lv_tasks_5_0= ruleTask )
            	    // InternalRhDsl.g:329:5: lv_tasks_5_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_tasks_5_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_5_0,
            	    						"com.home.rh.xtext.RhDsl.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleTask"
    // InternalRhDsl.g:354:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalRhDsl.g:354:45: (iv_ruleTask= ruleTask EOF )
            // InternalRhDsl.g:355:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalRhDsl.g:361:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'responsable' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= 'startDate' ( (lv_startDate_7_0= RULE_DATE ) ) otherlv_8= 'duration' ( (lv_duration_9_0= RULE_INT ) ) ( (lv_durationType_10_0= ruleDurationType ) ) (otherlv_11= 'subtasks' otherlv_12= '{' ( (lv_subtasks_13_0= ruleTask ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_startDate_7_0=null;
        Token otherlv_8=null;
        Token lv_duration_9_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_durationType_10_0 = null;

        EObject lv_subtasks_13_0 = null;



        	enterRule();

        try {
            // InternalRhDsl.g:367:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'responsable' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= 'startDate' ( (lv_startDate_7_0= RULE_DATE ) ) otherlv_8= 'duration' ( (lv_duration_9_0= RULE_INT ) ) ( (lv_durationType_10_0= ruleDurationType ) ) (otherlv_11= 'subtasks' otherlv_12= '{' ( (lv_subtasks_13_0= ruleTask ) )* otherlv_14= '}' )? ) )
            // InternalRhDsl.g:368:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'responsable' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= 'startDate' ( (lv_startDate_7_0= RULE_DATE ) ) otherlv_8= 'duration' ( (lv_duration_9_0= RULE_INT ) ) ( (lv_durationType_10_0= ruleDurationType ) ) (otherlv_11= 'subtasks' otherlv_12= '{' ( (lv_subtasks_13_0= ruleTask ) )* otherlv_14= '}' )? )
            {
            // InternalRhDsl.g:368:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'responsable' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= 'startDate' ( (lv_startDate_7_0= RULE_DATE ) ) otherlv_8= 'duration' ( (lv_duration_9_0= RULE_INT ) ) ( (lv_durationType_10_0= ruleDurationType ) ) (otherlv_11= 'subtasks' otherlv_12= '{' ( (lv_subtasks_13_0= ruleTask ) )* otherlv_14= '}' )? )
            // InternalRhDsl.g:369:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'responsable' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= 'startDate' ( (lv_startDate_7_0= RULE_DATE ) ) otherlv_8= 'duration' ( (lv_duration_9_0= RULE_INT ) ) ( (lv_durationType_10_0= ruleDurationType ) ) (otherlv_11= 'subtasks' otherlv_12= '{' ( (lv_subtasks_13_0= ruleTask ) )* otherlv_14= '}' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalRhDsl.g:373:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRhDsl.g:374:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRhDsl.g:374:4: (lv_name_1_0= RULE_ID )
            // InternalRhDsl.g:375:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getResponsableKeyword_2());
            		
            // InternalRhDsl.g:395:3: ( (otherlv_3= RULE_ID ) )
            // InternalRhDsl.g:396:4: (otherlv_3= RULE_ID )
            {
            // InternalRhDsl.g:396:4: (otherlv_3= RULE_ID )
            // InternalRhDsl.g:397:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getResponsableEmployeeCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getDescriptionKeyword_4());
            		
            // InternalRhDsl.g:412:3: ( (lv_description_5_0= RULE_STRING ) )
            // InternalRhDsl.g:413:4: (lv_description_5_0= RULE_STRING )
            {
            // InternalRhDsl.g:413:4: (lv_description_5_0= RULE_STRING )
            // InternalRhDsl.g:414:5: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_description_5_0, grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getStartDateKeyword_6());
            		
            // InternalRhDsl.g:434:3: ( (lv_startDate_7_0= RULE_DATE ) )
            // InternalRhDsl.g:435:4: (lv_startDate_7_0= RULE_DATE )
            {
            // InternalRhDsl.g:435:4: (lv_startDate_7_0= RULE_DATE )
            // InternalRhDsl.g:436:5: lv_startDate_7_0= RULE_DATE
            {
            lv_startDate_7_0=(Token)match(input,RULE_DATE,FOLLOW_18); 

            					newLeafNode(lv_startDate_7_0, grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_7_0,
            						"com.home.rh.xtext.RhDsl.DATE");
            				

            }


            }

            otherlv_8=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getDurationKeyword_8());
            		
            // InternalRhDsl.g:456:3: ( (lv_duration_9_0= RULE_INT ) )
            // InternalRhDsl.g:457:4: (lv_duration_9_0= RULE_INT )
            {
            // InternalRhDsl.g:457:4: (lv_duration_9_0= RULE_INT )
            // InternalRhDsl.g:458:5: lv_duration_9_0= RULE_INT
            {
            lv_duration_9_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_duration_9_0, grammarAccess.getTaskAccess().getDurationINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalRhDsl.g:474:3: ( (lv_durationType_10_0= ruleDurationType ) )
            // InternalRhDsl.g:475:4: (lv_durationType_10_0= ruleDurationType )
            {
            // InternalRhDsl.g:475:4: (lv_durationType_10_0= ruleDurationType )
            // InternalRhDsl.g:476:5: lv_durationType_10_0= ruleDurationType
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getDurationTypeDurationTypeEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_20);
            lv_durationType_10_0=ruleDurationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"durationType",
            						lv_durationType_10_0,
            						"com.home.rh.xtext.RhDsl.DurationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRhDsl.g:493:3: (otherlv_11= 'subtasks' otherlv_12= '{' ( (lv_subtasks_13_0= ruleTask ) )* otherlv_14= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRhDsl.g:494:4: otherlv_11= 'subtasks' otherlv_12= '{' ( (lv_subtasks_13_0= ruleTask ) )* otherlv_14= '}'
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getSubtasksKeyword_11_0());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalRhDsl.g:502:4: ( (lv_subtasks_13_0= ruleTask ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRhDsl.g:503:5: (lv_subtasks_13_0= ruleTask )
                    	    {
                    	    // InternalRhDsl.g:503:5: (lv_subtasks_13_0= ruleTask )
                    	    // InternalRhDsl.g:504:6: lv_subtasks_13_0= ruleTask
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskAccess().getSubtasksTaskParserRuleCall_11_2_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_subtasks_13_0=ruleTask();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subtasks",
                    	    							lv_subtasks_13_0,
                    	    							"com.home.rh.xtext.RhDsl.Task");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_11_3());
                    			

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "ruleDurationType"
    // InternalRhDsl.g:530:1: ruleDurationType returns [Enumerator current=null] : ( (enumLiteral_0= 'hours' ) | (enumLiteral_1= 'days' ) ) ;
    public final Enumerator ruleDurationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRhDsl.g:536:2: ( ( (enumLiteral_0= 'hours' ) | (enumLiteral_1= 'days' ) ) )
            // InternalRhDsl.g:537:2: ( (enumLiteral_0= 'hours' ) | (enumLiteral_1= 'days' ) )
            {
            // InternalRhDsl.g:537:2: ( (enumLiteral_0= 'hours' ) | (enumLiteral_1= 'days' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==28) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRhDsl.g:538:3: (enumLiteral_0= 'hours' )
                    {
                    // InternalRhDsl.g:538:3: (enumLiteral_0= 'hours' )
                    // InternalRhDsl.g:539:4: enumLiteral_0= 'hours'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDurationTypeAccess().getHoursEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDurationTypeAccess().getHoursEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRhDsl.g:546:3: (enumLiteral_1= 'days' )
                    {
                    // InternalRhDsl.g:546:3: (enumLiteral_1= 'days' )
                    // InternalRhDsl.g:547:4: enumLiteral_1= 'days'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getDurationTypeAccess().getDaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDurationTypeAccess().getDaysEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleDurationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});

}