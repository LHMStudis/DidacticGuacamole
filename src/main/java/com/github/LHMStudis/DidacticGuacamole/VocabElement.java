package main.java.com.github.LHMStudis.DidacticGuacamole;

/**
 * Represents one word + definition
 */
public class VocabElement {
  private String word;
  private String definition;
  public VocabElement(String word, String definition){
    this.word = word;
    this.definition = definition;
  }

  public String getWord(){
    return this.word;
  }

  public String getDefinition(){
    return this.definition;
  }

}
