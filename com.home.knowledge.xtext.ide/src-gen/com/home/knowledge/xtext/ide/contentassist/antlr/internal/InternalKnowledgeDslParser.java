package com.home.knowledge.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.home.knowledge.xtext.services.KnowledgeDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKnowledgeDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Organisation'", "'{'", "'}'", "'currentProblem'", "'experiences'", "','", "'Experience'", "'solutions'", "'problems'", "'Problem'", "'Solution'", "'description'"
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

    	public void setGrammarAccess(KnowledgeDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleOrganisation"
    // InternalKnowledgeDsl.g:53:1: entryRuleOrganisation : ruleOrganisation EOF ;
    public final void entryRuleOrganisation() throws RecognitionException {
        try {
            // InternalKnowledgeDsl.g:54:1: ( ruleOrganisation EOF )
            // InternalKnowledgeDsl.g:55:1: ruleOrganisation EOF
            {
             before(grammarAccess.getOrganisationRule()); 
            pushFollow(FOLLOW_1);
            ruleOrganisation();

            state._fsp--;

             after(grammarAccess.getOrganisationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrganisation"


    // $ANTLR start "ruleOrganisation"
    // InternalKnowledgeDsl.g:62:1: ruleOrganisation : ( ( rule__Organisation__Group__0 ) ) ;
    public final void ruleOrganisation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:66:2: ( ( ( rule__Organisation__Group__0 ) ) )
            // InternalKnowledgeDsl.g:67:2: ( ( rule__Organisation__Group__0 ) )
            {
            // InternalKnowledgeDsl.g:67:2: ( ( rule__Organisation__Group__0 ) )
            // InternalKnowledgeDsl.g:68:3: ( rule__Organisation__Group__0 )
            {
             before(grammarAccess.getOrganisationAccess().getGroup()); 
            // InternalKnowledgeDsl.g:69:3: ( rule__Organisation__Group__0 )
            // InternalKnowledgeDsl.g:69:4: rule__Organisation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Organisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrganisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrganisation"


    // $ANTLR start "entryRuleEString"
    // InternalKnowledgeDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalKnowledgeDsl.g:79:1: ( ruleEString EOF )
            // InternalKnowledgeDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalKnowledgeDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalKnowledgeDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalKnowledgeDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalKnowledgeDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalKnowledgeDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalKnowledgeDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleExperience"
    // InternalKnowledgeDsl.g:103:1: entryRuleExperience : ruleExperience EOF ;
    public final void entryRuleExperience() throws RecognitionException {
        try {
            // InternalKnowledgeDsl.g:104:1: ( ruleExperience EOF )
            // InternalKnowledgeDsl.g:105:1: ruleExperience EOF
            {
             before(grammarAccess.getExperienceRule()); 
            pushFollow(FOLLOW_1);
            ruleExperience();

            state._fsp--;

             after(grammarAccess.getExperienceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExperience"


    // $ANTLR start "ruleExperience"
    // InternalKnowledgeDsl.g:112:1: ruleExperience : ( ( rule__Experience__Group__0 ) ) ;
    public final void ruleExperience() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:116:2: ( ( ( rule__Experience__Group__0 ) ) )
            // InternalKnowledgeDsl.g:117:2: ( ( rule__Experience__Group__0 ) )
            {
            // InternalKnowledgeDsl.g:117:2: ( ( rule__Experience__Group__0 ) )
            // InternalKnowledgeDsl.g:118:3: ( rule__Experience__Group__0 )
            {
             before(grammarAccess.getExperienceAccess().getGroup()); 
            // InternalKnowledgeDsl.g:119:3: ( rule__Experience__Group__0 )
            // InternalKnowledgeDsl.g:119:4: rule__Experience__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Experience__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperience"


    // $ANTLR start "entryRuleProblem"
    // InternalKnowledgeDsl.g:128:1: entryRuleProblem : ruleProblem EOF ;
    public final void entryRuleProblem() throws RecognitionException {
        try {
            // InternalKnowledgeDsl.g:129:1: ( ruleProblem EOF )
            // InternalKnowledgeDsl.g:130:1: ruleProblem EOF
            {
             before(grammarAccess.getProblemRule()); 
            pushFollow(FOLLOW_1);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getProblemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProblem"


    // $ANTLR start "ruleProblem"
    // InternalKnowledgeDsl.g:137:1: ruleProblem : ( ( rule__Problem__Group__0 ) ) ;
    public final void ruleProblem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:141:2: ( ( ( rule__Problem__Group__0 ) ) )
            // InternalKnowledgeDsl.g:142:2: ( ( rule__Problem__Group__0 ) )
            {
            // InternalKnowledgeDsl.g:142:2: ( ( rule__Problem__Group__0 ) )
            // InternalKnowledgeDsl.g:143:3: ( rule__Problem__Group__0 )
            {
             before(grammarAccess.getProblemAccess().getGroup()); 
            // InternalKnowledgeDsl.g:144:3: ( rule__Problem__Group__0 )
            // InternalKnowledgeDsl.g:144:4: rule__Problem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Problem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProblem"


    // $ANTLR start "entryRuleSolution"
    // InternalKnowledgeDsl.g:153:1: entryRuleSolution : ruleSolution EOF ;
    public final void entryRuleSolution() throws RecognitionException {
        try {
            // InternalKnowledgeDsl.g:154:1: ( ruleSolution EOF )
            // InternalKnowledgeDsl.g:155:1: ruleSolution EOF
            {
             before(grammarAccess.getSolutionRule()); 
            pushFollow(FOLLOW_1);
            ruleSolution();

            state._fsp--;

             after(grammarAccess.getSolutionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSolution"


    // $ANTLR start "ruleSolution"
    // InternalKnowledgeDsl.g:162:1: ruleSolution : ( ( rule__Solution__Group__0 ) ) ;
    public final void ruleSolution() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:166:2: ( ( ( rule__Solution__Group__0 ) ) )
            // InternalKnowledgeDsl.g:167:2: ( ( rule__Solution__Group__0 ) )
            {
            // InternalKnowledgeDsl.g:167:2: ( ( rule__Solution__Group__0 ) )
            // InternalKnowledgeDsl.g:168:3: ( rule__Solution__Group__0 )
            {
             before(grammarAccess.getSolutionAccess().getGroup()); 
            // InternalKnowledgeDsl.g:169:3: ( rule__Solution__Group__0 )
            // InternalKnowledgeDsl.g:169:4: rule__Solution__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSolution"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalKnowledgeDsl.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalKnowledgeDsl.g:182:2: ( RULE_STRING )
                    {
                    // InternalKnowledgeDsl.g:182:2: ( RULE_STRING )
                    // InternalKnowledgeDsl.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalKnowledgeDsl.g:188:2: ( RULE_ID )
                    {
                    // InternalKnowledgeDsl.g:188:2: ( RULE_ID )
                    // InternalKnowledgeDsl.g:189:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Organisation__Group__0"
    // InternalKnowledgeDsl.g:198:1: rule__Organisation__Group__0 : rule__Organisation__Group__0__Impl rule__Organisation__Group__1 ;
    public final void rule__Organisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:202:1: ( rule__Organisation__Group__0__Impl rule__Organisation__Group__1 )
            // InternalKnowledgeDsl.g:203:2: rule__Organisation__Group__0__Impl rule__Organisation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Organisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__0"


    // $ANTLR start "rule__Organisation__Group__0__Impl"
    // InternalKnowledgeDsl.g:210:1: rule__Organisation__Group__0__Impl : ( () ) ;
    public final void rule__Organisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:214:1: ( ( () ) )
            // InternalKnowledgeDsl.g:215:1: ( () )
            {
            // InternalKnowledgeDsl.g:215:1: ( () )
            // InternalKnowledgeDsl.g:216:2: ()
            {
             before(grammarAccess.getOrganisationAccess().getOrganisationAction_0()); 
            // InternalKnowledgeDsl.g:217:2: ()
            // InternalKnowledgeDsl.g:217:3: 
            {
            }

             after(grammarAccess.getOrganisationAccess().getOrganisationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__0__Impl"


    // $ANTLR start "rule__Organisation__Group__1"
    // InternalKnowledgeDsl.g:225:1: rule__Organisation__Group__1 : rule__Organisation__Group__1__Impl rule__Organisation__Group__2 ;
    public final void rule__Organisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:229:1: ( rule__Organisation__Group__1__Impl rule__Organisation__Group__2 )
            // InternalKnowledgeDsl.g:230:2: rule__Organisation__Group__1__Impl rule__Organisation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Organisation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__1"


    // $ANTLR start "rule__Organisation__Group__1__Impl"
    // InternalKnowledgeDsl.g:237:1: rule__Organisation__Group__1__Impl : ( 'Organisation' ) ;
    public final void rule__Organisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:241:1: ( ( 'Organisation' ) )
            // InternalKnowledgeDsl.g:242:1: ( 'Organisation' )
            {
            // InternalKnowledgeDsl.g:242:1: ( 'Organisation' )
            // InternalKnowledgeDsl.g:243:2: 'Organisation'
            {
             before(grammarAccess.getOrganisationAccess().getOrganisationKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getOrganisationAccess().getOrganisationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__1__Impl"


    // $ANTLR start "rule__Organisation__Group__2"
    // InternalKnowledgeDsl.g:252:1: rule__Organisation__Group__2 : rule__Organisation__Group__2__Impl rule__Organisation__Group__3 ;
    public final void rule__Organisation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:256:1: ( rule__Organisation__Group__2__Impl rule__Organisation__Group__3 )
            // InternalKnowledgeDsl.g:257:2: rule__Organisation__Group__2__Impl rule__Organisation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Organisation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__2"


    // $ANTLR start "rule__Organisation__Group__2__Impl"
    // InternalKnowledgeDsl.g:264:1: rule__Organisation__Group__2__Impl : ( ( rule__Organisation__NameAssignment_2 ) ) ;
    public final void rule__Organisation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:268:1: ( ( ( rule__Organisation__NameAssignment_2 ) ) )
            // InternalKnowledgeDsl.g:269:1: ( ( rule__Organisation__NameAssignment_2 ) )
            {
            // InternalKnowledgeDsl.g:269:1: ( ( rule__Organisation__NameAssignment_2 ) )
            // InternalKnowledgeDsl.g:270:2: ( rule__Organisation__NameAssignment_2 )
            {
             before(grammarAccess.getOrganisationAccess().getNameAssignment_2()); 
            // InternalKnowledgeDsl.g:271:2: ( rule__Organisation__NameAssignment_2 )
            // InternalKnowledgeDsl.g:271:3: rule__Organisation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Organisation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrganisationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__2__Impl"


    // $ANTLR start "rule__Organisation__Group__3"
    // InternalKnowledgeDsl.g:279:1: rule__Organisation__Group__3 : rule__Organisation__Group__3__Impl rule__Organisation__Group__4 ;
    public final void rule__Organisation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:283:1: ( rule__Organisation__Group__3__Impl rule__Organisation__Group__4 )
            // InternalKnowledgeDsl.g:284:2: rule__Organisation__Group__3__Impl rule__Organisation__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Organisation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__3"


    // $ANTLR start "rule__Organisation__Group__3__Impl"
    // InternalKnowledgeDsl.g:291:1: rule__Organisation__Group__3__Impl : ( '{' ) ;
    public final void rule__Organisation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:295:1: ( ( '{' ) )
            // InternalKnowledgeDsl.g:296:1: ( '{' )
            {
            // InternalKnowledgeDsl.g:296:1: ( '{' )
            // InternalKnowledgeDsl.g:297:2: '{'
            {
             before(grammarAccess.getOrganisationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOrganisationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__3__Impl"


    // $ANTLR start "rule__Organisation__Group__4"
    // InternalKnowledgeDsl.g:306:1: rule__Organisation__Group__4 : rule__Organisation__Group__4__Impl rule__Organisation__Group__5 ;
    public final void rule__Organisation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:310:1: ( rule__Organisation__Group__4__Impl rule__Organisation__Group__5 )
            // InternalKnowledgeDsl.g:311:2: rule__Organisation__Group__4__Impl rule__Organisation__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Organisation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__4"


    // $ANTLR start "rule__Organisation__Group__4__Impl"
    // InternalKnowledgeDsl.g:318:1: rule__Organisation__Group__4__Impl : ( ( rule__Organisation__Group_4__0 )? ) ;
    public final void rule__Organisation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:322:1: ( ( ( rule__Organisation__Group_4__0 )? ) )
            // InternalKnowledgeDsl.g:323:1: ( ( rule__Organisation__Group_4__0 )? )
            {
            // InternalKnowledgeDsl.g:323:1: ( ( rule__Organisation__Group_4__0 )? )
            // InternalKnowledgeDsl.g:324:2: ( rule__Organisation__Group_4__0 )?
            {
             before(grammarAccess.getOrganisationAccess().getGroup_4()); 
            // InternalKnowledgeDsl.g:325:2: ( rule__Organisation__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKnowledgeDsl.g:325:3: rule__Organisation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Organisation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrganisationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__4__Impl"


    // $ANTLR start "rule__Organisation__Group__5"
    // InternalKnowledgeDsl.g:333:1: rule__Organisation__Group__5 : rule__Organisation__Group__5__Impl rule__Organisation__Group__6 ;
    public final void rule__Organisation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:337:1: ( rule__Organisation__Group__5__Impl rule__Organisation__Group__6 )
            // InternalKnowledgeDsl.g:338:2: rule__Organisation__Group__5__Impl rule__Organisation__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Organisation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__5"


    // $ANTLR start "rule__Organisation__Group__5__Impl"
    // InternalKnowledgeDsl.g:345:1: rule__Organisation__Group__5__Impl : ( ( rule__Organisation__Group_5__0 )? ) ;
    public final void rule__Organisation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:349:1: ( ( ( rule__Organisation__Group_5__0 )? ) )
            // InternalKnowledgeDsl.g:350:1: ( ( rule__Organisation__Group_5__0 )? )
            {
            // InternalKnowledgeDsl.g:350:1: ( ( rule__Organisation__Group_5__0 )? )
            // InternalKnowledgeDsl.g:351:2: ( rule__Organisation__Group_5__0 )?
            {
             before(grammarAccess.getOrganisationAccess().getGroup_5()); 
            // InternalKnowledgeDsl.g:352:2: ( rule__Organisation__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKnowledgeDsl.g:352:3: rule__Organisation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Organisation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrganisationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__5__Impl"


    // $ANTLR start "rule__Organisation__Group__6"
    // InternalKnowledgeDsl.g:360:1: rule__Organisation__Group__6 : rule__Organisation__Group__6__Impl ;
    public final void rule__Organisation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:364:1: ( rule__Organisation__Group__6__Impl )
            // InternalKnowledgeDsl.g:365:2: rule__Organisation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Organisation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__6"


    // $ANTLR start "rule__Organisation__Group__6__Impl"
    // InternalKnowledgeDsl.g:371:1: rule__Organisation__Group__6__Impl : ( '}' ) ;
    public final void rule__Organisation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:375:1: ( ( '}' ) )
            // InternalKnowledgeDsl.g:376:1: ( '}' )
            {
            // InternalKnowledgeDsl.g:376:1: ( '}' )
            // InternalKnowledgeDsl.g:377:2: '}'
            {
             before(grammarAccess.getOrganisationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOrganisationAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group__6__Impl"


    // $ANTLR start "rule__Organisation__Group_4__0"
    // InternalKnowledgeDsl.g:387:1: rule__Organisation__Group_4__0 : rule__Organisation__Group_4__0__Impl rule__Organisation__Group_4__1 ;
    public final void rule__Organisation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:391:1: ( rule__Organisation__Group_4__0__Impl rule__Organisation__Group_4__1 )
            // InternalKnowledgeDsl.g:392:2: rule__Organisation__Group_4__0__Impl rule__Organisation__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Organisation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_4__0"


    // $ANTLR start "rule__Organisation__Group_4__0__Impl"
    // InternalKnowledgeDsl.g:399:1: rule__Organisation__Group_4__0__Impl : ( 'currentProblem' ) ;
    public final void rule__Organisation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:403:1: ( ( 'currentProblem' ) )
            // InternalKnowledgeDsl.g:404:1: ( 'currentProblem' )
            {
            // InternalKnowledgeDsl.g:404:1: ( 'currentProblem' )
            // InternalKnowledgeDsl.g:405:2: 'currentProblem'
            {
             before(grammarAccess.getOrganisationAccess().getCurrentProblemKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOrganisationAccess().getCurrentProblemKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_4__0__Impl"


    // $ANTLR start "rule__Organisation__Group_4__1"
    // InternalKnowledgeDsl.g:414:1: rule__Organisation__Group_4__1 : rule__Organisation__Group_4__1__Impl ;
    public final void rule__Organisation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:418:1: ( rule__Organisation__Group_4__1__Impl )
            // InternalKnowledgeDsl.g:419:2: rule__Organisation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Organisation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_4__1"


    // $ANTLR start "rule__Organisation__Group_4__1__Impl"
    // InternalKnowledgeDsl.g:425:1: rule__Organisation__Group_4__1__Impl : ( ( rule__Organisation__CurrentProblemAssignment_4_1 ) ) ;
    public final void rule__Organisation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:429:1: ( ( ( rule__Organisation__CurrentProblemAssignment_4_1 ) ) )
            // InternalKnowledgeDsl.g:430:1: ( ( rule__Organisation__CurrentProblemAssignment_4_1 ) )
            {
            // InternalKnowledgeDsl.g:430:1: ( ( rule__Organisation__CurrentProblemAssignment_4_1 ) )
            // InternalKnowledgeDsl.g:431:2: ( rule__Organisation__CurrentProblemAssignment_4_1 )
            {
             before(grammarAccess.getOrganisationAccess().getCurrentProblemAssignment_4_1()); 
            // InternalKnowledgeDsl.g:432:2: ( rule__Organisation__CurrentProblemAssignment_4_1 )
            // InternalKnowledgeDsl.g:432:3: rule__Organisation__CurrentProblemAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Organisation__CurrentProblemAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOrganisationAccess().getCurrentProblemAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_4__1__Impl"


    // $ANTLR start "rule__Organisation__Group_5__0"
    // InternalKnowledgeDsl.g:441:1: rule__Organisation__Group_5__0 : rule__Organisation__Group_5__0__Impl rule__Organisation__Group_5__1 ;
    public final void rule__Organisation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:445:1: ( rule__Organisation__Group_5__0__Impl rule__Organisation__Group_5__1 )
            // InternalKnowledgeDsl.g:446:2: rule__Organisation__Group_5__0__Impl rule__Organisation__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Organisation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5__0"


    // $ANTLR start "rule__Organisation__Group_5__0__Impl"
    // InternalKnowledgeDsl.g:453:1: rule__Organisation__Group_5__0__Impl : ( 'experiences' ) ;
    public final void rule__Organisation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:457:1: ( ( 'experiences' ) )
            // InternalKnowledgeDsl.g:458:1: ( 'experiences' )
            {
            // InternalKnowledgeDsl.g:458:1: ( 'experiences' )
            // InternalKnowledgeDsl.g:459:2: 'experiences'
            {
             before(grammarAccess.getOrganisationAccess().getExperiencesKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOrganisationAccess().getExperiencesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5__0__Impl"


    // $ANTLR start "rule__Organisation__Group_5__1"
    // InternalKnowledgeDsl.g:468:1: rule__Organisation__Group_5__1 : rule__Organisation__Group_5__1__Impl rule__Organisation__Group_5__2 ;
    public final void rule__Organisation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:472:1: ( rule__Organisation__Group_5__1__Impl rule__Organisation__Group_5__2 )
            // InternalKnowledgeDsl.g:473:2: rule__Organisation__Group_5__1__Impl rule__Organisation__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__Organisation__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5__1"


    // $ANTLR start "rule__Organisation__Group_5__1__Impl"
    // InternalKnowledgeDsl.g:480:1: rule__Organisation__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Organisation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:484:1: ( ( '{' ) )
            // InternalKnowledgeDsl.g:485:1: ( '{' )
            {
            // InternalKnowledgeDsl.g:485:1: ( '{' )
            // InternalKnowledgeDsl.g:486:2: '{'
            {
             before(grammarAccess.getOrganisationAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOrganisationAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5__1__Impl"


    // $ANTLR start "rule__Organisation__Group_5__2"
    // InternalKnowledgeDsl.g:495:1: rule__Organisation__Group_5__2 : rule__Organisation__Group_5__2__Impl rule__Organisation__Group_5__3 ;
    public final void rule__Organisation__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:499:1: ( rule__Organisation__Group_5__2__Impl rule__Organisation__Group_5__3 )
            // InternalKnowledgeDsl.g:500:2: rule__Organisation__Group_5__2__Impl rule__Organisation__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Organisation__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5__2"


    // $ANTLR start "rule__Organisation__Group_5__2__Impl"
    // InternalKnowledgeDsl.g:507:1: rule__Organisation__Group_5__2__Impl : ( ( rule__Organisation__ExperiencesAssignment_5_2 ) ) ;
    public final void rule__Organisation__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:511:1: ( ( ( rule__Organisation__ExperiencesAssignment_5_2 ) ) )
            // InternalKnowledgeDsl.g:512:1: ( ( rule__Organisation__ExperiencesAssignment_5_2 ) )
            {
            // InternalKnowledgeDsl.g:512:1: ( ( rule__Organisation__ExperiencesAssignment_5_2 ) )
            // InternalKnowledgeDsl.g:513:2: ( rule__Organisation__ExperiencesAssignment_5_2 )
            {
             before(grammarAccess.getOrganisationAccess().getExperiencesAssignment_5_2()); 
            // InternalKnowledgeDsl.g:514:2: ( rule__Organisation__ExperiencesAssignment_5_2 )
            // InternalKnowledgeDsl.g:514:3: rule__Organisation__ExperiencesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Organisation__ExperiencesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getOrganisationAccess().getExperiencesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5__2__Impl"


    // $ANTLR start "rule__Organisation__Group_5__3"
    // InternalKnowledgeDsl.g:522:1: rule__Organisation__Group_5__3 : rule__Organisation__Group_5__3__Impl rule__Organisation__Group_5__4 ;
    public final void rule__Organisation__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:526:1: ( rule__Organisation__Group_5__3__Impl rule__Organisation__Group_5__4 )
            // InternalKnowledgeDsl.g:527:2: rule__Organisation__Group_5__3__Impl rule__Organisation__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Organisation__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5__3"


    // $ANTLR start "rule__Organisation__Group_5__3__Impl"
    // InternalKnowledgeDsl.g:534:1: rule__Organisation__Group_5__3__Impl : ( ( rule__Organisation__Group_5_3__0 )* ) ;
    public final void rule__Organisation__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:538:1: ( ( ( rule__Organisation__Group_5_3__0 )* ) )
            // InternalKnowledgeDsl.g:539:1: ( ( rule__Organisation__Group_5_3__0 )* )
            {
            // InternalKnowledgeDsl.g:539:1: ( ( rule__Organisation__Group_5_3__0 )* )
            // InternalKnowledgeDsl.g:540:2: ( rule__Organisation__Group_5_3__0 )*
            {
             before(grammarAccess.getOrganisationAccess().getGroup_5_3()); 
            // InternalKnowledgeDsl.g:541:2: ( rule__Organisation__Group_5_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKnowledgeDsl.g:541:3: rule__Organisation__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Organisation__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getOrganisationAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5__3__Impl"


    // $ANTLR start "rule__Organisation__Group_5__4"
    // InternalKnowledgeDsl.g:549:1: rule__Organisation__Group_5__4 : rule__Organisation__Group_5__4__Impl ;
    public final void rule__Organisation__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:553:1: ( rule__Organisation__Group_5__4__Impl )
            // InternalKnowledgeDsl.g:554:2: rule__Organisation__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Organisation__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5__4"


    // $ANTLR start "rule__Organisation__Group_5__4__Impl"
    // InternalKnowledgeDsl.g:560:1: rule__Organisation__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Organisation__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:564:1: ( ( '}' ) )
            // InternalKnowledgeDsl.g:565:1: ( '}' )
            {
            // InternalKnowledgeDsl.g:565:1: ( '}' )
            // InternalKnowledgeDsl.g:566:2: '}'
            {
             before(grammarAccess.getOrganisationAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOrganisationAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5__4__Impl"


    // $ANTLR start "rule__Organisation__Group_5_3__0"
    // InternalKnowledgeDsl.g:576:1: rule__Organisation__Group_5_3__0 : rule__Organisation__Group_5_3__0__Impl rule__Organisation__Group_5_3__1 ;
    public final void rule__Organisation__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:580:1: ( rule__Organisation__Group_5_3__0__Impl rule__Organisation__Group_5_3__1 )
            // InternalKnowledgeDsl.g:581:2: rule__Organisation__Group_5_3__0__Impl rule__Organisation__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Organisation__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Organisation__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5_3__0"


    // $ANTLR start "rule__Organisation__Group_5_3__0__Impl"
    // InternalKnowledgeDsl.g:588:1: rule__Organisation__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Organisation__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:592:1: ( ( ',' ) )
            // InternalKnowledgeDsl.g:593:1: ( ',' )
            {
            // InternalKnowledgeDsl.g:593:1: ( ',' )
            // InternalKnowledgeDsl.g:594:2: ','
            {
             before(grammarAccess.getOrganisationAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOrganisationAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5_3__0__Impl"


    // $ANTLR start "rule__Organisation__Group_5_3__1"
    // InternalKnowledgeDsl.g:603:1: rule__Organisation__Group_5_3__1 : rule__Organisation__Group_5_3__1__Impl ;
    public final void rule__Organisation__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:607:1: ( rule__Organisation__Group_5_3__1__Impl )
            // InternalKnowledgeDsl.g:608:2: rule__Organisation__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Organisation__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5_3__1"


    // $ANTLR start "rule__Organisation__Group_5_3__1__Impl"
    // InternalKnowledgeDsl.g:614:1: rule__Organisation__Group_5_3__1__Impl : ( ( rule__Organisation__ExperiencesAssignment_5_3_1 ) ) ;
    public final void rule__Organisation__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:618:1: ( ( ( rule__Organisation__ExperiencesAssignment_5_3_1 ) ) )
            // InternalKnowledgeDsl.g:619:1: ( ( rule__Organisation__ExperiencesAssignment_5_3_1 ) )
            {
            // InternalKnowledgeDsl.g:619:1: ( ( rule__Organisation__ExperiencesAssignment_5_3_1 ) )
            // InternalKnowledgeDsl.g:620:2: ( rule__Organisation__ExperiencesAssignment_5_3_1 )
            {
             before(grammarAccess.getOrganisationAccess().getExperiencesAssignment_5_3_1()); 
            // InternalKnowledgeDsl.g:621:2: ( rule__Organisation__ExperiencesAssignment_5_3_1 )
            // InternalKnowledgeDsl.g:621:3: rule__Organisation__ExperiencesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Organisation__ExperiencesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrganisationAccess().getExperiencesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__Group_5_3__1__Impl"


    // $ANTLR start "rule__Experience__Group__0"
    // InternalKnowledgeDsl.g:630:1: rule__Experience__Group__0 : rule__Experience__Group__0__Impl rule__Experience__Group__1 ;
    public final void rule__Experience__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:634:1: ( rule__Experience__Group__0__Impl rule__Experience__Group__1 )
            // InternalKnowledgeDsl.g:635:2: rule__Experience__Group__0__Impl rule__Experience__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Experience__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__0"


    // $ANTLR start "rule__Experience__Group__0__Impl"
    // InternalKnowledgeDsl.g:642:1: rule__Experience__Group__0__Impl : ( 'Experience' ) ;
    public final void rule__Experience__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:646:1: ( ( 'Experience' ) )
            // InternalKnowledgeDsl.g:647:1: ( 'Experience' )
            {
            // InternalKnowledgeDsl.g:647:1: ( 'Experience' )
            // InternalKnowledgeDsl.g:648:2: 'Experience'
            {
             before(grammarAccess.getExperienceAccess().getExperienceKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getExperienceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__0__Impl"


    // $ANTLR start "rule__Experience__Group__1"
    // InternalKnowledgeDsl.g:657:1: rule__Experience__Group__1 : rule__Experience__Group__1__Impl rule__Experience__Group__2 ;
    public final void rule__Experience__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:661:1: ( rule__Experience__Group__1__Impl rule__Experience__Group__2 )
            // InternalKnowledgeDsl.g:662:2: rule__Experience__Group__1__Impl rule__Experience__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Experience__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__1"


    // $ANTLR start "rule__Experience__Group__1__Impl"
    // InternalKnowledgeDsl.g:669:1: rule__Experience__Group__1__Impl : ( ( rule__Experience__NameAssignment_1 ) ) ;
    public final void rule__Experience__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:673:1: ( ( ( rule__Experience__NameAssignment_1 ) ) )
            // InternalKnowledgeDsl.g:674:1: ( ( rule__Experience__NameAssignment_1 ) )
            {
            // InternalKnowledgeDsl.g:674:1: ( ( rule__Experience__NameAssignment_1 ) )
            // InternalKnowledgeDsl.g:675:2: ( rule__Experience__NameAssignment_1 )
            {
             before(grammarAccess.getExperienceAccess().getNameAssignment_1()); 
            // InternalKnowledgeDsl.g:676:2: ( rule__Experience__NameAssignment_1 )
            // InternalKnowledgeDsl.g:676:3: rule__Experience__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Experience__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__1__Impl"


    // $ANTLR start "rule__Experience__Group__2"
    // InternalKnowledgeDsl.g:684:1: rule__Experience__Group__2 : rule__Experience__Group__2__Impl rule__Experience__Group__3 ;
    public final void rule__Experience__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:688:1: ( rule__Experience__Group__2__Impl rule__Experience__Group__3 )
            // InternalKnowledgeDsl.g:689:2: rule__Experience__Group__2__Impl rule__Experience__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Experience__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__2"


    // $ANTLR start "rule__Experience__Group__2__Impl"
    // InternalKnowledgeDsl.g:696:1: rule__Experience__Group__2__Impl : ( '{' ) ;
    public final void rule__Experience__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:700:1: ( ( '{' ) )
            // InternalKnowledgeDsl.g:701:1: ( '{' )
            {
            // InternalKnowledgeDsl.g:701:1: ( '{' )
            // InternalKnowledgeDsl.g:702:2: '{'
            {
             before(grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__2__Impl"


    // $ANTLR start "rule__Experience__Group__3"
    // InternalKnowledgeDsl.g:711:1: rule__Experience__Group__3 : rule__Experience__Group__3__Impl rule__Experience__Group__4 ;
    public final void rule__Experience__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:715:1: ( rule__Experience__Group__3__Impl rule__Experience__Group__4 )
            // InternalKnowledgeDsl.g:716:2: rule__Experience__Group__3__Impl rule__Experience__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Experience__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__3"


    // $ANTLR start "rule__Experience__Group__3__Impl"
    // InternalKnowledgeDsl.g:723:1: rule__Experience__Group__3__Impl : ( ( rule__Experience__Group_3__0 )? ) ;
    public final void rule__Experience__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:727:1: ( ( ( rule__Experience__Group_3__0 )? ) )
            // InternalKnowledgeDsl.g:728:1: ( ( rule__Experience__Group_3__0 )? )
            {
            // InternalKnowledgeDsl.g:728:1: ( ( rule__Experience__Group_3__0 )? )
            // InternalKnowledgeDsl.g:729:2: ( rule__Experience__Group_3__0 )?
            {
             before(grammarAccess.getExperienceAccess().getGroup_3()); 
            // InternalKnowledgeDsl.g:730:2: ( rule__Experience__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKnowledgeDsl.g:730:3: rule__Experience__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Experience__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExperienceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__3__Impl"


    // $ANTLR start "rule__Experience__Group__4"
    // InternalKnowledgeDsl.g:738:1: rule__Experience__Group__4 : rule__Experience__Group__4__Impl rule__Experience__Group__5 ;
    public final void rule__Experience__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:742:1: ( rule__Experience__Group__4__Impl rule__Experience__Group__5 )
            // InternalKnowledgeDsl.g:743:2: rule__Experience__Group__4__Impl rule__Experience__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Experience__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__4"


    // $ANTLR start "rule__Experience__Group__4__Impl"
    // InternalKnowledgeDsl.g:750:1: rule__Experience__Group__4__Impl : ( 'solutions' ) ;
    public final void rule__Experience__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:754:1: ( ( 'solutions' ) )
            // InternalKnowledgeDsl.g:755:1: ( 'solutions' )
            {
            // InternalKnowledgeDsl.g:755:1: ( 'solutions' )
            // InternalKnowledgeDsl.g:756:2: 'solutions'
            {
             before(grammarAccess.getExperienceAccess().getSolutionsKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getSolutionsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__4__Impl"


    // $ANTLR start "rule__Experience__Group__5"
    // InternalKnowledgeDsl.g:765:1: rule__Experience__Group__5 : rule__Experience__Group__5__Impl rule__Experience__Group__6 ;
    public final void rule__Experience__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:769:1: ( rule__Experience__Group__5__Impl rule__Experience__Group__6 )
            // InternalKnowledgeDsl.g:770:2: rule__Experience__Group__5__Impl rule__Experience__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Experience__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__5"


    // $ANTLR start "rule__Experience__Group__5__Impl"
    // InternalKnowledgeDsl.g:777:1: rule__Experience__Group__5__Impl : ( '{' ) ;
    public final void rule__Experience__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:781:1: ( ( '{' ) )
            // InternalKnowledgeDsl.g:782:1: ( '{' )
            {
            // InternalKnowledgeDsl.g:782:1: ( '{' )
            // InternalKnowledgeDsl.g:783:2: '{'
            {
             before(grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__5__Impl"


    // $ANTLR start "rule__Experience__Group__6"
    // InternalKnowledgeDsl.g:792:1: rule__Experience__Group__6 : rule__Experience__Group__6__Impl rule__Experience__Group__7 ;
    public final void rule__Experience__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:796:1: ( rule__Experience__Group__6__Impl rule__Experience__Group__7 )
            // InternalKnowledgeDsl.g:797:2: rule__Experience__Group__6__Impl rule__Experience__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Experience__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__6"


    // $ANTLR start "rule__Experience__Group__6__Impl"
    // InternalKnowledgeDsl.g:804:1: rule__Experience__Group__6__Impl : ( ( rule__Experience__SolutionsAssignment_6 ) ) ;
    public final void rule__Experience__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:808:1: ( ( ( rule__Experience__SolutionsAssignment_6 ) ) )
            // InternalKnowledgeDsl.g:809:1: ( ( rule__Experience__SolutionsAssignment_6 ) )
            {
            // InternalKnowledgeDsl.g:809:1: ( ( rule__Experience__SolutionsAssignment_6 ) )
            // InternalKnowledgeDsl.g:810:2: ( rule__Experience__SolutionsAssignment_6 )
            {
             before(grammarAccess.getExperienceAccess().getSolutionsAssignment_6()); 
            // InternalKnowledgeDsl.g:811:2: ( rule__Experience__SolutionsAssignment_6 )
            // InternalKnowledgeDsl.g:811:3: rule__Experience__SolutionsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Experience__SolutionsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getSolutionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__6__Impl"


    // $ANTLR start "rule__Experience__Group__7"
    // InternalKnowledgeDsl.g:819:1: rule__Experience__Group__7 : rule__Experience__Group__7__Impl rule__Experience__Group__8 ;
    public final void rule__Experience__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:823:1: ( rule__Experience__Group__7__Impl rule__Experience__Group__8 )
            // InternalKnowledgeDsl.g:824:2: rule__Experience__Group__7__Impl rule__Experience__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Experience__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__7"


    // $ANTLR start "rule__Experience__Group__7__Impl"
    // InternalKnowledgeDsl.g:831:1: rule__Experience__Group__7__Impl : ( ( rule__Experience__Group_7__0 )* ) ;
    public final void rule__Experience__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:835:1: ( ( ( rule__Experience__Group_7__0 )* ) )
            // InternalKnowledgeDsl.g:836:1: ( ( rule__Experience__Group_7__0 )* )
            {
            // InternalKnowledgeDsl.g:836:1: ( ( rule__Experience__Group_7__0 )* )
            // InternalKnowledgeDsl.g:837:2: ( rule__Experience__Group_7__0 )*
            {
             before(grammarAccess.getExperienceAccess().getGroup_7()); 
            // InternalKnowledgeDsl.g:838:2: ( rule__Experience__Group_7__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalKnowledgeDsl.g:838:3: rule__Experience__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Experience__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getExperienceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__7__Impl"


    // $ANTLR start "rule__Experience__Group__8"
    // InternalKnowledgeDsl.g:846:1: rule__Experience__Group__8 : rule__Experience__Group__8__Impl rule__Experience__Group__9 ;
    public final void rule__Experience__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:850:1: ( rule__Experience__Group__8__Impl rule__Experience__Group__9 )
            // InternalKnowledgeDsl.g:851:2: rule__Experience__Group__8__Impl rule__Experience__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Experience__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__8"


    // $ANTLR start "rule__Experience__Group__8__Impl"
    // InternalKnowledgeDsl.g:858:1: rule__Experience__Group__8__Impl : ( '}' ) ;
    public final void rule__Experience__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:862:1: ( ( '}' ) )
            // InternalKnowledgeDsl.g:863:1: ( '}' )
            {
            // InternalKnowledgeDsl.g:863:1: ( '}' )
            // InternalKnowledgeDsl.g:864:2: '}'
            {
             before(grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__8__Impl"


    // $ANTLR start "rule__Experience__Group__9"
    // InternalKnowledgeDsl.g:873:1: rule__Experience__Group__9 : rule__Experience__Group__9__Impl ;
    public final void rule__Experience__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:877:1: ( rule__Experience__Group__9__Impl )
            // InternalKnowledgeDsl.g:878:2: rule__Experience__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experience__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__9"


    // $ANTLR start "rule__Experience__Group__9__Impl"
    // InternalKnowledgeDsl.g:884:1: rule__Experience__Group__9__Impl : ( '}' ) ;
    public final void rule__Experience__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:888:1: ( ( '}' ) )
            // InternalKnowledgeDsl.g:889:1: ( '}' )
            {
            // InternalKnowledgeDsl.g:889:1: ( '}' )
            // InternalKnowledgeDsl.g:890:2: '}'
            {
             before(grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group__9__Impl"


    // $ANTLR start "rule__Experience__Group_3__0"
    // InternalKnowledgeDsl.g:900:1: rule__Experience__Group_3__0 : rule__Experience__Group_3__0__Impl rule__Experience__Group_3__1 ;
    public final void rule__Experience__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:904:1: ( rule__Experience__Group_3__0__Impl rule__Experience__Group_3__1 )
            // InternalKnowledgeDsl.g:905:2: rule__Experience__Group_3__0__Impl rule__Experience__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Experience__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3__0"


    // $ANTLR start "rule__Experience__Group_3__0__Impl"
    // InternalKnowledgeDsl.g:912:1: rule__Experience__Group_3__0__Impl : ( 'problems' ) ;
    public final void rule__Experience__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:916:1: ( ( 'problems' ) )
            // InternalKnowledgeDsl.g:917:1: ( 'problems' )
            {
            // InternalKnowledgeDsl.g:917:1: ( 'problems' )
            // InternalKnowledgeDsl.g:918:2: 'problems'
            {
             before(grammarAccess.getExperienceAccess().getProblemsKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getProblemsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3__0__Impl"


    // $ANTLR start "rule__Experience__Group_3__1"
    // InternalKnowledgeDsl.g:927:1: rule__Experience__Group_3__1 : rule__Experience__Group_3__1__Impl rule__Experience__Group_3__2 ;
    public final void rule__Experience__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:931:1: ( rule__Experience__Group_3__1__Impl rule__Experience__Group_3__2 )
            // InternalKnowledgeDsl.g:932:2: rule__Experience__Group_3__1__Impl rule__Experience__Group_3__2
            {
            pushFollow(FOLLOW_13);
            rule__Experience__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3__1"


    // $ANTLR start "rule__Experience__Group_3__1__Impl"
    // InternalKnowledgeDsl.g:939:1: rule__Experience__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Experience__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:943:1: ( ( '{' ) )
            // InternalKnowledgeDsl.g:944:1: ( '{' )
            {
            // InternalKnowledgeDsl.g:944:1: ( '{' )
            // InternalKnowledgeDsl.g:945:2: '{'
            {
             before(grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3__1__Impl"


    // $ANTLR start "rule__Experience__Group_3__2"
    // InternalKnowledgeDsl.g:954:1: rule__Experience__Group_3__2 : rule__Experience__Group_3__2__Impl rule__Experience__Group_3__3 ;
    public final void rule__Experience__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:958:1: ( rule__Experience__Group_3__2__Impl rule__Experience__Group_3__3 )
            // InternalKnowledgeDsl.g:959:2: rule__Experience__Group_3__2__Impl rule__Experience__Group_3__3
            {
            pushFollow(FOLLOW_8);
            rule__Experience__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3__2"


    // $ANTLR start "rule__Experience__Group_3__2__Impl"
    // InternalKnowledgeDsl.g:966:1: rule__Experience__Group_3__2__Impl : ( ( rule__Experience__ProblemsAssignment_3_2 ) ) ;
    public final void rule__Experience__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:970:1: ( ( ( rule__Experience__ProblemsAssignment_3_2 ) ) )
            // InternalKnowledgeDsl.g:971:1: ( ( rule__Experience__ProblemsAssignment_3_2 ) )
            {
            // InternalKnowledgeDsl.g:971:1: ( ( rule__Experience__ProblemsAssignment_3_2 ) )
            // InternalKnowledgeDsl.g:972:2: ( rule__Experience__ProblemsAssignment_3_2 )
            {
             before(grammarAccess.getExperienceAccess().getProblemsAssignment_3_2()); 
            // InternalKnowledgeDsl.g:973:2: ( rule__Experience__ProblemsAssignment_3_2 )
            // InternalKnowledgeDsl.g:973:3: rule__Experience__ProblemsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Experience__ProblemsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getProblemsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3__2__Impl"


    // $ANTLR start "rule__Experience__Group_3__3"
    // InternalKnowledgeDsl.g:981:1: rule__Experience__Group_3__3 : rule__Experience__Group_3__3__Impl rule__Experience__Group_3__4 ;
    public final void rule__Experience__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:985:1: ( rule__Experience__Group_3__3__Impl rule__Experience__Group_3__4 )
            // InternalKnowledgeDsl.g:986:2: rule__Experience__Group_3__3__Impl rule__Experience__Group_3__4
            {
            pushFollow(FOLLOW_8);
            rule__Experience__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3__3"


    // $ANTLR start "rule__Experience__Group_3__3__Impl"
    // InternalKnowledgeDsl.g:993:1: rule__Experience__Group_3__3__Impl : ( ( rule__Experience__Group_3_3__0 )* ) ;
    public final void rule__Experience__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:997:1: ( ( ( rule__Experience__Group_3_3__0 )* ) )
            // InternalKnowledgeDsl.g:998:1: ( ( rule__Experience__Group_3_3__0 )* )
            {
            // InternalKnowledgeDsl.g:998:1: ( ( rule__Experience__Group_3_3__0 )* )
            // InternalKnowledgeDsl.g:999:2: ( rule__Experience__Group_3_3__0 )*
            {
             before(grammarAccess.getExperienceAccess().getGroup_3_3()); 
            // InternalKnowledgeDsl.g:1000:2: ( rule__Experience__Group_3_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalKnowledgeDsl.g:1000:3: rule__Experience__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Experience__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getExperienceAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3__3__Impl"


    // $ANTLR start "rule__Experience__Group_3__4"
    // InternalKnowledgeDsl.g:1008:1: rule__Experience__Group_3__4 : rule__Experience__Group_3__4__Impl ;
    public final void rule__Experience__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1012:1: ( rule__Experience__Group_3__4__Impl )
            // InternalKnowledgeDsl.g:1013:2: rule__Experience__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experience__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3__4"


    // $ANTLR start "rule__Experience__Group_3__4__Impl"
    // InternalKnowledgeDsl.g:1019:1: rule__Experience__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Experience__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1023:1: ( ( '}' ) )
            // InternalKnowledgeDsl.g:1024:1: ( '}' )
            {
            // InternalKnowledgeDsl.g:1024:1: ( '}' )
            // InternalKnowledgeDsl.g:1025:2: '}'
            {
             before(grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3__4__Impl"


    // $ANTLR start "rule__Experience__Group_3_3__0"
    // InternalKnowledgeDsl.g:1035:1: rule__Experience__Group_3_3__0 : rule__Experience__Group_3_3__0__Impl rule__Experience__Group_3_3__1 ;
    public final void rule__Experience__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1039:1: ( rule__Experience__Group_3_3__0__Impl rule__Experience__Group_3_3__1 )
            // InternalKnowledgeDsl.g:1040:2: rule__Experience__Group_3_3__0__Impl rule__Experience__Group_3_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Experience__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3_3__0"


    // $ANTLR start "rule__Experience__Group_3_3__0__Impl"
    // InternalKnowledgeDsl.g:1047:1: rule__Experience__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Experience__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1051:1: ( ( ',' ) )
            // InternalKnowledgeDsl.g:1052:1: ( ',' )
            {
            // InternalKnowledgeDsl.g:1052:1: ( ',' )
            // InternalKnowledgeDsl.g:1053:2: ','
            {
             before(grammarAccess.getExperienceAccess().getCommaKeyword_3_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3_3__0__Impl"


    // $ANTLR start "rule__Experience__Group_3_3__1"
    // InternalKnowledgeDsl.g:1062:1: rule__Experience__Group_3_3__1 : rule__Experience__Group_3_3__1__Impl ;
    public final void rule__Experience__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1066:1: ( rule__Experience__Group_3_3__1__Impl )
            // InternalKnowledgeDsl.g:1067:2: rule__Experience__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experience__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3_3__1"


    // $ANTLR start "rule__Experience__Group_3_3__1__Impl"
    // InternalKnowledgeDsl.g:1073:1: rule__Experience__Group_3_3__1__Impl : ( ( rule__Experience__ProblemsAssignment_3_3_1 ) ) ;
    public final void rule__Experience__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1077:1: ( ( ( rule__Experience__ProblemsAssignment_3_3_1 ) ) )
            // InternalKnowledgeDsl.g:1078:1: ( ( rule__Experience__ProblemsAssignment_3_3_1 ) )
            {
            // InternalKnowledgeDsl.g:1078:1: ( ( rule__Experience__ProblemsAssignment_3_3_1 ) )
            // InternalKnowledgeDsl.g:1079:2: ( rule__Experience__ProblemsAssignment_3_3_1 )
            {
             before(grammarAccess.getExperienceAccess().getProblemsAssignment_3_3_1()); 
            // InternalKnowledgeDsl.g:1080:2: ( rule__Experience__ProblemsAssignment_3_3_1 )
            // InternalKnowledgeDsl.g:1080:3: rule__Experience__ProblemsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Experience__ProblemsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getProblemsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_3_3__1__Impl"


    // $ANTLR start "rule__Experience__Group_7__0"
    // InternalKnowledgeDsl.g:1089:1: rule__Experience__Group_7__0 : rule__Experience__Group_7__0__Impl rule__Experience__Group_7__1 ;
    public final void rule__Experience__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1093:1: ( rule__Experience__Group_7__0__Impl rule__Experience__Group_7__1 )
            // InternalKnowledgeDsl.g:1094:2: rule__Experience__Group_7__0__Impl rule__Experience__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Experience__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Experience__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_7__0"


    // $ANTLR start "rule__Experience__Group_7__0__Impl"
    // InternalKnowledgeDsl.g:1101:1: rule__Experience__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Experience__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1105:1: ( ( ',' ) )
            // InternalKnowledgeDsl.g:1106:1: ( ',' )
            {
            // InternalKnowledgeDsl.g:1106:1: ( ',' )
            // InternalKnowledgeDsl.g:1107:2: ','
            {
             before(grammarAccess.getExperienceAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExperienceAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_7__0__Impl"


    // $ANTLR start "rule__Experience__Group_7__1"
    // InternalKnowledgeDsl.g:1116:1: rule__Experience__Group_7__1 : rule__Experience__Group_7__1__Impl ;
    public final void rule__Experience__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1120:1: ( rule__Experience__Group_7__1__Impl )
            // InternalKnowledgeDsl.g:1121:2: rule__Experience__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Experience__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_7__1"


    // $ANTLR start "rule__Experience__Group_7__1__Impl"
    // InternalKnowledgeDsl.g:1127:1: rule__Experience__Group_7__1__Impl : ( ( rule__Experience__SolutionsAssignment_7_1 ) ) ;
    public final void rule__Experience__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1131:1: ( ( ( rule__Experience__SolutionsAssignment_7_1 ) ) )
            // InternalKnowledgeDsl.g:1132:1: ( ( rule__Experience__SolutionsAssignment_7_1 ) )
            {
            // InternalKnowledgeDsl.g:1132:1: ( ( rule__Experience__SolutionsAssignment_7_1 ) )
            // InternalKnowledgeDsl.g:1133:2: ( rule__Experience__SolutionsAssignment_7_1 )
            {
             before(grammarAccess.getExperienceAccess().getSolutionsAssignment_7_1()); 
            // InternalKnowledgeDsl.g:1134:2: ( rule__Experience__SolutionsAssignment_7_1 )
            // InternalKnowledgeDsl.g:1134:3: rule__Experience__SolutionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Experience__SolutionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getExperienceAccess().getSolutionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__Group_7__1__Impl"


    // $ANTLR start "rule__Problem__Group__0"
    // InternalKnowledgeDsl.g:1143:1: rule__Problem__Group__0 : rule__Problem__Group__0__Impl rule__Problem__Group__1 ;
    public final void rule__Problem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1147:1: ( rule__Problem__Group__0__Impl rule__Problem__Group__1 )
            // InternalKnowledgeDsl.g:1148:2: rule__Problem__Group__0__Impl rule__Problem__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Problem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__0"


    // $ANTLR start "rule__Problem__Group__0__Impl"
    // InternalKnowledgeDsl.g:1155:1: rule__Problem__Group__0__Impl : ( 'Problem' ) ;
    public final void rule__Problem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1159:1: ( ( 'Problem' ) )
            // InternalKnowledgeDsl.g:1160:1: ( 'Problem' )
            {
            // InternalKnowledgeDsl.g:1160:1: ( 'Problem' )
            // InternalKnowledgeDsl.g:1161:2: 'Problem'
            {
             before(grammarAccess.getProblemAccess().getProblemKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProblemAccess().getProblemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__0__Impl"


    // $ANTLR start "rule__Problem__Group__1"
    // InternalKnowledgeDsl.g:1170:1: rule__Problem__Group__1 : rule__Problem__Group__1__Impl rule__Problem__Group__2 ;
    public final void rule__Problem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1174:1: ( rule__Problem__Group__1__Impl rule__Problem__Group__2 )
            // InternalKnowledgeDsl.g:1175:2: rule__Problem__Group__1__Impl rule__Problem__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Problem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__1"


    // $ANTLR start "rule__Problem__Group__1__Impl"
    // InternalKnowledgeDsl.g:1182:1: rule__Problem__Group__1__Impl : ( ( rule__Problem__NameAssignment_1 ) ) ;
    public final void rule__Problem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1186:1: ( ( ( rule__Problem__NameAssignment_1 ) ) )
            // InternalKnowledgeDsl.g:1187:1: ( ( rule__Problem__NameAssignment_1 ) )
            {
            // InternalKnowledgeDsl.g:1187:1: ( ( rule__Problem__NameAssignment_1 ) )
            // InternalKnowledgeDsl.g:1188:2: ( rule__Problem__NameAssignment_1 )
            {
             before(grammarAccess.getProblemAccess().getNameAssignment_1()); 
            // InternalKnowledgeDsl.g:1189:2: ( rule__Problem__NameAssignment_1 )
            // InternalKnowledgeDsl.g:1189:3: rule__Problem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Problem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__1__Impl"


    // $ANTLR start "rule__Problem__Group__2"
    // InternalKnowledgeDsl.g:1197:1: rule__Problem__Group__2 : rule__Problem__Group__2__Impl rule__Problem__Group__3 ;
    public final void rule__Problem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1201:1: ( rule__Problem__Group__2__Impl rule__Problem__Group__3 )
            // InternalKnowledgeDsl.g:1202:2: rule__Problem__Group__2__Impl rule__Problem__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Problem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__2"


    // $ANTLR start "rule__Problem__Group__2__Impl"
    // InternalKnowledgeDsl.g:1209:1: rule__Problem__Group__2__Impl : ( '{' ) ;
    public final void rule__Problem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1213:1: ( ( '{' ) )
            // InternalKnowledgeDsl.g:1214:1: ( '{' )
            {
            // InternalKnowledgeDsl.g:1214:1: ( '{' )
            // InternalKnowledgeDsl.g:1215:2: '{'
            {
             before(grammarAccess.getProblemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProblemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__2__Impl"


    // $ANTLR start "rule__Problem__Group__3"
    // InternalKnowledgeDsl.g:1224:1: rule__Problem__Group__3 : rule__Problem__Group__3__Impl rule__Problem__Group__4 ;
    public final void rule__Problem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1228:1: ( rule__Problem__Group__3__Impl rule__Problem__Group__4 )
            // InternalKnowledgeDsl.g:1229:2: rule__Problem__Group__3__Impl rule__Problem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Problem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__3"


    // $ANTLR start "rule__Problem__Group__3__Impl"
    // InternalKnowledgeDsl.g:1236:1: rule__Problem__Group__3__Impl : ( 'solutions' ) ;
    public final void rule__Problem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1240:1: ( ( 'solutions' ) )
            // InternalKnowledgeDsl.g:1241:1: ( 'solutions' )
            {
            // InternalKnowledgeDsl.g:1241:1: ( 'solutions' )
            // InternalKnowledgeDsl.g:1242:2: 'solutions'
            {
             before(grammarAccess.getProblemAccess().getSolutionsKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getProblemAccess().getSolutionsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__3__Impl"


    // $ANTLR start "rule__Problem__Group__4"
    // InternalKnowledgeDsl.g:1251:1: rule__Problem__Group__4 : rule__Problem__Group__4__Impl rule__Problem__Group__5 ;
    public final void rule__Problem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1255:1: ( rule__Problem__Group__4__Impl rule__Problem__Group__5 )
            // InternalKnowledgeDsl.g:1256:2: rule__Problem__Group__4__Impl rule__Problem__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Problem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__4"


    // $ANTLR start "rule__Problem__Group__4__Impl"
    // InternalKnowledgeDsl.g:1263:1: rule__Problem__Group__4__Impl : ( '{' ) ;
    public final void rule__Problem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1267:1: ( ( '{' ) )
            // InternalKnowledgeDsl.g:1268:1: ( '{' )
            {
            // InternalKnowledgeDsl.g:1268:1: ( '{' )
            // InternalKnowledgeDsl.g:1269:2: '{'
            {
             before(grammarAccess.getProblemAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getProblemAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__4__Impl"


    // $ANTLR start "rule__Problem__Group__5"
    // InternalKnowledgeDsl.g:1278:1: rule__Problem__Group__5 : rule__Problem__Group__5__Impl rule__Problem__Group__6 ;
    public final void rule__Problem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1282:1: ( rule__Problem__Group__5__Impl rule__Problem__Group__6 )
            // InternalKnowledgeDsl.g:1283:2: rule__Problem__Group__5__Impl rule__Problem__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Problem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__5"


    // $ANTLR start "rule__Problem__Group__5__Impl"
    // InternalKnowledgeDsl.g:1290:1: rule__Problem__Group__5__Impl : ( ( rule__Problem__SolutionsAssignment_5 ) ) ;
    public final void rule__Problem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1294:1: ( ( ( rule__Problem__SolutionsAssignment_5 ) ) )
            // InternalKnowledgeDsl.g:1295:1: ( ( rule__Problem__SolutionsAssignment_5 ) )
            {
            // InternalKnowledgeDsl.g:1295:1: ( ( rule__Problem__SolutionsAssignment_5 ) )
            // InternalKnowledgeDsl.g:1296:2: ( rule__Problem__SolutionsAssignment_5 )
            {
             before(grammarAccess.getProblemAccess().getSolutionsAssignment_5()); 
            // InternalKnowledgeDsl.g:1297:2: ( rule__Problem__SolutionsAssignment_5 )
            // InternalKnowledgeDsl.g:1297:3: rule__Problem__SolutionsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Problem__SolutionsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getSolutionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__5__Impl"


    // $ANTLR start "rule__Problem__Group__6"
    // InternalKnowledgeDsl.g:1305:1: rule__Problem__Group__6 : rule__Problem__Group__6__Impl rule__Problem__Group__7 ;
    public final void rule__Problem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1309:1: ( rule__Problem__Group__6__Impl rule__Problem__Group__7 )
            // InternalKnowledgeDsl.g:1310:2: rule__Problem__Group__6__Impl rule__Problem__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Problem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__6"


    // $ANTLR start "rule__Problem__Group__6__Impl"
    // InternalKnowledgeDsl.g:1317:1: rule__Problem__Group__6__Impl : ( ( rule__Problem__Group_6__0 )* ) ;
    public final void rule__Problem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1321:1: ( ( ( rule__Problem__Group_6__0 )* ) )
            // InternalKnowledgeDsl.g:1322:1: ( ( rule__Problem__Group_6__0 )* )
            {
            // InternalKnowledgeDsl.g:1322:1: ( ( rule__Problem__Group_6__0 )* )
            // InternalKnowledgeDsl.g:1323:2: ( rule__Problem__Group_6__0 )*
            {
             before(grammarAccess.getProblemAccess().getGroup_6()); 
            // InternalKnowledgeDsl.g:1324:2: ( rule__Problem__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalKnowledgeDsl.g:1324:3: rule__Problem__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Problem__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getProblemAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__6__Impl"


    // $ANTLR start "rule__Problem__Group__7"
    // InternalKnowledgeDsl.g:1332:1: rule__Problem__Group__7 : rule__Problem__Group__7__Impl rule__Problem__Group__8 ;
    public final void rule__Problem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1336:1: ( rule__Problem__Group__7__Impl rule__Problem__Group__8 )
            // InternalKnowledgeDsl.g:1337:2: rule__Problem__Group__7__Impl rule__Problem__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Problem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__7"


    // $ANTLR start "rule__Problem__Group__7__Impl"
    // InternalKnowledgeDsl.g:1344:1: rule__Problem__Group__7__Impl : ( '}' ) ;
    public final void rule__Problem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1348:1: ( ( '}' ) )
            // InternalKnowledgeDsl.g:1349:1: ( '}' )
            {
            // InternalKnowledgeDsl.g:1349:1: ( '}' )
            // InternalKnowledgeDsl.g:1350:2: '}'
            {
             before(grammarAccess.getProblemAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProblemAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__7__Impl"


    // $ANTLR start "rule__Problem__Group__8"
    // InternalKnowledgeDsl.g:1359:1: rule__Problem__Group__8 : rule__Problem__Group__8__Impl ;
    public final void rule__Problem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1363:1: ( rule__Problem__Group__8__Impl )
            // InternalKnowledgeDsl.g:1364:2: rule__Problem__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Problem__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__8"


    // $ANTLR start "rule__Problem__Group__8__Impl"
    // InternalKnowledgeDsl.g:1370:1: rule__Problem__Group__8__Impl : ( '}' ) ;
    public final void rule__Problem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1374:1: ( ( '}' ) )
            // InternalKnowledgeDsl.g:1375:1: ( '}' )
            {
            // InternalKnowledgeDsl.g:1375:1: ( '}' )
            // InternalKnowledgeDsl.g:1376:2: '}'
            {
             before(grammarAccess.getProblemAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getProblemAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group__8__Impl"


    // $ANTLR start "rule__Problem__Group_6__0"
    // InternalKnowledgeDsl.g:1386:1: rule__Problem__Group_6__0 : rule__Problem__Group_6__0__Impl rule__Problem__Group_6__1 ;
    public final void rule__Problem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1390:1: ( rule__Problem__Group_6__0__Impl rule__Problem__Group_6__1 )
            // InternalKnowledgeDsl.g:1391:2: rule__Problem__Group_6__0__Impl rule__Problem__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Problem__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Problem__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_6__0"


    // $ANTLR start "rule__Problem__Group_6__0__Impl"
    // InternalKnowledgeDsl.g:1398:1: rule__Problem__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Problem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1402:1: ( ( ',' ) )
            // InternalKnowledgeDsl.g:1403:1: ( ',' )
            {
            // InternalKnowledgeDsl.g:1403:1: ( ',' )
            // InternalKnowledgeDsl.g:1404:2: ','
            {
             before(grammarAccess.getProblemAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getProblemAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_6__0__Impl"


    // $ANTLR start "rule__Problem__Group_6__1"
    // InternalKnowledgeDsl.g:1413:1: rule__Problem__Group_6__1 : rule__Problem__Group_6__1__Impl ;
    public final void rule__Problem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1417:1: ( rule__Problem__Group_6__1__Impl )
            // InternalKnowledgeDsl.g:1418:2: rule__Problem__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Problem__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_6__1"


    // $ANTLR start "rule__Problem__Group_6__1__Impl"
    // InternalKnowledgeDsl.g:1424:1: rule__Problem__Group_6__1__Impl : ( ( rule__Problem__SolutionsAssignment_6_1 ) ) ;
    public final void rule__Problem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1428:1: ( ( ( rule__Problem__SolutionsAssignment_6_1 ) ) )
            // InternalKnowledgeDsl.g:1429:1: ( ( rule__Problem__SolutionsAssignment_6_1 ) )
            {
            // InternalKnowledgeDsl.g:1429:1: ( ( rule__Problem__SolutionsAssignment_6_1 ) )
            // InternalKnowledgeDsl.g:1430:2: ( rule__Problem__SolutionsAssignment_6_1 )
            {
             before(grammarAccess.getProblemAccess().getSolutionsAssignment_6_1()); 
            // InternalKnowledgeDsl.g:1431:2: ( rule__Problem__SolutionsAssignment_6_1 )
            // InternalKnowledgeDsl.g:1431:3: rule__Problem__SolutionsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Problem__SolutionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemAccess().getSolutionsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__Group_6__1__Impl"


    // $ANTLR start "rule__Solution__Group__0"
    // InternalKnowledgeDsl.g:1440:1: rule__Solution__Group__0 : rule__Solution__Group__0__Impl rule__Solution__Group__1 ;
    public final void rule__Solution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1444:1: ( rule__Solution__Group__0__Impl rule__Solution__Group__1 )
            // InternalKnowledgeDsl.g:1445:2: rule__Solution__Group__0__Impl rule__Solution__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Solution__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__0"


    // $ANTLR start "rule__Solution__Group__0__Impl"
    // InternalKnowledgeDsl.g:1452:1: rule__Solution__Group__0__Impl : ( () ) ;
    public final void rule__Solution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1456:1: ( ( () ) )
            // InternalKnowledgeDsl.g:1457:1: ( () )
            {
            // InternalKnowledgeDsl.g:1457:1: ( () )
            // InternalKnowledgeDsl.g:1458:2: ()
            {
             before(grammarAccess.getSolutionAccess().getSolutionAction_0()); 
            // InternalKnowledgeDsl.g:1459:2: ()
            // InternalKnowledgeDsl.g:1459:3: 
            {
            }

             after(grammarAccess.getSolutionAccess().getSolutionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__0__Impl"


    // $ANTLR start "rule__Solution__Group__1"
    // InternalKnowledgeDsl.g:1467:1: rule__Solution__Group__1 : rule__Solution__Group__1__Impl rule__Solution__Group__2 ;
    public final void rule__Solution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1471:1: ( rule__Solution__Group__1__Impl rule__Solution__Group__2 )
            // InternalKnowledgeDsl.g:1472:2: rule__Solution__Group__1__Impl rule__Solution__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Solution__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__1"


    // $ANTLR start "rule__Solution__Group__1__Impl"
    // InternalKnowledgeDsl.g:1479:1: rule__Solution__Group__1__Impl : ( 'Solution' ) ;
    public final void rule__Solution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1483:1: ( ( 'Solution' ) )
            // InternalKnowledgeDsl.g:1484:1: ( 'Solution' )
            {
            // InternalKnowledgeDsl.g:1484:1: ( 'Solution' )
            // InternalKnowledgeDsl.g:1485:2: 'Solution'
            {
             before(grammarAccess.getSolutionAccess().getSolutionKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getSolutionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__1__Impl"


    // $ANTLR start "rule__Solution__Group__2"
    // InternalKnowledgeDsl.g:1494:1: rule__Solution__Group__2 : rule__Solution__Group__2__Impl rule__Solution__Group__3 ;
    public final void rule__Solution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1498:1: ( rule__Solution__Group__2__Impl rule__Solution__Group__3 )
            // InternalKnowledgeDsl.g:1499:2: rule__Solution__Group__2__Impl rule__Solution__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Solution__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__2"


    // $ANTLR start "rule__Solution__Group__2__Impl"
    // InternalKnowledgeDsl.g:1506:1: rule__Solution__Group__2__Impl : ( ( rule__Solution__NameAssignment_2 ) ) ;
    public final void rule__Solution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1510:1: ( ( ( rule__Solution__NameAssignment_2 ) ) )
            // InternalKnowledgeDsl.g:1511:1: ( ( rule__Solution__NameAssignment_2 ) )
            {
            // InternalKnowledgeDsl.g:1511:1: ( ( rule__Solution__NameAssignment_2 ) )
            // InternalKnowledgeDsl.g:1512:2: ( rule__Solution__NameAssignment_2 )
            {
             before(grammarAccess.getSolutionAccess().getNameAssignment_2()); 
            // InternalKnowledgeDsl.g:1513:2: ( rule__Solution__NameAssignment_2 )
            // InternalKnowledgeDsl.g:1513:3: rule__Solution__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Solution__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__2__Impl"


    // $ANTLR start "rule__Solution__Group__3"
    // InternalKnowledgeDsl.g:1521:1: rule__Solution__Group__3 : rule__Solution__Group__3__Impl rule__Solution__Group__4 ;
    public final void rule__Solution__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1525:1: ( rule__Solution__Group__3__Impl rule__Solution__Group__4 )
            // InternalKnowledgeDsl.g:1526:2: rule__Solution__Group__3__Impl rule__Solution__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Solution__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__3"


    // $ANTLR start "rule__Solution__Group__3__Impl"
    // InternalKnowledgeDsl.g:1533:1: rule__Solution__Group__3__Impl : ( '{' ) ;
    public final void rule__Solution__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1537:1: ( ( '{' ) )
            // InternalKnowledgeDsl.g:1538:1: ( '{' )
            {
            // InternalKnowledgeDsl.g:1538:1: ( '{' )
            // InternalKnowledgeDsl.g:1539:2: '{'
            {
             before(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__3__Impl"


    // $ANTLR start "rule__Solution__Group__4"
    // InternalKnowledgeDsl.g:1548:1: rule__Solution__Group__4 : rule__Solution__Group__4__Impl rule__Solution__Group__5 ;
    public final void rule__Solution__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1552:1: ( rule__Solution__Group__4__Impl rule__Solution__Group__5 )
            // InternalKnowledgeDsl.g:1553:2: rule__Solution__Group__4__Impl rule__Solution__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Solution__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__4"


    // $ANTLR start "rule__Solution__Group__4__Impl"
    // InternalKnowledgeDsl.g:1560:1: rule__Solution__Group__4__Impl : ( ( rule__Solution__Group_4__0 )? ) ;
    public final void rule__Solution__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1564:1: ( ( ( rule__Solution__Group_4__0 )? ) )
            // InternalKnowledgeDsl.g:1565:1: ( ( rule__Solution__Group_4__0 )? )
            {
            // InternalKnowledgeDsl.g:1565:1: ( ( rule__Solution__Group_4__0 )? )
            // InternalKnowledgeDsl.g:1566:2: ( rule__Solution__Group_4__0 )?
            {
             before(grammarAccess.getSolutionAccess().getGroup_4()); 
            // InternalKnowledgeDsl.g:1567:2: ( rule__Solution__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKnowledgeDsl.g:1567:3: rule__Solution__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Solution__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSolutionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__4__Impl"


    // $ANTLR start "rule__Solution__Group__5"
    // InternalKnowledgeDsl.g:1575:1: rule__Solution__Group__5 : rule__Solution__Group__5__Impl ;
    public final void rule__Solution__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1579:1: ( rule__Solution__Group__5__Impl )
            // InternalKnowledgeDsl.g:1580:2: rule__Solution__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__5"


    // $ANTLR start "rule__Solution__Group__5__Impl"
    // InternalKnowledgeDsl.g:1586:1: rule__Solution__Group__5__Impl : ( '}' ) ;
    public final void rule__Solution__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1590:1: ( ( '}' ) )
            // InternalKnowledgeDsl.g:1591:1: ( '}' )
            {
            // InternalKnowledgeDsl.g:1591:1: ( '}' )
            // InternalKnowledgeDsl.g:1592:2: '}'
            {
             before(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group__5__Impl"


    // $ANTLR start "rule__Solution__Group_4__0"
    // InternalKnowledgeDsl.g:1602:1: rule__Solution__Group_4__0 : rule__Solution__Group_4__0__Impl rule__Solution__Group_4__1 ;
    public final void rule__Solution__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1606:1: ( rule__Solution__Group_4__0__Impl rule__Solution__Group_4__1 )
            // InternalKnowledgeDsl.g:1607:2: rule__Solution__Group_4__0__Impl rule__Solution__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Solution__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Solution__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group_4__0"


    // $ANTLR start "rule__Solution__Group_4__0__Impl"
    // InternalKnowledgeDsl.g:1614:1: rule__Solution__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Solution__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1618:1: ( ( 'description' ) )
            // InternalKnowledgeDsl.g:1619:1: ( 'description' )
            {
            // InternalKnowledgeDsl.g:1619:1: ( 'description' )
            // InternalKnowledgeDsl.g:1620:2: 'description'
            {
             before(grammarAccess.getSolutionAccess().getDescriptionKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSolutionAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group_4__0__Impl"


    // $ANTLR start "rule__Solution__Group_4__1"
    // InternalKnowledgeDsl.g:1629:1: rule__Solution__Group_4__1 : rule__Solution__Group_4__1__Impl ;
    public final void rule__Solution__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1633:1: ( rule__Solution__Group_4__1__Impl )
            // InternalKnowledgeDsl.g:1634:2: rule__Solution__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Solution__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group_4__1"


    // $ANTLR start "rule__Solution__Group_4__1__Impl"
    // InternalKnowledgeDsl.g:1640:1: rule__Solution__Group_4__1__Impl : ( ( rule__Solution__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Solution__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1644:1: ( ( ( rule__Solution__DescriptionAssignment_4_1 ) ) )
            // InternalKnowledgeDsl.g:1645:1: ( ( rule__Solution__DescriptionAssignment_4_1 ) )
            {
            // InternalKnowledgeDsl.g:1645:1: ( ( rule__Solution__DescriptionAssignment_4_1 ) )
            // InternalKnowledgeDsl.g:1646:2: ( rule__Solution__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getSolutionAccess().getDescriptionAssignment_4_1()); 
            // InternalKnowledgeDsl.g:1647:2: ( rule__Solution__DescriptionAssignment_4_1 )
            // InternalKnowledgeDsl.g:1647:3: rule__Solution__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Solution__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSolutionAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__Group_4__1__Impl"


    // $ANTLR start "rule__Organisation__NameAssignment_2"
    // InternalKnowledgeDsl.g:1656:1: rule__Organisation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Organisation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1660:1: ( ( ruleEString ) )
            // InternalKnowledgeDsl.g:1661:2: ( ruleEString )
            {
            // InternalKnowledgeDsl.g:1661:2: ( ruleEString )
            // InternalKnowledgeDsl.g:1662:3: ruleEString
            {
             before(grammarAccess.getOrganisationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrganisationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__NameAssignment_2"


    // $ANTLR start "rule__Organisation__CurrentProblemAssignment_4_1"
    // InternalKnowledgeDsl.g:1671:1: rule__Organisation__CurrentProblemAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Organisation__CurrentProblemAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1675:1: ( ( ( ruleEString ) ) )
            // InternalKnowledgeDsl.g:1676:2: ( ( ruleEString ) )
            {
            // InternalKnowledgeDsl.g:1676:2: ( ( ruleEString ) )
            // InternalKnowledgeDsl.g:1677:3: ( ruleEString )
            {
             before(grammarAccess.getOrganisationAccess().getCurrentProblemProblemCrossReference_4_1_0()); 
            // InternalKnowledgeDsl.g:1678:3: ( ruleEString )
            // InternalKnowledgeDsl.g:1679:4: ruleEString
            {
             before(grammarAccess.getOrganisationAccess().getCurrentProblemProblemEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrganisationAccess().getCurrentProblemProblemEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getOrganisationAccess().getCurrentProblemProblemCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__CurrentProblemAssignment_4_1"


    // $ANTLR start "rule__Organisation__ExperiencesAssignment_5_2"
    // InternalKnowledgeDsl.g:1690:1: rule__Organisation__ExperiencesAssignment_5_2 : ( ruleExperience ) ;
    public final void rule__Organisation__ExperiencesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1694:1: ( ( ruleExperience ) )
            // InternalKnowledgeDsl.g:1695:2: ( ruleExperience )
            {
            // InternalKnowledgeDsl.g:1695:2: ( ruleExperience )
            // InternalKnowledgeDsl.g:1696:3: ruleExperience
            {
             before(grammarAccess.getOrganisationAccess().getExperiencesExperienceParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExperience();

            state._fsp--;

             after(grammarAccess.getOrganisationAccess().getExperiencesExperienceParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__ExperiencesAssignment_5_2"


    // $ANTLR start "rule__Organisation__ExperiencesAssignment_5_3_1"
    // InternalKnowledgeDsl.g:1705:1: rule__Organisation__ExperiencesAssignment_5_3_1 : ( ruleExperience ) ;
    public final void rule__Organisation__ExperiencesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1709:1: ( ( ruleExperience ) )
            // InternalKnowledgeDsl.g:1710:2: ( ruleExperience )
            {
            // InternalKnowledgeDsl.g:1710:2: ( ruleExperience )
            // InternalKnowledgeDsl.g:1711:3: ruleExperience
            {
             before(grammarAccess.getOrganisationAccess().getExperiencesExperienceParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExperience();

            state._fsp--;

             after(grammarAccess.getOrganisationAccess().getExperiencesExperienceParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Organisation__ExperiencesAssignment_5_3_1"


    // $ANTLR start "rule__Experience__NameAssignment_1"
    // InternalKnowledgeDsl.g:1720:1: rule__Experience__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Experience__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1724:1: ( ( ruleEString ) )
            // InternalKnowledgeDsl.g:1725:2: ( ruleEString )
            {
            // InternalKnowledgeDsl.g:1725:2: ( ruleEString )
            // InternalKnowledgeDsl.g:1726:3: ruleEString
            {
             before(grammarAccess.getExperienceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExperienceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__NameAssignment_1"


    // $ANTLR start "rule__Experience__ProblemsAssignment_3_2"
    // InternalKnowledgeDsl.g:1735:1: rule__Experience__ProblemsAssignment_3_2 : ( ruleProblem ) ;
    public final void rule__Experience__ProblemsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1739:1: ( ( ruleProblem ) )
            // InternalKnowledgeDsl.g:1740:2: ( ruleProblem )
            {
            // InternalKnowledgeDsl.g:1740:2: ( ruleProblem )
            // InternalKnowledgeDsl.g:1741:3: ruleProblem
            {
             before(grammarAccess.getExperienceAccess().getProblemsProblemParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getExperienceAccess().getProblemsProblemParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__ProblemsAssignment_3_2"


    // $ANTLR start "rule__Experience__ProblemsAssignment_3_3_1"
    // InternalKnowledgeDsl.g:1750:1: rule__Experience__ProblemsAssignment_3_3_1 : ( ruleProblem ) ;
    public final void rule__Experience__ProblemsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1754:1: ( ( ruleProblem ) )
            // InternalKnowledgeDsl.g:1755:2: ( ruleProblem )
            {
            // InternalKnowledgeDsl.g:1755:2: ( ruleProblem )
            // InternalKnowledgeDsl.g:1756:3: ruleProblem
            {
             before(grammarAccess.getExperienceAccess().getProblemsProblemParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProblem();

            state._fsp--;

             after(grammarAccess.getExperienceAccess().getProblemsProblemParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__ProblemsAssignment_3_3_1"


    // $ANTLR start "rule__Experience__SolutionsAssignment_6"
    // InternalKnowledgeDsl.g:1765:1: rule__Experience__SolutionsAssignment_6 : ( ruleSolution ) ;
    public final void rule__Experience__SolutionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1769:1: ( ( ruleSolution ) )
            // InternalKnowledgeDsl.g:1770:2: ( ruleSolution )
            {
            // InternalKnowledgeDsl.g:1770:2: ( ruleSolution )
            // InternalKnowledgeDsl.g:1771:3: ruleSolution
            {
             before(grammarAccess.getExperienceAccess().getSolutionsSolutionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSolution();

            state._fsp--;

             after(grammarAccess.getExperienceAccess().getSolutionsSolutionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__SolutionsAssignment_6"


    // $ANTLR start "rule__Experience__SolutionsAssignment_7_1"
    // InternalKnowledgeDsl.g:1780:1: rule__Experience__SolutionsAssignment_7_1 : ( ruleSolution ) ;
    public final void rule__Experience__SolutionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1784:1: ( ( ruleSolution ) )
            // InternalKnowledgeDsl.g:1785:2: ( ruleSolution )
            {
            // InternalKnowledgeDsl.g:1785:2: ( ruleSolution )
            // InternalKnowledgeDsl.g:1786:3: ruleSolution
            {
             before(grammarAccess.getExperienceAccess().getSolutionsSolutionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSolution();

            state._fsp--;

             after(grammarAccess.getExperienceAccess().getSolutionsSolutionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Experience__SolutionsAssignment_7_1"


    // $ANTLR start "rule__Problem__NameAssignment_1"
    // InternalKnowledgeDsl.g:1795:1: rule__Problem__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Problem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1799:1: ( ( ruleEString ) )
            // InternalKnowledgeDsl.g:1800:2: ( ruleEString )
            {
            // InternalKnowledgeDsl.g:1800:2: ( ruleEString )
            // InternalKnowledgeDsl.g:1801:3: ruleEString
            {
             before(grammarAccess.getProblemAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__NameAssignment_1"


    // $ANTLR start "rule__Problem__SolutionsAssignment_5"
    // InternalKnowledgeDsl.g:1810:1: rule__Problem__SolutionsAssignment_5 : ( ruleSolution ) ;
    public final void rule__Problem__SolutionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1814:1: ( ( ruleSolution ) )
            // InternalKnowledgeDsl.g:1815:2: ( ruleSolution )
            {
            // InternalKnowledgeDsl.g:1815:2: ( ruleSolution )
            // InternalKnowledgeDsl.g:1816:3: ruleSolution
            {
             before(grammarAccess.getProblemAccess().getSolutionsSolutionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSolution();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getSolutionsSolutionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__SolutionsAssignment_5"


    // $ANTLR start "rule__Problem__SolutionsAssignment_6_1"
    // InternalKnowledgeDsl.g:1825:1: rule__Problem__SolutionsAssignment_6_1 : ( ruleSolution ) ;
    public final void rule__Problem__SolutionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1829:1: ( ( ruleSolution ) )
            // InternalKnowledgeDsl.g:1830:2: ( ruleSolution )
            {
            // InternalKnowledgeDsl.g:1830:2: ( ruleSolution )
            // InternalKnowledgeDsl.g:1831:3: ruleSolution
            {
             before(grammarAccess.getProblemAccess().getSolutionsSolutionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSolution();

            state._fsp--;

             after(grammarAccess.getProblemAccess().getSolutionsSolutionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Problem__SolutionsAssignment_6_1"


    // $ANTLR start "rule__Solution__NameAssignment_2"
    // InternalKnowledgeDsl.g:1840:1: rule__Solution__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Solution__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1844:1: ( ( ruleEString ) )
            // InternalKnowledgeDsl.g:1845:2: ( ruleEString )
            {
            // InternalKnowledgeDsl.g:1845:2: ( ruleEString )
            // InternalKnowledgeDsl.g:1846:3: ruleEString
            {
             before(grammarAccess.getSolutionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__NameAssignment_2"


    // $ANTLR start "rule__Solution__DescriptionAssignment_4_1"
    // InternalKnowledgeDsl.g:1855:1: rule__Solution__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Solution__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalKnowledgeDsl.g:1859:1: ( ( ruleEString ) )
            // InternalKnowledgeDsl.g:1860:2: ( ruleEString )
            {
            // InternalKnowledgeDsl.g:1860:2: ( ruleEString )
            // InternalKnowledgeDsl.g:1861:3: ruleEString
            {
             before(grammarAccess.getSolutionAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSolutionAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Solution__DescriptionAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000402000L});

}