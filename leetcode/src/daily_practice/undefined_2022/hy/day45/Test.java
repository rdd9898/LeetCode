package daily_practice.undefined_2022.hy.day45;

/**
 * @author 胡阳
 * @ClassName Test
 * @description:
 * @date 2022年03月14日 9:24
 */
public class Test {
    public static void main(String[] args) {
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] ans = Solution.findRestaurant(list1, list2);
        for (String s : ans) {
            System.out.println(s);
        }
    }
}
