package aed.tries;

import es.upm.aedlib.positionlist.PositionList;


/**
 * A dictionary which just stores words without associated meanings. 
 * Can be used for e.g. checking spelling of words.
 */
public interface Dictionary {

  /**
   * Adds a new word. 
   * Raises exception IllegalArgumentException if word is null or the empty string.
   */
  public void add(String word);

  /**
   * Returns true if a word is included in the dictionary, and false otherwise.
   * Raises exception IllegalArgumentException if word is null or the empty string.
   */
  public boolean isIncluded(String word);

  /**
   * Deletes a word. 
   * Raises exception IllegalArgumentException if word is null or the empty string.
   */
  public void delete(String word);
  
  /**
   * Returns, in alphabetic order, a list with all words which begin with the prefix argument.
   * Raises exception IllegalArgumentException if prefix is null. Note that the empty string
   * is an acceptable argument.
   */
  public PositionList<String> wordsBeginningWithPrefix(String prefix);

}

                            
