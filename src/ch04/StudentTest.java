package ch04;

public class StudentTest {

	public static void main(String[] args) {
	
		Student studentLee = new Student();

		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		studentLee.showStudentInfo();

		Student studentKim = new Student();

		studentKim.studentId = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "경기도 성남시";
		studentKim.showStudentInfo();
		
		/*
		 * ch04.Student@7852e922
		 * ch04.Student@4e25154f
		 * 클래스패키지네임 ==> [ch04]
		 * 클래스풀네임 ==> [ch04.Student]
		 * 참조 변수 : 메모리에 생성된 인스턴스를 가리키는 변수 (Stack Memory)
		 * 참조 변수 ==> [studentLee, studentKim]
		 * 참조 값 : 생성된 인스턴스의 메모리 주소 값 (Heap Memory)
		 * 참조 값 ==> [@7852e922, @4e25154f]
		 */
		System.out.println(studentLee);
		//System.out.println(new Student());
		System.out.println(studentKim);

	}

}
