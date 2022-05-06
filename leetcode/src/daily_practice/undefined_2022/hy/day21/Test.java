package daily_practice.undefined_2022.hy.day21;

public class Test {
    public static void main(String[] args) {
        String text =  "obo jvezipre obo jnvavldde jvezipre jvezipre jnvavldde jvezipre jvezipre jvezipre y jnvavldde jnvavldde obo jnvavldde jnvavldde obo jnvavldde jnvavldde jvezipre";
        String first = "jnvavldde";
        String second = "y";
        String[] answers = Solution.findOcurrences(text, first, second);
        for (String answer: answers) {
            System.out.println(answer);
        }
    }
}
