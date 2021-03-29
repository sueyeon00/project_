package project_;

import java.util.Arrays;
import java.util.HashSet;

//제목 : Unlimited Blade Works
public class Split_sentance_in_words4 {

	public static void main(String[] args) {
		String poem = "I am the bone of my sword"
				+" Steel is my body and fire is my blood"
				+" I have created over a thousand blade"
				+" Unknown to Death"
				+" Nor Known to life"
				+" Have withstood pain to create many weapons"
				+" Yet those hand will never hold anything"
				+" So, as i pray Unlimited Blade Works";
		String[] words = poem.split(" ");                 //문장 split로 단어 나누기
		HashSet<String> set = new HashSet<String>();      //HashSet으로 단어추가
		HashSet<String> set2 = new HashSet<String>();     //set2는 소문자로 바꾼 set
		for(int i = 0; i < words.length; i++) {           //for문 사용해서 루프 
			set.add(words[i]);
	
	    set2.addAll(Arrays.asList(words[i].toLowerCase()));    // 배열words를 소문자로 바꿔서 set2로 바꿈 
	  
		}
		System.out.println(set);                          // 출력
		System.out.println(set2);                         // 소문자로 바꾸고 출력
		System.out.print("단어의 개수는 : ");
		System.out.println(words.length);                 //배열 words 길이로 단어 개수 파악     51
		System.out.print("Set 속의 개수는 : ");
		System.out.println(set.size());                   //중복된 것은 제외                   45
		System.out.print("소문자로 다 바꾼 후 개수는 : ");
		System.out.println(set2.size());                  //소문자로 바꿔서 set 크기 출력하기      42
	}

}
