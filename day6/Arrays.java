public class Arrays {

	public static void main (String[] args) {
		ArrayCopier copier = new ArrayCopier();
		int[] src = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		int[] dst = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		copier.copy(src, dst);
		System.out.println("Length of source array is " + src.length);
		System.out.println("Length of destination array is " + dst.length);
		System.out.println("Destination array is now: ");
		for (int i=0; i<dst.length; i++) {
			System.out.println(dst[i]);
		}
		
	}

}