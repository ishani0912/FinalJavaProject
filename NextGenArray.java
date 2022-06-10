//generic class with generic methods. 
public class NextGenArray <T> {
	
	T[] elements;

	public NextGenArray(T[] elements){
		super();
		this.elements = elements;
	}
	
	public T get(int index) {
		return this.elements[index-1];
	}
	
	public void set(int index, T element) {
		this.elements[index-1] = element;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "";
		for(int i=0; i<this.elements.length;i++)
		{
			result += this.elements[i];
			if(i!=this.elements.length-1) {
				result +=",";
			}
		}
		return result;
	}
}
