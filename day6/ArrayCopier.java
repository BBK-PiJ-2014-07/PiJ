public class ArrayCopier {

	ArrayCopier() {

	}

	public void copy(int[] src, int[] dst) {
		//if both arrays are the same size
		if (src.length > dst.length) {
			//if src is longer
			for (int i = 0; i < dst.length; i++) {
				dst[i] = src[i];
			}
		} else {
			//if src is shorter
			for (int i = 0; i < src.length; i++) {
				dst[i] = src[i];
			}
		}

	}


}
