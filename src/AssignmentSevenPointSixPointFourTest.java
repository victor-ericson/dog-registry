// JUnit-testfallen i denna fil testar metoden för att sortera hundar U7.6.4, den kräver tillgång till AssignmentSevenPointSixTest
// För mer information se README.txt-filen

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class AssignmentSevenPointSixPointFourTest extends AssignmentSevenPointSixTest {

 	public AssignmentSevenPointSixPointFourTest() throws IllegalArgumentException, IllegalAccessException {
 		super("U7.6.4");
 	}

 	private void sortAndCheck(Dog[] dogsToSort, Dog[] expectedOrder, int expectedSwaps) {
 		addDogs(dogsToSort);
 		var swaps = callMethodUnderTest(sut);
 		assertDogsAre("Den sorterade listan av hundar är inte korrekt", expectedOrder);
 		assertEquals(expectedSwaps, swaps, "Fel antal byten");
 	}

 	@Test
 	public void sortPreparedDogs() {
 		sortAndCheck(ORIGINAL_ORDER_OF_PREPARED_DOGS, SORTED_ORDER_OF_PREPARED_DOGS, 8);
 	}

 	@Test
 	public void sortEmptyList() {
 		Dog[] arr = {};
 		sortAndCheck(arr, arr, 0);
 	}

 	@Test
 	public void sortingAnAlreadySortedListRequiresNoSwaps() {
 		sortAndCheck(SORTED_ORDER_OF_PREPARED_DOGS, SORTED_ORDER_OF_PREPARED_DOGS, 0);
 	}

 	@Test

 	public void sortingAReversedSortedListRequiresSwapingHalfThePlaces() {
 		int count = SORTED_ORDER_OF_PREPARED_DOGS.length;
 		Dog[] arr = new Dog[count];
 		for (int i = 0; i < count; i++) {
 			arr[count - 1 - i] = SORTED_ORDER_OF_PREPARED_DOGS[i];
 		}
 		sortAndCheck(arr, SORTED_ORDER_OF_PREPARED_DOGS, SORTED_ORDER_OF_PREPARED_DOGS.length / 2);
 	}

}
