public class GeometricObject {
	private String triColor;
	private boolean isFilled;
	public String getColor(){
		return triColor;
	}
	public void putColor(String color){
		this.triColor = color;
	}
	public void setFill(boolean fill){
		isFilled = fill;
	}
	public boolean isFilled(){
		return isFilled;
	}
	
}
