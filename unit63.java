// name of program interface: test.
// member function is: square
//implement class: class arithmetic;
//one new class: ToTestInt in arithmetic class;
interface test {
 void square();/// member function
 }
class arithmetic implements test{
	public void square(){
		System.out.println("hehelolo");
		
	}

}

class main{
	public static void main(String[] args) {
		arithmetic myob = new arithmetic();
		myob.square();
		myob.test();
	}
}

