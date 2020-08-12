package FuzzingFunctions;

import java.util.ArrayList;

import BioinfoFieldExtractor.GenericSequence;

/**
 * This interface is used to perform a specific fuzzing function on a message.
 * Message is given in two forms: the original input message and the generic version
 * of the message generated by sequence alignment algorithms amongst "similar"
 * messages.
 * 
 * @author Serge Gorbunov
 *
 */
public interface FuzzingFunctionInterface {

	/**
	 * Modifies the input messages
	 * @param genericMessage The generic representation of the message 
	 * @param originalMessage Original Input Message
	 * 
	 * @return modified message
	 */
	public ArrayList<Integer> fuzzInputMsg( GenericSequence genericMessage, ArrayList<Integer> originalMessage ) ;	
}
