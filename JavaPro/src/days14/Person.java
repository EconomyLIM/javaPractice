package days14;


public class Person {

	//필드
	private String name;
	private int age;
	private boolean gender;

	//alt+shift+s

	public Person() {

	} // Default Person

	public Person(boolean b) {
		gender = b;
	} // Person

	// getter, setter 선언 값을 바꿀땐 set 가져올땐 get
	public void setAge(int n) {
		if ( 0 <= n && n<=130) {
			age = n;			
		} else {
			// 강제로 예외(오류)를 발생
			throw new RuntimeException("Person.age 0~100 실행오류");
		} //else

	} //setAge

	public int getAge() {
		return age;
	} // getAge

	public String getName() {
		return name;
	} //getName

	public void setName(String name) {
		this.name = name;
	} // setName

	public boolean isGender() {
		return gender;
	} //isGender

	public void setGender(boolean gender) {
		this.gender = gender;
	} //setGender

} //class


