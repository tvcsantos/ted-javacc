package ted;

import java.io.Serializable;
import java.io.StringReader;

import ted.javacc.IASTExpression;
import ted.javacc.ParseException;
import ted.javacc.Parser;


/**
 * TED: Torrent Episode Downloader (2005 - 2006)
 * 
 * The tedkeywordchecker checks a string against a keyword string from the user
 * 
 * @author Roel
 * @author Joost
 * @author tvcsantos
 *
 * ted License:
 * This file is part of ted. ted and all of it's parts are licensed
 * under GNU General Public License (GPL) version 2.0
 * 
 * for more details see: http://en.wikipedia.org/wiki/GNU_General_Public_License
 *
 */
public class TedParserKeywordChecker implements Serializable
{

	/****************************************************
	 * LOCAL METHODS
	 ****************************************************/
	/**
	 * Checks a keyword expression against a string
	 * @param parseTekst Keyword Expression
	 * @param name String we have to match
	 * @return Are all keywords in the string?
	 */
	private boolean ExpressieChecker ( String parseTekst, String name )
	{
		// if the user has not set any keywords in the serie
		if (parseTekst == null || parseTekst.equals(""))
		{
			return true;
		}
		
		try {
			Parser parser = new Parser(new StringReader(parseTekst));
			IASTExpression ast = parser.Start();

			return ast.evaluate(name);
		} catch (ParseException x) {
			return false;
		}
	}
	
	/****************************************************
	 * PUBLIC METHODS
	 ****************************************************/
	/**
	 * @param name String we have to check
	 * @param keywords Keywords that have to be in the string
	 * @return If the keywords match with the string
	 */
	public boolean checkKeywords(String name, String keywords)
	{		
		name = name.toLowerCase();
		keywords = keywords.toLowerCase();
		return this.ExpressieChecker(keywords, name);
	}
	
	
}
