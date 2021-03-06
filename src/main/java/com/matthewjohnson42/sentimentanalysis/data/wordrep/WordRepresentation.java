package com.matthewjohnson42.sentimentanalysis.data.wordrep;

/**
* A generic class used to describe the representation of a single word from a text.
*/
public abstract class WordRepresentation{

	/**
	* The String representation of the word being described.
	*/
	protected String word;

	/**
	* Get the String representation of the word being described.
	* @return String The String representation of the word.
	*/
	public String getWord(){
		return word;
	}

	/**
	* Get the integer representation of the sentiment score of the word.
	* @return int The integer sentiment score of the word.
	*/
	public abstract int getIntValue();

	/**
	* Get the float representation of the sentiment score of the word.
	* @return float The float sentiment score of the word.
	*/
	public abstract float getFloatValue();

	@Override
	public boolean equals(Object other) {
		if(other instanceof WordRepresentation) {
			WordRepresentation otherWord = (WordRepresentation) other;
			return this.word.equals(otherWord.getWord());
		} else if(other instanceof String) {
			String otherWord = (String) other;
			return this.word.equals(otherWord);
		} else {
			return false;
		}
	}
}