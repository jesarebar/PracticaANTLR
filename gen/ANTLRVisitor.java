// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ANTLRParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ANTLRVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ANTLRParser#axioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxioma(ANTLRParser.AxiomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ANTLRParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ANTLRParser.TextContext ctx);
}