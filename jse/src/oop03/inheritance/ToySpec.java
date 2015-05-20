package oop03.inheritance;

import java.util.HashMap;
import java.util.Map;

public class ToySpec {
	private Map<String,Object> properties;
	
	public ToySpec(){
		properties = new HashMap<String, Object>();
	}

	public Map<String, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
	// �ʿ� Ű��, �Ӽ��� �߰�
	
	public void setProperty(String pName, Object pValue){
		properties.put(pName, pValue);
	}
	// Ű���� ���� �Ӽ��� �ҷ�����
	public Object getProperty(String pname){
		return properties.get(pname);
	}
	// �� �˻�
	public boolean match(ToySpec spec){
		String specStr = "";
		String thisStr = "";
		if(spec.getProperty("ToyUser")!=null){
			specStr += spec.getProperty("ToyUser");
			thisStr += getProperty("ToyUser");
		}
		if(spec.getProperty("ToyType")!=null){
			specStr += spec.getProperty("ToyType");
			thisStr += getProperty("ToyType");
		}
		return spec.equals(thisStr);
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
