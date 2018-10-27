import java.util.Arrays;

public class ArrayList implements List{

	Object arr[];
	 int size;

	public ArrayList() {

		arr = new Object[10];
		size = 0;

	}



	// public static void main(String[] args){ 


	// 	ArrayList aL = new ArrayList();

	// 	 aL.add("C");
 //      	//  aL.add("A");
 //     	 // aL.add("E");

 //     	  aL.add(2, "A2");
     	 
 //      aL.remove(1);


 //      	System.out.println(aL.get(2));

 //      	System.out.println(Arrays.toString(aL.arr));



	// }


	public int size(){

		return size;

	}

	public void growArray(){

		Object[] newArray = new Object[arr.length * 2];

		for(int i = 0; i < arr.length - 1; i++){

			newArray[i] = arr[i];


		}

		arr = newArray;

	}

	public void add(Object obj){

		if(size == arr.length){

			growArray();

		}

		arr[size] = obj;

		++size;

	}

public void add(int pos, Object obj){

		
		if(size == arr.length){

			growArray();

		}
		if(pos >= size &&  pos < 0 ) {

			throw new IndexOutOfBoundsException();
		}


		for(int i = size; i > pos; i --){

			arr[i] = arr[i - 1];

		}

		arr[pos] = obj;
		size++;

}

public Object remove(int pos){

		if(pos >= size && pos < 0 ) {

			throw new IndexOutOfBoundsException();
		}

		Object temp = arr[pos];

		for(int i = pos; i < size; i++) {

			arr[i] = arr[i + 1];

		}

		--size;
		return temp;

}

public Object get(int index){

	if(index >= size && index < 0 ) {

			throw new IndexOutOfBoundsException();
		}

	return arr[index];
}


}