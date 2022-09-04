package ted.javacc;

/**
 * TED: Torrent Episode Downloader (2005 - 2006).<br><br>
 * 
 * This class represents the NOT ("!") branch of an expression
 * in an abstract syntax tree expression.<br><br> 
 *  
 * ted License:
 * This file is part of ted. ted and all of it's parts are licensed
 * under GNU General Public License (GPL) version 2.0
 * 
 * for more details see: http://en.wikipedia.org/wiki/GNU_General_Public_License.
 *
 * @author tvcsantos
 */
public class ASTNot implements IASTExpression {
	/** the expression to negate */
	protected IASTExpression expression;

	/**
	 * Constructs a new ASTNot expression with
	 * the expression in argument
	 * @param e the expression to negate
	 */
	public ASTNot(IASTExpression e) {
		expression = e;
	}

	public boolean evaluate(String name) {
		return !expression.evaluate(name);
	}

}