package project_;

import java.util.Arrays;
import java.util.HashSet;

//���� : Unlimited Blade Works
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
		String[] words = poem.split(" ");                 //���� split�� �ܾ� ������
		HashSet<String> set = new HashSet<String>();      //HashSet���� �ܾ��߰�
		HashSet<String> set2 = new HashSet<String>();     //set2�� �ҹ��ڷ� �ٲ� set
		for(int i = 0; i < words.length; i++) {           //for�� ����ؼ� ���� 
			set.add(words[i]);
	
	    set2.addAll(Arrays.asList(words[i].toLowerCase()));    // �迭words�� �ҹ��ڷ� �ٲ㼭 set2�� �ٲ� 
	  
		}
		System.out.println(set);                          // ���
		System.out.println(set2);                         // �ҹ��ڷ� �ٲٰ� ���
		System.out.print("�ܾ��� ������ : ");
		System.out.println(words.length);                 //�迭 words ���̷� �ܾ� ���� �ľ�     51
		System.out.print("Set ���� ������ : ");
		System.out.println(set.size());                   //�ߺ��� ���� ����                   45
		System.out.print("�ҹ��ڷ� �� �ٲ� �� ������ : ");
		System.out.println(set2.size());                  //�ҹ��ڷ� �ٲ㼭 set ũ�� ����ϱ�      42
	}

}
