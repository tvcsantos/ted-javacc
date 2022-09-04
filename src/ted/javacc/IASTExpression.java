package ted.javacc;

/**
 * TED: Torrent Episode Downloader (2005 - 2006).<br><br>
 * 
 * This interface represents an 
 * abstract syntax tree expression.<br><br> 
 *  
 * ted License:
 * This file is part of ted. ted and all of it's parts are licensed
 * under GNU General Public License (GPL) version 2.0
 * 
 * for more details see: http://en.wikipedia.org/wiki/GNU_General_Public_License.
 *
 * @author tvcsantos
 */
public interface IASTExpression {
	/**
	 * Evaluate the abstract syntax tree.
	 * @param name the string to match with.
	 * @return true if all keywords in the string.
	 */
	boolean evaluate(String name);
}
