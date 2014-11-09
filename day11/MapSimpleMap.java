public class MapSimpleMap implements SimpleMap {
	private int[] key;
	private String[] value;
	private static final int DEFAULT_ARRAY_LENGTH = 5;


	public MapSimpleMap(){
		key = new int[DEFAULT_ARRAY_LENGTH];
		value = new String[DEFAULT_ARRAY_LENGTH];
	}

	public void populate(String[] strarray, int[] intarray){
		for (int i=0; i<strarray.length; i++;) {
			key[i] = intarray[i];
			value[i] = strarray[i];
		}
	}

	public void put(int k, String v) {
		for (int i=0; i<value.length; i++) {
			if (k==key[i]) || (value==value[i]){
				break;
			} else {

			}
		}
	}
}