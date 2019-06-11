package task5;

public class MinMax {
	static String minmax(int[] values){
		String s = new String();
		int max = values[0];
		int min = values[0];
		for(int i = 0;i < values.length; i++){
			if(max < values[i]){
				max = values[i];
			}
			if(min > values[i]){
				min = values[i];
			}
		}
		s += "max = " + max;
		s += '\n' + "min = " + min;
		return s;
	}
}
