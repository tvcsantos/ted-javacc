package ted.javacc;

/**
 * TED: Torrent Episode Downloader (2005 - 2006).<br><br>
 * 
 * This class represents the OR ("|") branch of an expression
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
public class ASTOr implements IASTExpression {
	/** left expression of the OR */
	protected IASTExpression left;
	/** right expression of the OR */
	protected IASTExpression right;

	/**
	 * Constructs a new ASTOr expression with
	 * the left and right expressions in argument
	 * @param l the left expression of the OR
	 * @param r the right expression of the OR
	 */
	public ASTOr(IASTExpression l, IASTExpression r) {
		left = l;
		right = r;
	}

	public boolean evaluate(String name) {
		return left.evaluate(name) || right.evaluate(name);
	}
}
