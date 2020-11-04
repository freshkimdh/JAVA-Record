package Stack;


interface IStack{
    boolean isEmpty(); // 스택이 empty 상태인지 확인
    boolean isFull(); // 스택이 Full 상태인지 확인
    void push(int item); // 스택의 가장 최상위(마지막)에 데이터를 삽입
    int pop(); // 스택의 가장 최상위(마지막)에 위치한 데이터를 추출한 후에 스택에서 삭제
    int peek(); // 스택의 가장 최상위(마지막)에 위치한 데이터를 추출 하고, 삭제는 안함!!
    void clear(); // 스택에 저장된 모든 데이터를 삭제하고 스택을 초기화 한다.
}

class ArrayStack implements IStack {
	
	private int top;
	private int stackSize;
	private int stackArr[];
	
	//스택을 생성하는 생성자
	public ArrayStack(int stackSize) {
		top = -1; // 배열을 0 부터 시작하므로, 변수 -1 선언
		this.stackSize = stackSize; // 스택 사이즈 설정
		stackArr = new int[this.stackSize]; // 스택 배열 생성
	}
	
	@Override
	public boolean isEmpty() {
		// 스택 포인터가 -1인 경우 데이터가 없는 상태이므로 ture 아닌 경우 false를 return
		return (top == -1);
	}
	
	@Override
	public boolean isFull() {
		// 스택 포인터가 스택의 마지막 인덱스와 동일한 경우  ture 아닌 경우 false를 return
		return (top == this.stackSize-1);
	}
	
	//스택에 데이터 추가
	@Override
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack 꽉 찼음");
		} else {
			stackArr[++top] = item;
			System.out.println("추가된 데이터는: " + item);
		}
	}
	
	// 스택의 최상위(마지막) 데이터 추출 후 삭제
	@Override
	public int pop() {
		if(isEmpty()) {
			System.out.println("지울꺼 없으니, 채우고 지워주세요.");
			return 0;
		} else {
			try {
			
			System.out.println("최상위 데이터는 이것이며, 이것은 지우겠습니다. : " + stackArr[top]);
			return stackArr[--top];
			
		} catch(IndexOutOfBoundsException e) {
				System.out.println("데이터 없음");
			}
		}
		return 0;
	}
	
	//스택의 최상위(마지막) 데이터 추출
	@Override
	public int peek() {
		if(isEmpty()) {
			System.out.println("데이터 없으니, 채우고 추출하세요.");
		return 0;
		} else {
			System.out.println("최상위(마지막) 데이터는 이것 입니다.: " + stackArr[top]);
			return stackArr[top];
		}
	}
		

	//스택 모두 초기화
	@Override
	public void clear() {
		if(isEmpty()) {
			System.out.println("초기화 할것이 없습니다. 먼저 채워라주세요.");
		} else {
			top = -1;
			stackArr = new int[this.stackSize];
			System.out.println("스택 초기화 했습니다.");
		}
	}
	
	//스택 데이터 모두 출력
	public void printStack() {
		if(isEmpty()) {
			System.out.println("데이터 없으니, 채우고 추출하세요.");
		} else {
			System.out.print("스택의 모든 데이터 ");
			for(int i=0; i<=top; i++) {
				System.out.print(stackArr[i] + " ");
			}
			System.out.println();
			System.out.println(); 
		}
	}
}


public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stackSize = 5;
		ArrayStack arrStack = new ArrayStack(stackSize);
		
		//데이터 채운것
		arrStack.push(34);
		arrStack.printStack();
		
		arrStack.push(55);
		arrStack.printStack();
		
		arrStack.push(66);
		arrStack.printStack();
		
		arrStack.push(45);
		arrStack.printStack();
		
		arrStack.push(85);
		arrStack.printStack();
		
		arrStack.push(99); // 꽉 차서 못 들어 감
		arrStack.printStack();
		
		arrStack.clear(); // 스택 초기화
		arrStack.printStack();
		
		arrStack.isEmpty(); // 스택 없는거 확인 완료
		arrStack.printStack();
		
		// 다시 데이터 삽입
		arrStack.push(22);
		arrStack.printStack();
		
		arrStack.push(40);
		arrStack.printStack();
		
		arrStack.peek();// 최상위 데이터 확인
		arrStack.printStack();
		
		arrStack.pop();// 최상위 데이터 확인 후 삭제
		arrStack.printStack();
		
		arrStack.pop();
		

	}
}
