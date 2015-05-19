package oop01.syntax;

public class AverageC {
	/*필드 선언*/
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	/*이름 저장하는 기능*/
	public void setName(String name){
		this.name = name;
		//필드영역에 선언된 인변 name 에 setName메소드의 파라미터인 name을 할당함
	}
	/*국어점수를 저장하는 기능*/
	public void setKor(int kor){
		this.kor = kor;
	}
	
	/*영어점수를 저장하는 기능*/
	public void setEng(int eng){
		this.eng = eng;
	}
	
	/*합계점수를 저장하는 기능*/
	public void setTot(int kor, int eng){
		this.tot = kor + eng;
	}
	
	/*평균점수를 저장하는 기능*/
	public void setAvg(int tot){
		this.avg = tot / 2;
	}//평균점수를 저장하는기능 오버로딩
	public void setAvg(int kor, int eng){
		this.avg = (kor + eng)/2;
	}
}
