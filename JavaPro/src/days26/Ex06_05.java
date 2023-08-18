package days26;

import java.io.File;

public class Ex06_05 {
	public static void main(String[] args) {
		//days26 폴더안에 upload폴더 유무 확인 후 없으면 폴더 생성
		// createNewFile() 파일 새로 생성 -> 이미 생성할 파일이 존재하면 false <-> 생성 성공하면 true
		// createTempFile() 임시파일 생성 -> File객체 반환 -> c::\\windows\\TEMP 파일생성 "파일명", "확장자명"
		// delete -> 파일 삭제 함수 -> 파일 삭제되면 true
		// deleteOnExit() : 응용 프로그램이 종료할 때 파일 삭제(주로 임시파일 삭제때 사용)
		// boolean renameTo(File) : 파일명을 변경하는 메소드
		// mkdir() : make directory 폴더 생성
		// mkdirs() : make directory 폴더들 생성
		
		
		String pathName = ".\\src\\days26";
		File dir = new File(pathName, "upload");

//		System.out.println(dir.exists());
		if (!dir.exists()) {
			System.out.println(dir.mkdir() + "생성완료");
		} else {
			System.out.println(dir.delete() + "삭제완료");
		}

	} //main
}
