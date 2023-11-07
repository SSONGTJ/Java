package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.BookListDto;

/*
 * 	글 목록을 ArrayList 에 담아 보세요.
 * 
 * 	글 하나는 글번호, 작성자, 제목 으로 이루어져 있다고 가정합니다.
 * 
 * 	글 3개의 정보를 ArrayList 에 담고, 반복문 돌면서 담긴 내용을 출력해보세요.
 * 
 * 	글 하나를 담을 dto 클래스를 알아서 만들어 보세요.
 */
public class QuiMain2 {
	public static void main(String[] args) {
		List<BookListDto> BookList = new ArrayList<BookListDto>();
		
		BookListDto list1 = new BookListDto();
		list1.setNum(1);
		list1.setWirter("김구라");
		list1.setTitle("제목1");
		
		BookListDto list2 = new BookListDto();
		list2.setNum(2);
		list2.setWirter("해골");
		list2.setTitle("제목2");
		
		BookListDto list3 = new BookListDto();
		list3.setNum(3);
		list3.setWirter("원숭이");
		list3.setTitle("제목3");
		
		BookList.add(list1);
		BookList.add(list2);
		BookList.add(list3);
		
		for (BookListDto b:BookList) {
			String result=String.format("글번호 : %d, 작성자 : %s, 제목 : %s",b.getNum(),b.getWirter(),b.getTitle());
			System.out.println(result);
		}
	}
}
