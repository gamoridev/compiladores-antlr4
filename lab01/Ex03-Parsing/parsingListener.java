// Generated from parsing.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parsingParser}.
 */
public interface parsingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parsingParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(parsingParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link parsingParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(parsingParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link parsingParser#np}.
	 * @param ctx the parse tree
	 */
	void enterNp(parsingParser.NpContext ctx);
	/**
	 * Exit a parse tree produced by {@link parsingParser#np}.
	 * @param ctx the parse tree
	 */
	void exitNp(parsingParser.NpContext ctx);
	/**
	 * Enter a parse tree produced by {@link parsingParser#vp}.
	 * @param ctx the parse tree
	 */
	void enterVp(parsingParser.VpContext ctx);
	/**
	 * Exit a parse tree produced by {@link parsingParser#vp}.
	 * @param ctx the parse tree
	 */
	void exitVp(parsingParser.VpContext ctx);
	/**
	 * Enter a parse tree produced by {@link parsingParser#pp}.
	 * @param ctx the parse tree
	 */
	void enterPp(parsingParser.PpContext ctx);
	/**
	 * Exit a parse tree produced by {@link parsingParser#pp}.
	 * @param ctx the parse tree
	 */
	void exitPp(parsingParser.PpContext ctx);
	/**
	 * Enter a parse tree produced by {@link parsingParser#cn}.
	 * @param ctx the parse tree
	 */
	void enterCn(parsingParser.CnContext ctx);
	/**
	 * Exit a parse tree produced by {@link parsingParser#cn}.
	 * @param ctx the parse tree
	 */
	void exitCn(parsingParser.CnContext ctx);
	/**
	 * Enter a parse tree produced by {@link parsingParser#cv}.
	 * @param ctx the parse tree
	 */
	void enterCv(parsingParser.CvContext ctx);
	/**
	 * Exit a parse tree produced by {@link parsingParser#cv}.
	 * @param ctx the parse tree
	 */
	void exitCv(parsingParser.CvContext ctx);
	/**
	 * Enter a parse tree produced by {@link parsingParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(parsingParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link parsingParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(parsingParser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link parsingParser#noun}.
	 * @param ctx the parse tree
	 */
	void enterNoun(parsingParser.NounContext ctx);
	/**
	 * Exit a parse tree produced by {@link parsingParser#noun}.
	 * @param ctx the parse tree
	 */
	void exitNoun(parsingParser.NounContext ctx);
	/**
	 * Enter a parse tree produced by {@link parsingParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(parsingParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link parsingParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(parsingParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link parsingParser#prep}.
	 * @param ctx the parse tree
	 */
	void enterPrep(parsingParser.PrepContext ctx);
	/**
	 * Exit a parse tree produced by {@link parsingParser#prep}.
	 * @param ctx the parse tree
	 */
	void exitPrep(parsingParser.PrepContext ctx);
}