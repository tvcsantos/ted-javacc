/* Generated By:JavaCC: Do not edit this line. ParserConstants.java */
package ted.javacc;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int NOT = 5;
  /** RegularExpression Id. */
  int AND = 6;
  /** RegularExpression Id. */
  int OR = 7;
  /** RegularExpression Id. */
  int LPAR = 8;
  /** RegularExpression Id. */
  int RPAR = 9;
  /** RegularExpression Id. */
  int STRING = 10;
  /** RegularExpression Id. */
  int EOL = 11;
  /** RegularExpression Id. */
  int CONSTANT = 12;
  /** RegularExpression Id. */
  int DIGIT = 13;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"!\"",
    "\"&\"",
    "\"|\"",
    "\"(\"",
    "\")\"",
    "<STRING>",
    "\";;\"",
    "<CONSTANT>",
    "<DIGIT>",
  };

}
