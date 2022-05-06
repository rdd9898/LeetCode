package daily_practice.undefined_2022.hy.day21;

//1078.Bigram分词

//给出第一个词first 和第二个词second，考虑在某些文本text中可能以 "first second third" 形式出现的情况，其中second紧随first出现，third紧随second出现。
//
//对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。

public class Solution {
    public static String[] findOcurrences(String text, String first, String second) {
        String[] strings = text.split(" ");
        StringBuffer answers = new StringBuffer();
        for (int i = 0; i + 3 <= strings.length; i++) {
            if (strings[i].equals(first) && strings[i+1].equals(second)) {
                answers.append(strings[i+2]);
                answers.append(" ");
            }
        }
        answers.append(" ");
        return answers.toString().split(" ");
    }
}
