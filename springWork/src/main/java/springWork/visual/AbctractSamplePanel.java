package springWork.visual;

import java.awt.Component;

import javax.swing.JPanel;

import springWork.utility.SampleStringUtility;

public class AbctractSamplePanel extends JPanel {
	@Override
	public String toString() {
		SampleStringUtility.outStartEnd(this, SampleStringUtility.OUT_START);
		StringBuffer retSb = new StringBuffer();

		// output to component list
		Component[] coms = getComponents();
		for(Component com : coms){
			retSb.append("com:" + com.toString());
			retSb.append(System.getProperty("line.separator"));
		}

		// output toBounds
		retSb.append("getBounds:" + getBounds().toString());
		retSb.append(System.getProperty("line.separator"));
		retSb.append("getLayout:" + getLayout().getClass().getName().toString());

		System.out.println(retSb.toString());
		SampleStringUtility.outStartEnd(this, SampleStringUtility.OUT_END);
		return retSb.toString();
	}
}
