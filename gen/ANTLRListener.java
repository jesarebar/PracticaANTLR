// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ANTLRParser}.
 */
public interface ANTLRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#axioma}.
	 * @param ctx the parse tree
	 */
	void enterAxioma(ANTLRParser.AxiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#axioma}.
	 * @param ctx the parse tree
	 */
	void exitAxioma(ANTLRParser.AxiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(ANTLRParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(ANTLRParser.TextContext ctx);
}