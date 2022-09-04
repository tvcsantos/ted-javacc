package ted.javacc;

/**
 * TED: Torrent Episode Downloader (2005 - 2006).<br><br>
 * 
 * This class represents a string literal on an expression
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
public class ASTString implements IASTExpression {
	/** the string literal */
	protected String s;

	/**
	 * Constructs a new ASTString with
	 * the string literal in argument
	 * @param s the string literal of the expression
	 */
	public ASTString(String s) {
		this.s = s;
	}

	public boolean evaluate(String name) {
		return name.indexOf(s) != -1;
	}
}
