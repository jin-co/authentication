package add.console;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook {
    /*
    * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
    전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

    구조대 : 119
    박준영 : 97 674 223
    지영석 : 11 9552 4421
    전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

    제한 사항
    phone_book의 길이는 1 이상 1,000,000 이하입니다.
    각 전화번호의 길이는 1 이상 20 이하입니다.
    같은 전화번호가 중복해서 들어있지 않습니다.
    * */

    public static boolean phone(String[] phone_book) {
        boolean answer = true;
        java.util.ArrayList<String> numbers = new java.util.ArrayList<>();
        int length = 10;
        String shortest = "";
        for (String i : phone_book) {
            numbers.add(i);
            if (length > i.length()) {
                length = i.length();
                shortest = i;
            }
        }

        numbers.remove(shortest);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).startsWith(shortest)) {
                answer = false;
                break;
            }
        }

        // time over
//        for (int i = 0; i < numbers.size(); i++) {
//            for (int j = 0; j < numbers.size(); j++) {
//                if (numbers.get(i) != numbers.get(j) && numbers.get(i).startsWith(numbers.get(j))) {
//                    answer = false;
//                    break;
//                }
//            }
//        }

//        for (int i = 0; i < numbers.size(); i++) {
//            firsNums.add(numbers.get(i).split(" ")[0]);
//            System.out.println(firsNums);
//        }

//        for (String i : numbers) {
//            System.out.println(i);
//        }
        return answer;
    }
}
