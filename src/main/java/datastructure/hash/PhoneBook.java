package datastructure.hash;

import java.util.Arrays;

public class PhoneBook {
    public static void main(String[] args) {
        boolean result = new PhoneBook().solution(new String[]{"119", "97674223", "1195524421"});
        System.out.println(result);
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book, String::compareTo);
//        Arrays.stream(phone_book).forEach(System.out::println);

        for (int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i + 1].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }
        return answer;
    }
// 접두어인 경우를 체크하는 수행을 최소화하고자, 오름차순 정렬
// 오름차순 정렬을 하면 접두어인지 확인하려고하는 문자열의 바로 다음값만비교해봐도 알 수 있다.
// 다음값이 있기만 해도 수행을 멈추고 false를 반환하면 된다.
}
