package FuzzingFunctions;

import java.util.ArrayList;
import java.util.Random;

import AutoFuzzMain.ConfigVariables;
import BioinfoFieldExtractor.GenericSequence;
import BioinfoFieldExtractor.GenericSequence.MessageBlock;

/**
 * @author Serge Gorbunov
 *
 */
public class FuzzingFunctionIntegerMax32BitUnsigned implements FuzzingFunctionInterface{
	private ConfigVariables variables = new ConfigVariables() ;

	public ArrayList<Integer> fuzzInputMsg(GenericSequence genericMessage,
			ArrayList<Integer> originalMessage) {
		ArrayList<Integer> fuzzedMsg = new ArrayList<Integer>() ;
		int[] maxValue = { 52, 50, 57, 52, 57, 54, 55, 50, 57, 53 } ;
		
		for ( MessageBlock block : genericMessage.getGenericSequence() ) 
		{
			if ( block.getType() == 0 )
				fuzzedMsg.addAll( block.getConstantFieldData() ) ;
			else if ( block.getType() == 1 )
			{
				for ( int v : maxValue )
				{
					fuzzedMsg.add( v ) ;
				}
			}
			else
			{
				Random generator = new Random() ;
				int randomIndex = generator.nextInt( block.getSampleDataSet().size() ) ;
				fuzzedMsg.addAll( block.getSampleDataSet().get( randomIndex ) ) ;
			}	
		}
		return fuzzedMsg ;
	}
	
}