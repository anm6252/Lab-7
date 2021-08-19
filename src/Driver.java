
public class Driver {

	public static void main(String[] args) {

		ArrayStack arrayStack = new ArrayStack();
		LinkedStack linkedStack = new LinkedStack();

				arrayStack.push(1);
				arrayStack.push(7);
				arrayStack.push(3);
				arrayStack.push(4);
				arrayStack.push(9);
				arrayStack.push(2);

	while (!arrayStack.isEmpty()) {
			
			System.out.println("INTEGER REMOVED:\n " + arrayStack.pop());
			
		}

			System.out.println("STACK IS EMPTY\n");
		
				linkedStack.push(1);
				linkedStack.push(7);
				linkedStack.push(3);
				linkedStack.push(4);
				linkedStack.push(9);
				linkedStack.push(2);

	while (!linkedStack.isEmpty()) {
			
			System.out.println("INTEGER REMOVED:\n " + linkedStack.pop());
			
		}

			System.out.println("STACK IS EMPTY\n");

		LinkedStack linkedStack1 = new LinkedStack();

				linkedStack1.push(1);
				linkedStack1.push(7);
				linkedStack1.push(3);
				linkedStack1.push(4);
				linkedStack1.push(9);
				linkedStack1.push(2);

			linkedStack1.removeBottomHalf();

	
			System.out.println("BOTTOM HALF OF STACK:\n " + linkedStack1);
		
	}
	
}
