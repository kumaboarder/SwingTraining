package springWork.utility;

public final class SampleStringUtility {
	public static final int OUT_START = 0;
	public static final int OUT_END = 1;


	public static String outStartEnd(Object obj , int isStart){
		String StartEndMsg = "START";
		if(isStart == OUT_END){
			StartEndMsg = "END";
		}
		String restr = "======"+ StartEndMsg +"======" + obj.getClass().getName() + "============";
		System.out.println(restr);
		return restr;
	}

}
